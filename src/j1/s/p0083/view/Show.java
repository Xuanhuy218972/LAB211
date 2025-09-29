package j1.s.p0083.view;

import j1.s.operation.Validator;
import j1.s.p0083.model.MyStack;

public class Show {
    public int askCapacity() {
        return Validator.checkNum("Enter stack capacity");
    }

    public int menu() {
        return Validator.getChoice("===== Stack =====",
                "Push",
                "Pop",
                "Get (peek)",
                "Status",
                "Exit");
    }

    public int askPushValue() {
        return Validator.checkNum("Enter value to push");
    }

    public void showPushed(int value) {
        System.out.println("Pushed " + value);
    }

    public void showPushFailed() {
        System.out.println("Stack is full. Cannot push.");
    }

    public void showPopped(Integer value) {
        if (value == null) {
            System.out.println("Stack is empty. Nothing to pop.");
        } else {
            System.out.println("Popped " + value);
        }
    }

    public void showTop(Integer value) {
        if (value == null) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Top value: " + value);
        }
    }

    public void showStatus(MyStack stack) {
        System.out.println("Size: " + stack.size() + "/" + stack.capacity());
        System.out.println("Empty: " + stack.isEmpty() + ", Full: " + stack.isFull());
    }

    public void showExit() {
        System.out.println("Exiting...");
    }
}


