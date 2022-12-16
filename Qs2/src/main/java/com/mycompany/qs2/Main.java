package com.mycompany.qs2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Car k = new Car();
        SpecCar sp = new SpecCar();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter maker: ");
        String maker = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();
        System.out.print("Enter type: ");
        int type = sc.nextInt();
        System.out.println("1. Test toString()");
        System.out.println("2. Test setData()");
        System.out.println("3. Enter getValue()");
        System.out.print("Enter TC (1,2,3): ");
        int choice = sc.nextInt();
        k.setMaker(maker);
        k.setPrice(price);
        sp.setMaker(maker);
        sp.setPrice(price);
        sp.setType(type);
        System.out.println("OUTPUT:");
        switch(choice){
            case 1:
                System.out.println(k.toString());
                System.out.println(sp.toString());
                break;
            case 2:
                sp.setData();
                break;
            case 3:
                System.out.println(sp.getValue());              
                break;
            default:
                System.out.println("Out of range!");
        }
    }
    
}

