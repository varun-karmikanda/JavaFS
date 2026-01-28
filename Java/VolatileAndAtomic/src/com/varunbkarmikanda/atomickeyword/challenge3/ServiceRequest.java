package com.varunbkarmikanda.atomickeyword.challenge3;

import com.varunbkarmikanda.atomickeyword.challenge3.utils.LogActivity;

public class ServiceRequest implements Runnable{

    private String name;

    public ServiceRequest(String name){
        this.name = name;
    }

    @Override
    public void run() {
        UserSession.currentUser.set(name);
        new LogActivity().logActivity();
        UserSession.currentUser.remove();
    }
}
