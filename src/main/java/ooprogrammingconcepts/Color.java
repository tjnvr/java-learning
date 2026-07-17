package ooprogrammingconcepts;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum Color {
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m");

    private final String code;

    String code() {
        return code;
    }
}
