package AbstractFactory;

public class NorthProductFactory implements Factory {
    @Override
    public Fruit createFruit() {
        return new NorthFruit();
    }

    @Override
    public Vegetable createVegetable() {
        return new NortVegetable();
    }
}
