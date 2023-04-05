public class MyGenericClass<T> {
    private T t;

    public MyGenericClass(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class GenericClassDemo {
    public static void main(String[] args) {
        MyGenericClass<String> myStringObj = new MyGenericClass<>("Hello, World!");
        MyGenericClass<Integer> myIntObj = new MyGenericClass<>(42);
        
        System.out.println(myStringObj.getT());
        System.out.println(myIntObj.getT());
    }
}
