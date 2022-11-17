package prac221117;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
	//DB 연결에 필요한 변수 또는 메소드를 정의한다
	
	// 0. 변수 선언
	protected Connection conn= null; // 패키지가 다를 경우 상속 받아 사용가능한 멤버 변수
	protected PreparedStatement pstmt = null;
	protected ResultSet rs = null;
	
	String sql = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String username = "scott";
	String password = "tiger";
	
	
	// 1. JDBC 드라이브 로딩
	static {//멤버 변수와 생성자 메소드가 실행되기 전 먼저 실행된다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException fnfe) {
			System.out.println("JDBC 드라이브 로딩 예외 발생"+fnfe.getMessage());
		}
	}
	// 2. DB 연결
	public void dbConn() {
		try {
			conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException se) {
			System.out.println("DB연결 예외 발생"+se.getMessage());
		}
	}
	// 3. DB 닫기
	public void dbClose() {
		try {//생성된 객체를 역순으로 닫는다.
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null) conn.close();
		}catch (Exception e) {
			System.out.println("DB닫기 예외 발생"+e.getMessage());
		}
	}

}
