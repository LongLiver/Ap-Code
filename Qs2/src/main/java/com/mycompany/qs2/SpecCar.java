/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.qs2;

/**
 *
 * @author duy
 */
public class SpecCar extends Car {

    int type;

    public SpecCar() {
    }

    public SpecCar(String maker, int price, int type) {
        super(maker, price);
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return super.getMaker() + ", " + super.getPrice() + ", " + type;
    }

    public void setData() {
        super.setMaker("XZ" + super.getMaker());
        System.out.println(super.getMaker());
        super.setPrice(super.getPrice() + 20);
        System.out.println(super.toString());
    }

    public int getValue() {
        if (this.type < 7) {
            return super.getPrice() + 10;
        } else {
            return super.getPrice() + 15;
        }
    }
}