package studyjava;

class zItem {
    String name;
    int price;
}

class Armor extends zItem {
    int level;

    public static void main(String[] args) {
        studyjava.Armor hujia1 = new studyjava.Armor();
        hujia1.name = "hujia1";
        hujia1.level = 2;
        hujia1.price = 2000;
        System.out.println("护甲的名字" + hujia1.name);
        System.out.println("护甲的价格" + hujia1.price);
        System.out.println("护甲的等级" + hujia1.level);
        Armor h1 = new Armor();
        Armor h2 = new Armor();
        h1.name = "h1";
        h2.name = "h2";
        hujia1.hujia(h1, h2);

    }

    public void hujia(Armor hujia) {
        System.out.println("买了一件" + hujia.name + "护甲");
    }

    public void hujia(Armor hujia, int n) {
        System.out.println("买了" + n + "件" + hujia.name + "护甲");
    }

    public void hujia(Armor... armors) {
        for (int i = 0; i < armors.length; i++) {
            System.out.println(name + "和" + armors[i].name);
        }
    }
}
