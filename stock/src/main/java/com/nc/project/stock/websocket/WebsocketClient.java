package com.nc.project.stock.websocket;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;
import java.util.Queue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nc.project.stock.model.Stock;
import com.nc.project.stock.repository.StockRepository;
import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;
import org.springframework.scheduling.annotation.Scheduled;


public class WebsocketClient {

    private String stockSymbol;

    private String USER_URI;

    private Queue<String> queue = new LinkedList();

    public Queue<String> getQueue() {
        return this.queue;
    }

    public WebsocketClient(String stock, String USER_URI){
        this.stockSymbol = stock;
        this.USER_URI = USER_URI;
    }

    public void clearQueue(){
        this.queue.clear();
    }

    public void tradeUpdates() {
//        Queue<String> queue = new LinkedList<>();
        try {
            // open websocket
            final WebsocketClientEndpoint clientEndPoint = new WebsocketClientEndpoint(new URI(USER_URI));

            // add listener
            clientEndPoint.addMessageHandler(new WebsocketClientEndpoint.MessageHandler() {
                public void handleMessage(String message) {
//                    System.out.println(message);
                    queue.add(message);
                }
            });

            // send message to websocket
            clientEndPoint.sendMessage("{\"type\":\"subscribe\",\"symbol\":\""+stockSymbol+"\"}");

            // wait 5 seconds for messages from websocket
            Thread.sleep(5000);

        } catch (InterruptedException ex) {
            System.err.println("InterruptedException exception: " + ex.getMessage());
        } catch (
                URISyntaxException ex) {
            System.err.println("URISyntaxException exception: " + ex.getMessage());
        }
    }
}
