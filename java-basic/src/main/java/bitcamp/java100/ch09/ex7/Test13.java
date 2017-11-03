package bitcamp.java100.ch09.ex7;

import java.util.ArrayList;
import java.util.Iterator;

public class Test13 {
    public static void main(String[] args) {

        //여러 객체(주소)를 저장할 컬렉션 준비
        ArrayList<String> list = new ArrayList<>();
        
        list.add("홍길동");
        list.add("임꺽정");
        list.add("유관순");

        // Iterator 값을 꺼내주는 객체
        //ArrayList에서 데이터를 꺼내주는 객체를 얻는다.
        Iterator<String> iterator = list.iterator();
        
        // 데이터를 꺼내주는 개체를 통해 ArrayList에서 값을 꺼낸다.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
