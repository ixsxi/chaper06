package echo.ex01_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		
		ServerSocket serversocket = new ServerSocket(); // 차원문 개방
		serversocket.bind(new InetSocketAddress("172.30.1.1",10001)); // ip 포트번호설정 < 들어올수있는>
		
		
		
		System.out.println("서버 시작");
		System.out.println("====================================");
		System.out.println("연결을 기다리고 있습니다.");
		
		//serversocket.accept();
		
		//Socket socket = new Socket();
		
		 
		Socket socket = serversocket.accept();
		
		System.out.println("클라이언트가 연결되었습니다.");
		
		
		//메세지 받기용 스트림
		InputStream is= socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		// 메시지 보내기용 스트림
		OutputStream os= socket.getOutputStream();
		OutputStreamWriter osw =new OutputStreamWriter(os ,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		
		while(true) {
			
		
			// 메시지 받기
			String	msg= br.readLine();
			
			
			
			if(msg == null) {
				System.out.println("접속종료");
				break;
			}
			
			
			System.out.println("받은 메세지"+msg);
			
			 //메시지 보내기
			 bw.write(msg);
			 bw.newLine();
			 bw.flush();
			
		}
		
		System.out.println("======================================");
		System.out.println("서버 종료");
		socket.close();
		serversocket.close();

	}

}
