package interfaces;

import lombok.val;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MyCharSequenceTest {

    @Test
    void shouldComputeLength() {
        // given
        val input = RandomStringUtils.randomAlphabetic(ThreadLocalRandom.current().nextInt(1, 100));
        val s = new MyCharSequence(input);

        // expect
        assertThat(s.length()).isEqualTo(input.length());
    }

    @Test
    void shouldGetCharAt() {
        val s = new MyCharSequence("aaaaaaba");
        // expect
        assertThat(s.charAt(7)).toString().equals("b");
    }
}