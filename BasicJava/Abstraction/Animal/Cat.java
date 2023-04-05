class Cat extends Animal {
   public Cat(String name, int age, String sound, String food, boolean isDomestic) {
      super(name, age, sound, food, isDomestic);
   }

   public void move() {
      System.out.println(getName() + " is walking.");
   }

   public void scratch() {
      System.out.println(getName() + " is scratching.");
   }
}
