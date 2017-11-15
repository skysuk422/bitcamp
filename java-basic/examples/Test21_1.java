package bitcamp.java100;

import java.util.Scanner;

//키보드로부터 입력받기
public class Test21_1 {    
    public static void main(String[] args) {
        
        Scanner keyScan = new Scanner(System.in);
        
        System.out.print("입력하세요:");
        String line = keyScan.nextLine();
        
        System.out.print(line);
        
        keyScan.close();
    }
}

 


