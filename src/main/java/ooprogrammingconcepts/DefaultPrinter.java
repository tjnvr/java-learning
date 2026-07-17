package ooprogrammingconcepts;

public class DefaultPrinter implements Printer {

    @Override
    public void print(String text) {
        System.out.println(text);
    }
}
