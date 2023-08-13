package view;

import entities.User;


import service.LoginService;
import service.SignInService;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        menu.displayMenu();



        ArrayList<User> users = new ArrayList<>();
do {
    try{
        int choice = menu.selectmenu(scanner);
        switch (choice) {
            case 1:
                SignInService signInService = new SignInService();
                LoginService loginService = new LoginService();

                loginService.Login(scanner,users,signInService);

                break;
            case 2:
                SignInService siginService = new SignInService();
                User user = siginService.createUser(scanner);

                users.add(user);


                System.out.println(users);
                break;
        }
        }catch(Exception e){

            System.out.println("Try again");

        };

    }while (true);

    }
}


