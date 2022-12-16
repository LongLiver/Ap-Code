/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book a = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.println("1. Test getTitle()");
        System.out.println("2. Test setPrice()");
        System.out.print("Enter TC (1 or 2): ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("output:");
                a.setTitle(title);
                System.out.println(a.getTitle());
                break;
            case 2:
                System.out.print("Enter new price: ");
                int newPrice = sc.nextInt();
                System.out.println("output:");
                a.setPrice(newPrice);
                System.out.println(a.getPrice()); 
        }
    }
    
}

