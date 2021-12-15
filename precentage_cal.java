package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

      System.out.println("enter the marks of student");

        Scanner sc=new Scanner(System.in);

        System.out.println("hindi");

        float s1=sc.nextFloat();

        System.out.println("english");

        float s2=sc.nextFloat();

        System.out.println("math");

        float s3=sc.nextFloat();

        System.out.println("ssc");

        float s4=sc.nextFloat();

        System.out.println("sanskrit");

        float s5=sc.nextFloat();

        float sum=s1+s2+s3+s4+s5;

        float dummy=sum/500f;

        dummy=dummy*100f;
        System.out.println(dummy);





    }
}
