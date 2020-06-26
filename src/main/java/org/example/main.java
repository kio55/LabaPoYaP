package org.example;

public class main {

    public static void main(String[] args)
    {
        while(true)
        {
            Menu.printMenu();
            Task menuItem = Menu.getSelectedItem();
            menuItem.execute();
        }
    }
}

