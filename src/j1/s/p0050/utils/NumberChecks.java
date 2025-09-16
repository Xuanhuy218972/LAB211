package j1.s.p0050.utils

public class NumberChecks {

    public static boolean checkOdd(double n) {
        return n % 2 != 0;
    }

    public static boolean checkEven(double n) {
        return n % 2 == 0;
    }

    public static boolean checkSquareNumber(double n) {
        int sqrt = (int) Math.sqrt(n);
        return sqrt * sqrt == (int) n;
    }

    public static void printClassifications(double... numbers) {
        System.out.print("Odd numbers: ");
        for (double n : numbers) {
            if (checkOdd(n)) System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("Even numbers: ");
        for (double n : numbers) {
            if (checkEven(n)) System.out.print(n + " ");
        }
        System.out.println();

        System.out.print("Perfect square numbers: ");
        for (double n : numbers) {
            if (checkSquareNumber(n)) System.out.print(n + " ");
        }
        System.out.println();
    }
}
