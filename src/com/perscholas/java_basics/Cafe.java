package com.perscholas.java_basics;

import java.util.Scanner;

public class Cafe {

        //Scanner sc = new Scanner(System.in);
         double subtotal;
         double totalsale;
         final double salestax=2.05;
        double coffeeprice= 3.5;
        double teaprice=3.2;
        double greenteaprice=2.4;
       // int orders;
        double cofeeorders;
        double teaorders;
        double greenteaorders;
    public void printOrders() {
        cofeeorders=3*coffeeprice;
        teaorders=2*teaprice;
        greenteaorders=4*greenteaprice;
        subtotal=cofeeorders+teaorders+greenteaorders;
        System.out.println("coffee orders total is " +cofeeorders);
        System.out.println("tea orders total is " +teaorders);
        System.out.println("green tea orders total is " +greenteaorders);
        System.out.println("orders subtotal is  " +subtotal);
        totalsale=subtotal+salestax;
        System.out.println("total sale value is " +totalsale);
    }
}

