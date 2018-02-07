package C7090117;

public class Student {

    public Student(String name, String department, String schoolNumber, String gradeAverage) {
        this.name = name;
        this.department = department;
        this.schoolNumber = schoolNumber;
        this.gradeAverage = gradeAverage;
    }

    private String name;
    private String department;
    private String schoolNumber;
    private String gradeAverage;

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public String getSchoolNumber() {
        return schoolNumber;
    }

    public String getGradeAverage() {
        return gradeAverage;
    }
}
