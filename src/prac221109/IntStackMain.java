package sw.search;

import java.util.Scanner;

public class IntStackMain {
	public static Scanner sc = new Scanner(System.in);
	
	public static void startStack() {
		//stack 객체를 생성하고, 스택의 크기를 설정할 수 있도록 작성한다.
		IntStack stack = new IntStack(3);
		
		
		
		do {
			//메뉴 작성하기
			System.out.print("(1)PUSH (2)POP (3)PEEK (4)DUMP (5)SEARCH (6)EMPTY (7)STACK INFO (0)EXIT ->");
			int menu = sc.nextInt();
			
			if(menu==0) break;				//종료

			switch(menu) {
			case 0:
				break;
			case 1: 
				//push : 데이터를 스택에 담기
				System.out.print("데이터: ");
				int data = sc.nextInt();		//52
				
				try{
					stack.push(data);
				}catch(IntStack.OverflowIntStackException e){
					System.out.println("스택이 가득 찼습니다.");
				}
				
				break;
			case 2:
					try {
					//pop : 스택에 제일 마지막에 저장된 값 꺼내기
					int popData = stack.pop();
					System.out.println("꺼낸값:" + popData);			
					}catch(IntStack.EmptyIntStackException e) {
						System.out.println("스택이 비어있습니다.");
					}
				break;
			case 3:
				try {
				//peek	:	stack의 제일 위에 있는 값 = 마지막에 저장된 값을 구하기
				int topData	= stack.peek();
				System.out.println("마지막에 담긴 데이터: "+topData);
				}catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택에 저장된 값이 없습니다.");
				}
				break;
			case 4:
				//dump : 스택의 정보 알아내기
				stack.dump();
				break;
			case 5:
				//search : 찾는 데이터가 있는 index 구하기 (없으면 -1)
				System.out.print("위치를 찾을 값: ");
				int searchData = sc.nextInt();
				int result = stack.indexOf(searchData);
				if(result>=0){//스택에 데이터가 있다.
					System.out.println(searchData+"는 "+result+"번 index위치에 있습니다.");
				}else {//스택에 데이터가 없다다.
					System.out.println(searchData+"는 스택에 없습니다.");
				}
				
				break;
			case 6:
				//empty : 스택비우기
				stack.setEmpty();
				break;
			case 7:
				//stack info
				System.out.println("저장가능한 데이터 수: "+stack.capacity());//용량
				System.out.println("현재 데이터 수: "+stack.size());//데이터의 수
				stack.dump();//스택의 데이터정보
				System.out.println("스택이 "+ ((stack.isEmpty()) ? "비어있습니다.":"비어있지 않습니다."));//스택의 데이터 존재유무
				break;
			default:
				//메뉴 잘못선택
				System.out.println("메뉴를 잘못 입력하였습니다. 0~7 사이의 값을 입력하세요.");
			}
			
			
			
		}while(true);
		System.out.println("프로그램이 정상 종료되었습니다.");
	}

	public static void main(String[] args) {
		startStack();
		

	}

}
