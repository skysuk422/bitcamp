package bitcamp.java100.ch15.ex3;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

	public class Client2 {

	   public static void main(String[] args) throws Exception {
		   
		   Scanner keyScan = new Scanner(System.in);
		   
		   System.out.print("���� �޽���:");
		   String message = keyScan.nextLine();
		   
		   System.out.print("�����ּ�:");
		   String serverAddr = keyScan.nextLine();
		   
		   keyScan.close();
	   
	      Socket socket = new Socket(serverAddr, 9999);
	      System.out.println("������ ����Ǿ���");
	      
	      PrintStream out = new PrintStream(socket.getOutputStream());
	      out.println(message);
	      
	      Scanner in = new Scanner(socket.getInputStream());
	      String line = in.nextLine();
	      
	      System.out.println(line);
	      
	      out.close();
	      in.close();

	      socket.close();
	      
	   }

	}

