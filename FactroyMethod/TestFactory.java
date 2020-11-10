package FactroyMethod;

public class TestFactory {
    public static void main(String[] args) {
        Factory f = new DogFactory();
        Animal dog =f.createAnimal();
        dog.eat();
        Factory f2 = new CatFactory();
        Animal cat =f2.createAnimal();
        cat.eat();
    }
}
