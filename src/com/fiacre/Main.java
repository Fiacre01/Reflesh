package com.fiacre;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name= "  Fiacre Indagiye Sibo   ";
        String firstName= "Fiacre";
        String lastName= "Sibo";
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the middle name: ");
        String middleName= sc.next();
            if (middleName.startsWith("i") || middleName.contains("s")) {
                System.out.println("please enter a different middle name");
            }
            else if (middleName.contains("d")){
                System.out.println("Thank you");
            }
        System.out.println(firstName + " " + " " + middleName + " " + lastName);
        int age= 25;
        int num1=10;
        int num2=20;
        int money= 111_111_111;

        Date now = new Date();
        int randomInt= (int) (Math.random()*9)+1;
        System.out.println("random integer = " +randomInt);
        System.out.println(now);
        String newName =  name.trim();
        System.out.println(name+", "+ name.length());
        System.out.println(newName +", "+ newName.length());
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        System.out.println(formatter.format(now));
        Addition add= new Addition();
        int sum = add.addTwoNum(num1,num2);
        System.out.println(sum);


    }
}
