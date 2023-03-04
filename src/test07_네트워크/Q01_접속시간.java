package test07_네트워크;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Q01_접속시간 {

    public static void main(String[] args) {
        BufferedReader in = null;
        Socket socket = null;
        try {
            socket = new Socket("192.168.0.3", 8290);
            System.out.println("서버에 접속하였습니다.");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.print("서버의 시간 : ");
            while (true) {
                String time = in.readLine();
                if(time.equals("end")){
                    System.out.println("\n연결을 종료합니다.");
                    break;
                }
                System.out.print(time + " ");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (socket != null) socket.close(); // 클라이언트 소켓 닫기
            } catch (IOException e) {
                System.out.println("서버와의 통신중 오류가 발생했습니다.");
            }
        }    
    }
    
}
