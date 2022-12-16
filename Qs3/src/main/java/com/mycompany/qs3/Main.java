/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

import Qs3.Car;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Car> mcarList = new LinkedList<>();
        MyCar mcar = new MyCar();
        int choice = 0;
        System.out.println("Add how many elements: ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Maker: ");
            String maker = sc.nextLine();
            System.out.println("Enter rate: ");
            int rate = Integer.parseInt(sc.nextLine());
            Car car = new Car(maker, rate);
            mcarList.add(car);
        }
        do {            
            System.out.println("Enter TC([1]-f1;[2]-f2;[3]-f3): " );
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println(mcar.f1(mcarList));
                    break;
                case 2:
                    mcar.f2(mcarList);
                    break;
                case 3:
                    mcar.f3(mcarList);
            }
        } while (true);   
    }
}

