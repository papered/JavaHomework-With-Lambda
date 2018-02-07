package C7050117;

public class Student {
    public Student(String name, String department, int num, int grade) {
        this.name = name;
        this.department = department;
        this.num = num;
        this.grade = grade;
    }

    private String name;    // 이름
    private String department;     //학과
    private int num;    // 학번
    private int grade;    // 성적

    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getNum() {
        return num;
    }
    public int getGrade() {
        return grade;
    }
}
