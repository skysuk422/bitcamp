package bitcamp.java100.ch15.cx2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) throws IOException {

		ServerSocket ss = new ServerSocket(9999, 3);

		System.out.println("������ �����Ͽ���.");

		Scanner scan = new Scanner(System.in);

		for( int i =0; i< 10; i++) {
			System.out.println("Ŭ���̾�Ʈ ����:");
			scan.nextLine();

			Socket socket = ss.accept();

			System.out.println("Ŭ���̾�Ʈ�� ���� �Ǿ���");
			System.out.printf("%s:%d\n",
					socket.getInetAddress().getHostAddress(),
					socket.getPort());
			socket.close();

		}

		System.out.println("������ �����Ͽ���.");
	}

}