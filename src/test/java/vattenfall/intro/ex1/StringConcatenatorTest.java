package vattenfall.intro.ex1;


import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;


class StringConcatenatorTest {

    @Test
    void concatenate() {
        StringConcatenator stringConcatenator = new StringConcatenator("s1", "s2", "s3");
        Supplier<String> concatenate = stringConcatenator.concatenate(((s1, s2, s3) -> s1 + s2 + s3));
        assertEquals("s1s2s3", concatenate.get());
    }
}