package bitcamp.java100;

import java.io.Console;

//문자(숫자와 알바벳) 입력 받아 꺼꾸로 변경
public class Test21_4_3 {    
    
static Console console;
    
    static void prepareConsole() {
 Console console = System.console();
        
        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
    }
    
    public static void main(String[] args) {
        
        Console console = System.console();
        
        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        
        
        String sen = console.readLine("문자열?");
        System.out.printf("입력한 값: %s\n", sen);
        System.out.print("거꾸로 바꾼 값: ");
        
        for(int i = sen.length() -1; i >= 0; i--) {
            System.out.print(sen.charAt(i));
        }
       
    }
}

 


