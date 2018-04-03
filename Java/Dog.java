class Dog {
    private int age;
    private String breed;
    private String colour;

   public int getAge() {
       return age;
   }
   public String getBreed() {
       return breed;
   }
   public String getColour() {
       return colour;
   }
   public void setAge(int Age) {
       age = Age;
   }
   public void setColour(String colour) {
       this.colour = colour;
   }
   public void setBreed(String breed) {
       this.breed = breed;
   }

    public void Act() {
        System.out.println("Woof woof");
    }

    public void AboutMe() {
       System.out.print("I'm Dog:");
    }

}
class Main {
    public static void main(String[] args) {
        Dog Doge = new Dog();
        Doge.setAge(3);
        Doge.setBreed("Bulldog");
        Doge.setColour("Black");
        Doge.Act();
        Dog[] DogMass = new Dog [3];
        DogMass[0] = new Dog();
        DogMass[1] = new Dog();
        DogMass[2] = new Dog();
        DogMass[0].setBreed("Bulldog");
        DogMass[1].setBreed("Sheepdog");
        DogMass[2].setBreed("Dachshund");
        DogMass[0].setAge(2);
        DogMass[1].setAge(1);
        DogMass[2].setAge(5);
        for (int i = 0; i < DogMass.length; i++) {
                Doge.AboutMe();
                System.out.print(" " + DogMass[i].getBreed() + ", me " + DogMass[i].getAge() + " old year");
                System.out.println("");
        }
    }
}

