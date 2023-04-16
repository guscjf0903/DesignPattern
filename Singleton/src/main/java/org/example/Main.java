package org.example;

class Printer{
    private static Printer printer = null;

    private Printer(){}

    public static Printer getInstance(){
        if(printer == null){
            printer = new Printer();
        }
        return printer;
    }
}


public class Main {
    public static void main(String[] args) {

    }
}
