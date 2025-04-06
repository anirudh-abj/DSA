package DSA;

public class SinglyLinkedList<T> {
    
    private SinglyLinkedListNode<T> head, curr;
    private int size;

    public SinglyLinkedList(T headVal){
        this.head = new SinglyLinkedListNode<T>(headVal);
        this.curr = this.head;
        this.size = 1;
    }

    public void append(T val){
        this.curr.next =  new SinglyLinkedListNode<T>(val);
        this.size += 1;
    }

    public void insert(int pos, T val){
        if(pos < 0 || pos > size){
            throw new IndexOutOfBoundsException("Index : " + String.valueOf(pos) + " ; Size : " + String.valueOf(this.size) );
        }

        SinglyLinkedListNode<T> newNode = new SinglyLinkedListNode<T>(val);

        if(pos == 0){
            newNode.next = this.head;
            this.head = newNode;
        }

        SinglyLinkedListNode<T> start = this.head;
        int i = 0;
        while(start != null && i < pos - 1){
            start = start.next;
            i++;
        }

        start.next = newNode;
        if(pos == this.size){
            this.curr = newNode;
        }

        this.size += 1;
    }

    public void deleteByPos(int pos){
        if(pos == 0){
            this.head = this.head.next;
        }

        SinglyLinkedListNode<T> start = this.head;
        int i = 0;
        while(start != null && i < pos - 1){
            start = start.next;
            i++;
        }

        if(pos == this.size - 1){
            this.curr = start;
        }

        start.next = start.next.next;
        this.size -= 1;
    }

    public void deleteByVal(T val, boolean deleteAllInstances){
        while(this.head.data == val){
            this.head = this.head.next;
        }

        SinglyLinkedListNode<T> readNode = this.head, writeNode = this.head;

        boolean firstDelete = false;
        while(readNode != null){
            if(readNode.data == val && (deleteAllInstances || !firstDelete)){
                if(!deleteAllInstances){
                    firstDelete = true;
                }

                readNode = readNode.next;
                continue;
            }

            writeNode.next = readNode;
            writeNode = writeNode.next;
            readNode = readNode.next;
        }
    }

    public void reverseList(){
        if(this.head == null) {
            return;
        }
        SinglyLinkedListNode<T> prev = null, curr = this.head, next = this.head.next;
        while(curr != null){
            curr.next = prev;
            prev = curr;
            curr = next;
            if(next != null){
                next = next.next;
            }
        }

        this.head = prev;
    }

    public String toString(){
        String res = "head";
        SinglyLinkedListNode<T> start = this.head;
        while(start != null){
            res += " -> " + String.valueOf(start.data);
            start = start.next;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println("---------Singly Linked List---------");
    }
}
