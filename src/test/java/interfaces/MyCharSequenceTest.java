package interfaces;

import lombok.val;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MyCharSequenceTest {

    @Test
    void shouldGetLength() {
        // given
        val input = RandomStringUtils.randomAlphabetic(ThreadLocalRandom.current().nextInt(1, 100));
        val s = new MyCharSequence(input);

        // expect
        assertThat(s.length()).isEqualTo(input.length());
    }

    @Test
    void shouldGetCharAt() {
        // given
        val s = new MyCharSequence("aaaaaaba");

        // test
        val res = s.charAt(6);

        // expect
        assertThat(res).isEqualTo('b');
    }

    @Test
    void shouldGetSubSequenceInReverseOrder() {
        // given
        val s = new MyCharSequence("abcdef");

        // test
        val res = s.subSequence(2, 5);

        // expect
        assertThat(res.toString()).isEqualTo("edc");
    }
}