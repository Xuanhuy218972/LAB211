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
public class Triangle extends Shape{
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
    
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }
    
    @Override
    public double getArea() {
        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }
    
    @Override
    public void printResult() {
            System.out.println("-----Triangle-----");
            System.out.println("Side A: " + sideA);
             System.out.println("Side B: " + sideB);
              System.out.println("Side C: " + sideC);
               System.out.println("Area: " + getArea());
                System.out.println("Perimeter: " + getPerimeter());
    }
    
    @Override
    public void input() {
        while (true) { 
             sideA = Validator.getDouble(1, 1000, "Please input side A of Triangle: ");
             sideB = Validator.getDouble(1, 1000, "Please input side B of Triangle: ");
              sideC = Validator.getDouble(1, 1000, "Please input side C of Triangle: ");
              if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
                  setSideA(sideA);
                    setSideB(sideB);
                      setSideC(sideC);
                      return;
              } else {
                  System.out.println("The three sides do not form a triangle. Please enter again.");
              }
        }   
       
    }
    
}
