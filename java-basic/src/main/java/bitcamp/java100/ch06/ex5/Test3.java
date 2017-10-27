package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

// 3단계: 클래스 분리
public class Test3 {
    


    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);
        
        Score1.InputScore();
        Score1.computeScore();
        Score1.printScore();

    }

}
