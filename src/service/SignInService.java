package service;

import entities.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SignInService {
    private static final ArrayList<User> users = new ArrayList<>();


    public User createUser(Scanner scanner) {
        System.out.println("Creat new account");



        do {
            System.out.print("Username: ");
            String newUsername = scanner.nextLine();

            if (users.contains(newUsername)) {
                System.out.println("Username exist");
            }



            System.out.print("Email: ");
            String newEmail = scanner.nextLine();
            while (!newEmail.matches(User.getEmailPattern())) {
                System.out.println("Invalid email address. Please enter a valid email address");
                newEmail = scanner.nextLine();
            }

            System.out.print("Password: ");
            String password = scanner.nextLine();
            while (!password.matches(User.getPasswordPattern())) {
                System.out.println("Invalid password. Please enter a valid password");
               password = scanner.nextLine();
            }


            while (!password.equals(password)) {
                System.out.println("The password is incorrect. Enter again.");
                password = scanner.nextLine();

            }

            System.out.println("Sign in Successful!");


            return new User(newUsername, password, newEmail);



        }
        while (true);


    }


}























