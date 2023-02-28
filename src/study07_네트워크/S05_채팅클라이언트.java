package study07_네트워크;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class S05_채팅클라이언트 {

    public static void main(String[] args) {
        BufferedReader in = null;
        BufferedWriter out = null;
        Socket socket = null;
        Scanner sc = new Scanner(System.in); // 키보드에서 읽을 Scanner 객체 생성
        try {
            socket = new Socket("192.168.0.3", 8290);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            while (true) {
                System.out.print("보내기>>"); // 프롬프트
                String outputMessage = sc.nextLine(); // 키보드에서 한 행 읽기
                if (outputMessage.equalsIgnoreCase("bye")) {
                    out.write(outputMessage + "\n");
                    out.flush();
                    break;
                }
                out.write(outputMessage + "\n"); // 키보드에서 읽을 문자열 전송
                out.flush();
                String inputMessage = in.readLine(); // 서버로부터 한 행 수신
                System.out.println("서버: " + inputMessage);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                sc.close();
                if (socket != null) socket.close(); // 클라이언트 소켓 닫기
            } catch (IOException e) {
                System.out.println("서버와의 채팅중 오류가 발생했습니다.");
            }
        }
    }

}
