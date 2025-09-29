package j1.s.p0004.controller;

import j1.s.operation.Validator;
import j1.s.p0004.model.Array;
import j1.s.p0004.view.Show;

public class Controller {
    public void start() {
        int n = Validator.checkNum("Enter the size of the array");
        int max = Validator.checkNum("Enter the scope of the array values (0..scope)");

        Array arr = new Array(n);
        arr.fill(max);

        int[] before = arr.copy();
        arr.sort();
        int[] after = arr.copy();

        new Show().print(before, after);
    }
}


