package bitcamp.java100;
  // 문장 (Statement)
public class Test16_1 {    
    
    public static void main(String[] args) {

        int a = 100;
        {
        //int a = 200; // 컴파일오류
        
        System.out.println(a);
        
        int b = 200;
        
        System.out.println(b);
        {
        
            int C = 300;

            
           }
        }
        
        
        System.out.println(a);
        
        //System.out.println(b); //컴파일오류
    }
}

        
        
        