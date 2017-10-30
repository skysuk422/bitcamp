package bitcamp.java100.ch08.ex7;

public class A2 extends A{

    public void test1() {
        m4();  //상속 받은 public 사용가능!
        m3();  //서브 클래스에서 상속 받은 protected 맴버 사용가능
        m2();  //같은 패키지에서 상속 받은 (default) 맴버 사용가능
        //        m1();  // private 맴버는 오직 그 클래스만 사용가능!! 컴파일오류!
    }
    private void m1() {
        System.out.println("B.m1()");
    }

    void m2() {}

    @Override
    protected void m3() {}    

    @Override
    public void m4() {}
}