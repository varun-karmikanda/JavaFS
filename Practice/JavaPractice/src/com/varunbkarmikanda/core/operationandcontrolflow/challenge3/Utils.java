package com.varunbkarmikanda.core.operationandcontrolflow.challenge3;

import java.util.Scanner;

public class Utils {

    public void terminalMessage(){
        System.out.println("================================SECURE TERMINAL=================================");
    }

    public void displayTerminalMessage(){
        System.out.println("1. CHECK SYSTEM");
        System.out.println("2. UPDATE LOGS");
        System.out.println("3. SECURE EXIT");
        displayTerminalName();
    }

    public void displayForceClosingMessage(){
        System.out.println("MULTIPLE WRONG ATTEMPTS");
        System.out.println("FORCE CLOSING TERMINAL");
    }

    public void displayTerminalName(){
        System.out.print("~$ ");
    }

    public int takeUserInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void checkingSystem(){
        System.out.println("CHECKING SYSTEM...");
    }

    public void updatedLogs(){
        System.out.println("UPDATING LOGS...");
    }

    public void secureExit(){
        System.out.println("EXITING...");
    }

    public void wrongInput(){
        System.out.println("WARNING!! INVALID INPUT.");
    }

}
