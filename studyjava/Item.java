package studyjava;

import studyjava.AItem;

public class Item {
    String name; //姓名
    float price;

    public static void main(String[] args) {
//        studyjava.Item hpbottle = new studyjava.Item();
//        hpbottle.name = "血瓶";
//        hpbottle.price = 300f;
//        studyjava.Item sword = new studyjava.Item();
//        sword.name = "长剑";
//        sword.price = 700f;
//        studyjava.Item shoe = new studyjava.Item();
//        shoe.name = "潮鞋";
//        shoe.price = 511f;
        AItem hhero = new AItem("护甲",400f,500);
        System.out.println(hhero.price);
    }
}
//   class tem{
//        String name;
//        int price;
//
//public tem(){}
//
//public tem(String a,int b){
//        name = a;
//        price = b;}}