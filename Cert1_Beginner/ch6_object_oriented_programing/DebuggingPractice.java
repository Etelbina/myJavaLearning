public class DebuggingPractice{
    public static void main(String[] args){

        abstract class Animal {
            protected String name;

            // public void Animal(String n) {
            //     this.name = n;
            // }

            abstract void speak();

            // public String getName() {
            //     return name;
            // }

            // void setName(String newName) {
            //     this.name = newName;
            // }
        }
        
        interface Eater {
            public void eat();
        }
        
        //sub class
        class Dog extends Animal implements Eater {
            // final?
            private final String species;
            //constructor
            Dog(String name, String species) {
                this.name = name;
                this.species = species;
            }

            void speak() {
                System.out.println(this.name + " says Woof!");
            }

            @Override
            public void eat() {
                System.out.println("Eats kibble.");
            }
        }
        
        Dog myDog = new Dog("Max", "Labrador");
        System.out.println(myDog.name);
        System.out.println(myDog.species);
        myDog.speak();
        myDog.eat();
        System.out.println("Species: " + myDog.species);
    }
}