package bitcamp.java100;
// 래퍼 클래스 사용법 - 오토박싱 & 언박싱
public class Test20_2 {    
    public static void main(String[] args) {

        int i = 100;

        //오토 박싱
        Integer r1 = 100;

        Integer r2 = new Integer(300);

        //오토 언박싱
        int i2 = r2;
    }
}



