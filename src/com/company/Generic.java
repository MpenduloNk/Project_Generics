package com.company;

public class Generic<T>  {
    public T value;

    public void setValue(T value){
        this.value = value;
    }

    public T getValue(){
        return value;
    }

    public void printArrayContent(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(i+1+". "+ array[i]);
        }
    }
}
