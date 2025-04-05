package DSA;

public class List<T>{
	protected int size, capacity;
	private T[] arr;

	public List(int maxCapacity){
		this.arr = (T[]) new Object[maxCapacity];
		this.size = 0;
		this.capacity = maxCapacity;
	}

	public List(){
		this.arr = (T[]) new Object[5];
		this.size = 0;
		this.capacity = 5;
	}

	public void resize(){
		this.capacity += this.capacity;
		T[] newArr = (T[]) new Object[this.capacity];
		for(int i = 0; i < this.size; i++){
			newArr[i] = this.arr[i];
		}

		this.arr = newArr;
	}

	public void shrinkToFit(){
		this.capacity = this.size;
		T[] newArr = (T[]) new Object[this.capacity];
		for(int i = 0; i < this.size; i++){
			newArr[i] = this.arr[i];
		}

		this.arr = newArr;
	}

	public void append(T newElement){
		if(this.size >= this.capacity){
			this.resize();
		}

		this.arr[this.size] = newElement;
		this.size += 1;
	}

	public void insert(int pos, T newElement){
		if(pos < 0 || pos > this.size){
			throw new IndexOutOfBoundsException("Index : "+ String.valueOf(pos) + "; SIZE : " + String.valueOf(this.size));
		}

		if(this.size >= this.capacity){
			this.resize();
		}

		T temp = newElement;
		T tmp;
		for(int i = pos; i <= this.size; i++){
			tmp = this.arr[i];
			this.arr[i] = temp;
			temp = tmp;
		}

		this.size += 1;
	}

	public void deleteByPos(int pos, boolean shrink){
		if(pos > this.size || pos < this.size){
			throw new IndexOutOfBoundsException("Index : "+ String.valueOf(pos) + "; SIZE : " + String.valueOf(this.size));
		}

		for(int i = pos; i < this.size - 1; i++){
			this.arr[i] = this.arr[i + 1];
		}

		this.size -= 1;

		if(shrink){
			this.shrinkToFit();
		}
	}

	public void deleteByVal(T val, boolean deleteAllInstances, boolean shrink){
		boolean valFound = false;
		for(int i = 0; i < this.size; i++){
			if(this.arr[i] == val){
				valFound = true;
				for(int j = i; j < this.size - 1; j++){
					this.arr[j] = this.arr[j + 1];
				}

				this.size -= 1;

				if (!deleteAllInstances) {
					break;
				}

				else{
					i = 0;
				}

			}
		}

		if (!valFound){
			System.out.println("Value not present in the list.");
		}

		if(shrink){
			this.shrinkToFit();
		}
	}

	public T get(int index){
		return this.arr[index];
	}

	public int size(){
		return this.size;
	}

	public int capacity(){
		return this.capacity;
	}

	public String toString(){
		String res = " { ";
		for(int i = 0; i < this.size; i++){
			res += " " + String.valueOf(this.arr[i]) + " , ";
		}

		res += " } ";
		return res;
	}

	public static void main(String[] args) {
		System.out.println("---------LIST---------");
		List<Integer> lst = new List<Integer>();
		lst.append(1);
		lst.append(2);
		lst.append(4);
		System.out.println(lst);
		lst.insert(0, 0);
		lst.insert(3, 3);
		System.out.println(lst);
		lst.insert(5, 5);
		System.out.println(lst);
		lst.deleteByPos(0, true);
		System.out.println(lst);
		System.out.println(lst.capacity());
		lst.deleteByPos(3, true);
		System.out.println(lst);
		System.out.println(lst.capacity());
		lst.deleteByPos(4, true);
		System.out.println(lst);
		System.out.println(lst.capacity());
		

		List<Integer> lst2 = new List<Integer>();
		for(int i = 0; i < 9; i++){
			for(int j = i; j > 0; j--){
				lst2.append(i);
			}
		}
		System.out.println(lst2);
		System.out.println("SIZE : " +  String.valueOf(lst2.size()));
		lst2.deleteByVal(1, false, false);
		System.out.println(lst2);
		System.out.println("SIZE : " +  String.valueOf(lst2.size()));
		lst2.deleteByVal(5, true, true);
		System.out.println(lst2);
		System.out.println("SIZE : " +  String.valueOf(lst2.size()));
		System.out.println("CAPACITY : " +  String.valueOf(lst2.capacity()));
		lst2.deleteByVal(8, true, true);
		System.out.println(lst2);
		System.out.println("SIZE : " +  String.valueOf(lst2.size()));
		System.out.println("CAPACITY : " +  String.valueOf(lst2.capacity()));

	}
}



