package C3070117;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class C3070117 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] arr = new int[4][4];

        IntStream.range(0,4).forEach(i ->{
            arr[i] = IntStream.range(0, 16).map(j -> rand.nextInt(10)).toArray();
        });

        IntStream.range(0, 4).forEach(i -> {
            Arrays.stream(arr[i]).forEach(j -> System.out.println(j + " "));
            System.out.println();
        });
    }
}
/*
    int[][] arr = new int[4][4];

    for (int i = 0; i < 4; i++) {
        for(int j = 0; j <4 ; j++){
            arr[i][j] = rand.nextInt(10);
        }
    }
*/
//    int[][] arr = IntStream.range(0, 4).mapToObj(i -> IntStream.range(0, 16).map(j -> rand.nextInt(10)).toArray()).toArray(int[][]::new);
/*
    int[][] arr = new int[4][4];

    for (int i = 0; i < 4; i++) {
        arr[i] = IntStream.range(0, 16).map(j -> rand.nextInt(10)).toArray();
    }
*/


