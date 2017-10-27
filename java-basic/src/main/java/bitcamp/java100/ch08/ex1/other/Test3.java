package bitcamp.java100.ch08.ex1.other;

import bitcamp.java100.ch08.ex1.A;

public class Test3 extends A {

    public static void main(String[] args) {
        
//        A.v1 = 100; // private 접근 불가 // 
        
//        A.v2 = 200; // default  접근불가
        
        A.v3 = 300; // protected  ok! 
        
        A.v4 = 400; // public ok! / 전체 공개
    }

}
