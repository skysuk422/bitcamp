package bitcamp.java100;

//메서드 - 로컬 변수와 스택 메모리
public class Test17_12 {    
    
    static void m1(int value) {
        value += 50;
        m1(value);
        System.out.printf("m1(): %d\n" ,value);
    }
    
    
    
    public static void main(String[] args) {
        int value = 100;
        m1(value);
        System.out.printf("main: %d\n" ,value);
    }
}





