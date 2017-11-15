package bitcamp.java100.ch14.ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test1_2 {

 public static void main(String[] args) throws Exception {
        
        // 다음 데이터를 출력해보자!
        // 조건: 국,영,수 각각의 만점은 1000점이다.
        Score3 s = new Score3("홍길동", 800, 900, 1000);
        
        ObjectOutputStream out = new ObjectOutputStream(
                                    new FileOutputStream("test2_new.dat"));
        
        out.writeObject(s);
        
        
        out.close();
        
        System.out.println("출력을 완료했습니다.");
    }
}
