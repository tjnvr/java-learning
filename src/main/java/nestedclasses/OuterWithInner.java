package nestedclasses;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Outer {

    private int count;

    class Inner {

        void print() {
            System.out.printf("Inner print of count: %d%n", count);
        } // Non static-inner classes can be used to access instance members
    }
}
