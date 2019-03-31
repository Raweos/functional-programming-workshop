package vattenfall.examples;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.junit.MatcherAssert.assertThat;

final class StreamExamplesTest {
    private SchoolClass schoolClass;

    @BeforeEach
    void initTestData() {
        List<Teacher> teachers = List.of(
                new Teacher(new PersonalData("Mietek", "Makaron"), new BigDecimal(2000)),
                new Teacher(new PersonalData("Marek", "Maslo"), new BigDecimal(3000)),
                new Teacher(new PersonalData("Marek", "Kowal"), new BigDecimal(5000)));
        List<Student> students = List.of(
                new Student(new PersonalData("Stefan", "Kasztanowski"), "math", teachers),
                new Student(new PersonalData("Tomasz", "Kebab"), "math", teachers),
                new Student(new PersonalData("Aneta", "Kometa"), "history", teachers.subList(0, 1))
        );
        schoolClass = new SchoolClass("1A", students);
    }

    @Test
    @DisplayName("Students whose favorite subject is math")
    void filterExample() {
        List<Student> mathStudents = schoolClass
                .getStudents()
                .stream()
                .filter(student -> student.getFavoriteSubject().equals("math"))
                .collect(Collectors.toList());

        mathStudents.forEach(
                student -> assertThat(student.getFavoriteSubject(), is("math"))
        );
    }

    @Test
    @DisplayName("Map students to their favorite subject")
    void mapExample() {
        Set<String> subjects = schoolClass.getStudents()
                .stream()
                .map(Student::getFavoriteSubject)
                .collect(Collectors.toSet());

        assertThat(subjects, is(Set.of("math", "history")));
    }

    @Test
    @DisplayName("Reduce students to string containing all their names")
    void reduceExample() {
        String allNames = schoolClass.getStudents()
                .stream()
                .map(student -> student.getPersonalData().getName())
                .reduce("Names:", (name1, name2) -> name1 + " " + name2);

        assertThat(allNames, is("Names: Stefan Tomasz Aneta"));
    }

    @Test
    @DisplayName("Flat map students to their teachers")
    void flatMapExample() {
        List<Teacher> teachers = schoolClass.getStudents()
                .stream()
                .flatMap((student -> student.getTeachers().stream()))
                .peek(teacher -> System.out.println(teacher.getPersonalData().getSurname()))
                .collect(Collectors.toList());

        assertThat(teachers, hasSize(7));
    }

    @Test
    @DisplayName("Group students by their favorite subjects")
    void groupingExample() {
        Map<String, List<Student>> studentSubjectMap = schoolClass.getStudents()
                .stream()
                .collect(groupingBy(Student::getFavoriteSubject));

        assertThat(studentSubjectMap.get("math"), is(List.of(schoolClass.getStudents().get(0), schoolClass.getStudents().get(1))));
        assertThat(studentSubjectMap.get("history"), is(List.of(schoolClass.getStudents().get(2))));
    }
}
