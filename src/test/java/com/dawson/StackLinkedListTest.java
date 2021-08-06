package com.dawson;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
* The StackLinkedList test program will create several testcases to test
* the StackLinkedList library
*
* @author  Suyang Chen
* @version 1.0
* @since   2021-07-25 
*/
public class StackLinkedListTest {
    @Test
    public void test_empty(){
        StackLinkedList stack = new StackLinkedList();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void test_push_pop(){
        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
        assertEquals(1, stack.pop());
    }
    
    @Test
    public void test_size(){
        StackLinkedList stack = new StackLinkedList();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        assertEquals(3, stack.size());
    }

    @Test
    public void test_zeroToNine(){
        StackLinkedList stack = new StackLinkedList();
        for(int index = 0; index < 10; index++){
            stack.push(index);
        }
        for(int index = 9; index >=0; index--){
            assertEquals(index, stack.pop());
        }
    }
}
