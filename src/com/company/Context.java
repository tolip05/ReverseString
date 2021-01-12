package com.company;

import com.company.commands.ReverseString;

public class Context {
    private ReverseString reverseString;

    public Context(ReverseString reverseString) {
        this.reverseString = reverseString;
    }

    public void executeStrategy(String text){
        this.reverseString.printReverseString(text);
    }
}
