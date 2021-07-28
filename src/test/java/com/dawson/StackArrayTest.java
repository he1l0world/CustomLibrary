package com.dawson;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
* The StackArray test program will create several testcases to test
* the StackArray library
* @author  Suyang Chen
* @version 1.0
* @since   2021-07-25 
*/
public class StackArrayTest {


    @Test
    public void test_empty(){
        StackArray stack = new StackArray();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void test_full(){
        StackArray stack = new StackArray();
        stack.push(1);
        assertTrue(stack.isFull());
    }

    @Test
    public void test_push_pop(){
        StackArray stack = new StackArray();
        stack.push(1);
        assertEquals(1, stack.pop());
    }
    
    @Test
    public void test_size(){
        StackArray stack = new StackArray();
        stack.push(1);
        stack.push(3);
        stack.push(5);
        assertEquals(3, stack.size());
    }

    @Test
    public void test_zeroToNine(){
        StackArray stack = new StackArray();
        for(int index = 0; index < 10; index++){
            stack.push(index);
        }
        for(int index = 9; index >=0; index--){
            assertEquals(index, stack.pop());
        }
    }
 
}
