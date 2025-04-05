package DSA;

public class Stack<T>{
    private List<T> lst;

    public Stack(int maxCapacity){
        lst = new List<T>(maxCapacity);
    }

    public Stack(){
        lst = new List<T>();
    }

    public void push(T newElement){
        lst.append(newElement);
    }

    public T pop(boolean shrink){
        T res = lst.get(lst.size - 1);
        lst.deleteByPos(lst.size - 1, shrink);
        return res;
    }

    public T peek(){
        return lst.get(lst.size - 1);
    }

    public int size(){
        return lst.size;
    }

    public int capacity(){
        return lst.capacity;
    }

    public String toString(){
        return lst.toString();
    }

    public static void main(String[] args) {
        System.out.println("---------STACK---------");
    }
}
