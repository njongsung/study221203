package prac221126;

public class Queue {

    private int[] array;
    private int head;
    private int tail;

    public Queue(int size) {
        array = new int[size];
        tail = 0;
    }

    public int peek(){
        if (tail ==0)
            return -1;
        return array[tail-1];
    }

    public boolean enqueue (int data){
        if (data < 0)
            return false;
        if (array.length == tail)
            return false;
        array[tail]=data;
        tail+=1;
        return true;
    }

    public int dequeue(){
        if (tail==0)
            return -1;
        if (head >= tail)
            return -1;
        return array[head++];
    }

    public int getHead(){
        return head;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        if(queue.dequeue() ==  -1){
            System.out.println("Error");
        }

        for(int i=0; i<5; i++){
            queue.enqueue(i+1);
        }
        for(int i=0;i<6;i++){
            System.out.println(queue.dequeue());
        }
        for(int i=0;i<5;i++)
            queue.enqueue(i+1);
        for(int i = 0;i<5;i++)
            System.out.println(queue.dequeue());
    }

}


