import java.util.Arrays;
import java.util.Scanner;

public class Module3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Call methods
        //reverseOrder(in);
        //reverseArray(in);
        //sumArrays(in);

        int[] array = fillingArray(in);
        System.out.print("Исходный массив: ");

        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println();
        int[] sortArray = quickSort(0, array.length - 1, array);
        System.out.print("Упорядоченный массив: ");

        for (int i : sortArray) {
            System.out.print(i + " ");
        }

    }

    public static void reverseOrder(Scanner in) {
        int a, b;
        StringBuffer strA = new StringBuffer("");
        StringBuffer strB = new StringBuffer("");

        System.out.print("Введите a: ");
        a = in.nextInt();
        System.out.print("Введите b: ");
        b = in.nextInt();

        while (a > 0){
           strA.append(a % 10);
           a /= 10;
        }
        System.out.println(strA);

        while (b > 0){
            strB.append(b % 10);
            b /= 10;
        }
        System.out.println(strB);

    }

    public static void reverseArray(Scanner in) {
        int temp;
        System.out.print("Введите размер массива: ");
        int[] arrayNumbers = new int[in.nextInt()];

        for (int i = 0; i < arrayNumbers.length; i++){
            System.out.print("Ведите " + (i + 1) + " элемент: ");
            arrayNumbers[i] = in.nextInt();
        }

        for (int i = 0; i < arrayNumbers.length / 2; i++){
            temp = arrayNumbers[i];
            arrayNumbers[i] = arrayNumbers[arrayNumbers.length - i - 1];
            arrayNumbers[arrayNumbers.length - i - 1] = temp;
        }

        System.out.println("Перевернутый массив:");
        for (int i : arrayNumbers) {
            System.out.print(i + " ");
        }

    }

    public static void sumArrays(Scanner in) {
        System.out.print("Введите размер массива A: ");
        int[] arrayA = new int[in.nextInt()];

        for (int i = 0; i < arrayA.length; i++){
            System.out.print("Введите " + (i + 1) + " элемент: ");
            arrayA[i] = in.nextInt();
        }

        System.out.print("Введите размер массива B: ");
        int[] arrayB = new int[in.nextInt()];

        for (int i = 0; i < arrayB.length; i++){
            System.out.print("Введите " + (i + 1) + " элемент: ");
            arrayB[i] = in.nextInt();
        }

        int maxLength = Math.max(arrayA.length, arrayB.length);
        int[] arrayC = Arrays.copyOf(arrayA, maxLength);
        for (int i = 0; i < arrayB.length; i++){
            arrayC[i] += arrayB[i];
        }
        for (int i : arrayC) {
            System.out.print(i + " ");
        }

    }

    public static int[] fillingArray(Scanner in) {
        System.out.print("Введите размер массива: ");
        int[] arrayNumbers = new int[in.nextInt()];

        for (int i = 0; i < arrayNumbers.length; i++){
            System.out.print("Введите " + (i + 1) + " элемент: ");
            arrayNumbers[i] = in.nextInt();
        }
        return arrayNumbers;

    }

    public static int[] quickSort(int first, int last, int[] array){
        int l = first, r = last;
        int op = array[(l + r) / 2];
        while (l <= r){
            while (array[l] > op)
                l++;
            while (array[r] < op)
                r--;
            if(l <= r){
                int temp = array[l];
                array[l] = array[r];
                array[r] = temp;
                l++;
                r--;
            }
        }
        if (first < r){
            quickSort(first, r, array);
        }
        if (last > l){
            quickSort(l, last, array);
        }
        return array;
    }

}
