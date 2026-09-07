package annotations;

import lombok.extern.jackson.Jacksonized;

public class DoBadThings implements Doer{

    public void doSomething() {
        throw new RuntimeException("Something bad happened");
    }
}
