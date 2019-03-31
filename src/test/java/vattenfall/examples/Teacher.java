package vattenfall.examples;

import java.math.BigDecimal;

final class Teacher {
    private final PersonalData personalData;
    private final BigDecimal salary;

    Teacher(PersonalData personalData, BigDecimal salary) {
        this.personalData = personalData;
        this.salary = salary;
    }

    PersonalData getPersonalData() {
        return personalData;
    }

    public BigDecimal getSalary() {
        return salary;
    }
}
