package bitcamp.java100.ch12.ex5;

public class Test2 implements D {
    
    @Override
    public void m4() {
        System.out.println("m4()");
    }
// m1은 A에서도 선언되어있어 여기 정의하는 순간 
// A의 메서드를 구현한 것이된다.
    @Override
    public void m1() {
        System.out.println("m1()");
    }

    @Override
    public void m3() {
        System.out.println("m3()");
    }

    @Override
    public void m2() {
       System.out.println("m2()");
        
    }

}
