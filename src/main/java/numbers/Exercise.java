package numbers;

import lombok.val;

public class Exercise {

    public static void main(String[] args) {
        val x = 65;
        System.out.format("Integer.toHexString(%d)=%s%n", x, Integer.toHexString(x));
        val y = "230";
        System.out.format("Integer.parseInt(%s,5)=%d%n", y, Integer.parseInt(y, 5));
        System.out.format("Double.isNaN(Double.NaN)=%b%n", Double.isNaN(Double.NaN));
    }
}
