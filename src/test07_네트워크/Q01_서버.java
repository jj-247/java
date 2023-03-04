package test07_네트워크;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Q01_서버 {

    public static void main(String[] args) throws InterruptedException {
        BufferedWriter out = null;
        ServerSocket listener = null;
        Socket socket = null;
        try {
            listener = new ServerSocket(8290); // 서버 소켓 생성
            System.out.println("타임 서버입니다.");
            socket = listener.accept(); // 클라이언트로부터 연결 요청 대기
            System.out.println("연결되었습니다.");
            out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            System.out.println("500ms 마다 수를 보냅니다.");
            int time = 0;
            while (true) {
                if (time == 20) {
                    out.write("end\n");
                    out.flush();
                    System.out.println("종료합니다.");
                    break;
                }
                out.write(time + "\n");
                out.flush();
                Thread.sleep(500);
                time++;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                socket.close();
                listener.close();
            } catch (IOException e) {
                System.out.println("클라이언트와 연결중 오류가 발생했습니다.");
            }
        }
    }

}
