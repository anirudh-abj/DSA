#include<iostream>
#include "stdio.h"

template <typename T>
class List{
  private:
    int size, capacity;
    T arr[];

  public:
    List(){
      size = 0;
      capacity = 5;
      arr = new T[5];
    }

    List(int max_size){
      size = 0;
      capacity = max_size;
      arr = new T[max_size];
    }

    void append(T data){
      if(size >= capacity){
        resize();
      }
      arr[size] = data;
      size++;
    }

    void resize(){
      capacity += capacity;
      T new_arr[] = new T[capacity];
      for(int i = 0; i < size; i++){
        new_arr = arr[i];
      }

      T* temp = arr;
      arr = new_arr;
      delete temp;
    }

    void display(){
      std::cout << " { ";
      for(T i : arr){
        std::cout << i << " , ";
      }
      std::cout << " } ";
    }

};

int main(){
  List<int>* lst = new List<int>();
  for(int i = 0; i < 5; i++){
    (*lst).append(i);
  }
  (*lst).display();
}

