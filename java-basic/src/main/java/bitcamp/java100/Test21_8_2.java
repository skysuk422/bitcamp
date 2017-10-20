package bitcamp.java100;

import java.io.Console;
import java.util.ArrayList;

public class Test21_8_2 {
    // 2단계 : 배열을 사용하여 여러 개의 값을 저장한다.
    public static void main(String[] args) {

        Console console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1);
        }
        String[] name = new String[3];
        String[] email = new String[3];
        String[] tel = new String[3];
        
        int cursor = 0;
        
        while (cursor < name.length) {
            name[cursor] = console.readLine("이름?");
            email[cursor] = console.readLine("이메일?");
            tel[cursor] = console.readLine("번호?");
            cursor++;
        }
        cursor = 0;
        while (cursor < name.length) {
            System.out.println(name[cursor]);
            System.out.println(email[cursor]);
            System.out.println(tel[cursor]);
            cursor++;
        }
    }
}