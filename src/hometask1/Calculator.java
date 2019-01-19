package hometask1;

public class Calculator {
    public static void main(String[] args) {
        int iResult = add(5, 7);
        System.out.println(iResult);

        double dResult = add(5d, 7d);
        System.out.println(dResult);

        int isResult = sub(100, 35);
        System.out.println(isResult);

        double dsResult = sub(100d, 35d);
        System.out.println(dsResult);

        int idResult = div(200, 50);
        System.out.println(idResult);

        double ddResult = div(200d, 50d);
        System.out.println(ddResult);

        int imResult = mul(33, 3);
        System.out.println(imResult);

        double dmResult = mul(33d, 3d);
        System.out.println(dmResult);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;

    }

    public static float add(float x, float y) {
        float result = x + y;
        return result;

    }

    public static double add(double x, double y) {
        double result = x + y;
        return result;
    }

    public static int sub(int x, int y) {
        return x - y;
    }

    public static float sub(float x, float y) {
        return x - y;
    }

    public static double sub(double x, double y) {
        return x - y;

    }


    public static int div(int x, int y) {
        return x / y;
    }

    public static float div(float x, float y) {
        return x / y;
    }

    public static double div(double x, double y) {
        return x / y;

    }

    public static int mul(int x, int y) {
        return x * y;
    }

    public static float mul(float x, float y) {
        return x * y;
    }

    public static double mul(double x, double y) {
        return x * y;

    }


}


