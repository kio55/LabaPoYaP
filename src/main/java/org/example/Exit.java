package org.example;

public class Exit extends Task{
    public Exit()
    {
        _title = "Exit";
    }

    @Override
    public void execute() {
        System.exit(0);
    }
}
