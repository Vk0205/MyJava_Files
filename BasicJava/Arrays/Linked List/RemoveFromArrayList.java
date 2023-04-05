import java.util.LinkedList;

public class RemoveFromLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("Before removing the first element: " + list);
        list.removeFirst();
        System.out.println("After removing the first element: " + list);
    }
}