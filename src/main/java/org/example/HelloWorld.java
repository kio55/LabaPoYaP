package org.example;

public class HelloWorld extends Task {
    public HelloWorld()
    {
        _title = "HelloWorld";
    }

    @Override
    public void execute() {
        Printer.PrintMessage("Hello, World!");
    }
}
