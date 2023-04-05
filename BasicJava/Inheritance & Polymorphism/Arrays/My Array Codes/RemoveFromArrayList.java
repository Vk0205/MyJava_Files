import java.util.ArrayList;

public class RemoveFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Before removing an element: " + list);
        list.remove(1);
        System.out.println("After removing an element: " + list);
    }
}