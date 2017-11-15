package bitcamp.java100.ch13.ex7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Test2 {
    
    
    
    
    static void m2(int i) throws Exception,
    SQLException, IOException, FileNotFoundException {
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    
    
    static void m3(int i) throws Exception,
    SQLException, IOException, FileNotFoundException {
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }
    
    // Throwable 타입이 아니여서 컴파일 오류
    /*
    static void m4(int i) throws Object{
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }  */
    
    //Throwable 타입이 아닌것은 던질 수 없다.
    /*
    static void m6(int i) throws String {
        switch (i) {
        case 1: throw new Exception();
        case 2: throw new SQLException();
        case 3: throw new IOException();
        case 4: throw new FileNotFoundException();
        }
    }  */
    
    public static void main(String[] args) {
        
    }
}
