package study07_네트워크;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class S03_서버소켓 {

    public static void main(String[] args) throws IOException {
        // 서버 소켓 생성
        ServerSocket listener = new ServerSocket(5150);

        // 클라이언트로부터 접속 대기
        Socket socket = listener.accept();

        // 네트워크 입출력 스트림 생성
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        // 클라이언트로부터 데이터 수신
        int x = in.read();
        String line = in.readLine();

        // 클라이언트로 데이터 전송
        out.write("클라이언트로 데이터 전송" + "\n");
        out.flush();

        // 데이터 송수신 종료
        socket.close();

        // 서버 응용프로그램 종료
        listener.close();
    }

}
