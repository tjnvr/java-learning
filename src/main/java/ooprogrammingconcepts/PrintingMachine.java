package ooprogrammingconcepts;


import lombok.Setter;
import lombok.experimental.SuperBuilder;

@SuperBuilder
public class PrintingMachine extends ElectricityPoweredMachine implements Printer {

    private final Printer printer;
    private final Printer errorPrinter;

    @Setter
    private int sheets;

    @Override
    public void print(String text) {
        if (!ready()) {
            return;
        }

        if (sheets <= 0) {
            errorPrinter.print("No more sheets!");
            return;
        }

        printer.print(text);
        sheets--;
    }
}
