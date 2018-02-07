package C7020117;

/*

    410p. 챕터 7 실습문제 2번

    Scanner 클래스를 사용하여 5개의 학점('A', 'B', 'C', 'D', 'F')을 문자로 입력받아 ArrayList에 저장하고,
    ArrayList를 검색하여 학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
    출력하는 프로그램을 작성하라.

 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class C7020117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

         ArrayList<Character> grade = IntStream.range(0,5).mapToObj(i -> s.next().charAt(0)).collect(Collectors.toCollection(ArrayList::new));
         grade.forEach(i ->{
             switch (i){
                 case 'A':
                     System.out.println("Score: 4.0");
                     break;
                 case 'B':
                     System.out.println("Score: 3.0");
                     break;
                 case 'C':
                     System.out.println("Score: 2.0");
                     break;
                 case 'D':
                     System.out.println("Score: 1.0");
                     break;
                 case 'E':
                     System.out.println("Score: 0.0");
                     break;
                 default:
                     System.err.println("Error");
             }
         });


    }

}
