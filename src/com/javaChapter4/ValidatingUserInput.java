package com.javaChapter4;

public class ValidatingUserInput {
    private int passes;
    private int fails;

    public ValidatingUserInput(int passes, int fails) {
        this.passes = 0;
        this.fails = 0;
    }

    public int getPasses() {
        return passes;
    }

    public int getFails() {
        return fails;
    }

    public boolean passIsEqualTo(int newPasses) {
        if (newPasses == 1) {
            this.passes += 1;
        }
        return false;
    }

    public boolean failsIsEqualTo(int newFails) {
        if (newFails == 2) {
            this.fails += 1;
        }
        return false;
    }
}