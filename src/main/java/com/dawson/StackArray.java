package com.dawson;

import java.lang.reflect.Array;

/**
* The StackArray program implements an stack library that
* utilize the generric array as underlying structure to store data
*
* @author  Suyang Chen
* @version 1.0
* @since   2021-07-25 
*/



public class StackArray<T>{
    /**
    * This is the initialization method to initialize a new array
    *
    * @param null
    * @return null
    */
    private T[] array;
    private int count;
    private int size;
    public StackArray(){
        this.count = 0;
        this.size = 0;
        this.array = (T[]) new Object[this.size];
    }

    /**
    * This method is used to check if stack is empty. 
    * Simply comparethe count with 0.
    * @param null
    * @return boolean This returns if this stack is empty.
    */
    public boolean isEmpty(){
        return this.count == 0;
    }

    /**
    * This method is used to check if stack is full. 
    * Simply comparethe count with size.
    * @param null
    * @return boolean This returns if this stack is full.
    */
    public boolean isFull(){
        return this.count == this.size;
    }
    /**
    * This method is used to return the size of stack. 
    * @param null
    * @return int This returns the size of stack.
    */
    public int size(){
        return this.size;
    }
    /**
    * This method is used to add two integers. This is
    * a the simplest form of a class method, just to
    * show the usage of various javadoc Tags.
    * @param element this is the generic type of element need to add into stack
    * @return null
    */
    public void push(T element){
        if ( this.isFull() ){
            this.resize();
        }
        this.array[this.count++] = element;
    }

    public T pop(){
        if(this.isEmpty()){
            return null;
        }
        return this.array[--this.count];
    }

    /**
    * This method is used to resize the array. This is
    * a private method so only can be used inside of class
    * 
    * @param null 
    * @return null.
    */

    private void resize(){
        this.size *= 2;
        T[] newArray = (T[]) new Object[this.size];
        for(int index = 0;  index < this.count; index++){
            newArray[index] = this.array[index];
        }
        this.array = newArray;
    }


}
