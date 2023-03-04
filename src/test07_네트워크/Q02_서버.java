package test07_네트워크;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Q02_서버 {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8290);
        Socket s = ss.accept();
        System.out.println("연결됨");
        DataInputStream dis = new DataInputStream(s.getInputStream());
        int fileNameLen = dis.readInt();
        System.out.println("전송받은 파일 이름 길이: " + fileNameLen);
        String fileName = dis.readUTF();
        System.out.println("전송받은 파일 이름: " + fileName);
        String saveFile = fileName.split("\\.")[0] + "_copied." + fileName.split("\\.")[1];
        System.out.println("저장할 파일 이름: " + saveFile);
        long fileLen = dis.readLong();
        System.out.println("전송받은 파일 크기: " + fileLen);
        byte[] buf = new byte[(int) fileLen / 10];
        int per = 0;
        String parent = "src/test07_네트워크/";
        FileOutputStream fos = new FileOutputStream(parent + saveFile);
        while (true) {
            int len = dis.read(buf);
            if (len <= 0) {
                s.close();
                ss.close();
                break;
            }
            fos.write(buf, 0, len);
            fos.flush();
            if(per != 10){
                per++;
                System.out.print(per + " ");
            }
        }
        System.out.println("\n파일 수신 성공");
     }

}
