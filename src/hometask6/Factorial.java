package hometask6;

public class Factorial {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (x <= 22) {
            y = y * x;
            x++;
        }
        System.out.println("22!=" + y);
    }
}