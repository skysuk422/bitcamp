package bitcamp.java100.ch15.cx2;

import java.net.Socket;

	public class Client {

	   public static void main(String[] args) throws Exception {
	   
	      Socket socket = new Socket("192.168.0.58", 9999);
	      System.out.println("������ ����Ǿ���");
	      

	      System.out.printf("%s:%d\n",
					socket.getInetAddress().getHostAddress(),
					socket.getPort());
	      socket.close();
	      
	   }

	}

