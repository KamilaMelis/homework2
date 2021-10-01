package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        checkInfo();
        checkInfo();
        checkInfo();
        checkInfo();
        checkInfo();
        int age = generateRandomAge();


    }

    public static void checkInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Введите ваш возраст");
        int age = scanner.nextInt();

        System.out.println(" Введите температуру");
        int temp1 = scanner.nextInt();

        if (age >= 20 && age <= 40 && temp1 >= 20 && temp1 <= 40) System.out.println(" Можно идти гулять");
        else if (age <= 20 && age >= 0 && temp1 >= 0 && temp1 <= 28) System.out.println(" Можно прогуляться");
        else if (age >= 45 && temp1 >= 10 && temp1 <= 25) System.out.println(" Можно гулять");
        else System.out.println(" Оставайтесь дома ");
        System.out.println(age);
        System.out.println();
    }

    private static int generateRandomAge() {
        Random random = new Random();
        return random.nextInt(100);
    }
}
