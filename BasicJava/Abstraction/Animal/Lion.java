class Lion extends Animal {
   public Lion(String name, int age, String sound, String food, boolean isDomestic) {
      super(name, age, sound, food, isDomestic);
   }

   public void move() {
      System.out.println(getName() + " is prowling.");
   }

   public void roar() {
      System.out.println(getName() + " is roaring.");
   }
}