package com.perscholas.java_basics;

import java.util.Scanner;

public class Cafe {

        Scanner sc = new Scanner(System.in);
         double subtotal;
         double totalsale;
         final double salestax=2;
        double coffeeprice= 3.5;
        double teaprice=3.2;
        double greenteaprice=2.4;
        int orders;
        double cofeeorders;
        double teaorders;
        double greenteaorders;

        public void coffee(){
            System.out.println("Enter the number of coffee orders");
            orders = sc.nextInt();
            cofeeorders=orders*coffeeprice;
            System.out.println("total cofeeorders "+cofeeorders);
            //sc.close();
        }
        public void tea(){
            System.out.println("Enter the number of tea orders");
            orders = sc.nextInt();
            teaorders=orders*teaprice;
            System.out.println("total teaorders "+teaorders);
            //sc.close();
        }
        public void greentea() {
            System.out.println("Enter the number of green tea orders");
            orders = sc.nextInt();
            greenteaorders = orders * greenteaprice;
            System.out.println("total greenteaorders "+greenteaorders);
            //sc.close();
        }
        public void subtotal() {
            subtotal=0;
            //System.out.println("Enter the total subtotal" + subtotal);
            subtotal=cofeeorders+teaorders+greenteaorders;
            System.out.println("subtotal is "+subtotal);
        }
        public void totalsale() {
            totalsale=0;
            //System.out.println("Enter the total sales" + totalsale);
            totalsale=subtotal+salestax;
            System.out.println("totalsale is "+totalsale);
            sc.close();
        }

    }

