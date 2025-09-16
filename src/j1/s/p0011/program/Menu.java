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
            System.out.println("=========Menu=========");
            System.out.println("1. Convert Binary");
            System.out.println("2. Convert Decimal");
            System.out.println("3. Convert HexaDecimal");
            System.out.println("4. Exit");
            choice = Validator.checkNum("Enter your choice (1-4)");
            switch (choice) {
                case 1:
                    binary.inputBinary();
                    binary.convertFromBinary();
                    break;
                case 2:
                    decimal.inputDecimal();
                    decimal.convertFromDecimal(decimal.getDecimal());
                    break;
                case 3:
                    hexaDecimal.inputHexa();
                    hexaDecimal.convertfromHexaDecimal();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (choice != 4);
    }
}
