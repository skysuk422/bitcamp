package bitcamp.java100.ch15.cx1;

import java.net.Socket;

	public class Client {

	   public static void main(String[] args) throws Exception {
	   
	      Socket socket = new Socket("192.168.0.53", 9999);
	      System.out.println("������ ����Ǿ���");
	      
	      System.out.printf("Ŭ���̾�Ʈ ip = %s\n", socket.getLocalAddress().getHostAddress());
	      System.out.printf("Ŭ���̾�Ʈ port = %d\n ", socket.getLocalPort());

	      System.out.printf("���� ip = %s\n ", socket.getInetAddress().getHostAddress());
	      System.out.printf("���� port = %d\n ", socket.getPort());
	      
	      socket.close();
	      
	   }

	}

