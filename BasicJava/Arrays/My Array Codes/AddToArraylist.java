import java.util.ArrayList;

public class AddToArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.print("Elements in the ArrayList: ");
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
