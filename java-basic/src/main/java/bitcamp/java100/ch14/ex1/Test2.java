package bitcamp.java100.ch14.ex1;

import java.io.File;

public class Test2 {

    public static void main(String[] args) throws Exception {
        //File file = new File(".");
        File file = new File("ok.txt");
        
        System.out.printf("파일생성=%b\n", file.createNewFile());
        
        
        System.out.printf("파일삭제=%b\n", file.delete());
        
        File file2 = new File("dir1");
        System.out.printf("디렉토리 생성=%b\n", file2.mkdir());
        //System.out.printf("디렉토리 삭제=%b\n", file2.delete());
        


    }

}
