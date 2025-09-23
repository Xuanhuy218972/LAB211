package j1.s.p0011.object;

import j1.s.operation.Validator;

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
        int decimal = 0;
        for (int i = 0; i < hexa.length(); i++) {
            char c = hexa.charAt(i);
            int value;
            if (c >= '0' && c <= '9') {
                value = c - '0';
            } else { // 'A'..'F'
                value = 10 + (c - 'A');
            }
            decimal = decimal * 16 + value;
        }
        return String.valueOf(decimal);
    }

    private String convertHexaToBinary() {
        Decimal deci = new Decimal();
        String decimal = convertHexaToDecimal();
        String binary = deci.convertDecimalToBinary(decimal);
        return binary;
    }

    public void inputHexa(){
        hexa = Validator.checkInputHexa();
    }

    public void convertFromHexaDecimal(){
        int choice = Validator.getChoice( "HexaDecimal" ,"Binary", "Decimal");
        switch (choice) {
            case 1 -> System.out.println("Binary: " + convertHexaToBinary());
            case 2 -> System.out.println("Decimal: " + convertHexaToDecimal());
        }   
    }
}