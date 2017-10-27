package bitcamp.java100.ch06.ex4;
//6단계 : 인스턴스 변수의 활용
public class Test6 {
    
   
    
    public static void main(String[] args) {
        
        Calculator2 c1 = new Calculator2();
        Calculator2 c2 = new Calculator2();

        // 첫 번쨰 식 계산:
        Calculator2.plus(c1, 2);
        Calculator2.plus(c1, 5);
        Calculator2.multiple(c1, 3);
        Calculator2.minus(c1, 7);
        Calculator2.divide(c1, 2);
        
        System.out.println(c1.result);
        
        //두 번쨰 식 계산:
        
        Calculator2.plus(c2,3);
        Calculator2.multiple(c2, 6);
        Calculator2.minus(c2, 5);
        Calculator2.plus(c2, 11);
        Calculator2.divide(c2, 2);
        
        System.out.println(c2.result);
    }
}
