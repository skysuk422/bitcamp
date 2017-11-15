package bitcamp.java100.ch14.ex2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Test3_2 {
    public static void main(String[] args) throws Exception {

        FileInputStream in = new FileInputStream(
                new File("sample/jls9.pdf"));

        FileOutputStream out = new FileOutputStream(
                new File("sample/jls9-2.pdf"));

        long start = System.currentTimeMillis();
        byte[] buf = new byte[8192];
        int len = 0;
        
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
        }

        in.close();
        out.close();
        
        System.out.println("파일 복사 완료했음!");
        
        
    }
}
