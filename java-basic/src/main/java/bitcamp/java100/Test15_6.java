package bitcamp.java100;
  //연산자 - 연산자 우선순위
public class Test15_6 {    
    
    public static void main(String[] args) {

      int r = 2 + 3 * 4;
      System.out.println(r);

      r = 2+ 3 * 4 - 6 / 3 + 7;
      //= 2 + 12 -2 +7
      //= 14 - 2 + 7
      //= 12 + 7
      //= 19
      System.out.println(r);

      r = (2 + 3)* 4 ;
      System.out.println(r);


  }


}

        
        
        