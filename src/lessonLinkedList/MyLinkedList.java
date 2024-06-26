package lessonLinkedList;

import java.util.Arrays;

public class MyLinkedList {
    public Node head;
    private int size;

    public void add(int value){
        //если это первое добавление в список
        if(head == null){
            this.head = new Node(value);
        }else {
            Node temp = head;

            while(temp.getNext() != null){
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));
        }
        size++;
    }

    public String toString(){
        int[] result = new int[size];

        int idx = 0;
        Node temp = head;

        while(temp != null){
            result[idx++] = temp.getValue();
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    public static class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
