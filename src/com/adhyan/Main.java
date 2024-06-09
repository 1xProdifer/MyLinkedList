package com.adhyan;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addToFront(10);
        list.addToFront(20);
        list.addToFront(30);
        System.out.println(list);  // Output: [30, 20, 10]
    }
}
