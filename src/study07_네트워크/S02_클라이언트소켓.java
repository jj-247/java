package study07_네트워크;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class S02_클라이언트소켓 {

    public static void main(String[] args) throws IOException {
        // 클라이언트 소켓 생성 및 서버 접속
//        Socket clientSocket = new Socket("192.168.0.30", 5550);
        Socket clientSocket = new Socket();
        clientSocket.bind(new InetSocketAddress("192.168.0.3", 1960)); // 소켓에 자신의 IP 주소를 결합
        clientSocket.connect(new InetSocketAddress("192.168.0.30", 5150)); // 서버 응용프로그램에 접속

        // 네트워크 입출력 스트림 생성
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));

        // 서버로 데이터 전송
        out.write("서버로 데이터 전송" + "\n");
        out.flush();

        // 서버로부터 데이터 수신
        int x = in.read();
        String line = in.readLine(); // '\n'이 도착하면 그 때까지 읽은 문자열을 리턴

        // 데이터 송수신 종료
        clientSocket.close();

        // InetAddress getInetAddress() : 소켓에 연결된 서버 IP 주소 반환
        // InetAddress getLocalAddress() : 소켓의 로컬 주소 반환
        // int getLocalPort() : 소켓의 로컬 포트 번호 반환
        // int getPort() : 소켓에 연결된 서버의 포트 번호 반환
        // boolean isBound() : 소켓이 로컬 주소와 결합되어 있으면 true 반환
        // void setSoTimeout(int timeout) : 데이터 읽기 타임아웃 시간 지정. 0이면 타임아웃 해제
    }

}
