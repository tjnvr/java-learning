package controlflow;

import lombok.val;

public class ControlFlowDemo {
    public static void main(String[] args) {
        val aNumber = 3;
        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
        }
        System.out.println("third string");
    }
}
