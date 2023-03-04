package test07_네트워크;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Q02_파일전송 {

    // DataOutputStream 사용하기
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("192.168.0.3", 8290);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        Scanner sc = new Scanner(System.in);
        System.out.print("보낼 파일 이름을 입력하세요>>");
//        src/test07_네트워크/효정.jpg
        String path = sc.next();
        File file = new File(path);
        String fileName = file.getName();
        int fileNameLen = fileName.length();
        long fileLen = file.length();
        FileInputStream fis = new FileInputStream(file);
        byte[] buf = new byte[(int) fileLen / 10];
        dos.writeInt(fileNameLen);
        dos.writeUTF(fileName);
        dos.writeLong(fileLen);
        while (true) {
            int len = fis.read(buf);
            if (len <= 0) {
                break;
            }
            dos.write(buf, 0, len);
            dos.flush();
        }
        System.out.println("파일 전송이 완료되었습니다.");
        sc.close();
        fis.close();
        dos.close();
        s.close();
    }

}
