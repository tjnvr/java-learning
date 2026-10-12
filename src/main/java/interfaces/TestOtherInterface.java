package interfaces;

public interface TestOtherInterface {
    default void doSomething(){
        System.out.println("I do other things");
    }
}
