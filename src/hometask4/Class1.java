package hometask4;

public class Class1 {
    public static void main(String[] args) {
        int number = 768;
        int sum = 0;
        int test;
        test = number % 10;
        sum = sum + test;
        number = number / 10;
        test = number % 10;
        sum = sum + test;
        number = number / 10;
        sum = sum + number;
        System.out.println(sum);
    }
}
