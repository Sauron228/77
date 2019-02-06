package hometask9;
import Utils.Array;
public class MathMin {
    public static void main(String[] args) {
math();
    }

    public static void math() {
int[] x = {-10, 20, 34, -11, 100, 20};
double[] y = {10.10, 43.543, 0.01, 1.3, 0.1, 43.4, 0.001};
        System.out.println(Utils.Array.arrayMax(x));
        System.out.println(Utils.Array.arrayMin(x));
        System.out.println(Utils.Array.arrayMax(y));
        System.out.println(Utils.Array.arrayMin(y));

    }
}
