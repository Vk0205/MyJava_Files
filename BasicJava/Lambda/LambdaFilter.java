import java.util.ArrayList;
import java.util.List;

public class LambdaFilter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(5, 2, 9, 1, 3));
        List<Integer> filtered = new ArrayList<>();
        numbers.forEach((n) -> {
            if (n % 2 == 0) {
                filtered.add(n);
            }
        });
        System.out.println(filtered);
    }
}
