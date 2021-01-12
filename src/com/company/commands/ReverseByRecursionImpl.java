package com.company.commands;

import com.company.io.Write;

public class ReverseByRecursionImpl implements ReverseString {
    private Write write;

    public ReverseByRecursionImpl(Write write) {
        this.write = write;
    }

    @Override
    public void printReverseString(String text) {
        this.write.write(this.reverseString(text));
    }

    private String reverseString(String text){
        if (text.isEmpty())
            return text;
        return reverseString(text.substring(1)) + text.charAt(0);
    }
}
