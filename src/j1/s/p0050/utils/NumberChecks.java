package j1.s.p0050.utils;

public class NumberChecks {

    public boolean checkOdd(double n) {
        return n == (int) n && (int) n % 2 != 0;
    }

    public boolean checkEven(double n) {
        return n == (int) n && (int) n % 2 == 0;
    }

    public boolean checkSquareNumber(double n) {
        return n == (int) n && n >= 0 && Math.sqrt(n) == (int) Math.sqrt(n);
    }

    public void printClassifications(double... numbers) {
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
