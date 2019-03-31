package vattenfall.intro.ex1;


import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class StringConcatenatorTest {

    @Test
    void concatenate() {
        StringConcatenator stringConcatenator = new StringConcatenator("s1", "s2", "s3");
        Supplier<String> concatenate = stringConcatenator.concatenate(new ConcatenationFunction() {
        });
        assertEquals("s1s2s3", concatenate.get());
    }
}