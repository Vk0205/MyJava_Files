import java.util.Arrays;

public class LambdaSort {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "elephant", "bird"};
        Arrays.sort(words, (a, b) -> a.compareTo(b));
        System.out.println(Arrays.toString(words));
    }
}
