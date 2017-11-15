package bitcamp.java100.ch14.ex3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test1_0 {

    public static void main(String[] args) throws UnsupportedEncodingException, IOException  {

        Score s = new Score("홍길동", 80, 90, 100);
        
        FileOutputStream out = new FileOutputStream("test1.dat");
        
        byte[] bytes = s.getName().getBytes("UTF-8");
        
        out.write(bytes.length);
        
        out.write(bytes);
        
        out.write(s.getKor());
        out.write(s.getEng());
        out.write(s.getMath());
        out.write(s.getSum());
       // out.write((int) s.getAver());
        out.close();
        
        System.out.println("출력을 완료하였습니다.");
    }
    

}
