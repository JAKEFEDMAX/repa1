package org.example;

public class App
{
    public static void main( String[] args )
    {
        System.out.println("Hello World!");
        Tester test=new Tester("Maksim","Bahar",1000,10,3);
        System.out.println(test.toString());
        Tester.printInfo("работает");
    }
}
