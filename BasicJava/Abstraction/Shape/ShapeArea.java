public abstract class Shape {
   public abstract double area();
}

public class ShapeDemo {
   public static void main(String[] args) {
      Shape[] shapes = new Shape[4];

      shapes[0] = new Triangle(3, 4);
      shapes[1] = new Square(5);
      shapes[2] = new Circle(2);
      shapes[3] = new Rectangle(4, 6);

      for (Shape shape : shapes) {
         System.out.println("Area of " + shape.getClass().getSimpleName() + ": " + shape.area());
      }
   }
}