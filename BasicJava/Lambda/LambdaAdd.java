interface Adder {
    int add(int a, int b);
}

public class LambdaAdd {
    public static void main(String[] args) {
        Adder adder = (a, b) -> a + b;
        int sum = adder.add(5, 3);
        System.out.println("The sum is " + sum);
    }
}
