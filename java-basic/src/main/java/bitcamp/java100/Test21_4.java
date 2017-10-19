package bitcamp.java100;

import java.io.Console;


public class Test21_4 {    
    public static void main(String[] args) {

        class gugudan{
        // 1.클래스를 선언
        int x;
        // 2.변수선언
        }
       Console console = System.console();
       if (console == null) {
           System.err.println("콘솔을 지원하지 않습니다.");
           System.exit(1);
       }
        
        gugudan g = new gugudan();
        //3.클래스를 가져온다
        g.x = Integer.parseInt(console.readLine("숫자? "));
        // 콘솔 입력창
        
        //조건문 if로 조건을 붙힌다.
        if(1 < g.x && g.x < 10) {
            //반복문을 이용해 구구단 만든다
            
                System.out.printf("[%d 단]\n", g.x);
                for(int j =1; j<=9; j++) {
                    System.out.printf("%d x %d = %d\n", g.x,j,g.x*j);
                }
            System.out.println("---------------");
        }
        //else if와 else를 이용해 조건에 맞지 않을때 출력된다.
        else if(g.x < 0) System.out.println("다음에 또 봐요!");
        else System.out.println("2단에서 9단까지만 가능합니다!");
    }
}





