package bitcamp.java100.ch15.ex3;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(9999);

		System.out.println("������ �����Ͽ���.");


			Socket socket = ss.accept();
			
			Scanner in = new Scanner(socket.getInputStream());

			String line = in.nextLine();
			
			PrintStream out = new PrintStream(socket.getOutputStream());
			
			
			out.print(line);

			in.close();
			out.close();
			socket.close();

		System.out.println("������ �����Ͽ���.");
	}

}