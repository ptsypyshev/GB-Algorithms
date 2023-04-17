package lesson03.Task01;

public class Program {
    public static void main(String[] args) {
        DoublyLinkedList lst1 = new DoublyLinkedList();
        lst1.AddFirst(new Node(1));
        lst1.AddFirst(new Node(2));
        lst1.AddFirst(new Node(3));
        lst1.AddFirst(new Node(2));
        lst1.Print();
        System.out.println();
        lst1.Reverse();
        lst1.Print();
        System.out.println();
        lst1.BubbleSort();
        lst1.Print();

        System.out.println();
        System.out.println();

        DoublyLinkedList lst2 = new DoublyLinkedList();
        lst2.AddLast(new Node(10));
        lst2.AddLast(new Node(2));
        lst2.AddLast(new Node(6));
        lst2.AddLast(new Node(1));
        lst2.AddLast(new Node(7));
        lst2.Print();
        System.out.println();
        lst2.Reverse();        
        lst2.Print();
        System.out.println();
        lst2.BubbleSort();
        lst2.Print();
    }
}
