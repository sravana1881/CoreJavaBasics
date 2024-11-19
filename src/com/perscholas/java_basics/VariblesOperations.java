package com.perscholas.java_basics;

public class VariblesOperations {
    public static void main(String[] args) {
        int a =5;
        int b = 6;
        double x = 23.7;
        double y = 22.4;
        double sum1 = x + y;
        double sum2 = x + b;
        int sum = a + b;
        int div = a / b;
        double div1=a/x;
        double div2 = x/y;
        int q=b/a;
        int div2casting=(int)div2;
        double c= (double)a;
        double r=b/c;
        final double  PI=3.14159;
        Double Radius=3.2;
        double area= PI * Radius * Radius;
        System.out.println("sum : " + sum);
        System.out.println("sum1 : " + sum1);
        System.out.println("sum2 : " + sum2);
        System.out.println("div : " + div);
        System.out.println("div1 : " + div1);
        System.out.println("div2 : " + div2);
        System.out.println("div2casting : " + div2casting);
        System.out.println("q : " + q);
        System.out.println("c : " + c);
        System.out.println("r : " + r);
        System.out.println("area : " + area);


    }
}
