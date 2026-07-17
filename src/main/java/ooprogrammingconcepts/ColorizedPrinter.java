package ooprogrammingconcepts;

import lombok.AllArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
public class ColorizedPrinter implements Printer {
    private static final String RESET_CODE = "\u001B[0m";

    private Color color;

    @Override
    public void print(String text) {
        System.out.println(color.code() + text + RESET_CODE);
    }
}