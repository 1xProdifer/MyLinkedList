package com.adhyan;
/**
 * @author Adhyan Chandhoke
 * @date 11/6/2024
 */
public class Main {
	
	/**
	 * Main Method
	 * @param args Command line arguments.
	 */
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addToFront(10);
        list.addToFront(20);
        list.addToFront(30);
        System.out.println(list);  // Output: [30, 20, 10]
    }
}
