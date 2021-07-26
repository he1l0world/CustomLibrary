package com.dawson;
/**
* The StackLinkedList program implements an stack library that
* utilize the generic LinkedList as underlying structure to store data
*
* @author  Suyang Chen
* @version 1.0
* @since   2021-07-25 
*/
public class StackLinkedList<T> {

    /**
    * This is the inner class of node which stores the data. 
    */
    private class Node <T>{
        public T item;
        public Node next;

        public Node(){
            this.item = null;
            this.next = null;
        }

        public Node(T element){
            this.item = element;
            this.next = null;
        }
    }

    private Node head;
    private int count;

    /**
    * This is initialization method to creat a empty stack
    *
    * @param null
    * @return null
    */
    public StackLinkedList(){
        this.head = null;
        this.count = 0;
    }

    /**
     * This method is to check if stack is empty
     * @return boolean return true if it is empty
     */

    public boolean isEmpty(){
        return this.head == null;
    }

    /**
     * This method is to check if stack is full since
     * this is linkedlist so it can dynamically grow
     * and this method will always return false
     * @return boolean return true if it is full
     */
    public boolean isFull(){
        return false;
    }

    /**
     * This method is to check the size of the current stack
     * @return int return the size of the stack
     */
    public int size(){
        return this.count;
    }

    /**
     * This method is to push element into current stack
     * since this is implemented by linkedlist so element will
     * insert to the front
     * @param element element is the generic type to store in the stack
     */
    public void push(T element){
        if ( !this.isEmpty() ){
            this.head = new Node(element);
        }else{
            Node temp = new Node(element);
            temp.next = this.head.next;
            this.head = temp;
        }
    }

    /**
     * This method is to return the first element in current stack
     * and move head point to next one, JVM garbage will reclaim the 
     * memory
     * @return T return the first element in the stack
     */
    public T pop(){
        if(this.isEmpty()){
            return null;
        }
        T item = this.head.item;
        this.head = this.head.next;
        return item;
    }


}
