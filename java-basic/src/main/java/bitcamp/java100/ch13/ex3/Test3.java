package bitcamp.java100.ch13.ex3;

import java.io.FileReader;

public class Test3 {

    public static void main(String[] args) {
        class MyClass {}
        
        class MyClass2 implements AutoCloseable {

            @Override
            public void close() throws Exception {
                System.out.println("close() 호출되었음!");
                
            }
            
        }
        
        
        try (
                //MyClass obj = new MyClass();
                // MyClass는 AutoCloseable을 구현하지 않았기 때문에 컴파일 오류
                
                MyClass2 obj2 = new MyClass2();
               // MyClass는 AutoCloseable을 구현했기 때문에 컴파일 가능
            ) {
            System.out.println("try 블록 실행!");
            
            int r = 20 / 0; //0으로 나누기 떄문에 오류발생

        } catch (Exception e) {
            System.out.println("catch 블록실행!");

        }
        
        
    }


}


