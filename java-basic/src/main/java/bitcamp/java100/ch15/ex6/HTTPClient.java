package bitcamp.java100.ch15.ex6;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class HTTPClient {

    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("www.etnews.com", 80);
        System.out.println("서버시작");


        // 요청 데이터를 보낼 출력 스트림 준비
        PrintStream out = new PrintStream( 
                new BufferedOutputStream(
                        socket.getOutputStream()));

        // HTTP 요청 프로토콜에 따라 출력한다.
        // => request-line 출력
        out.println("GET / HTTP/1.1");

        // => 헤더 출력 : 최소한 Host 헤더는 보내야 한다.
        out.println("Host: www.etnews.com");

        // => 빈줄 출력
        out.println();
        out.flush();

        // HTTP 서버의 응답을 읽을 스트림 준비
        BufferedReader in = new BufferedReader(
                new InputStreamReader( // 바이너리 스트림 ==> 캐릭터 스트림 
                        socket.getInputStream()));

        String line;
        while (true) {
            line = in.readLine();
            System.out.println(line);
            if (line.equals(""))
                break;
        }

        int b;
        while ((b = in.read()) != -1) {
            System.out.print((char)b);
        }

        out.close();
        in.close();
        socket.close();
    }

}

// HTTP 응답 프로토콜
// 1) response status
// 문법:
//   protocol/version sp status_code sp status_phrase CRLF
// 예:
//    HTTP/1.1 200 OK
//
// 2) (general header | response header | entity header)*
// 문법:
//   header : value CRLF
// 예:
//   Server: nginx
//   Date: Thu, 16 Nov 2017 02:27:15 GMT
//   Content-Type: text/css
//   Transfer-Encoding: chunked
//   Connection: keep-alive
//   Vary: Accept-Encoding
//   Vary: Accept-Encoding
//
// 3) empty line
//
// 4) entity
//   본문 데이터









