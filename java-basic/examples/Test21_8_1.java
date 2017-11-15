package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;

public class Test21_8_1 {
// 1단계: 변수를 사용하여 사용자가 입력한 값을 저장한다.
    public static void main(String[] args) {

        Console console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }

        String name = console.readLine("이름? ");
        String email = console.readLine("이메일? ");
        String tel = console.readLine("전화? ");

        System.out.println(name);
        System.out.println(email);
        System.out.println(tel);
          
        
    }
}