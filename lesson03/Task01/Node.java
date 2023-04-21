package lesson03.Task01;

/**
 * Node is an atomic unit for Linked List
 */
public class Node {
    // Value of the node
    private int value;

    // Link to next node
    private Node next;

    // Link to previous node
    private Node prev;

    /**
     * Default constructor
     * 
     * @param value Value of the Node
     */
    public Node(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    /**
     * getValue returns this.value
     * 
     * @return Value of the Node
     */
    public int getValue() {
        return this.value;
    }

    /**
     * setValue sets the value field of the Node
     * 
     * @param value Value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * getNext returns the next Node in the list
     * 
     * @return next Node
     */
    public Node getNext() {
        return this.next;
    }

    /**
     * setNext sets the link to next Node in the list
     * 
     * @param next next Node
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * getPrev returns the previous Node in the list
     * 
     * @return previous Node
     */
    public Node getPrev() {
        return this.prev;
    }

    /**
     * setPrev sets the link to previous Node in the list
     * 
     * @param prev previous Node
     */
    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
