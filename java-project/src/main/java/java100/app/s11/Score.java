package java100.app.s11;

import java.util.Scanner;

public class Score {

    String name;
    int[] subjects = new int[3];
    int sum;
    float aver;
    
    Score() {
        
    }

    Score(String name, int kor, int eng, int math) {
        this.name = name;
        this.subjects = new int[] {kor, eng, math};

        this.compute();
    }

    void compute (){
        for (int sub : subjects) {
            sum += sub;
        }
        aver = sum / 3f;
    }

    void print () {
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
                name,
                subjects[0],
                subjects[1],
                subjects[2],
                sum,
                aver);

    }
    
    void input() {
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("이름 ");
        this.name = keyScan.nextLine();
        
        System.out.print("국어점수? ");
        this. subjects[0] = keyScan.nextInt();
        
        System.out.print("영어점수? ");
        this. subjects[1] = keyScan.nextInt();
        
        System.out.print("수학점수? ");
        this. subjects[2] = keyScan.nextInt();
        
        this.compute();
        
        
     }


}


