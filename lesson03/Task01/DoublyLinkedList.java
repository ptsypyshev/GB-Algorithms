package lesson03.Task01;

/**
 * DoublyLinkedList is a structure with links to previous and next nodes at
 * every node in list.
 */
public class DoublyLinkedList {
    // Head node of list
    private Node head;

    // Tail node of list
    private Node tail;

    /**
     * Default constructor
     */
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * AddFirst method adds a node to the head of list
     * 
     * @param addNode Node to adding
     */
    public void AddFirst(Node addNode) {
        Node currNode = this.head;
        if (currNode == null) {
            this.head = addNode;
            this.tail = addNode;
            return;
        }

        addNode.setNext(currNode);
        currNode.setPrev(addNode);
        this.head = addNode;
    }

    /**
     * AddLast method adds a node to the tail of list
     * 
     * @param addNode
     */
    public void AddLast(Node addNode) {
        Node currNode = this.tail;
        if (currNode == null) {
            this.head = addNode;
            this.tail = addNode;
            return;
        }
        currNode.setNext(addNode);
        addNode.setPrev(currNode);
        this.tail = addNode;
    }

    /**
     * Print method prints the list to the console
     */
    public void Print() {
        Node currNode = this.head;
        while (currNode != null) {
            System.out.println(currNode.getValue());
            currNode = currNode.getNext();
        }
    }

    /**
     * Reverse method modifies list to reverse it in place
     */
    public void Reverse() {
        Node temp = null;
        Node current = this.head;
        while (current != null) {
            temp = current.getPrev();
            current.setPrev(current.getNext());
            current.setNext(temp);
            current = current.getPrev();
        }

        if (temp != null) {
            this.head = temp.getPrev();
        }
    }

    /**
     * BubbleSort method sorts the list with Bubble sort algorithm
     */
    public void BubbleSort() {
        Node currNode = this.head;
        Node prevNode = null;
        Node nextNode = null;
        int tmp;
        boolean swap = false;

        if (this.head == null) {
            return;
        }

        do {
            swap = false;
            currNode = this.head;
            while (currNode.getNext() != prevNode) {
                nextNode = currNode.getNext();
                if (currNode.getValue() > nextNode.getValue()) {
                    tmp = currNode.getValue();
                    currNode.setValue(nextNode.getValue());
                    nextNode.setValue(tmp);
                    swap = true;
                }
                currNode = currNode.getNext();
            }
            prevNode = currNode;
        } while (swap);
    }
}
