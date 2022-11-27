package prac221126;

public class LinkedList {
    public class Node{
        public Node next;
        public int value;


        public Node(int value, Node next) {
            this.next = next;
            this.value = value;
        }
    }
    Node head;
    int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public boolean insert(int index, int value){
        if (size < index)
            return false;
        if (index == 0){
            head = new Node(value, head);
            size += 1;
            return true;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++)
            temp = temp.next;
        Node next_after_node = temp.next;
        temp.next = new Node(value, next_after_node);
        size += 1;
        return true;
    }

    public boolean remove(int index){
        if (size <= index)
            return false;
        if (index - 1 < 0) {
            head = head.next;
            size -= 1;
            return true;
        }
        Node temp = head;
        for(int i = 0; i < index - 1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
        size -= 1;
        return true;
    }

    public int search(int value){
        Node cursor = head;
        int idx = 0;
        while(cursor != null){
            if (cursor.value == value)
                return idx;
            cursor = cursor.next;
            idx += 1;
        }

        return -1;
    }

    public void print(){
        var cursor = head;
        while(cursor != null){
            System.out.print("" + cursor.value + ", ");
            cursor = cursor.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        int[] test_data = {4,63,32,23,51,45,54};

        for (var i : test_data) {
            ll.insert(0, i);
        }

        ll.print();
        ll.remove(3);
        ll.print();

        ll.remove(0);
        ll.remove(0);
        ll.print();

        ll.insert(ll.size - 1, 99);
        ll.print();

        System.out.println(ll.search(32));
        System.out.println(ll.search(100));

    }
}
