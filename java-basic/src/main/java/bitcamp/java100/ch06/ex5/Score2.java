package bitcamp.java100.ch06.ex5;

import java.util.Scanner;

public class Score2 {
    
    
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    void Input() {
        Scanner keyScan = new Scanner(System.in);
        System.out.print("이름");
        this.name = keyScan.nextLine();

        System.out.print("국어 점수?");
        this.kor = keyScan.nextInt();

        System.out.print("영어 점수?");
        this.eng = keyScan.nextInt();

        System.out.print("수학 점수?");
        this.math = keyScan.nextInt();
        
        this.compute();

        //keyScan.close(); //Scanner는 사용 후 닫아야한다.
    }

    void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

    void print() {
        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                this.name, this.kor, this.eng, this.math, this.sum, this.aver);
    }
}
