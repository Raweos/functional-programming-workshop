package vattenfall.intro.ex1;


import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class NumberMachineTest {

    @Test
    void shouldReturnEvenOnly() {
        //Convert anonymous inner class in getEven method into lambda
        NumberMachine numberMachine = new NumberMachine(0, 8);
        assertEquals(numberMachine.getEven(), List.of(0, 2, 4, 6, 8));
    }

    @Test
    void printText() {
        //Convert printValues method from imperative to functional approach, use method reference syntax
        NumberMachine numberMachine = new NumberMachine(0, 8);
        numberMachine.printValues();
    }
}