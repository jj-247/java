package study08_JDBC;

import java.sql.*;

public class S02_사용 {
    // Statement 클래스 메소드
    // ResultSet executeQuery(String sql) : 주어진 sql 문을 실행하고 결과는 ResultSet 객체에 반환
    // int executeUpdate(String sql) : INSERT, UPDATE, 또는 DELETE 와 같은 sql 문을 실행하고, sql 문 실행으로 영향을 받은 행의 개수나 0을 반환
    // void close() Statement : 객체의 데이터베이스와 JDBC 리소스를 즉시 반환

    // ResultSet 클래스 메소드
    // boolean first() : 커서를 첫 번째 행으로 이동
    // boolean last() : 커서를 마지막 행으로 이동
    // boolean next() : 커서를 다음 행으로 이동
    // boolean previous() : 커서를 이전 행으로 이동
    // boolean absolute(int row) : 커서를 지정된 행 row 로 이동
    // boolean isFirst() : 첫 번째 행이면 true 반환
    // boolean isLast() : 마지막 행이면 true 반환
    // void close() : ResultSet 객체의 데이터베이스와 JDBC 리소스를 즉시 반환
    // Xxx getXxx(String columnLable) : Xxx 는 해당 데이터 타입을 나타내며 현재 행에서 지정된 열이름(columnLable)에 해당하는 데이터를 반환한다.
    // 예를 들어, int 형 데이터를 읽는 메소드는 getInt()이다.
    // Xxx getXxx(int columnIndex) : Xxx 는 해당 데이터 타입을 나타내며 현재 행에서 지정된 열 인덱스(columnIndex)에 해당하는 데이터를 반환한다.
    // 예를 들어, int 형 데이터를 읽는 메소드는 getInt()이다.
    public static void main(String[] args) throws SQLException {
        // 데이터 검색
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "root","password");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select * from table");
        while (rs.next()) { // rs에 저장된 다음 행으로 커서를 옮긴다.
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("id"));
        }
        // 레코드 추가
        stmt.executeUpdate("insert into TABLE (column1, column2) values('효정', '940728');");
        // 데이터 수정
        stmt.executeUpdate("update TABLE set id='0728' where name='효정'");
        // 레코드 삭제
        stmt.executeUpdate("delete from TABLE where name='효정'");
    }

}
