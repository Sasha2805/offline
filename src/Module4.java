import java.util.Scanner;

public class Module4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        int[] arrayNumbers = fillingArray(in);
        System.out.println(searchMin(arrayNumbers));
        middleNum(arrayNumbers);
        System.out.println("Максимальный елемент: " + findMaxNumber(arrayNumbers));
        System.out.println(power(4,3));*/
        System.out.print("Ведите а: ");
        int a = in.nextInt();
        System.out.print("Ведите b: ");
        int b = in.nextInt();
        //sequence(a, b);
        System.out.println(sequenceTwo(a, b));

    }

    public static int[] fillingArray(Scanner in) {
        System.out.print("Введите размер массива: ");
        int[] arrayNumbers = new int[in.nextInt()];
        for (int i = 0; i < arrayNumbers.length; i++){
            System.out.print("Введите " + (i + 1) + " елемент: ");
            arrayNumbers[i] = in.nextInt();
        }
        return arrayNumbers;

    }

    public static int searchMin(int[] arrayNumbers) {
        int min = Integer.MAX_VALUE;
        for (int temp: arrayNumbers) {
            min = Math.min(temp, min);
        }
        return min;

    }

    public static void middleNum(int[] arrayNumbers) {
        int sum = 0;
        float mid;
        for (int n: arrayNumbers) {
            sum += n;
        }
        mid = (float) sum / arrayNumbers.length;
        System.out.println("Среднее арифметическое чисел массива = " + mid);

        float diffNum = Math.abs(mid - arrayNumbers[0]);
        int index = 0;
        for (int i = 0; i < arrayNumbers.length; i++){
            if(Math.abs(mid - arrayNumbers[i]) < diffNum){
                diffNum = Math.abs(mid - arrayNumbers[i]);
                index = i;
            }
        }
        System.out.println("Максимально приближенный елемент: " + arrayNumbers[index]);

    }

    public static int findMaxIndex(int[] arrayNumbers) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > max){
                max = arrayNumbers[i];
                index = i;
            }
        }
        return index;

    }

    public static int findMaxNumber(int[] arrayNumbers) {
        int index = findMaxIndex(arrayNumbers);
        return arrayNumbers[index];
    }

    public static int power(int x, int n) {
        if (n == 1) return x;
        return power(x, n-1)*x;

    }

    public static void sequence(int a, int b) {
        if (a == b) System.out.println(a);
        if (a < b) {
            System.out.println(a);
            sequence(a + 1, b);
        }
        if (a > b){
            System.out.println(a);
            sequence(a-1, b);
        }

    }

    public static String sequenceTwo(int a, int b) {
        if (a < b){
            if (a == b) return Integer.toString(a);
            return a + " " + sequenceTwo(a + 1, b);
        }else {
            if (a == b) return Integer.toString(a);
            return a + " " + sequenceTwo(a - 1, b);
        }
    }

}
