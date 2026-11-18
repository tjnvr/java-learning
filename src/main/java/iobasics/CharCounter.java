package iobasics;

import lombok.val;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharCounter {

    private final static String FILENAME = "./input.txt";

    public static void main(String[] args) {
        try {
            int c = System.in.read();
            if (c == -1) {
                throw new IOException("Got no character");
            }

            char ch = (char) c;

            val path = Path.of(FILENAME);
            System.out.println(Files.readString(path).chars().filter(i -> i == ch).count());
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }
}
