package ooprogrammingconcepts;

import lombok.val;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class RandomPrinter implements Printer {

    private static final List<Color> AVAILABLE_COLORS = List.of(Color.values());
    private final ColorizedPrinter printer = new ColorizedPrinter(Color.BLUE);
    private final DefaultPrinter defaultPrinter = new DefaultPrinter();

    @Override
    public void print(String text) {
        val inColor = ThreadLocalRandom.current().nextBoolean();
        if (inColor) {
            printer.setColor(randomColor());
            printer.print(text);
            return;
        }

        defaultPrinter.print(text);
    }

    Color randomColor() {
        return AVAILABLE_COLORS.get(ThreadLocalRandom.current().nextInt(0, AVAILABLE_COLORS.size()));
    }
}
