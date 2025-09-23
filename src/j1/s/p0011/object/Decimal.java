package j1.s.p0011.object;

import j1.s.operation.Validator;

public class Decimal {
    private String decimal;

    private final char[] HEXA_DIGIT = {
        '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };

    public Decimal() {
    }
    public Decimal(String decimal) {
        this.decimal = decimal;
    }
    public String getDecimal() {
        return decimal;
    }
    public void setDecimal(String decimal) {
        this.decimal = decimal;
    }

    public String convertDecimalToBinary(String decimal) {
        String integer = "";
        int deci = Integer.parseInt(decimal);
        while (deci != 0) {
            integer = (deci % 2) + integer;
            deci /= 2;
        }
        return integer;        
    }

    public String convertDecimalToHexa(String decimal) {
        String hexa = "";
        int deci = Integer.parseInt(decimal);
        while (deci != 0) {
            hexa = HEXA_DIGIT[deci % 16] + hexa;
            deci /= 16;
        }
        return hexa;
    }

    public void inputDecimal() {
        decimal = Validator.checkInputDecimal();
    }

    public void convertFromDecimal() {
        int choice = Validator.getChoice("Decimal", "Binary", "HexaDecimal");
        switch (choice) {
            case 1 -> System.out.println("Binary: " + convertDecimalToBinary(this.decimal));
            case 2 -> System.out.println("HexaDecimal: " + convertDecimalToHexa(this.decimal));
        }
    }
}
