package hometask8;

public class OrelReshka {
    public static void main(String[] args) {
        orelReshka(2000);
    }


    public static void orelReshka (int y){
        int x = 1;
        int sum = 0;
        while (x <=y){
            int n = (int)(Math.random()*2);
            sum = sum + n;
            x++;
        }
        int z = y - sum;
        System.out.println("Орел: " + sum);
        System.out.println("Решка: " + z);
    }


}
