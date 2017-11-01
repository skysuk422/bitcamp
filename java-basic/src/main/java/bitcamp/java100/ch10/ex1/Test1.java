package bitcamp.java100.ch10.ex1;

import bitcamp.java100.ch10.ex1.other.C;

public class Test1 {
    
    public static void main(String[] args) {
        
        A obj = new A();
        
        bitcamp.java100.ch10.ex1.other.B obj2 = new
                bitcamp.java100.ch10.ex1.other.B();
        
        C obj4 = new C();
        
        
//        bicamp.java100.ch10.ex1.other.D obj5 =
//                new bitcamp.java100.ch10.ex1.other.D(); 컴파일 오류 D클래스는 비공개이기 때문!
        
        F obj6 = new F();
        G obj7 = new G();
    }
}
