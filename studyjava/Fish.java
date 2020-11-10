package studyjava;

import javax.xml.namespace.QName;

/*1. 创建Fish类，它继承Animal类
2. 重写Animal的walk方法以表明鱼不能走且没有腿。
3. 实现Pet接口
4. 无参构造方法
5. 提供一个private 的name属性

 */
public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    public void walk() {
        System.out.println("Fish has " + legs + "legs can walk");
    }

    public void eat() {
        System.out.println("fish eat grass");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println(name + "is playing");
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        System.out.println(fish.legs);
        fish.setName("kilo");
        fish.play();
        fish.eat();
        System.out.println(fish.getName());
        fish.walk();
    }
}
