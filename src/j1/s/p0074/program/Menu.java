package j1.s.p0074.program;
import j1.s.p0074.controller.Caculator;
import j1.s.operation.Validator;

public class Menu {
    public void display() {
        Caculator matrix = new Caculator();
        int choice;
        do {
            choice = Validator.getChoice("=======Calculator program=======",
                    "Addition",
                    "Subtraction",
                    "Multiplication",
                    "Exit");
            switch (choice) {
                case 1:
                    matrix.additionMatrix();
                    break;
                case 2:
                    matrix.subtractionMatrix();
                    break;
                case 3:
                    matrix.multiplicationMatrix();
                    break;
                case 4:
                    return;
                default:
                    break;
            }
        } while (true);
    }
}

