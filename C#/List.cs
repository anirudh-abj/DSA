using System;

public class List{
    private int size, capacity;

    private int[] arr;

    List(){
        arr = new int[5];
        this.size = 0;
        this.capacity = 5;
    }

    List(int maxCapacity){
        arr = new int[maxCapacity];
        this.size = 0;
        this.capacity = maxCapacity;
    }

    public void append(int data){
        if(this.size >= this.capacity){
            this.resize();
        }

        this.arr[this.size] = data;
        this.size += 1;
    }

    public void insert(int pos, int data){
        if(pos < 0 || pos > this.size){
            Console.WriteLine("Invalid Position");
            return;
        }

        if(this.size >= this.capacity){
            this.resize();
        }

        for(int i = this.size ; i < pos; i++){
            this.arr[i] = this.arr[i - 1];
        }

        this.arr[pos] = data;

        this.size += 1;
    }

    public void deleteByPos(int pos, bool shrink){
        if(pos < 0 || pos > this.size){
            Console.WriteLine("Invalid Position");
            return;
        }

        for(int i = pos; i < this.size - 1; i++){
            this.arr[i] = this.arr[i + 1];
        }

        this.arr[this.size - 1] = 0;
        this.size -= 1;

        if(shrink){
            this.shrinkToFit();
        }
    }

    public void deleteByVal(int val, bool deleteAllInstances, bool shrink){
        bool firstDelete = false;

        int readIndex = 0, writeIndex = 0;
        while(readIndex < this.size){
            if(this.arr[readIndex] == val && (deleteAllInstances || !firstDelete)){
                if(!deleteAllInstances){
                    firstDelete = true;
                }

                readIndex++;
                continue;
            }

            this.arr[writeIndex] = this.arr[readIndex];
            writeIndex++;
            readIndex++;
        }

        this.size = writeIndex;
    }

    public void resize(){
        this.capacity += this.capacity;

        int[] newArr = new int[this.capacity];

        for(int i = 0; i < this.size; i++){
            newArr[i] = this.arr[i];
        }

        this.arr = newArr;
    }

    public void shrinkToFit(){
        this.capacity += this.size;

        int[] newArr = new int[this.capacity];

        for(int i = 0; i < this.size; i++){
            newArr[i] = this.arr[i];
        }

        this.arr = newArr;
    }

    public int length(){
        return this.size;
    }

    public int currCapacity(){
        return this.capacity;
    }
}