package bitcamp.java100;
//메서드 - 기본 메서드 정의 IV
public class Test17_5 {    

    static String m1() {
        return "Hello";
    }
    static int m2( ) {
        return 100;
    }
    static boolean m3() {
        return true;
    }
    //static int m4() {return "hello";} //컴파일오류
    //static in m5() {} //컴파일오류

    public static void main(String[] args) {
        
        String v = m1();
        System.out.println(v);
        
        System.out.println(m1());
        
        m1();
        
       
        }
    }





