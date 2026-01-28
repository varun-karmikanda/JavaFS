package com.varunbkarmikanda.atomickeyword.challenge3.utils;

import com.varunbkarmikanda.atomickeyword.challenge3.UserSession;

public class LogActivity {
    public void logActivity(){
        System.out.println(Thread.currentThread().getName() + " | Performing action for " + UserSession.currentUser.get());
    }
}
