package hometask7;

import java.util.Scanner;

public class UserAge {
    public static void main(String[] args) {
        System.out.println("Введите год дождения");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println("Ваш текущий возраст " + (x - 2019));
    }

}
