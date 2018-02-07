package C4050117;

import java.util.Scanner;

public class C4050117 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        char op = s.next().charAt(0);

        switch (op){
            case '+':
                Add add = new Add();
                add.setValue(a,b);
                System.out.println(add.calculate());
                break;
            case '-':
                Sub sub = new Sub();
                sub.setValue(a,b);
                System.out.println(sub.calculate());
                break;
            case '*':
                Mul mul = new Mul();
                mul.setValue(a,b);
                System.out.println(mul.calculate());
                break;
            case '/':
                Div div = new Div();
                div.setValue(a,b);
                System.out.println(div.calculate());
                break;
            default:
                System.out.println("잘못 입력했는데요");
        }
    }
}

