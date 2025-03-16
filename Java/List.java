public class <T> List{
  private int size = 0 , capacity = 5;
  private Object arr[];

  List(int maxSize){
    this.arr = new T[maxSize];
    this.capacity = maxSize;
  }

  List(){
    this.arr = new Object[this.maxSize];
  }

  public void append(T data){
    if(this.size >= this.capacity) {
      this.resize();
    }
    this.arr[size] = data;
    this.size += 1;
  }

  public void resize(){
    this.capacity += this.capacity;
    newArr = new Object[this.capacity];
    for(int i = 0; i < this.size; i++){
      newArr[i] = this.arr[i];
    }

    this.arr = newArr;
  }

  public void insert(int pos, T data){
    if(this.size >= this.capacity){
      this.resize();
    }

    T temp = data;
    T temp2;

    for(int i = pos; i <= this.size; i++){
      temp2 = this.arr[i];
      this.arr[i] = temp;
      temp = temp2;
    }
  }


  public static void main(String args[]) {
    
  }

}
