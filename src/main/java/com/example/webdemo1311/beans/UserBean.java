package com.example.webdemo1311.beans;

import com.example.webdemo1311.data.User;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import lombok.Data;

import java.io.Serializable;

@Named
@SessionScoped
@Data
public class UserBean implements Serializable {
    private User user = new User();
}
