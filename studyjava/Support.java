package studyjava;

import javax.print.DocFlavor;

public class Support extends Hero implements Healer {
    @Override
    public void heal() {
        System.out.println("辅助");
    }

    public static void main(String[] args) {
        bluepotion bp = new bluepotion();
        bp.effect();
         Support support = new Support();
         support.heal();
         support.revive();

    }
}
class iipotion{
    String name;
    int price;
    public  void effect(){
        System.out.println("可以加血");
    }
}
class bluepotion extends iipotion{
//    @Override
//    public void effect(){
//        System.out.println("蓝瓶补魔");
//    }
}
