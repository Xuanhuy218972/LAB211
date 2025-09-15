package J1.S.P0011.program;
import J1.S.operation.Validator;
import J1.S.P0011.object.Binary;
import J1.S.P0011.object.Decimal;
import J1.S.P0011.object.HexaDecimal;

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
