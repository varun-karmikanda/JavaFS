package com.varunbkarmikanda.core.staticandfinal.challenge1;

public class DatabaseClient extends SystemConfiguration{

//    showConfig()' cannot override 'showConfig()' in 'com.varunbkarmikanda.core.staticandfinal.SystemConfiguration'; overridden method is final
//    @Override
//    public final void showConfig(){}

        public void connect(){
            System.out.println("Connecting to "+ SystemConfiguration.DATABASE_URL);
        }

}
