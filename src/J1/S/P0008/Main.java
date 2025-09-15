/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package J1.S.P0008;
import java.util.Scanner;

import J1.S.operation.Validator;
/**
 *
 * @author hxhba
 */
// Main.java

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = Validator.inputLineWithLetters( sc, "Enter your content: ");
             
        TextCounter counter = new TextCounter(text);
        System.out.println(counter.countWords());
        System.out.println(counter.countLetters());

        sc.close();
    }
}
