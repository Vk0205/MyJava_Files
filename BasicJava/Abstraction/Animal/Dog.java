class Dog extends Animal {
   public Dog(String name, int age, String sound, String food, boolean isDomestic) {
      super(name, age, sound, food, isDomestic);
   }

   public void move() {
      System.out.println(getName() + " is running.");
   }

   public void bark() {
      System.out.println(getName() + " is barking.");
   }
}

