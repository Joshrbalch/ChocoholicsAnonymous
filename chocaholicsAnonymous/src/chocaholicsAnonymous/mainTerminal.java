package chocaholicsAnonymous;

import java.util.*;
//import java.util.Scanner;
/**
* The mainTerminal class will be the first that prompts user to login
*
* @author Michael Orscheln
* @version 1.0
*/
public class mainTerminal {
    Scanner scanna = new Scanner(System.in);
    public String username;
    public String password;

    public static void main() {
        mainTerminal terminalMain = new mainTerminal();
        terminalMain.displayLogin();
    }

    public void displayLogin() {
        System.out.println("Enter username: ");
        username = scanna.nextLine();
        System.out.println("Enter password: ");
        password = scanna.nextLine();
        userVerification LoginToVerify = new userVerification();
        LoginToVerify.verify(username, password);
    }

    public void displayMainMenu() {
        System.out.println("Welcome to Chocoholics Anonymomus! Please log in.");
        System.out.println("Enter username: ");
        String username = scanna.nextLine();
        System.out.println("Enter password: ");
        String password = scanna.nextLine();
        userVerification LoginToVerify = new userVerification();
        LoginToVerify.verify(username, password);

    }


}
