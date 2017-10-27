package bitcamp.java100.ch06.ex4;
//5단계 : static 변수의 한계
public class Test5 {
    
   
    
    public static void main(String[] args) {

        // 첫 번쨰 식 계산:
        Calculator1.plus(2);
        Calculator1.plus(5);
        Calculator1.multiple(3);
        Calculator1.minus(7);
        Calculator1.divide(2);
        
        System.out.println(Calculator1.result);
        
        //두 번쨰 식 계산:
        
        Calculator1.result = 0;
        Calculator1.plus(3);
        Calculator1.multiple(6);
        Calculator1.minus(5);
        Calculator1.plus(11);
        Calculator1.divide(2);
        
        System.out.println(Calculator1.result);
    }
}
