package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Reader {
    protected static Scanner _scanner = null;

    public static Scanner getScanner()
    {
        if (_scanner == null)
        {
            _scanner = new Scanner(System.in);
        }
        return _scanner;
    }

    public static String getString()
    {
        Scanner scan = getScanner();
        scan.useDelimiter("\\n");
        return scan.next();
    }


    public static int getNumber()
    {
        Scanner scan = getScanner();

        while(!scan.hasNextInt())
        {
            scan.nextLine();
            Printer.PrintMessage("ERROR: Input is not integer!");
        }

        return scan.nextInt();
    }

    public static LocalDate getDate() {
        DateTimeFormatter dateform = DateTimeFormatter.ofPattern("d.MM.yyyy");

        do {
            try {
                Scanner scan = getScanner();
                String dateline = scan.next();
                return LocalDate.parse(dateline, dateform);
            } catch (DateTimeParseException exception) {
                Printer.PrintMessage("Try again");
            }
        } while (true);

    }
}
