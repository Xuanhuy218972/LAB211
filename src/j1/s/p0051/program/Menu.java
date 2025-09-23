package j1.s.p0051.program;

import j1.s.operation.Validator;
import j1.s.p0051.object.*;

public class Menu {

    public void program() {
        int choice;
        BMIcalculator bmicalc = new BMIcalculator();
        NormalCalculator ncalc = new NormalCalculator();
        do {
            choice = Validator.getChoice("=========Menu=========",
                    "Normal Calculator",
                    "BMI Calculator",
                    "Exit");
            switch (choice) {
                case 1 ->
                    ncalc.calculator();
                case 2 -> {
                    bmicalc.inputValueOfWeightAndHeight();
                    bmicalc.calculateBMI();
                    bmicalc.displayBMI();
                }
                case 3 -> {
                }
            }
        } while (choice != 3);
    }
}
