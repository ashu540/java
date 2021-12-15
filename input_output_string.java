https://www.hackerrank.com/challenges/java-stdin-stdout/problem?isFullScreen=true

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       System.out.println("taking input from user");

       Scanner sc=new Scanner(System.in);

        System.out.println("enter the num1");
        int num1=sc.nextInt();
        float num1=sc.nextFloat();

        System.out.println("enter the num2");
        int num2=sc.nextInt();
         float num2=sc.nextFloat();

        float sum=num1+num2;
        System.out.println("the sum is");

        System.out.println(sum);
-------------------------------------------------//
 integer checker
        boolean b1 =  sc.hasNextInt();

        System.out.println(b1);
-------------------------------------------------//
#############################################################
-->taking input a string as a word

        String s=sc.next();
        System.out.println(s);
-->example
        ashutosh rawat
        ashutosh
-------

-->taking input a string as a sentense

        String s=sc.nextLine();
        System.out.println(s);
-->example
        ashutosh rawat is good boy
        ashutosh rawat is good boy





    }
}
