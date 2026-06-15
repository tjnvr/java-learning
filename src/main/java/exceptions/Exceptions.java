package exceptions;

import lombok.val;

public class Exceptions {

    static void main() {
        /*
            Throwable is the root class of the exception hierarchy
                        ┌─────────────────┐
                        │     Throwable   │
                        └─────────────────┘
                             /        \
                            /          \
                      ┌──────┐     ┌─────────┐
                      │ Error│     │Exception│
                      └──────┘     └─────────┘
                                     /      \
                                    /        \
                            ┌─────────┐   ┌──────────────────┐
                            │ Checked │   │    Unchecked     │
                            └─────────┘   │(RuntimeException)│
                                          └──────────────────┘
            Any class or subclass of Throwable can be throw using a throw statement
         */

        val throwable = new Throwable("Something bad happened!");
        try {
            throw throwable;
        } catch (Throwable t) {
            System.out.printf("throwable.getMessage(): %s%n", throwable.getMessage()); // Something bad happened!
            System.out.printf("throwable.getCause(): %s%n", throwable.getCause()); // null
        }

        /*
            Error is an unchecked type of exception
            such exceptions are typically thrown by the JVM and are not meant to be caught

            Error exceptions to know
            * OutOfMemoryError
            * StackOverflowError
            * NoClassDefFoundError
         */
        val error = new Error("Something bad happened, I'm an error!");
        try {
            throw error;
        } catch (Throwable t) {
            System.out.printf("error.getMessage(): %s%n", throwable.getMessage()); // Something bad happened!
            System.out.printf("error.getCause(): %s%n", throwable.getCause()); // null
        }
        /*
            The exceptions that are not a subtype of RuntimeException are checked exception.
         */
        try {
            willFail();
        } catch (Throwable e) {
            System.out.printf("e.getMessage(): %s%n", e.getMessage()); // I can't!
        }

        /*
            Checked exceptions to know
            * IOException
            * SQLException
            * ClassNotFoundException

            Unchecked exceptions : They are due to programming errors and extends RuntimeExceptions

            * NullPointerException
            * ArrayIndexOutOfBoundsException
            * IllegalArgumentException
            * IllegalArgumentException
         */
    }

    // Will fail returns a checked exception, so it is mandatory to indicate it in the signature of the method
    // The caller need to catch it or inform its caller that content is throwing in its signature
    static void willFail() throws Exception {
        throw new Exception("I can't!");
    }

    // RuntimeException is an unchecked exception (not in the method signature)
    void willThrow() {
        throw new RuntimeException("I can't!");
    }
}
