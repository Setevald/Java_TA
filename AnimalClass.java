public abstract class AnimalClass {
    private String name;
    private int age;

    //constructor
    public AnimalClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //setter and getter
    public String getname(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public abstract void makeSound();

    public void speak(){
        System.out.println("This animal speaks.");
    }
}

// Inheritance
class Dog extends AnimalClass {
    public Dog(String name, int age){
        super(name, age);
    }

    public void makeSound(){
        System.out.println("Woof! Woof!");
    }

    public void speak(){
        System.out.println("The dog barks");
    }
}

