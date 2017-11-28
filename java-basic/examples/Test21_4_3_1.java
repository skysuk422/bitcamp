package bitcamp.java100;

import java.io.Console;

//문자(숫자와 알바벳) 입력 받아 꺼꾸로 변경
public class Test21_4_3_1 {    
    public static void main(String[] args) {

        Console console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }

        String str = console.readLine("숫자? ");

        StringBuffer buf = new StringBuffer();
        buf.append(str);
        
        int len = buf.length() / 2;
        
        for (int left = 0, right = buf.length() -1; left < len; left++, right--) {
            char ch = buf.charAt(left);
            buf.setCharAt(left, buf.charAt(right));
            buf.setCharAt(right, ch);
        }
        System.out.printf("입력 문자열: %s\n", str);
        System.out.printf("변경 문자열: %s\n", buf);
    }
}





