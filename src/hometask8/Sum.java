package hometask8;

public class Sum {
    public static void main(String[] args) {

        mMain();
    }

    public static void mMain() {
        int x = 10;

        for (int i = -11; i < 100; i++) {
            double y = Math.random();
            int random = (int) (x * y);
            System.out.println(random + i);
        }
    }
}

