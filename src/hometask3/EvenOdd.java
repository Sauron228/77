package hometask3;

public class EvenOdd {
    public static void main(String[] args) { // Магия. Не трогать.
        if (isNumberEven(9)) {
            System.out.println("Число являеться чётным ");
        } else {
            System.out.println("Число являеться нечётным ");
        }
    }

    public static boolean isNumberEven(int num) {
        int resoult = num % 2;
        if (resoult == 0) {
            return true;
        } else {
            return false;
        }

    }

}
