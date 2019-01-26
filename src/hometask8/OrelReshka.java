package hometask8;

public class OrelReshka {
    public static void main(String[] args) {

        mMain();
    }

    public static void mMain() {
        int x = 2;

        for (int i = 0; i < 2000; i++) {
            double y = Math.random();
            int random = (int) (x * y);
            System.out.println(random);

        }
    }
}
