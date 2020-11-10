package studyjava;

public class Sup extends HeroS {
    public  Sup(String heroName,
            float heroHP,
            float heroArmor,
            int heroMoveSpeed,
            String copyright){
        super("dsfaf", 44, 1161, 54, "GAMCOMPANY");
        System.out.println("test1");
    }
    public static void main(String[] args) {
         new HeroS("saadsf,",444,555,421,"kSaafdf");

    }
}

class HeroS {
    String heroName;
    float heroHP;
    float heroArmor;
    int heroMoveSpeed;
    static String copyright;
    public HeroS(String heroName
            , float heroHP
            , float heroArmor
            , int heroMoveSpeed
            , String copyright) {
        this.heroHP = heroHP;
        this.heroMoveSpeed = heroMoveSpeed;
        this.heroName = heroName;
        this.heroArmor = heroArmor;
        this.copyright = copyright;
        System.out.println("tttttestsetset");
    }
}