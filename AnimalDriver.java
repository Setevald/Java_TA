public class AnimalDriver {
    public static void main(String[] args){
        Dog myDog = new Dog("Buld", 3);
        System.out.println("Dog name :" + myDog.getname());
        System.out.println("Dog age:" + myDog.getAge());

        System.out.print("Dog makes sound: ");
        myDog.makeSound();
        myDog.speak();
    }
}
