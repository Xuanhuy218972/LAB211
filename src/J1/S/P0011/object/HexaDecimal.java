package J1.S.P0011.object;

import J1.S.operation.Validator;

public class HexaDecimal {
    private String hexa;

    public HexaDecimal() {
    }

    public HexaDecimal(String hexa) {
        this.hexa = hexa;
    }

    public String getHexa() {
        return hexa;
    }

    public void setHexa(String hexa) {
        this.hexa = hexa;
    }

    private  String convertHexaToDecimal() {
        int i = 0; 
        int hex = Integer.parseInt(hexa);
        int decimal = 0;
        while (hex != 0) {
            int temp = hex % 10;
            decimal += temp * Math.pow(16, i);
            hex /= 10;
            i++;
        }
        return String.valueOf(decimal);
    }

    private String convertHexaToBinary() {
        Decimal decimalObj = new Decimal();
        String decimalStr = convertHexaToDecimal();
        String binary = decimalObj.convertDecimalToBinary(decimalStr);
        return binary;
    }

    public void inputHexa(){
        hexa = Validator.CheckInputHexa();
    }

    public void convertfromHexaDecimal(){
        int choice = Validator.getChoice( "HexaDecimal" ,"Binary", "Decimal");
        switch (choice) {
            case 1:
                System.out.println("Binary: " + convertHexaToBinary());
                break;
            case 2:
                System.out.println("Decimal: " + convertHexaToDecimal());
                break;
        }
    }
}
