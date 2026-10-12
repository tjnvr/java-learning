package interfaces;

public interface TestInterface {
    default void doSomething(){
        System.out.println("I do something");
    };
}
