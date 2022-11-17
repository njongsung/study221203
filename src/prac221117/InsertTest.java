package prac221117;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 JDBC Drive download
 oracle.com  -> developer -> Developer Resource Center -> Downloads -> driver & utility -> 
 JDBC Driver -> ojdbc.jar(자바 버전에 맞는 드라이브)
 
 
 
 
 
 */

public class InsertTest {

	public InsertTest() {}
	public void empInsert() {
		//JDBC : java database connection
		//java에서 Oracle BD를 사용하기 위해서 build path 설정해야한다.
		//프로젝트 -> 마우스 R키 -> build path -> configure buildPath -> library -> add external jar 클릭 
		//	-> ojbcd11.jar를 추가해준다.
		
		// 1. 	JDBC 드라이브 JVM 등록한다.
		//  	"oracle.jdbc.driver.OracleDriver"	
		//		--> 패키지 경로와 클래스명을 문자열로 알려주면 객체로 변환시켜주는 클래스를 이용한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException cnfe) {
			System.out.println("jdbc 드라이브 로딩 예외 발생");
		}
		
		
		Scanner sc = new Scanner(System.in);
		
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		try {
			// 2. DB 연결 jdbc:oracle:thin:@	ip		 :port:SID
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 서버주소, 포트, SID(전역데이터베이스)
			String username = "scott";
			String password = "tiger";
			conn= DriverManager.getConnection(url, username, password);
			//API java.sql.DriverManager 참조
			
			
			// 사원 정보 - 사원번호(int), 사원명(String), 입사일(sysdate), 급여(long)
			System.out.print("사원번호: ");
			int empno = Integer.parseInt(sc.nextLine());
			System.out.print("사원명: ");
			String ename = sc.nextLine();
			System.out.print("급여: ");
			int sal = Integer.parseInt(sc.nextLine());
			
			
			// 3. sql문을 만들어 PreparedStatement(Interface) 객체를 생성한다.			//java sql문에서 실제 데이터는 ?로 임시처리한다.
			String sql = "INSERT INTO emp(empno, ename, hiredate, sal) VALUES(?,?,sysdate,?)";
			pstmt= conn.prepareStatement(sql);
			
			// ? 세팅
			// ?가 있으면 세팅 없으면 세팅할 데이터가 없는것
			pstmt.setInt(1, empno);
			pstmt.setString(2, ename);
			pstmt.setInt(3, sal);
			
			
			// 4. 쿼리문 실행 
			// SELECT의 경우 executeQuery() 	-> 데이터에 변화  없음
			// INTSER, UPDATE, DELETE의 경우 EXECUTEuPDATA() 	->  데이터에 변화가 생김
			
			// 반환값은 처리한 레코드의 수를 리턴한다.	자동 커밋됨.
			int result = pstmt.executeUpdate();
			
			if(result>0) {//사원 등록 성공
				System.out.println("사원이 등록되었습니다.");				
			}else {//사원 등록 실패
				System.out.println("사원 등록이 실패했습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}// 5. 닫기
			finally{
			// conn, pstmt를 닫는다.
			// 닫는 것은 생성의 역순으로
			try {
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
			}catch(Exception ee){
				System.out.println("DB연결닫기 예외발생");
			}
			
		}
		//finally 예외가 발생하든 발생하지 않든 무조건 실행되는 것
	}
//	public static void main(String[] args) {
//		InsertTest it = new InsertTest();
//		it.empInsert();
//
//	}

}
