package com.varunbkarmikanda.core.javabasics.challenge2;

public class C2_Char {

    private char secretGrade;

    public C2_Char(char secretGrade){
        this.secretGrade = secretGrade;
    }

    public void printNext2Chars(){
        for (int i = 1; i <= 2; i++) {
            System.out.println((char) (secretGrade + i));
        }
    }

}
