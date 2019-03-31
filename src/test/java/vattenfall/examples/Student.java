package vattenfall.examples;

import java.util.List;

final class Student {
    private final PersonalData personalData;
    private final String favoriteSubject;
    private final List<Teacher> teachers;

    Student(PersonalData personalData, String favoriteSubject, List<Teacher> teachers) {
        this.personalData = personalData;
        this.favoriteSubject = favoriteSubject;
        this.teachers = teachers;
    }

    List<Teacher> getTeachers() {
        return teachers;
    }

    PersonalData getPersonalData() {
        return personalData;
    }

    String getFavoriteSubject() {
        return favoriteSubject;
    }
}
