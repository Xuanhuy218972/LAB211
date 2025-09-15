/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1.S.P0010;
import J1.S.operation.Validator;
/**
 *
 * @author hxhba
 */
public class Main {
    public static void main(String[] args) {
        LinearSearch ls = new LinearSearch(Validator.checkNum("Enter the size of the array"));
        ls.addArray(Validator.checkNum("Enter the scope of the array"));
        ls.showArray();
        int rs = ls.findElement(Validator.checkNum("Enter the number to be searched"));
        if(rs >= 0) System.out.println("Element fount at index " + rs);
        else System.out.println("Element not found");     
        }
}
