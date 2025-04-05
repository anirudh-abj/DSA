package DSA;

public class ListQueue<T> {
    private List<T> lst;

    public ListQueue(int maxCapacity){
        lst = new List<T>(maxCapacity);
    }

    public ListQueue(){
        lst = new List<T>();
    }

    public T popleft(){
        T res = lst.get(0);
        lst.deleteByPos(0, false);
        return res;
    }

    public void append(T newElement){
        lst.append(newElement);
    }

    public int size(){
        return lst.size;
    }

    public int capacity(){
        return lst.capacity;
    }
}
