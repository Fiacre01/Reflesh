package com.fiacre;

import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name= "  Fiacre \"Indagiye\" Sibo   ";
        int age= 25;
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



    }
}
