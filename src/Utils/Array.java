package Utils;

public class Array {
    public static int arrayMin (int [] arr){
        int min = arr [0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];
            }
        return min;
    }
    public static double arrayMin (double [] arr) {
        double min = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];
            }
        return min;
    }


    //Метод arrayMax возвращает наибольший элемент массива, благодаря реализации перегрузки может принимать массив с целыми или дробными числами
    public static int arrayMax (int [] arr){
        int max = arr [0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        return max;
    }
    public static double arrayMax (double [] arr) {
        double max = arr[0];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
            }
        return max;
    }

    //Индекс минимального элемента массива
    public static int arrayMinIndex (int [] arr){
        int minIndex = 0;
        int min = arr [minIndex];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        return minIndex;
    }
    public static int arrayMinIndex (int [] arr, int start){
        int minIndex = start;
        int min = arr [start];
        for (int i = start; i < arr.length; i++)
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        return minIndex;
    }


    //Индекс максимального элемента массива
    public static int arrayMaxIndex (int [] arr){
        int maxIndex = 0;
        int max = arr [maxIndex];
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;

            }
        return maxIndex;
    }
    public static int arrayMaxIndex (int [] arr, int start){
        int maxIndex = start;
        int max = arr [start];
        for (int i = start; i < arr.length; i++)
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
            }
        return maxIndex;
    }



    //Сравнение массивов
    public static boolean sameArrays(int[]a, int[]b) {
        boolean same =true;
        if (a.length != b.length) {
            same = false;
        } else{
            for (int i = 0; i < a.length; i++) {
                if(a[i] != b[i]){
                    same = false;
                    break;
                } else{
                    same = true;
                }
            }
        }
        return same;
    }


    //Слияние двух массивов
    public static int[] arrayAdd(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        for (int i = 0; i < c.length; i++) {
            if(i<a.length){
                c[i]=a[i];
            }else{
                c[i]=b[i-a.length];
            }
        }
        return c;
    }
    public static char[] arrayAdd(char[] a, char[] b){
        char[] c = new char[a.length+b.length];
        for (int i = 0; i < c.length; i++) {
            if(i<a.length){
                c[i]=a[i];
            }else{
                c[i]=b[i-a.length];
            }
        }
        return c;
    }


    //Метод выводит на экран элементы массива, реализована перегрузка
    public static void printArray (int[]arr){
        for(int i: arr){
            System.out.printf("[%d] ", i);
        }
        System.out.println();
    }
    public static void printArray (double[]arr){
        for(double i: arr){
            System.out.printf("[%f] ", i);
        }
        System.out.println();
    }
    public static void printArray (char[]arr){
        for(char i: arr){
            System.out.printf("[%s] ", i);
        }
        System.out.println();
    }



    //Метод генерирует случайный индекс для принимаемого массива
    public static int arrayRandomIndex(char[] arr){
        return Helper.intRandom(0, arr.length - 1);
    }
    public static int arrayRandomIndex(int[] arr) {
        return Helper.intRandom(0, arr.length - 1);
    }

    //Метод выбирает случайный символ из массива для принимаемого массива символов
    public static char arrayRandomChar(char[] arr) {
        return arr[Array.arrayRandomIndex(arr)];

    }

    //Метод перемешивает массив
    public static void arrayChaos (char[] arr){
        for (int i = 0; i < arr.length ; i++) {
            int a = (int) (Math.random()*arr.length);
            char c = arr[a];
            arr[a] = arr [i];
            arr[i] = c;
        }
    }

    //Принимает массив и меняет элементы с принимаемыми индексами местами
    public static void swap (int[]arr, int ind1, int ind2){
        int buffer = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = buffer;

    }
    //Заполняет принимаемый массив рандомными числами, границы для генерации которых так же принимаются
    public static void fillRandomArray(int[]arr,int min,int max) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Helper.intRandom(min, max);
        }
    }


    //Упорядочивает массив по убыванию
    public static void sortToMin(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            Array.swap(arr, i, arrayMaxIndex(arr, i));
        }
    }

    //Упорядочивает массив по возрастанию
    public static void sortToMax(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            Array.swap(arr, i, arrayMinIndex(arr, i));
        }
    }

    //Сортировка пузырьком
    public static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j] > numbers[j+1]){
                    Array.swap(numbers, j, j+1);
                }
            }
        }
    }

}
