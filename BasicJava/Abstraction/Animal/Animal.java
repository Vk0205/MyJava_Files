abstract class Animal {
   private String name;
   private int age;
   private String sound;
   private String food;
   private boolean isDomestic;

   public Animal(String name, int age, String sound, String food, boolean isDomestic) {
      this.name = name;
      this.age = age;
      this.sound = sound;
      this.food = food;
      this.isDomestic = isDomestic;
   }

   public abstract void move();

   public void makeSound() {
      System.out.println(name + " says " + sound + "!");
   }

   public void eat() {
      System.out.println(name + " is eating " + food + ".");
   }

   public void sleep() {
      System.out.println(name + " is sleeping.");
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getAge() {
      return age;
   }

   public String getName() {
      return name;
   }

   public boolean isDomestic() {
      return isDomestic;
   }
}



