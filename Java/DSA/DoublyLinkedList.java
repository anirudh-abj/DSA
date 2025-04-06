package DSA;

public class DoublyLinkedList<T> {
    
    private DoublyLinkedListNode<T> head, curr;

    public DoublyLinkedList(T headVal){
        this.head = new DoublyLinkedListNode<T>(headVal);
        this.curr = this.head;
    }

    public void append(T val){
        this.curr.next = new DoublyLinkedListNode<T>(val);
        this.curr.next.prev = this.curr.next;
        this.curr = this.curr.next;
    }

    public void insert(int pos, T val){
        
    }

    public void deleteByPos(int pos){

    }

    public void deleteByVal(T val){

    }

    public void reverseList(){

    }

    public String toString(){
        String res = new String();

        return res;
    }

    public static void main(String[] args) {
        
    }
}
