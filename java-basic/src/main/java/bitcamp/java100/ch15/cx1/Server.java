package bitcamp.java100.ch15.cx1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
   public static void main(String[] args) throws IOException {

      ServerSocket ss = new ServerSocket(9999);

      System.out.println("서버를 실행하였다.");

      Socket socket = ss.accept();

      System.out.println("클라이언트와 연결 되었음");

      System.out.printf("서버 ip = %s\n", socket.getLocalAddress().getHostAddress());
      System.out.printf("서버 port = %d\n ", socket.getLocalPort());

      System.out.printf("클라이언트 ip = %s\n ", socket.getInetAddress().getHostAddress());
      System.out.printf("클라이언트 port = %d\n ", socket.getPort());

      socket.getPort();

      ss.close();

      System.out.println("서버를 종료하였다.");
   }

}