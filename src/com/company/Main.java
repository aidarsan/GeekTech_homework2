package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //задание третьего пункта
        System.out.println(walkingDay(23, 35));
        System.out.println(walkingDay(-3, 32));
        System.out.println(walkingDay(0, 22));
        System.out.println(walkingDay(15, 17));
        System.out.println(walkingDay(5, 45));
    }


       //задание первого пункта
    public static String walkingDay(int age, int temperature) {
        //задание вторго пункта
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30)
            return "Можно гулять!";
         else if (age <= 20 && temperature >= 0 && temperature <= 28 )
            return "Можно идти гулять!";
         else if (age >= 45 && temperature >= -10 && temperature <= 25)
             return "Можно идти гулять!";
         else
             return "Оставайтесь дома!";
    }





}
