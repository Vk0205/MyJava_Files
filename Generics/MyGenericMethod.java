public class MyGenericMethod {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}

public class GenericMethodDemo {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "cherry"};

        MyGenericMethod.printArray(intArray);
        MyGenericMethod.printArray(stringArray);
    }
}
