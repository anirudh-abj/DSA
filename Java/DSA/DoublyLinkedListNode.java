package DSA;

public class DoublyLinkedListNode<T> {
    protected T data;
    protected DoublyLinkedListNode<T> prev, next;

    public DoublyLinkedListNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
