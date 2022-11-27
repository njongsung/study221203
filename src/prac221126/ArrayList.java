package prac221126;

public class ArrayList {
    public static void main(String[] args) {
        System.out.println(10 >> 1);

        int[] arr = new int [5];

        for (int i = 0; i < 5; i++) {
            arr[i] = i;
        }

        int[] t = new int[10];
        for (int i = 0; i < arr.length; i++) {
            t[i] = arr[i] + 1;
        }
        // t의 이름이 arr로 바뀐 것.
        arr = t;
        for (int i = 0; i < 5; i++) {
            arr[i+5] = i * 2;
        }

        for (var i: arr) {
            System.out.print("" + i + " ");
        }
    }

    // 성공 실패 여부 반환
    // 추가는 맨 마지막 위치에 추가한다.(스택, 큐와 같음)
//    public boolean add(int value){};

    // 성공 실패 여부 반환( 에러 = 실패)
    // 인덱스 위치의 데이터를 삭제 후, 뒤의 원소들을 하나씩 이동
//    public boolean remove(int index){};

    // 성공 값, 실패 -1
//    public int indexOf(int index)
}
