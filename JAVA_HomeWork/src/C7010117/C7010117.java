package C7010117;
/*

    410p. 챕터 7 실습문제 1번

    Scanner 클래스를 사용하여 10개의 실수 값을 키보드로부터 읽어 벡터에 저장한 후,
    벡터를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.

 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
import java.util.stream.IntStream;

public class C7010117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vector<Double> vec = new Vector<>();

        IntStream.range(0,10).forEach(i -> vec.add(s.nextDouble()));

        double max = vec.get(0);

        for (double val: vec) if (val > max) max = val;
        System.out.println(max);
    }
}
