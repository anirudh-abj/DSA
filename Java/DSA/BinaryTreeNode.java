package DSA;

public class BinaryTreeNode<T> {
    protected T data;
    protected BinaryTreeNode<T> left, right;

    public BinaryTreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
