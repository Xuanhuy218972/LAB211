package J1.S.operation;
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Validator {
    private static final Scanner IN = new Scanner(System.in);
    private Validator() {
    }

    private static String askLine(String prompt) {
        if (prompt != null && !prompt.isEmpty()) {
            System.out.print(prompt);
        }
        return IN.nextLine().trim();
    }

    public static String inputNonEmptyLine(Scanner scanner, String prompt) {
        String input;
        while (true) {
            if (prompt != null && !prompt.isEmpty()) {
                System.out.print(prompt);
            }
            input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input must not be empty. Please try again.");
        }
    }

    public static boolean hasAtLeastOneLetter(String text) {
        if (text == null) {
            return false;
        }
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    
    public static String inputLineWithLetters(Scanner scanner, String prompt) {
        while (true) {
            String line = inputNonEmptyLine(scanner, prompt);
            if (hasAtLeastOneLetter(line)) {
                return line;
            }
            System.out.println("Input must contain at least one letter. Please try again.");
        }
    }

    public static int checkNum(String message) {
        while (true) {
            String input = askLine(message == null || message.isEmpty() ? null : message + ": ");
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

    // Backward-compatible alias for legacy misspelling
    public static String chechkInputBinary() { return checkInputBinary(); }

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

    public static int getChoice(String fromType, String toType1, String toType2) {
        while (true) {
            System.out.println("Choose conversion from " + fromType + ":");
            System.out.println("1. Convert to " + toType1);
            System.out.println("2. Convert to " + toType2);
            String input = askLine("Enter your choice (1-2): ");
            try {
                int choice = Integer.parseInt(input);
                if (choice == 1 || choice == 2) {
                    return choice;
                }
                System.out.println("Please enter 1 or 2.");
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter 1 or 2.");
            }
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
                int result = Integer.parseInt(IN.nextLine().trim());
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

    //check user input double
    public static double checkInputDouble() {
        //loop until user input correct
        while (true) {
            try {
                double result = Double.parseDouble(askLine(null));
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Must be input double");
                System.out.print("Enter again: ");
            }

        }
    }
}

    
