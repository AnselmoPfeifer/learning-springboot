package com.anselmopfeifer.task.users;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Type of access
 * public
 * private
 * protected
 */
@RestController
@RequestMapping("/")
public class UserController {
    /**
     * Method Type
     * String text
     * Integer (int) integer numbers
     * Double number os decimal case
     * Date
     * char
     * void
     */

     @PostMapping("/users")
     public void create(@RequestBody UserModel userModel) {
        System.out.println(userModel.getName());
     }
}
