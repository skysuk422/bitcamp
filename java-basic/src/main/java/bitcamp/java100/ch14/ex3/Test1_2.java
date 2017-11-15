package bitcamp.java100.ch14.ex3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test1_2 {

    public static void main(String[] args) throws UnsupportedEncodingException, IOException  {

        Score s = new Score("홍길동", 800, 900, 1000);
        
        FileOutputStream out = new FileOutputStream("test2.dat");
        
        MyDataOutputStream out2 = new MyDataOutputStream(out);
        
        out2.writeUTF(s.getName());
        out2.writeInt(s.getKor());
        out2.writeInt(s.getEng());
        out2.writeInt(s.getMath());
        
        out.close();
        
        System.out.println("출력을 완료하였습니다.");
    }
    

}
