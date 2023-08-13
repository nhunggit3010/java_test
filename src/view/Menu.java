package view;

import java.util.Scanner;

public class Menu {
        public void displayMenu(){
            System.out.println("1 - Login");
            System.out.println("2 - Sign in");








        }

        public int selectmenu(Scanner scanner){

            do {
                System.out.println("Please choose : 1.Login / 2.Sign in   ");
                try{
                    int choice =  Integer.parseInt(scanner.nextLine()) ;
                    return choice;

                }catch(Exception e){
                    System.out.println("Input again");

                };



            }while(true);

        }


}
