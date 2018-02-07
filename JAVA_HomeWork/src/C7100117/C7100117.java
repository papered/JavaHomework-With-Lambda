package C7100117;

import java.util.HashMap;
import java.util.Scanner;
import java.util.stream.IntStream;

public class C7100117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<String, Location> map = new HashMap<>();

        IntStream.range(0, 5).forEach(i ->
                map.put(s.next(), new Location(s.nextInt(), s.nextInt()))
        );

        while (true) {
            System.out.print("원하는 지명 쓰세요: ");
            try {
                Location lc = map.get(s.next());
                System.out.println(lc.lat + "  " + lc.lng);
            } catch (NullPointerException e) {
                System.out.println("없는거 입력하지 말라고요");
            }
        }
    }
}
