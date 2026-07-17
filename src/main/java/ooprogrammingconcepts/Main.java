package ooprogrammingconcepts;

import lombok.val;

public class Main {

    public static void main(String[] args) {
        val randomPrintingMachine = PrintingMachine.builder()
            .printer(new RandomPrinter())
            .errorPrinter(new ErrorPrinter())
            .pluggedIn(true)
            .build();

        randomPrintingMachine.setOn(true);
        randomPrintingMachine.setSheets(25);

        for (int i = 0; i < 100; i++) {
            randomPrintingMachine.print("Hello World!");
        }
    }
}
