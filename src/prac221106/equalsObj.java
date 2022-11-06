package prac221106;

public class equalsObj {
    public static void main(String[] args) {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다.");

        v2 = v1;
        if (v1.equals(v2))
            System.out.println("v1과 v2는 같습니다.");
        else
            System.out.println("v1과 v2는 다릅니다");


    }
}

class Value {
    int value;

    Value(int value){
        this.value = value;
    }
}

//equals()는 주소값을 비교하기 때문에 v1과 v2가 10이라는 값을 가지고 있기 때문에 위의 코드에선 false 아래의 코드에서는 true가 나온 것
//equals()は住所を比べるため、ｖ１とｖ２が１０といつ値を持っていても上のコードではfalse下のコードではtrueを持つ。