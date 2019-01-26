package hometask7;

import java.sql.SQLOutput;

public class OddNumbers {
    public static void main(String[] args) {
        System.out.println(suma(100));
    }

    public static int suma(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;


        }
        return sum;
    }
}


