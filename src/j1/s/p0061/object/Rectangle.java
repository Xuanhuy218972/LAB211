/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package j1.s.p0061.object;
import j1.s.operation.Validator;

/**
 *
 * @author hxhba
 */
public class Rectangle extends Shape {
     private double length;
     private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }
    
    public void setLength(double length) {
        this.length = length;   
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width; 
    }

    
     @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void printResult() {
         System.out.println("-----Rectangle-----");
          System.out.println("Width: " + width);  
         System.out.println("Length: " + length);
           
                System.out.println("Area: " + getArea());
                    System.out.println("Perimeter: " + getPerimeter());
    }

    @Override
    public void input() {
        width = Validator.getDouble(1, 1000, "Please input side width of Rectangle: ");
        length = Validator.getDouble(1, 1000, "Please input length of Rectangle: ");
        
    }
     
}
