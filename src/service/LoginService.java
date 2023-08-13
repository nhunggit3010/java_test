package service;

import entities.User;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginService {

//    private static final ArrayList<User> users = new ArrayList<>();

    public Object Login(Scanner scanner, ArrayList<User> users, SignInService signInService) {

        do {
            System.out.println("Enter username: ");
            String username = scanner.next();

            System.out.println("Enter password: ");
            String password = scanner.next();


            // Kiểm tra xem username và mật khẩu có đúng hay không
            for (User user : users) {
                if (!user.getUsername().equals(username)) {
                    System.out.println("Login again");
                } else if (!user.getPassword().equals(password)) {
                    System.out.println("Forgot password:");
                } else if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                    System.out.println("Login sucessfull," + "   Wellcome  " + username + " to your email . You can to change your email,password,username...,:");

                    System.out.println("1. Change username");
                    System.out.println("2. Change email");
                    System.out.println("3. Change password");
                    System.out.println("4. Logout");
                    System.out.println("0. Exit program");

                    System.out.println("Please choose");
                    int choice = scanner.nextInt();

                    while (true) {
                        switch (choice) {
                            case 1:
                                System.out.println("reset username: ");
                                String newUsername = scanner.next();
                                user.setUsername(newUsername);
                                System.out.println(users);
                              break;

                            case 2:
                                System.out.println("Reset email: ");
                                String newEmail = scanner.next();
                                user.setEmail(newEmail);
                                System.out.println(users);
                                break;

                            case 3:
                                System.out.println("Reset password: ");
                                String newPassword = scanner.next();
                                user.setPassword(newPassword);
                                System.out.println(users);
                                break;

                            case 4:
                                System.out.println("Logout successfull");
                                return signInService;

                            case 0:
                                System.out.println("Exit Program");
                                System.exit(0);

                            default:
                                System.out.println("Chọn không hợp lệ. Vui lòng nhập lại.");
                        }
                        return user;

//
//
                    }

                }

            }

        } while (true) ;
    }
}



