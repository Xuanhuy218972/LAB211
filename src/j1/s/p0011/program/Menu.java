package j1.s.p0011.program;
import j1.s.p0011.object.*;

import j1.s.operation.Validator;

public class Menu {
    public void displayProgram() {
        Binary binary = new Binary();
        Decimal decimal = new Decimal();    
        HexaDecimal hexaDecimal = new HexaDecimal();

        int choice;
        do {
            choice = Validator.getChoice("=========Menu=========",
                "Convert Binary",
                "Convert Decimal",
                "Convert HexaDecimal",
                "Exit");
            switch (choice) {
                case 1 -> {
                    binary.inputBinary();
                    binary.convertFromBinary();
                }
                case 2 -> {
                    decimal.inputDecimal();
                    decimal.convertFromDecimal();
                }
                case 3 -> {
                    hexaDecimal.inputHexa();
                    hexaDecimal.convertFromHexaDecimal();
                }
                case 4 -> System.out.println("Goodbye!");
            }
        } while (choice != 4);
    }
}
