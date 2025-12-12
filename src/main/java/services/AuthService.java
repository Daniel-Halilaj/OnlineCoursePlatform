package main.java.services;

import main.java.models.Student;
import main.java.models.Instructor;
import main.java.models.User;

import java.util.ArrayList;
import java.util.List;

public class AuthService {

    private List<User> users = new ArrayList<>();

    // Regjistrimi i përdoruesit
    public void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getName());
    }

    // Login
    public boolean login(String email, String password) {
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Login successful: " + user.getName());
                return true;
            }
        }
        System.out.println("Login failed for: " + email);
        return false;
    }
}
