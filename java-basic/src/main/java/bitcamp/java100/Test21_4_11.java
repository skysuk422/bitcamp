package bitcamp.java100;

import java.io.Console;

//입력 받은 숫자와 개수를 세시오
public class Test21_4_11 {    
    public static void main(String[] args) {

        Console console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
        //int i =  23347651;
        long value = Long.parseLong(console.readLine("숫자? "));
        
        int [] cnt = new int [10];
        
        //while (i < 0) {
            //ent[i % 10]++;
            //i /=10;
        //}
        while (value > 0) {
            cnt[(int)(value % 10)]++;
            value /= 10;
        }
        
        int x = 0;
        while (x < cnt.length) {
            System.out.printf("%d = %d\n",x,cnt[x]);
            x++;
        }
        


    }


}










