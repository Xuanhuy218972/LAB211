package J1.S;
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

public class Validator {
    private static final Scanner INTERNAL_SCANNER = new Scanner(System.in);
    private Validator() {
    }

    public static String getNonEmptyLine(Scanner scanner, String prompt) {
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
    
    public static String getLineWithLetters(Scanner scanner, String prompt) {
        while (true) {
            String line = getNonEmptyLine(scanner, prompt);
            if (hasAtLeastOneLetter(line)) {
                return line;
            }
            System.out.println("Input must contain at least one letter. Please try again.");
        }
    }

    public static int checkNum(String message) {
        while (true) {
            if (message != null && !message.isEmpty()) {
                System.out.print(message + ": ");
            }
            String input = INTERNAL_SCANNER.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println("Please enter a non-negative integer.");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }
    }
}


