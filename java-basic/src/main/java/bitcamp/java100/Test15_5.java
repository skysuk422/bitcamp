package bitcamp.java100;
  //연산자 - 증가/감소 연산자
public class Test15_5 {    
    
    public static void main(String[] args) {

   
    int a = 10;
    int b = 10;

    // 갑을 1 증가시키기
    a = a + 1;

    // 값을 1 감소시키기
    b = b-1;

    System.out.printf("a=%d,b=%d\n", a, b);

    //1) 전위 증감연산자
    a = 10;
    b = 10;

      ++a; // a = a +1
      --b; // b = b -1
      
      System.out.printf("a=%d,b=%d\n", a, b);

      //2) 후위(post) 증감연산자
      a = 10;
      b = 10;
  
        a++; // a = a +1
        b--; // b = b -1
        
        System.out.printf("a=%d,b=%d\n", a, b);

      a = 10;
      b = 10;
      
      int r1 = ++a;
      int r2 = --b;
      System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a, b, r1, r2);

      a = 10;
      b = 10;
      
      // 할당 연산자(=)는 항상 r-value 쪽이 다 실행된 후에 수행된다.
      r1 = a++;
      r2 = b--;
      System.out.printf("a=%d, b=%d, r1=%d, r2=%d\n", a, b, r1, r2);

      a = 10;
      a = ++a;
      System.out.println(a);

      b = 10;
      b = b++;
      System.out.println(b);

      a = 5;
      r1 = ++a + ++a * ++a;

      System.out.printf("a=%d, r1=%d\n", a, r1);

      a = 5;
      r1 = a++ + a++ * a++;
      System.out.printf("a=%d, r1=%d\n", a, r1);


  }


}

        
        
        