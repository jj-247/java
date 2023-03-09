package study08_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class S01_연결 {

    public static void main(String[] args) {
        try {
//            Class.forName("com.mysql.jdbc.Driver"); // MySQL 드라이버 로드, JDK 1.6 버전부터 자동 로딩
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "root","password");
            // JDBC 연결, password 는 root 계정 패스워드 입력
            System.out.println("DB 연결 완료");
//        } catch (ClassNotFoundException e) {
//            System.out.println("JDBC 드라이버 로드 에러");
        } catch (SQLException e) {
            System.out.println("DB 연결 에러");
        }
    }

}
