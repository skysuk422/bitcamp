package bitcamp.java100.ch08.ex1;

public class Test1 {

    public static void main(String[] args) {
        
//        A.v1 = 100; // private 접근 불가 // 무조건 비공개
        
        A.v2 = 200; // default ok! /같은 패키지만 가능
        
        A.v3 = 300; // protected ok! //Test1이 A의 서브 클래스는 아니지만 같은 패키지의 클래스이다.
        
        A.v4 = 400; // public ok! / 전체 공개
    }

}
