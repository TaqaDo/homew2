
package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(ageTemp(19,-5));
        System.out.println(ageTemp(25,-10));
        System.out.println(ageTemp(56,17));
        System.out.println(ageTemp(75,25));
        System.out.println(ageTemp(11,-50));

        genearateRandomAge();

    }
    public static String ageTemp (int age, int temp){


        if (age>=20 && age <= 45 && temp >= -20 && temp <=30)
            return "можно идти гулять";
        else if (age<20 && temp >= 0 && temp <= 28)
            return "можно идти гулять";
        else if (age > 45 && temp >= -10 && temp <= 25 )
            return "можно идти гулять";
        else
            return "оставайтесь дома";
    }

    public static void genearateRandomAge() {
        Random rand = new Random();
        int upperbound = 70;
        int int_random = rand.nextInt(upperbound);
        System.out.println("Можно ли идти гулять, когда тебе" + ":" + " " + int_random + " " + "лет (год)");









    }

}
