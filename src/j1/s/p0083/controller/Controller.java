package j1.s.p0083.controller;

import j1.s.p0083.model.MyStack;
import j1.s.p0083.view.Show;

public class Controller {
    private final Show show = new Show();
    private MyStack stack;

    public void start() {
        int capacity = show.askCapacity();
        stack = new MyStack(capacity);

        while (true) {
            int choice = show.menu();
            switch (choice) {
                case 1: // Push
                    handlePush();
                    break;
                case 2: // Pop
                    handlePop();
                    break;
                case 3: // Get
                    handleGet();
                    break;
                case 4: // Status
                    show.showStatus(stack);
                    break;
                case 5: // Exit (because getChoice starts from 1)
                    show.showExit();
                    return;
                default:
                    // Should not reach here
            }
        }
    }

    private void handlePush() {
        int value = show.askPushValue();
        if (stack.push(value)) {
            show.showPushed(value);
        } else {
            show.showPushFailed();
        }
    }

    private void handlePop() {
        show.showPopped(stack.pop());
    }

    private void handleGet() {
        show.showTop(stack.get());
    }
}


