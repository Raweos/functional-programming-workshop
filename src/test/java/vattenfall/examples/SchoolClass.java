package vattenfall.examples;

import java.util.List;

final class SchoolClass {
    private final String className;
    private final List<Student> students;

    SchoolClass(String className, List<Student> students) {
        this.className = className;
        this.students = students;
    }

    public String getClassName() {
        return className;
    }

    List<Student> getStudents() {
        return students;
    }


}
