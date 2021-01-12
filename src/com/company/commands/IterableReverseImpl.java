package com.company.commands;

import com.company.io.Reader;
import com.company.io.Write;

public class IterableReverseImpl implements ReverseString {
    private Write write;

    public IterableReverseImpl(Write write) {
        this.write = write;
    }

    @Override
    public void printReverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            this.write.writeCharacter(text.charAt(i));
        }
        this.write.writeNewLine();
    }
}
