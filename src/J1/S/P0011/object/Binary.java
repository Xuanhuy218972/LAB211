package J1.S.P0011.object;

import J1.S.operation.Validator;

public class Binary {
    private String binary;

    public Binary() {
    }
    public Binary(String binary) {
        this.binary = binary;
    }
    public String getBinary() {
        return binary;
    }
    public void setBinary(String binary) {
        this.binary = binary;
    }

    private String convertBinaryToDecimal() {
        int i = 0;
        int decimal = 0;
        int bi = Integer.parseInt(binary);
        while (bi != 0) {
            int temp = bi % 10;
            decimal += (int)(temp * Math.pow(2, i));
            bi/=10;
            i++;
    }
    return String.valueOf(decimal);
    }

    private String convertBinaryToHexa() {
        Decimal deci = new Decimal();
        String decimal = convertBinaryToDecimal();
        String hexa = deci.convertDecimalToHexa(decimal);
        return hexa;
    }

    public void inputBinary() {
        binary = Validator.checkInputBinary();
    }
    
    public void convertFromBinary() {
        int choice = Validator.getChoice("Binary", "Decimal", "HexaDecimal");
        switch (choice) {
            case 1:
                System.out.println("Decimal: " + convertBinaryToDecimal());
                break;
            case 2:
                System.out.println("Hexadecimal: " + convertBinaryToHexa());
                break;
        }
    }
}
