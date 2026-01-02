package com.varunbkarmikanda.core.operationandcontrolflow.challenge3;

public class Test {
    public static void main(String[] args) {
        new Test().run();
    }

    public void run(){
        Utils utils = new Utils();
        SecureTerminal secureTerminal = new SecureTerminal(utils);
        secureTerminal.terminal();
    }
}
