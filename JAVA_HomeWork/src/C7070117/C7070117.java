package C7070117;

/*

    412p. 챕터 7 실습문제 7번

    아래의 C7070210 클래스는 해시맵을 인자로 받아 벡터를 리턴하는 hashToVector() 매소드를 가지고 있다.
    이 메소드는 해시맵 내의 '값(value)'을 모두 Vector<String>에 삽입하여 리턴한다.
    hashToVector()을 작성하라.

*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

public class C7070117 {
    public static void main(String[] args) {
        HashMap<String , String > map = new HashMap<>();
        map.put("아침", "시리얼");
        map.put("점심", "돈까스");
        map.put("저녁", "호떡");
        Vector<String > value = hashToVector(map);
        value.forEach(System.out::println);
    }

    static Vector<String > hashToVector(HashMap<String, String> map){
        Vector<String> value = new Vector<>();
        Iterator<String> keys = map.keySet().iterator();
        keys.forEachRemaining(value::add);
        return value;
    }

}
