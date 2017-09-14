/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package favoriteapp;

import java.util.Scanner;

/**
 *
 * @author daley
 */
public class Favoriteapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.printf("Enter your favourite app");
        Scanner keyboard = new Scanner(System.in);
        String app = keyboard.nextLine();
        System.out.printf("Enter your favourite app");
        String app2 = keyboard.nextLine();
        System.out.printf("Enter your favourite app");
        String app3 = keyboard.nextLine();
        System.out.printf("%n Your favourite apps are %s, %s and %s%n", app, app2, app3);
    }
    
}
