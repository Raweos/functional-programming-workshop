package vattenfall.examples;

final class PersonalData {
    private final String name;
    private final String surname;

    PersonalData(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    String getName() {
        return name;
    }

    String getSurname() {
        return surname;
    }
}
