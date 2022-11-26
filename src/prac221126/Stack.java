package prac221126;

public class Stack{
    private int[] array;
    private int length;

    public Stack(int size) {
        this.array = new int[size];
        this.length = 0;
    }

    public int peek(){
        if (length == 0)
            return -1;
        return array[length - 1];
    }

    public boolean push(int data){
        if (data < 0)
            return false;
        if (this.array.length == this.length)
            return false;
        this.array[this.length] = data;
        this.length += 1;
        return true;
    }

    public int pop(){
        if (this.length == 0)
            return -1;
        length -= 1;
        return this.array[length];
    }

    public int getLength() {
        return length;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(100);
        // 빈 스택에서 꺼내기 했을 때 리턴 -1
        if (stack.pop() == -1)
            System.out.println("Error");

        for(int i=0; i< 5; i++){
            stack.push(i+1);
        }
        for(int i=0; i<2; i++)
            System.out.print("" + stack.pop() + " ");
        System.out.println();
        for(int i=0;i<5;i++)
            stack.push(i+6);
        for(int i= 0;i<2;i++)
            System.out.print("" + stack.pop() + " ");
        System.out.println();
        int temp = stack.pop();
        while(temp != -1) {
            System.out.print("" + temp + " ");
            temp = stack.pop();
        }
    }
}
