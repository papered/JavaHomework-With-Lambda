package C7050117;

/*

    411p. 챕터 7 실습문제 5번

    하나의 학생 정보는 Student 클래스로 표현한다.
    Student 클래스에는 이름, 학과, 학번, 학점 평균을 나타내는 필드가 있다.
    키보드로 학생 정보를 5개 입력받아 ArrayList<Student>에 저장한후에
    ArrayList<Student>의 모든 학생 정보를 출력하는 프로그램을 작성하라.

 */


import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C7050117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Student> students = IntStream.range(0,5).mapToObj(i ->
            new Student(s.next(),s.next(),s.nextInt(),s.nextInt())
        ).collect(Collectors.toCollection(ArrayList::new));

        students.forEach(student -> {
            System.out.print("이름: " + student.getName());
            System.out.print("    학과: " + student.getDepartment());
            System.out.print("    학번: " + student.getNum());
            System.out.println("    학점: " + student.getGrade());
        });

    }
}
