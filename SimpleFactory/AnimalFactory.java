package SimpleFactory;



/*
 * 一个具体的工厂类，可创建多给具体的产品类
 *
 * */
public class AnimalFactory {
    //    //生产狗对象
//    public static Dog getDog() {
//        return new Dog();
//    }
//
//    //生产猫对象
//    public static Cat getCat() {
//        return new Cat();
//
//    }
    public static Animal getAnimal(String name) {
        if ("dog".equals(name)) {
            return new Dog();
        }else if("cat".equals(name)) {
            return  new Cat();
        }
        return null;
    }
}
