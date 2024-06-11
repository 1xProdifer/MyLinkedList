package com.adhyan;

/**
 * @author Adhyan Chandhoke
 * Date 08/06/2024
 * Implementation of a single linked list.Provides basic operations such as checking if the list is empty and adding an element to the front of the list.
 */

public class MyLinkedList {

    // Instance variable representing the head of the linked list
    private Node head;

    /**
     * Constructor to initialize an empty linked list.
     */
    public MyLinkedList() {
        this.head = null;
    }

    /**
     * Checks if the linked list is empty.
     * @return true if the list is empty, false otherwise.
     */
    public boolean isEmpty() {
        return this.head == null;
    }

    /**
     * Adds a new element to the front of the linked list.
     * @param value The value to be added to the list.
     */
    public void addToFront(int value) {
    	
        // Create a new Node with the given value
        Node node = new Node(value);

        if (this.isEmpty()) {
            this.head = node;
            return;
        }
        
        // Make the new node the head of the list
        node.setNext(head);
        this.head = node;
    }

    /**
     * Returns a string representation of the linked list.
     * @return A string representing the elements of the list in order.
     */
    @Override
    public String toString() {
        if (this.isEmpty()) {
            return "[]";
        }

        StringBuilder listRep = new StringBuilder("[");
        Node curr = head;
        while (curr != null) {
            listRep.append(curr);
            if (curr.next != null) {
                listRep.append(", ");
            }
            curr = curr.next;
        }
        listRep.append("]");
        return listRep.toString();
    }

    /**
     * A private class representing a node in the linked list.
     */
    private class Node {
    	
        // Value stored in the node
        int value;
        
        // Reference to the next node in the list
        Node next;

        /**
         * Constructor to initialize a node with a given value.
         * @param value The value to be stored in the node.
         */
        public Node(int value) {
            this.value = value;
            this.next = null;
        }

        /**
         * Sets the reference to the next node in the list.
         * @param next The next node in the list.
         */
        public void setNext(Node next) {
            this.next = next;
        }

        /**
         * Returns a string representation of the node.
         * @return A string representing the value of the node.
         */
        @Override
        public String toString() {
            return String.valueOf(value);
        }
    }
}
