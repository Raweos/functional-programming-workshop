package vattenfall.intro.ex1;

import java.util.function.Supplier;

class StringConcatenator {
    private final String string1;
    private final String string2;
    private final String string3;

    StringConcatenator(String string1, String string2, String string3) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
    }

    Supplier<String> concatenate(ConcatenationFunction concatenationFunction) {
        return () -> concatenationFunction.apply(string1, string2, string3);
    }
}
