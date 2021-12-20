package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    String name=new String("ashunick");

    System.out.println(name);

//_________________________________________________________________________________________________________________________

        // %d and %f are format specifire

        int a=55;
        float b=678.73112f;

        System.out.printf("the value of a is %d and value of b is %f "+"\n",a,b);
        System.out.printf("the value of a is %d and value of b is %.2f "+"\n",a,b);
        System.out.printf("the value of a is %d and value of b is %8.2f "+"\n",a,b);
        System.out.format("the value of a is %d and value of b is %f "+"\n",a,b);
   // both are same
//_________________________________________________________________________________________________________________________

        System.out.println("");

        Scanner sc=new Scanner(System.in);
-->not read a sentense it read only words
        String s=sc.next();
        System.out.println(s);

 it is use to read the sentense

        String s=sc.nextLine();
        System.out.println(s);
    }
}
