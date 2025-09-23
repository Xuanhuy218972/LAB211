/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package j1.s.p0008;

import j1.s.operation.Validator;

/**
 *
 * @author hxhba
 */
// Main.java

public class Main {
    public static void main(String[] args) {
        String text = Validator.inputLineWithLetters("Enter your content: ");
        TextCounter counter = new TextCounter(text);
        System.out.println(counter.countWords());
        System.out.println(counter.countLetters());
    }
}
