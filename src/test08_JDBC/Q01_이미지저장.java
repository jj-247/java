package test08_JDBC;

import java.io.*;
import java.sql.*;
import java.util.Arrays;

public class Q01_이미지저장 {
    
    
    // ByteArrayInputStream 사용하기
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.0.3:3306/ms", "user", "1234");
            System.out.println("DB 연결 완료");
            // 사진 저장하기
            File file = new File("src/test08_JDBC/효정.jpg");
            FileInputStream fis = new FileInputStream(file); // 파입 입력 스트림 생성
            PreparedStatement pre = conn.prepareStatement("insert into ohmygirl (id, name, pic) VALUES (?, ?, ?)");
            pre.setInt(1, 3);
            pre.setString(2, file.getName().split("\\.")[0]);
            pre.setBinaryStream(3, fis, (int) file.length());
            pre.executeUpdate(); // DB에 사진 저장
            pre.close();
            // 사진 불러오기
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from ohmygirl");
            FileOutputStream fos = new FileOutputStream("src/test08_JDBC/효정_copied.jpg");
            byte[] buf = new byte[1024 * 10];
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                Blob b = rs.getBlob("pic");
                byte[] bytes = b.getBytes(1l, (int) b.length());
                ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
                while (true) {
                    int n = bis.read(buf);
                    fos.write(buf, 0, n);
                    if (n < buf.length) break;
                }
                System.out.println(buf.length);
            }
        } catch (SQLException e) {
            System.out.println("DB 연결 에러");
        } catch (IOException e) {
            System.out.println("파일 전송 에러");
        }
    }

}
