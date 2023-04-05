public class Main {
   public static void main(String[] args) {
      Cat cat = new Cat("Fluffy", 2, "meow", "cat food", true);
      Dog dog = new Dog("Buddy", 5, "woof", "dog food", true);
      Lion lion = new Lion("Simba", 7, "roar", "meat", false);
      Monkey monkey = new Monkey("Bongo", 3, "eee eee", "fruit", false);

      System.out.println(cat.getName() + " is a domestic animal: " + cat.isDomestic());
      System.out.println(dog.getName() + " is a domestic animal: " + dog.isDomestic());
      System.out.println(lion.getName() + " is a domestic animal: " + lion.isDomestic());
      System.out.println(monkey.getName() + " is a domestic animal: " + monkey.isDomestic());

  cat.move();
  cat.scratch();
  cat.eat();
  cat.sleep();

  dog.move();
  dog.makeSound();
  dog.bark();
  dog.eat();
  dog.sleep();

  lion.move();
  lion.makeSound();
  lion.roar();
  lion.eat();
  lion.sleep();

  monkey.move();
  monkey.makeSound();
  monkey.screech();
  monkey.eat();
  monkey.sleep();

   }
}
