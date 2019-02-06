package Utils;

import java.util.Scanner;

public class Helper {
    //Случайное число
    public static int intRandom (int min, int max){
        int random = (int) ((Math.random() * ((max - min) + 1)) + min);
        return random;
    }


    //Целое число
    public static int inputInt(){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    //Дробное число
    public static double inputDouble(){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }


}