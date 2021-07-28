package com.dawson;

import static org.junit.Assert.assertTrue;

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
}
