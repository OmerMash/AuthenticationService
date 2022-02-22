package com.hit.auth;

public class Main {
    public static void main(String[] args) {
        AuthenticationService authService = new AuthenticationService();

        authService.addUser("omer1", "123456");
        authService.addUser("omer2", "1234567");
        authService.auth("omer2", "123456");
        authService.removeUser("omer1");

    }
}
