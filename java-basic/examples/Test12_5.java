package bitcamp.java100;
  
public class Test12_5{    
    
    public static void main(String[] args) {
    
    byte b1;
    
    b1 = 100;
    b1 = -128;
    b1 = 127;
    
    // b1 = -129; //컴파일 오류

    short s1;
    s1 = -32768;
    s1 = -32767;

    // s1 = -32769; //컴파일오류
    // s1 = 32768;  //컴파일오류

    int i1;
    i1 = -21_4748_3648;
    i1 = 21_4748_3647;

    // i1 = -21_4748_3649L; //컴파일오류
    // i1 = 21_4748_3648L;  //컴파일오류

    // b1 = 100L; //컴파일 오류!
    // s1 = 100L; //컴파일 오류!
    // i1 = 100L; //컴파일 오류!

    long l1;
    l1 = -922_3372_0368_5477_5808L;
    l1 = 922_3372_0368_5477_5807L;
    

    } 
}