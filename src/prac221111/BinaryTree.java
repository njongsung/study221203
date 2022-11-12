package prac221111;

public class BinaryTree {
    static class Node<K, V>{
        private K key;
        private V data;
        private Node<K, V> left;
        private Node<K, V> right;


        void print(){
            System.out.println(data);
        }
    }
}
