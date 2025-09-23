package j1.s.p0051.object;

import j1.s.operation.Validator;

public class NormalCalculator {

    private double memory;

    public NormalCalculator() {
    }

    public void calculator() {
        memory = Validator.getDouble(1, 1000, "Enter number: ");
        while (true) {
            String operator = Validator.checkOperator("Enter operator: ");
            if (operator.equals("=")) {
                System.out.println("Result: " + memory);
                break;
            }
            double nextNumber = Validator.getDouble(1, 1000, "Enter next number: ");
            memory = calculate(nextNumber, operator);
            System.out.println("Memory =" + memory);
        }
    }

    //chuong trinh chinh 
    public double calculate(double nextNumber, String operator) {
        double result = 0;
        switch (operator) {
            case "+" -> result = memory + nextNumber;
            case "-" -> result = memory - nextNumber;
            case "*" -> result = memory * nextNumber;
            case "/" -> result = memory / nextNumber;
            case "^" -> result = Math.pow(memory, nextNumber);
        }
        return result;
    }
}
