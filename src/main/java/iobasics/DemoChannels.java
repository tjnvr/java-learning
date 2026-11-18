package iobasics;

import lombok.SneakyThrows;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.READ;
import static java.nio.file.StandardOpenOption.WRITE;

public class DemoChannels {

    @SneakyThrows
    public static void main(String[] args) {
        Path file = Files.createTempFile("test", ".txt");
        Files.write(file, "AZERTYUIOPQSDFGHJKLMWXCVBN".getBytes());
        String s = "I was here!\n";
        byte data[] = s.getBytes();
        ByteBuffer out = ByteBuffer.wrap(data);

        ByteBuffer copy = ByteBuffer.allocate(12);
        System.out.format("*%s*%n", Files.readString(file));
        try (FileChannel fc = (FileChannel.open(file, READ, WRITE))) {
            // Read the first 12
            // bytes of the file.
            int nread;
            do {
                nread = fc.read(copy);
            } while (nread != -1 && copy.hasRemaining());

            // Write "I was here!" at the beginning of the file.
            fc.position(0);
            while (out.hasRemaining())
                fc.write(out);
            out.rewind();

            System.out.format("*%s*%n", Files.readString(file));
            System.out.println(file.toAbsolutePath());

            // Move to the end of the file.  Copy the first 12 bytes to
            // the end of the file.  Then write "I was here!" again.
            long length = fc.size();
            fc.position(length - 1);
            copy.flip();
            while (copy.hasRemaining())
                fc.write(copy);
            System.out.format("*%s*%n", Files.readString(file));
            while (out.hasRemaining())
                fc.write(out);
            System.out.format("*%s*%n", Files.readString(file));
        } catch (IOException x) {
            System.out.println("I/O Exception: " + x);
        } finally {
            Files.delete(file);
        }
    }
}
