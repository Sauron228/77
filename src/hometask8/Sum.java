package hometask8;

public class Sum {
    public static void main(String[] args) {

        randomSum(100);
    }

    public static void randomSum(int n) {
        int a = 1;
        int sum = 0;
        while (a <= n) {
            int random = (int) (Math.random() * 20) - 10;
            sum = sum + random;
            a++;
        }
        System.out.println(sum);
    }
}
