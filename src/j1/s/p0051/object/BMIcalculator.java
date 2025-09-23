package j1.s.p0051.object;

import j1.s.operation.Validator;

public class BMIcalculator {

    private double weight;
    private double height;
    private double BMI;

    public BMIcalculator() {
    }

    //nhap gia tri cho weight and height 
    public void inputValueOfWeightAndHeight() {
        weight = Validator.getDouble(1, 300, "Input your weight (kg): ");
        height = Validator.getDouble(1, 300, "Input your height (cm): ");
    }
    //tinh chi so BMI

    public void calculateBMI() {
        BMI = weight / (height / 100 * height / 100);
    }

    //hien thi thong tin cho lop bmi
    public void displayBMI() {
        System.out.println("Your BMI is: " + BMI);
        if (BMI < 19) {
            System.out.println(" Under-standard.");
        } else if (BMI >= 19 && BMI < 25) {
            System.out.println("Standard.");
        } else if (BMI >= 25 && BMI < 30) {
            System.out.println("Overweight.");
        } else if (BMI >= 30 && BMI < 40) {
            System.out.println("Fat");
        } else {
            System.out.println("Very fat.");
        }
    }
}
