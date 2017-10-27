package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

// 4단계: 여러 개의 성적 데이터를 다룰 때 문제점
public class Test4 {

    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
            if (response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }

    public static void main(String[] args) {

        Scanner keyScan = new Scanner(System.in);

        while (true) {
            Score1.InputScore();
            Score1.computeScore();
            Score1.printScore();

            if (!confirm("계속하시겠습니까? "))
                break;

        }
    }

}
