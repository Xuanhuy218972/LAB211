package J1.S.P0050.program;

import J1.S.operation.Validator;
import J1.S.P0050.object.NumberChecks;

public class Menu {

    public void displayProgram() {
        while (true) {
            displayMenu();
            int choice = Validator.checkInputIntLimit(1, 3);
            switch (choice) {
                case 1 -> superlativeEquation();
                case 2 -> quadraticEquation();
                case 3 -> {
                    System.out.println("Exiting program...");
                    return;
                }
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n======= MENU =======");
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void superlativeEquation() {
        System.out.print("Enter A: ");
        double a = Validator.checkInputDouble();
        System.out.print("Enter B: ");
        double b = Validator.checkInputDouble();

        double x = -b / a;
        System.out.println("Solution: x = " + x);

        NumberChecks.printClassifications(a, b, x);
    }

    private static void quadraticEquation() {
        System.out.print("Enter A: ");
        double a = Validator.checkInputDouble();
        System.out.print("Enter B: ");
        double b = Validator.checkInputDouble();
        System.out.print("Enter C: ");
        double c = Validator.checkInputDouble();

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("No real roots.");
            return;
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);

        NumberChecks.printClassifications(a, b, c, x1, x2);
    }
}
