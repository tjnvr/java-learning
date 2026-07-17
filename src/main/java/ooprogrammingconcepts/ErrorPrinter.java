package ooprogrammingconcepts;

public class ErrorPrinter implements Printer {
    @Override
    public void print(String text) {
        System.err.println(text);
    }
}
