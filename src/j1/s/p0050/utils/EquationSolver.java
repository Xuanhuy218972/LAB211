package j1.s.p0050.utils;

import j1.s.operation.Validator;

public class EquationSolver {
    private final NumberChecks numberChecks;

    public EquationSolver() {
        this.numberChecks = new NumberChecks();
    }
    
    public void superlativeEquation() {
        double a = Validator.getDouble(-1000, 1000, "Enter A: ");
        double b = Validator.getDouble(-1000, 1000, "Enter B: ");

        double x = -b / a;
        System.out.println("Solution: x = " + x);

        numberChecks.printClassifications(a, b);
    }
    
    public void quadraticEquation() {
        double a = Validator.getDouble(-1000, 1000, "Enter A: ");
        double b = Validator.getDouble(-1000, 1000, "Enter B: ");
        double c = Validator.getDouble(-1000, 1000, "Enter C: ");

        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("No real roots");
            return;
        }

        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("x1 = " + x1 + ", x2 = " + x2);

        numberChecks.printClassifications(a, b, c);
    }
}
