package bitcamp.java100;

import java.io.Console;


public class Test21_4_1 {    
    public static void main(String[] args) {

      class Gugudan {
          int x;

        }
        ////////////////////////////////////////////////////////
        Console console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); 
        }
        //////////////////////////////////////////////////////////////
       
        Gugudan g = new Gugudan();
        
        g.x = Integer.parseInt(console.readLine("숫자? "));
        
        if(0 < g.x && g.x < 10) {
            System.out.printf("[%s 단]\n",g.x);
            for(int j = 1; j<=9; j++) {
                System.out.printf("%dx%d=%d\n",g.x,j,g.x*j);
            }
        }

        else if (g.x == 0) System.out.println("다음에 또 봐요!");
        else System.out.println("2단에서 9단까지만 가능합니다!");
    }
}





