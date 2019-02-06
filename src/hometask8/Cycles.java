package hometask8;

import Utils.Helper;

public class Cycles {
    public static void main(String[] args) {

        guessingOfNumber();
    }

    public static void guessingOfNumber() {
        System.out.println("\nЗагадайте число от 1 до 10\n");
        int x = (int) (Math.random() * 10) + 1;
        int y = Helper.inputInt();
        while (y != x) {
            if (y > x) {
                System.out.println("Жарко\n");
            } else {
                System.out.println("Холодно\n");
            }
            y = Helper.inputInt();
        }
        System.out.println("Вы угадали");
    }
}