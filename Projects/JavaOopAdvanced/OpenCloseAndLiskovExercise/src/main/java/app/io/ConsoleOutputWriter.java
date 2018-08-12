package app.io;

import app.interfaces.Writer;

public class ConsoleOutputWriter implements Writer {

    @Override
    public void writeLine(String output) {
        System.out.println(output);
    }
}
