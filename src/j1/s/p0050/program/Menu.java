package j1.s.p0050.program;

import j1.s.p0050.utils.NumberChecks;
import j1.s.operation.Validator;

public class Menu {

    public void displayProgram() {
        while (true) {
            int choice = Validator.getChoice("======= MENU =======",
                    "Calculate Superlative Equation",
                    "Calculate Quadratic Equation",
                    "Exit");
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

    // displayMenu no longer needed; replaced by Validator.getChoice(title, options)

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
