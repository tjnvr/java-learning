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
        if (index >= 0 && index < str.length())
            return str.charAt(index);

        throw new IndexOutOfBoundsException();
    }

    @Override
    public CharSequence subSequence(int start, int end) {
         if(start >= str.length() || end >= str.length() || start > end)
            throw new IndexOutOfBoundsException();

         return str.substring(start, end);
    }
}
