abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void makeSound();
}

class Dog extends Animal {
    public Dog(String name, int age) { super(name, age); }
    @Override public void makeSound() { System.out.println(name + " barks: Woof!"); }
}

class Cat extends Animal {
    public Cat(String name, int age) { super(name, age); }
    @Override public void makeSound() { System.out.println(name + " meows: Meow!"); }
}

class Bird extends Animal {
    public Bird(String name, int age) { super(name, age); }
    @Override public void makeSound() { System.out.println(name + " chirps: Tweet!"); }
}

class AnimalHierarchyDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[] {
            new Dog("Buddy", 3), new Cat("Misty", 2), new Bird("Kiwi", 1)
        };
        for (Animal a : animals) { a.makeSound(); }
    }
}
