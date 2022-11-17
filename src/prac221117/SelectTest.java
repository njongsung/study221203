package prac221117;

public class SelectTest extends DBConn{

	public SelectTest() {}
	public void empList() {
		try {
		//사원목록을 선택한다.
		// 1. 드라이브 로딩 - 상속받은 상위 클래스의 static 영역에서 이미 실행됨
		// 2. DB연결
		dbConn();
		// 3. Preparedstatement 생성
		sql ="select empno, ename, job, hiredate, sal, comm from emp order by empno";
		pstmt = conn.prepareStatement(sql);
			
		//4.실행
		rs = pstmt.executeQuery(); // 선택한 레코드 정보를 Result 객체로 리턴해준다.
			
		// 5. DB에서 선택된 레코드 출력
		while(rs.next()) {//rs.next()는 선택한 레코드의 point 위치를 이동해준다.
				// 정수 : getInt(), 실수 : getDouble(), 문자열 : getString(), etc
			int empno = rs.getInt(1);
			String ename = rs.getString(2);
			String job = rs.getString(3);
			String hiredate = rs.getString(4);
			double sal = rs.getDouble(5);
			double comm = rs.getDouble(6);
			System.out.printf("%d,%s,%s,%s,%.2f,%.2f\n\n",empno , ename, job, hiredate, sal, comm);
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
			
}
//	public static void main(String[] args) {
//		new SelectTest().empList();	
//
//	}

}
