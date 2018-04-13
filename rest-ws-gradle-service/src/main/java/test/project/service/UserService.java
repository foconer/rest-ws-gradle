package test.project.service;

import test.project.model.User;

public class UserService {
    public static User getUser() {
        return User.builder().name("test name").build();
    }
}
