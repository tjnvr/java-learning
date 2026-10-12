package interfaces;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MyCharSequence implements  CharSequence{

    private final String str;

    @Override
    public int length() {
        return str.length();
    }

    @Override
    public char charAt(int index) {
        return str.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new StringBuilder(str.subSequence(start, end)).reverse();
    }
}
