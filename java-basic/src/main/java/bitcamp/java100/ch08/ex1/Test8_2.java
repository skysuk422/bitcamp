package bitcamp.java100.ch08.ex1;

class Score2 {
    String name;
    int kor;
    int eng;
    int math;

    // sum과 aver는 kor, eng, math를 계산과 결과를 저장하는 변수이다.
    //외부에 공개해서는 안된다.
    private int sum;
    private float aver;

    public void compute() {
        this.sum = this.kor + this.eng + this.math;
        this.aver = this.sum / 3f;
    }

    public int getSum() {
        return this.sum;
    }

    public float getAver() {
        return this.aver;
    }
}

public class Test8_2 {

    public static void main(String[] args) {

        Score2 s = new Score2();
        s.name = "홍길동";
        s.kor = 100;
        s.eng = 90;
        s.math = 80;

        // sum과 aver는 private으로 접근이 제한되어 값을 넣을 수 없다.
        //s.sum = 280;
        //s.aver = s.sum / 3f;
        //대신 sum과 aver의 값을 계산해주는 공개 메서드를 사용하라

        s.compute();

        System.out.printf("%s, %d, %d, %d, %d, %f\n",
                s.name, s.kor, s.eng, s.math, s.getSum(), s.getAver());

        s.eng = 50;
        
        s.compute();
    }

}
