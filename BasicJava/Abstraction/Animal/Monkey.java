class Monkey extends Animal {
   public Monkey(String name, int age, String sound, String food, boolean isDomestic) {
      super(name, age, sound, food, isDomestic);
   }

   public void move() {
      System.out.println(getName() + " is swinging.");
   }

   public void screech() {
      System.out.println(getName() + " is screeching.");
   }
}
