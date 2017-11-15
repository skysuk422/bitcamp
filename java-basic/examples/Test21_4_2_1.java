package bitcamp.java100;

import java.io.Console;

//입력 받은 숫자와 개수를 세시오
public class Test21_4_2_1 {    

    static Console console;

    static void prepareConsole() {
        console = System.console();

        if(console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM을 종료한다.
        }
    }
    static long inputNumber() {
        return Long.parseLong(console.readLine("숫자? "));
    }

    static int[] countNumbers(long value) {
        int [] cnt = new int [10];

        while (value > 0) {
            cnt[(int)(value % 10)]++;
            value /= 10;
        }
        return cnt;
    }

    static void printNumberCount(int[] cnt) {
        int x = 0;
        while (x < cnt.length) {
            System.out.printf("%d = %d\n",x,cnt[x]);
            x++;
        }

    }
    public static void main(String[] args) {


        prepareConsole();

        long value = inputNumber();

        int[] cnt = countNumbers(value);

        printNumberCount(cnt);


    }


}










