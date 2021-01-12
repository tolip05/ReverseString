package com.company.commands;

import com.company.io.Write;

public class ReverseByStringBufferImpl implements ReverseString {
    private StringBuffer stringBuffer;
    private Write write;

    public ReverseByStringBufferImpl(Write write) {
        this.write = write;
        this.stringBuffer = new StringBuffer();
    }

    @Override
    public void printReverseString(String text) {
        this.stringBuffer.append(text);
        this.write.write(this.stringBuffer.reverse().toString());
    }
}
