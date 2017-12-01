package bitcamp.java100.ch20.ex2;

import org.springframework.objenesis.instantiator.sun.MagicInstantiator;

public class MyClass2 {
    public MyClass2() {
        System.out.println("=> MyClass2()");
    }
    public MyClass2(int age) {
        System.out.println("=> MyClass2(int)");
    }
    
    public MyClass2(String name) {
        System.out.println("=> MyClass2(String)");
    }
    
    public MyClass2(int age, String name) {
        System.out.println("=> MyClass2(int,String)");
    }
    
    public MyClass2(String name, int age) {
        System.out.println("=> MyClass2(String,int)");
        
    }

    public static void main(String[] args) {
        
    }
}
