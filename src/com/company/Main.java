package com.company;

import com.company.commands.IterableReverseImpl;
import com.company.commands.ReverseByRecursionImpl;
import com.company.commands.ReverseByStringBufferImpl;
import com.company.commands.ReverseString;
import com.company.io.ConsoleReader;
import com.company.io.ConsoleWriter;
import com.company.io.Reader;
import com.company.io.Write;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Reader reader = new ConsoleReader();
        Write write = new ConsoleWriter();
        String toReverse = reader.read();
        ReverseString reverseString = new IterableReverseImpl(write);
        ReverseString reverseStringWithStrinfBuffer =
                new ReverseByStringBufferImpl(write);
        ReverseString reverseString1ByRecursion =
                new ReverseByRecursionImpl(write);
        Context context = new Context(reverseString);
        context.executeStrategy(toReverse);
        context = new Context(reverseStringWithStrinfBuffer);
        context.executeStrategy(toReverse);
        context = new Context(reverseString1ByRecursion);
        context.executeStrategy(toReverse);
    }
}
