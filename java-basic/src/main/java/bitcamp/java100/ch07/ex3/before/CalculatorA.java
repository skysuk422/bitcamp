package bitcamp.java100.ch07.ex3.before;

public class CalculatorA {
    int result;

    void multiple(int value) {
        this.result *= value;
    }

    //    void divide(int value) {
    //        this.result /= value;
    //    }
    
    void divide(int value) {
        if (value == 0) {
            System.err.println("0으로 나눌 수 없습니다.");
            return;
        } 
        
    }
    
    void plus(int value) {
        this.result += value;
    }
    void minus(int value) {
        this.result -= value;
    }



}
