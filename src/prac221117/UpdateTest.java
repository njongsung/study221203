package prac221117;

import java.util.Scanner;

public class UpdateTest extends DBConn{
	Scanner sc = new Scanner(System.in);
	public UpdateTest() {}
	public void empEdit() {
		// 사원번호(empno)를 기준으로 담당업무(job)와 급여(sal)를 수정하는 기능 구현
		try {
			//기존 사원목록 출력
//			SelectTest st = new SelectTest();
//			st.empList();
			System.out.println("--------------------------------------------------");
			//수정할 정보
			//수정할 대상의 사원번호를 입력받기
			
			System.out.print("사원번호: ");
			int empno = Integer.parseInt(sc.nextLine());
			System.out.print("수정할 담당업무: ");
			String job = sc.nextLine();
			System.out.print("수정할 급여: ");
			double sal = Double.parseDouble(sc.nextLine());
			
			// 1. DB 연결
			dbConn();
			
			// 2. sql -> PreparedStatement 객체 생성
			sql = "UPDATE emp SET job=?, sal=? WHERE empno=?";
			pstmt = conn.prepareStatement(sql);
			
			
			pstmt.setString(1, job);
			pstmt.setDouble(2, sal);
			pstmt.setInt(3, empno);
			
			// 3. 실행 
			int result = pstmt.executeUpdate();	// 수정된 레코드 수를 리턴 / 못고치면 0
			if(result>0) {//수정된 레코드가 있을 때
				System.out.printf("사원번호 %d의 담당업무는 %s, 급여는 %f로 수정되었습니다.\n", empno, job, sal);
			}else {//수정된 레코드가 없을 때
				System.out.println("수정에 실패하였습니다.");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	

//	public static void main(String[] args) {
//		new UpdateTest().empEdit();
//
//	}

}
