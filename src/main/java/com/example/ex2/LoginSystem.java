package com.example.ex2;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
    
        String Username = "Admin";
        String Password = "Password123";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String user = input.nextLine();

        System.out.print("Enter Password: ");
        String pass = input.nextLine();

        if (user.equals(Username) && pass.equals(Password)) {
            System.out.println("Login Successful! Welcome.");
        } else {
            System.out.println("Invalid credentials. Access Denied.");
        }
        
        input.close();
    }
}