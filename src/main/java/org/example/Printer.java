package org.example;

public class Printer {

    public static void PrintMessage(String n)
    {
        System.out.println(n);
    }

    public static void PrintF(String n,Object ... args){
        System.out.printf(n,args);
    }


}
