package com.demo.ansible.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.demo.ansible.user.User;


@Service
public class UserService {
	private List<User> userList = new ArrayList<>();

    public User registerUser(User user) {
        userList.add(user);
        return user;
    }

    public User findUserByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null; // Return null if user is not found
    }
}
