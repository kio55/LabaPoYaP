package org.example;

public class Calc extends Task{

    public Calc()
    {
        _title = "Calc";
    }

    public double GetResult(int X, int Z){
        return Z * Z + 7 + Math.sqrt(X);
    }

    @Override
    public void execute() {
        Printer.PrintMessage("Enter X");
        int X = Reader.getNumber();
        while (X < 0) {
            Printer.PrintMessage("Enter normal X ");
            X = Reader.getNumber();
        }
        Printer.PrintMessage("Enter Z");
        int Z = Reader.getNumber();
        double result = GetResult(X,Z);
        Printer.PrintF("Z^2+7+sqrt(X) = %.3f \n" , result);

    }
}
