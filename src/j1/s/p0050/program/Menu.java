package j1.s.p0050.program;

import j1.s.p0050.utils.EquationSolver;
import j1.s.operation.Validator;

public class Menu {

    public void displayProgram() {
        EquationSolver solver = new EquationSolver();
        while (true) {
            int choice = Validator.getChoice("======= MENU =======",
                    "Calculate Superlative Equation",
                    "Calculate Quadratic Equation",
                    "Exit");
            switch (choice) {
                case 1 -> solver.superlativeEquation();
                case 2 -> solver.quadraticEquation();
                case 3 -> {
                    System.out.println("Exiting program...");
                    return;
                }
            }
        }
    }
}
