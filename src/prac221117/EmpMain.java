import java.util.Scanner;

import prac221117.DeleteTest;
import prac221117.InsertTest;
import prac221117.SelectTest;
import prac221117.UpdateTest;

public class prac221117 {
    Scanner scan = new Scanner(System.in);
    public EmpMain() {
        start();
    }
    public void start() {
        while(true) {
            // 메뉴
            System.out.print("[1]사원목록 [2]사원등록 [3]사원수정 [4]사원삭제 [5]종료");
            String menu = scan.nextLine();

            switch(menu) {
            case "1":
                // 사원목록
                SelectTest st = new SelectTest();
                st.empList();
                break;

            case "2":
                InsertTest it = new InsertTest();
                it.empInsert();
                break;

            case "3":
                UpdateTest ut = new UpdateTest();
                ut.empEdit();
                break;

            case "4":
            	DeleteTest dt = new DeleteTest();
            	dt.empRemove();
            	break;
            	
            case "5":
            	//종료
            	System.out.println("프로그램이 종료되었습니다.");
            	System.exit(0);
            	
            default:
            	System.out.println("메뉴를 잘못입력하였습니다.");
            	
            }
        }
    }

    public static void main(String[] args) {
    	new EmpMain();
    }

}