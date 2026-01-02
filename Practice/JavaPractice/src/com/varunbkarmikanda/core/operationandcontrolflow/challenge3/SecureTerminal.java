package com.varunbkarmikanda.core.operationandcontrolflow.challenge3;

public class SecureTerminal {

    private int wrongAttempts = 0;
    private Utils utils;

    public SecureTerminal(Utils utils){
        this.utils = utils;
    }

    public void terminal(){

        utils.terminalMessage();
        boolean isRunning = true;

        do{

            if(wrongAttempts >= 3){
                utils.displayForceClosingMessage();
                isRunning = false;
                continue;
            }

            utils.displayTerminalMessage();

            int input = utils.takeUserInput();

            isRunning = secureSwitch(input, isRunning);


        } while (isRunning);

        System.out.println("SHUT DOWN COMPLETE!");

    }

    public boolean secureSwitch(int input, boolean isRunning){
        switch (input){
            case 1:{
                utils.checkingSystem();
                break;
            }
            case 2:{
                utils.updatedLogs();
                break;
            }
            case 3:{
                utils.secureExit();
                return false;
            }
            default:{
                if(wrongAttempts < 2) utils.wrongInput();
                wrongAttempts++;
            }
        }
        return true;
    }

}
