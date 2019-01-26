package hometask8;

public class Diagonal {
    public static final int LEN = 5;

    public static void main(String[] args) {

        for (int i = 0; i < LEN; i++) {
            for (int j = 0; j < LEN; j++) {

                if (i == j) {
                    System.out.print("x");
                } else {
                    System.out.print("0");
                }

            }
            System.out.println();
        }
    }
}