package org.example;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static List<Task> _menuItems = null;

    public static List<Task> getMenuItems()
    {
        if (_menuItems == null)
        {
            _menuItems = new ArrayList<Task>();
            _menuItems.add(new Exit());
            _menuItems.add(new HelloWorld());
            _menuItems.add(new Calc());
            _menuItems.add(new RecursionDate());
            _menuItems.add(new TaskStrings());
        }
        return _menuItems;
    }

    public static void printMenu()
    {
        List<Task> menuItems = getMenuItems();
        Printer.PrintMessage("Menu:");
        Printer.PrintMessage("-------------------------------------");
        for (int i = 0; i < menuItems.size(); i++)
        {
           Printer.PrintMessage("  [" + i + "] : " + menuItems.get(i).getTitle());
        }
        Printer.PrintMessage("-------------------------------------");
    }

    public static Task getSelectedItem()
    {
        List<Task> menuItems = getMenuItems();
        int i = 0;
        while (true)
        {
            Printer.PrintMessage("Enter menu number");
            i = Reader.getNumber();
            if ((i < 0) || (i >= menuItems.size()))
            {
                Printer.PrintMessage("ERROR: Number must be >=0 and <"+menuItems.size());
                continue;
            }

            return menuItems.get(i);
        }
    }
}