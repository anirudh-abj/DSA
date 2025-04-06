package DSA;

public class SinglyLinkedListNode<T> {
    protected T data;
    protected SinglyLinkedListNode<T> next;

    public SinglyLinkedListNode(T data) {
        this.data = data;
        this.next = null;
    }
}
