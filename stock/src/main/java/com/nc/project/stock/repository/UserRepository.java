package com.nc.project.stock.repository;

import com.nc.project.stock.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findUserById(Integer id);
    User findUserByUsername(String username);

}
