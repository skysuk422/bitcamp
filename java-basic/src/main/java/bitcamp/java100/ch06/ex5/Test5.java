package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

// 5단계: 인스턴스 변수와 메서드를 활용하여 여러 개의 성적 데이터를 관리하기
public class Test5 {

    static boolean confirm(String message) {
        Scanner keyScan = new Scanner(System.in);
        System.out.print(message);
        String response = keyScan.nextLine().toLowerCase();
            if (response.equals("y") || response.equals("yes"))
            return true;
        return false;
    }

    public static void main(String[] args) {
        
        Score2[] scores = new Score2[100];
        int cursor = 0;


        while (true) {
            Score2 score =new Score2();
            score.Input();
            
            scores[cursor++] = score;
            
            if (!confirm("계속하시겠습니까? "))
                break;
        }
        
        for (int i = 0; i < cursor; i++) {
            scores[i].print();
        }
    }

}
