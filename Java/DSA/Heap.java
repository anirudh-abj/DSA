package DSA;

public class Heap<T> {
    private boolean min;
    private List<T> lst;

    public Heap(boolean min){
        this.min = min;
        lst = new List<T>();
    }

    public Heap(boolean min, int maxCapacity){
        this.min = min;
        lst = new List<T>(maxCapacity);
    }

    public Heap(boolean min, List<T> lstToBeHeapified){

    }

    public void insert(T val){

    }

    public void delete(T val){

    }

    public List<T> returnInSortedOrder(){
        List<T> sortedList = new List<T>();
        return sortedList;
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
        System.out.Println()
    }
}
