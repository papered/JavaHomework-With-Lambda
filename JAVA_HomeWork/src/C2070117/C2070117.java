package C2070117;

import java.util.Scanner;

public class C2070117 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int y = s.nextInt();
        if (50 < x && x < 100 && 50 < y && y < 100) {
            System.out.println("사각형이 점 안에 있습니다.");
        } else {
            System.out.println("사각형이 점 안에 없는데요");
        }
    }
}
