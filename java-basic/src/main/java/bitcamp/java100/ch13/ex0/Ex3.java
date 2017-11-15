package bitcamp.java100.ch13.ex0;

public class Ex3 {

    public static void main(String[] args) {
        try {
            Exception e = new Exception ("고의로 발생시켰음.");
                    throw e;
           // throw new Exception("고의로 발생시켰음."); 위에 두줄을 한줄로 줄여 쓸수 있음
        } catch (Exception e) {
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("프로그램이 정상 종료되었음.");
    }

}
