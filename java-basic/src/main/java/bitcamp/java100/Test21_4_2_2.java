package bitcamp.java100;

import java.io.Console;

//입력 받은 숫자와 개수를 세시오
public class Test21_4_2_2 {    
    
    static Console console;
    
    static void prepareConsole() {
 Console console = System.console();
        
        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
    }
    
    static StringBuffer inputNumber() {
        StringBuffer buf = new StringBuffer(console.readLine("숫자? "));
        return buf;
    }
    
    static int[] NumberCount(StringBuffer buf) {
        int[] cnt = new int[10];
        
        for(int i = 0; i < buf.length(); i ++) {
            cnt[buf.charAt(i) -'0']++;
        }
        return cnt;
    }
    
    static void printNumberCount(int[] cnt) {
        for (int i = 0; i < cnt.length; i++) {
            System.out.printf("%d = %d\n", i, cnt[i]);
        }
        
    }
    public static void main(String[] args) {
        
        prepareConsole();
        
        StringBuffer buf = inputNumber();
        
        int[] cnt = NumberCount(buf);
        
        printNumberCount(cnt);
        
        
        
    }
}

 


