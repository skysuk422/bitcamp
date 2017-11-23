package bitcamp.java100.ch15.cx1;

import java.net.Socket;

	public class Client {

	   public static void main(String[] args) throws Exception {
	   
	      Socket socket = new Socket("192.168.0.53", 9999);
	      System.out.println("서버와 연결되었음");
	      
	      System.out.printf("클라이언트 ip = %s\n", socket.getLocalAddress().getHostAddress());
	      System.out.printf("클라이언트 port = %d\n ", socket.getLocalPort());

	      System.out.printf("서버 ip = %s\n ", socket.getInetAddress().getHostAddress());
	      System.out.printf("서버 port = %d\n ", socket.getPort());
	      
	      socket.close();
	      
	   }

	}

