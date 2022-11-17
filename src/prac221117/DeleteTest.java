package prac221117;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DeleteTest extends DBConn {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
	public DeleteTest() {}
	public void empRemove() {
		//사원번호를 기준으로 사원 삭제하기
		try{
			//데이터준비
			System.out.print("삭제할 사원번호 : ");
			int empno = Integer.parseInt(br.readLine());
			
			//DB 연결
			dbConn();
			
			
			// 삭제
			sql = "DELETE FROM emp WHERE empno=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			
			int result = pstmt.executeUpdate();
			if(result>0) {//삭제되었을 때
				System.out.println("사원번호가 삭제되었습니다.");
			}else {//삭제에 실패했을 때
				System.out.println("사원번호 삭제에 실패했습니다.");
			}			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
//	public static void main(String[] args) {
//		DeleteTest dt = new DeleteTest();
//		dt.empRemove();
//
//	}

}
