package bitcamp.java100;
  
public class Test12_9{    
    
    public static void main(String[] args) {
    
    char c1;
    c1 = 44032;
    char c2 = 0xAC00;

    char n1 = 0xC2EC; 
    char n2 = 0xD604; 
    char n3 = 0xC11D;
    
    System.out.printf("%c %c %c\n", n1, n2, n3);
    
    n1 = '심';
    n2 = '현';
    n3 = '석';
   
    System.out.printf("%c %c %c\n", n1, n2, n3);

    char x = '7';
    int num;
    num = x - '0';
    System.out.println(num);

    
} 
}