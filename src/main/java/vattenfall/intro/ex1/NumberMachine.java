package vattenfall.intro.ex1;


import java.util.List;
import java.util.function.Predicate;
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

    //Convert me into lambda
    List<Integer> getEven() {
        return numbers.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        }).collect(toList());
    }

    void printValues() {
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
