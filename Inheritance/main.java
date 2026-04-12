// Parent Class
class Animal {
    String color;

    // Getter
    String getColor() {
        return color;
    }

    // Setter
    void setColor(String color) {
        this.color = color;
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child Class 1
class Dog extends Animal {
    String owner;

    String getOwner() {
        return owner;
    }

    void setOwner(String owner) {
        this.owner = owner;
    }

    void eat() {
        System.out.println("Dog is eating");
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

// Child Class 2
class Lion extends Animal {
    String jungleName;

    String getJungleName() {
        return jungleName;
    }

    void setJungleName(String jungleName) {
        this.jungleName = jungleName;
    }

    void eat() {
        System.out.println("Lion is eating");
    }

    void roar() {
        System.out.println("Lion is roaring");
    }
}

// Main Class
public class main {
    public static void main(String[] args) {

        // Dog Object
        Dog d = new Dog();
        d.setColor("Brown");
        d.setOwner("Ramesh");

        System.out.println("Dog Color: " + d.getColor());
        System.out.println("Dog Owner: " + d.getOwner());
        d.eat();
        d.bark();

        System.out.println();

        // Lion Object
        Lion l = new Lion();
        l.setColor("Golden");
        l.setJungleName("Gir Forest");

        System.out.println("Lion Color: " + l.getColor());
        System.out.println("Lion Jungle: " + l.getJungleName());
        l.eat();
        l.roar();
    }
}