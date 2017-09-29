package bitcamp.java100;
  
public class Test12_7{    
    
    public static void main(String[] args) {
    float f1;
    f1 = 9876567f;
    System.out.println(f1);

    f1 = 9876543456789L; // 8바이트 정수를 4바이트 메모리에 저장.
    System.out.println(f1);

    // f1 = 9876543.4567; //컴파일 오류

    f1 = 9876543.4567f;
    System.out.println(f1);
   
    } 
}