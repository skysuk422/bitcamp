package bitcamp.java100.ch15.cx1;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
   public static void main(String[] args) throws IOException {

      ServerSocket ss = new ServerSocket(9999);

      System.out.println("������ �����Ͽ���.");

      Socket socket = ss.accept();

      System.out.println("Ŭ���̾�Ʈ�� ���� �Ǿ���");

      System.out.printf("���� ip = %s\n", socket.getLocalAddress().getHostAddress());
      System.out.printf("���� port = %d\n ", socket.getLocalPort());

      System.out.printf("Ŭ���̾�Ʈ ip = %s\n ", socket.getInetAddress().getHostAddress());
      System.out.printf("Ŭ���̾�Ʈ port = %d\n ", socket.getPort());

      socket.getPort();

      ss.close();

      System.out.println("������ �����Ͽ���.");
   }

}