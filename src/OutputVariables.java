import java.util.Scanner;

public class OutputVariables {

    public static void main(String[] args) {
        //sumDouble();
        //areaRectangle();
        //areaTriangle();
        //task4();
        //task5();
        //task6();

    }

    public static void sumDouble() {
        double a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите a: ");
        a = in.nextDouble();

        System.out.println("Введите b: ");
        b = in.nextDouble();

        System.out.println("Сумма " + a + " + " + b + " = " + (a + b));

    }

    public static void areaRectangle() {
        int a, b;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ширину: ");
        a = in.nextInt();

        System.out.println("Введите высоту: ");
        b = in.nextInt();

        System.out.println("Площадь прямоугольника равна = " + (a * b));

    }

    public static void areaTriangle() {
        double a, b, c;
        double p, s;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите длинну стороны a: ");
        a = in.nextDouble();

        System.out.println("Введите длинну стороны b: ");
        b = in.nextDouble();

        System.out.println("Введите длинну стороны c: ");
        c = in.nextDouble();

        p = (a + b + c) / 2;
        s = Math.sqrt(p*(p - a)*(p - b)*(p - c));
        System.out.println("Площадь треугольника равна = " + s);

    }

    public static void task4() {
        int a, b;
        boolean equal, mod, moreThan;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите a: ");
        a = in.nextInt();

        System.out.println("Введите b: ");
        b = in.nextInt();

        equal = a == b;
        mod = ((a % b) == 0);
        moreThan = a > b;

        System.out.println(equal + "\n" + mod + "\n"  +  moreThan);

    }

    public static void task5() {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите a: ");
        a = in.nextInt();

        System.out.println("Введите b: ");
        b = in.nextInt();

        System.out.println("Введите c: ");
        c = in.nextInt();

        System.out.println("a - являеться наибольшим числом: " + (a > b && a > c));
        System.out.println("b - являеться наибольшим числом: " + (b > a && b > c));
        System.out.println("c - являеться наибольшим числом: " + (c > a && c > b));

        System.out.println("------------------------------------------");

        System.out.println("a - являеться наименьшим числом: " + (a < b && a < c));
        System.out.println("b - являеться наименьшим числом: " + (b < a && b < c));
        System.out.println("c - являеться наименьшим числом: " + (c < a && c < b));

        System.out.println("------------------------------------------");

        System.out.println("a - являеться промежуточным числом между b и c: "
                            + ((a < b && a > c) || (a > b && a < c)));
        System.out.println("b - являеться промежуточным числом между a и c: "
                            + ((b < a && b > c) || (b > a && b < c)));
        System.out.println("c - являеться промежуточным числом между a и b: "
                            + ((c < a && c > b) || (c > a && c < b)));

    }

    public static void task6() {
        int a, b, c;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите a: ");
        a = in.nextInt();

        System.out.println("Введите b: ");
        b = in.nextInt();

        System.out.println("Введите c: ");
        c = in.nextInt();

        System.out.println("a - равняеться b или c: " + (a == b || a == c));
        System.out.println("b - равняеться a или c: " + (b == a || b == c));
        System.out.println("c - равняеться a или b: " + (c == a || c == b));

        System.out.println("------------------------------------------");

        System.out.println("a - больше b или c: " + (a > b || a > c));
        System.out.println("b - больше a или c: " + (b > a || b > c));
        System.out.println("c - больше a или b: " + (c > a || c > b));

    }


}
