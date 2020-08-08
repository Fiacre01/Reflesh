package com.fiacre;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here

        String fullName="";
        String firstName= "John";
        String lastName= "Smith";

        strings(firstName,lastName,fullName);

        maths();

        dates();

    }

    public static void strings(String firstName, String lastName,String fullName){

        //getting middle name
        Scanner sc = new Scanner(System.in);
        String middleName;
        do {
            System.out.println("please enter the middle name: ");
            middleName = sc.next();
        }
        while (middleName.startsWith("i"));

        //joining first,middle,last names
        System.out.println("adding first, middle and last names together: ");
        System.out.println(firstName+middleName+lastName);
        fullName = String.join(" ",firstName,middleName,lastName);
        System.out.println(fullName+ ", " + fullName.length());

        // changing name to uppercase
        System.out.println("making name uppercase: ");
        String upperCase =  fullName.toUpperCase();
        System.out.println(upperCase +", "+ upperCase.length());
    }
    public static void dates(){
        Date now = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");

        System.out.println("The time is:" +formatter.format(now));


    }

    public static void maths(){


        int randomInt= (int) (Math.random()*9)+1;
        System.out.println("random integer = " +randomInt);

        Addition add= new Addition();

        System.out.println("Please enter the first number: ");
        Scanner sc= new Scanner(System.in);
        int num3= sc.nextInt();

        System.out.println("Please enter the second number: ");
        int num4= sc.nextInt();

        // calling setters
        add.setNum1(num3);
        add.setNum2(num4);

        //using getters
        int sum = add.addTwoNum(add.getNum1(),add.getNum2());
        System.out.println("The sum of both numbers is: " +sum);
    }
}
