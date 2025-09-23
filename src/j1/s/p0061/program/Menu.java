package j1.s.p0061.program;
import j1.s.p0061.object.*;
public class Menu {
    Shape rectangle = new Rectangle();
    Shape circle = new Circle();
    Shape triangle = new Triangle();

    public void program() {
       System.out.println("========Calculator Shape Program========");
        rectangle.input();
        circle.input();
        triangle.input();
    }

    public void displayResult() {
        rectangle.printResult();
        circle.printResult();
        triangle.printResult();
    }
}