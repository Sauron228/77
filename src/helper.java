public class helper {
    public static int getRandom(int min, int max) {
        return  (int) Math.round(((max - min) * Math.random())) + min;
    }
}
