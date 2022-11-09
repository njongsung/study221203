package prac221109;
//스택 메모리
//스택은 임시로 데이터를 저장하는 기능을 가지며
//FILO(First Input Last Output) 먼저 들어간 것이 나중에 나옴 = 나중에 들어간 것이 먼저 나옴
//출력한 데이터는 스택에서 제거 된다.

public class IntStack {
	//용량 : 배열의 크기
	private int capacity;
	//데이터를 담을 배열
	private int[] stk;
	//스택의 포인터 // 멤버영역일 때 초기값 자동 설정됨 --> 변수에 값을 안 넣어주면 정수=0; 실수0.0, 논리=false, String=null
	private int ptr = 0;
	
	//생성자 메소드
	public IntStack(int capacity) {
		this.stk = new int[capacity];//매개변수 전달받은 값의 크기로 stk 객체를 생성한다.
		this.capacity = capacity;
		ptr = 0;
	}
	//push 담기
	public int push(int data) throws OverflowIntStackException {
		//overflow 발생 확인
		if(this.ptr==this.capacity) {
			//강제로 예외 발생시킴
			throw new OverflowIntStackException(); 
		}
		//ptr 위치에 data를 담고 ptr은 1 증가시킨다
		return stk[ptr++] = data;
	}
	//pop 꺼내기
	public int pop() {
		if(ptr==0) {
			throw new EmptyIntStackException();
		}
		//제일 위의 값을 꺼낸다. ptr-1이 제일 위의 값이다. ptr는 1감소 시킨다.
		return 	stk[--ptr];
	}
	
	//peek 마지막 값 꺼내기
	public int peek() throws EmptyIntStackException{
		if(ptr==0) {
			throw new EmptyIntStackException();
		}
		return stk[ptr-1];//ptr-1 위치의 값
		
	}
	//dump 스택의 정보 알아내기
	public void dump() {
		//ptr이 정보의 양을 나타냄
		for(int  i=0; i<ptr; i++) {
			System.out.println("stk["+i+"]: "+stk[i]);
		}if(ptr==0) {
			System.out.println("담긴 데이터가 없습니다.");
		}
	}
	
	//search 값의 index위치 찾기
	public int indexOf(int searchData) {
		for (int i=ptr-1; i>=0; i--) {
			if(stk[i]==searchData) {
				return i;
			}
		}
		return -1;
	}
	
	//스택비우기
	public void setEmpty() {
		ptr = 0;
	}
	//용량 구하기
	public int capacity() {
		return capacity;
	}
	//데이터의 수
	public int size() {
		return ptr;
	}
	
	//비어있는 여부
	public boolean isEmpty() {
		if(ptr==0) return true;
		else return false;
	
	}
	//내부 클래스로 예외처리
	//overflow 발생 시 처리할 예외 내부 클래스 생성
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {}
		
	}
	//stack이 비어 있을 때 pop할 경우 예외 클래스 생성
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}
	}
	
	
}
