package C3050117;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class C3050117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] arr = IntStream.range(0, 10).map(i -> s.nextInt()).toArray();

        Arrays.sort(arr);

        IntStream.range(0, 10).map(i -> arr[i]).forEach(System.out::println);
    }
}
