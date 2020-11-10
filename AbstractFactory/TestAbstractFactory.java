package AbstractFactory;

public class TestAbstractFactory {
    public static void main(String[] args) {
        Factory northFactory = new NorthProductFactory();
        Factory soutFactory = new SouthProductFactory();
        System.out.println("北方产品");
        northFactory.createFruit().fruitInfo();
        northFactory.createVegetable().vegetableInfo();
        soutFactory.createVegetable().vegetableInfo();
        soutFactory.createFruit().fruitInfo();
    }
}
