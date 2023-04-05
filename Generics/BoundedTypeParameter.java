public class BoundedTypeParameterDemo {
    public static <T extends Number> double sum(T[] array) {
        double sum = 0.0;

        for (T element : array) {
            sum += element.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        System.out.println("Sum of intArray: " + sum(intArray));
        System.out.println("Sum of doubleArray: " + sum(doubleArray));
    }
}
