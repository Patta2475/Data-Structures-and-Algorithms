package LinkedList;

public class LinkedList<E> {
    //fields
    private ListNode<E> head, tail;
    private int size;
    
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void insertFront(E data){
            ListNode<E> newNode = new ListNode<>(data, head);

            head = newNode;

            if (newNode.next == null){
                tail = newNode;
            }
            size++;
    }

    public void insertTail(E data) {
        ListNode<E> newNode = new ListNode<E>(data, null);

        tail = newNode;

        if (head == null){
            tail = newNode;
            size++;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public ListNode<E> find(E data){
        ListNode<E> cur = head;
        while (cur != null){
            if (java.util.Objects.equals(cur.data, cur)) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }

    public void delete(E data){
        ListNode<E> cur = this.head;
        ListNode<E> prev = null;

        while (cur != null && cur.data != data){
            prev = cur;
            cur = cur.next;
        }

        if (cur == null) {          
            System.out.println("Fail to delete");
        }

        if (cur != null) {
            if (cur == this.head)
                this.head = cur.next;
            else
                prev.next = cur.next;
            if (cur.next == null)
                this.tail = prev;
            cur.next = null;
            size--;
            System.out.println("Deleted");
        }
    }

    public int getSize() {
        return size;
    }


    public class ListNode<E> {
        private E data;
        private ListNode<E> next;

        public ListNode(E data, ListNode<E> next) {
            this.data = data;
            this.next = next;
            size = 0;
        }

        public E getData() { 
            return data; 
        }

        public ListNode<E> getNext() {
            return next;
        }

        public void setData(E newData) { 
            this.data = newData;
        }

        public void setNext(ListNode<E> newNext) {
            this.next = newNext;
        }

    }

    public static void main(String[] args) {
        
    }
}
