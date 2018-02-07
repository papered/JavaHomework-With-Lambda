package C4020117;

public class C4020117 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Rectangle s = new Rectangle(1, 1, 2, 3);

        r.show();
        s.show();
        System.out.println(s.square());
        r.set(-2, 2, -1, 4);
        r.show();
        System.out.println(r.square());
        if(r.equals(s)){
            System.out.println("두 삼각형은 같습니다.");
        }
    }
}