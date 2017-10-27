package bitcamp.java100.ch06.ex4;
//4단계 : 클래스 분리 계산을 수행하는 코드를 별도의 클래스로 분류해두면
//다른 프로그램을 개발할 떄 재사용하기 쉬울 것이다.abstract그래서 각각의 기능별로 묶어서
//분리하는 것이다.
public class Test4 {
    
   
    
    public static void main(String[] args) {

        Calculator1.plus(2);
        Calculator1.plus(5);
        Calculator1.multiple(3);
        Calculator1.minus(7);
        Calculator1.divide(2);
        
        System.out.println(Calculator1.result);
    }
}
