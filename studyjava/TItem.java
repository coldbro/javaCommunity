package studyjava;

public class TItem {
    String name ;
    int price;

    public  TItem(){}
    public TItem(String name ,int price){
        this .name =name;
        this.price = price;
    }
    public void hit(){}
    public static void main(String[] args) {
        TItem tItem = new TItem();//抽象类不能直接实例化,要通过子类
        tItem.price=15;
        tItem.name = "sda";
        System.out.println(tItem.toString());
        TItem m = new TItem(){
            public  void  hit(){
                System.out.println("hit");
            }
        };
        m.hit();

    }
    public String toString(){
       return name+price;
    }
}
