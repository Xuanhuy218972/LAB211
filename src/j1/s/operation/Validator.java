package j1.s.operation;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Validator {

    private static final Scanner SC = new Scanner(System.in);

    private Validator() {   
    }

    private static String askLine(String prompt) {
        if (prompt != null && !prompt.isEmpty()) {
            System.out.print(prompt);
        }
        return SC.nextLine().trim();
    }

    public static String inputLineWithLetters(String prompt) {
        while (true) {
            String input = askLine(prompt);
            
            if (input.isEmpty()) {
                System.out.println("Input must not be empty. Please try again.");
                continue;
            }
        
            boolean hasLetter = false;
            for (int i = 0; i < input.length(); i++) {
                if (Character.isLetter(input.charAt(i))) {
                    hasLetter = true;
                    break;
                }
            }
            
            if (hasLetter) {
                return input;
            }
            
            System.out.println("Input must contain at least one letter. Please try again.");
        }
    }

    public static int checkNum(String prompt) {
        while (true) {
            String input = askLine(prompt == null || prompt.isEmpty() ? null : prompt + ": ");
            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println("Please enter a positive integer.");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }

    public static String checkInputBinary() {
        while (true) {
            String input = askLine("Enter binary number: ");
            if (input.isEmpty()) {
                System.out.println("Input must not be empty. Please try again.");
                continue;
            }
            if (isValidBinary(input)) {
                return input;
            }
            System.out.println("Invalid binary number. Please enter only 0s and 1s.");
        }
    }

    public static String checkInputDecimal() {
        while (true) {
            String input = askLine("Enter decimal number: ");
            if (input.isEmpty()) {
                System.out.println("Input must not be empty. Please try again.");
                continue;
            }
            if (isValidDecimal(input)) {
                return input;
            }
            System.out.println("Invalid decimal number. Please enter a valid integer.");
        }
    }

    public static String checkInputHexa() {
        while (true) {
            String input = askLine("Enter hexadecimal number: ").toUpperCase();
            if (input.isEmpty()) {
                System.out.println("Input must not be empty. Please try again.");
                continue;
            }
            if (isValidHexadecimal(input)) {
                return input;
            }
            System.out.println("Invalid hexadecimal number. Please enter valid hex digits (0-9, A-F).");
        }
    }

    public static int getChoice(String title, String... options) {
        if (options == null || options.length == 0) {
            throw new IllegalArgumentException("options must not be empty");
        }
        while (true) {
            if (title != null && !title.isEmpty()) {
                System.out.println(title + ":");
            }
            for (int i = 0; i < options.length; i++) {
                System.out.println((i + 1) + ". " + options[i]);
            }
            int choice = checkNum("Enter your choice (1-" + options.length + ")");
            if (choice >= 1 && choice <= options.length) {
                return choice;
            }
            System.out.println("Please enter a number in range [1, " + options.length + "]");
        }
    }

    private static boolean isValidBinary(String input) {
        for (char c : input.toCharArray()) {
            if (c != '0' && c != '1') {
                return false;
            }
        }
        return true;
    }

    private static boolean isValidDecimal(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    private static boolean isValidHexadecimal(String input) {
        for (char c : input.toCharArray()) {
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F'))) {
                return false;
            }
        }
        return true;
    }

    //check user input number limit
    public static int checkInputIntLimit(int min, int max) {
        //loop until user input correct
        while (true) {
            try {
                int result = Integer.parseInt(SC.nextLine().trim());
                if (result < min || result > max) {
                    throw new NumberFormatException();

                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in range [" + min + ", " + max + "]");
                System.out.print("Enter again: ");
            }
        }
    }

    public static double getDouble(double min, double max, String prompt) {
        while (true) {
            try {
                double result = Double.parseDouble(askLine(prompt));
                if (result < min || result > max) {
                    System.err.println("Please input number in range [" + min + ", " + max + "]");
                    System.out.print("Enter again: ");
                    continue;
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }
        }
    }

    public static String checkOperator(String prompt) {
        while (true) {
            String op = askLine(prompt);
            if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
                return op;
            } else {
                System.err.println("Invalid operator. Please enter one of: +, -, *, /");
                System.out.print("Enter again: ");
            }
        }
    }
}
