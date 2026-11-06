package generics;

import lombok.val;

public class Swaper {

    <T> void swap(T[] a, int fromIndex, int toIndex) {
        val temp = a[fromIndex];
        a[fromIndex] = a[toIndex];
        a[toIndex] = temp;
    }
}