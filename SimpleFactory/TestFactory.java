package SimpleFactory;

public class TestFactory {
    //    public static void main(String[] args) {
//        Dog dog =AnimalFactory.getDog();
//        dog.eat();
//        Cat cat =AnimalFactory.getCat();
//        cat.eat();
//        Dog dog1 =AnimalFactory.getDog();
//        dog.eat();
//        System.out.println(dog);
//        System.out.println(cat);
//    }
    public static void main(String[] args) {


        Animal dog = AnimalFactory.getAnimal("dog");
        dog.eat();
        Animal cat = AnimalFactory.getAnimal("cat");
        cat.eat();
    }
}
