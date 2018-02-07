package C7090117;

/*

    413p. 챕터 7 실습문제 9번

    하나의 학생 정보는 Student 클래스로 표현한다.
    Student 클래스에는 이름, 학과, 학번, 학점 평균을 나타내는 필드가 있다.
    여기서 학번을 String 타입으로 선언한다.

    키보드에서 학생 정보를 5개 입력받아 학번을 '키' 로 하여 HashMap<String, Student>에 저장하고
    학번으로 학생 정보를 검색하여 출력하는 프로그램을 작성하라.

    다음과 같은 해시맵을 이용하하라.
    HashMap<String, Student> dept = new HashMap<String, Student>();

 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C7090117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Student> dept = new HashMap<>();
        IntStream.range(0, 5).forEach(i ->
            dept.put(s.next(), new Student(s.next(), s.next(), s.next(), s.next()))
        );

        while (true) {
            try {
                Student student = dept.get(s.next());
                System.out.print("이름: " + student.getName());
                System.out.print("\t학과: " + student.getDepartment());
                System.out.print("\t학번: " + student.getSchoolNumber());
                System.out.println("\t평균: " + student.getGradeAverage());
            } catch (NullPointerException e){
                System.out.println("없어");
            }
        }
    }
}
