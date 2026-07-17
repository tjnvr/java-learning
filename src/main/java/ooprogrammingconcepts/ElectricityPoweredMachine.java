package ooprogrammingconcepts;

import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@SuperBuilder
public class ElectricityPoweredMachine {
    private boolean on;
    private boolean pluggedIn;

    public boolean ready() {
        return pluggedIn && on;
    }
}
