package vattenfall.intro.ex1;


import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

final class NumberMachine {
    private final List<Integer> numbers;

    NumberMachine(Integer startVal, Integer endVal) {
        numbers = IntStream.range(startVal, endVal + 1).boxed().collect(toList());
    }

    private NumberMachine(List<Integer> numbers) {
        this.numbers = numbers;
    }

    List<Integer> getEven() {
        return numbers.stream().filter(number -> number % 2 == 0).collect(toList());
    }

    void printValues() {
        numbers.forEach(System.out::println);
    }
}
