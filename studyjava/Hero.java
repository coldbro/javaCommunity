package studyjava;

import PracticeDemo.XiTi;

import java.awt.desktop.SystemSleepEvent;

public class Hero {
    String heroName;
    float heroHP;
    float heroArmor;
    int heroMoveSpeed;
    static String copyright;

    public Hero() {

    }

    public Hero(float hp, int speed) {
        this.heroHP = hp;
        this.heroMoveSpeed = speed;
    }

    public Hero(String heroName
            , float heroHP
            , float heroArmor
            , int heroMoveSpeed, String copyright) {
        this(heroHP, heroMoveSpeed);
        this.heroName = heroName;
        this.heroArmor = heroArmor;
        this.copyright = copyright;
        System.out.println("tttttestsetset");
    }

    public static void testM() {
        System.out.println("这是给类方法");
    }

    public void methodT() {
        System.out.println("这是给对象方法");
    }
    public static void die(Hero h){
        System.out.println("死亡升级");
        h.heroHP=0;
        h.levelUp(h);
        System.out.println(" speed："+h.heroMoveSpeed);
    }
    public void levelUp(Hero h){
        System.out.println("升级");
        heroMoveSpeed+=1;
    }
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.heroMoveSpeed = 3;
        hero1.heroHP = 1111;
        hero1.heroArmor = 2222;
        hero1.heroName = "hasaki";
        hero1.copyright = "Blizzard Entertainment Enterprise";
        System.out.println(hero1.heroArmor + "     " + hero1.heroName + "     " + hero1.heroHP + "        " + hero1.heroMoveSpeed);
        Hero hero2 = new Hero("SAKULA", 100000, 200000, 5, "Riot Games");
//        System.out.println(hero2.heroArmor + "     " + hero2.heroName + "     " + hero2.heroHP + "        " + hero2.heroMoveSpeed);
//        XiTi xx = new XiTi();
//        xx.runN();
//        System.out.println(hero1.copyright);
        Hero.testM();
        hero1.methodT();
//        Hero.die(hero1);
//        die(hero2);

    }

}
