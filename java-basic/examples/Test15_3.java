package bitcamp.java100;
  //연산자 - 다른 타입의 변수와 연산하기
public class Test15_3 {    
    
    public static void main(String[] args) {

        byte b1 = 20, b2 = 22;
        short s1 = 30, s2 = 33;
        int i1 = 40, i2 = 44;
        long l1 = 50, l2 = 55;
        float f1 = 3.14f, f2 = 45.32f;
        double d1 = 4567.8988, d2 = 9876.5432;

        int r1 = b1 + s1;
        r1 = b1 + i1;
        r1 = i1 + s1;

        //r1 = i1 + l1; //계산 결과는 long 타입니다.
        long r2 = i1 + l1; // ok
        r2 = b1 + l1;
        r2 = s2 + l1;

        //long r3 = b1 + f1; // 계산 결과는 float이다. 컴파일 오류
        //r2 = b1 + f1; // 계산 결과는 float이다. 컴파일 오류
        //r3 = i1 + f1; // 계산 결과는 float이다. 컴파일 오류

        float r4 = b1 + f1; 
        r4 = s1 + f1;
        r4 = i1 + f1;
        r4 = l1 + f1;
        
        //float r5 = f1 + d1;

        double r6 = f1 + d1; // ok
        r6 = b1 +d1;
        r6 = s1 +d1;
        r6 = i1 +d1;
        r6 = l1 +d1;
        
    }


}

        
        
        