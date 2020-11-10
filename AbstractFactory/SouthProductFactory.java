package AbstractFactory;

public class SouthProductFactory implements Factory{
    @Override
    public Fruit createFruit() {
        return new SouthFruit();
    }

    @Override
    public Vegetable createVegetable() {
        return new SouthVegetable();
    }
}
