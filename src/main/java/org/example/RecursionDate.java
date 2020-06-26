package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class RecursionDate extends Task {
    public RecursionDate() {
        _title = "RecursionDate";
    }


    public int AckermannFunction(long m, int n) {
        if (m == 0) return n + 1;
        else if (n == 0) return AckermannFunction(m - 1, 1);
        else return AckermannFunction(m - 1, AckermannFunction(m, n - 1));
    }

    @Override
    public void execute() {

            long days;
            do {
                Printer.PrintMessage("Enter first date: ");
                LocalDate date = Reader.getDate();
                Printer.PrintMessage("Enter second date: ");
                LocalDate date2 = Reader.getDate();
                days = ChronoUnit.DAYS.between(date, date2);

                if (days < 0) {
                    Printer.PrintMessage("Enter date again! ");
                }
            } while (days < 0 || days > 4);

            long resultDate = AckermannFunction(days,0);

            Printer.PrintMessage("AckermannFunction result: " + resultDate);
        }
}
