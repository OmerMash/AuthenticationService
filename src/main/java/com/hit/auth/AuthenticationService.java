package com.hit.auth;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class AuthenticationService {
    File file = new File("users.txt");

    private Map<String, String> users = new HashMap<String, String>();;

    public boolean auth(String username, String password){
        if(users.get(username) == password){
            System.out.println(username + "validated successfully");
            return true;
        }
        System.out.println("authentication failed for: " + username);
        return false;
    }

    public void addUser(String username, String password){
        users.put(username, password);
        System.out.println(users);
    }

    public void removeUser(String username){
        users.remove(username);
        System.out.println("removing user, new map: ");
        System.out.println(users);
    }

    public Map<String, String> getMap() {
        return this.users;
    }

}
