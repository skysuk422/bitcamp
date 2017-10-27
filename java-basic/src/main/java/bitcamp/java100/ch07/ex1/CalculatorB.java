package bitcamp.java100.ch07.ex1;

public class CalculatorB {
    int result;
    
    void multiple(int value) {
        this.result *= value;
    }
    
    //void divide(int value) {  Test4.java에서 버그 발견으로 코드 변경
      //  this.result /= value;
    //}
   
    void divide(int value) {
        if (value == 0) {
            System.err.println("0으로 나누면 안됩니다!");
            return;
        }
    }
    
    void remainder(int value) {
        this.result %= value;
    }
}
