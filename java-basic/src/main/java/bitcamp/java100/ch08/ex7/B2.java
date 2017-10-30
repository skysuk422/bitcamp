package bitcamp.java100.ch08.ex7;

public class B2 extends B{
    
//    void m1(int a, String s) {} //ok
//    protected void m1(int a, String s) {} //ok    
//    public void m1(int a, String s) {} //ok
//    void m1(int x, String y) {} // ok 파라미터명은 달라도 된다.
    
//    int m1(int a, String s) {}  // 컴파일 오류!
//    void m1_1(int am String s) {} // 새 메서드 추가 한 것!
     void m1 (String a, String s) {} // 파라미터의 타입이 다르면 새 메서드 추가한 것!
     void m1(String s, int a) {} // 파라미터의 순서가 다르면 새 메서드 추가한 것!
     void m1(int a) {} // 파라미터의 개수가 다르면 새 메서드 추가한 것!
     
    
}
