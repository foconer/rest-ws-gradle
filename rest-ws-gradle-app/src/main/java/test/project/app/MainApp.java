package test.project.app;

import test.project.service.UserService;

public class MainApp {
    public static void main(String... args) {
        System.out.println(new UserService().getUser());
    }
}