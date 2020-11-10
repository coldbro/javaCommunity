package H2J;

import java.util.ArrayList;
import java.util.List;

/*
* 根据上面的学习和理解，设计一个Hero二叉树，HeroNode.
可以向这个英雄二叉树插入不同的Hero对象，并且按照Hero的血量倒排序。

随机生成10个Hero对象，每个Hero对象都有不同的血量值，插入这个HeroNode后，把排序结果打印出来。*/
public class HeroNode {
    public HeroNode leftN;
    public HeroNode rightN;
    public Hero1 bloodV;

    public void add(Hero1 v) {
        if (null == bloodV) {
            bloodV =v ;
        } else {
            if (((Integer) bloodV.bloodv - (Integer)v.bloodv) <= 0) {
                if (null == leftN) {
                    leftN = new HeroNode();
                }
                leftN.add(v);
            } else {
                if (null == rightN) {
                    rightN = new HeroNode();
                }
                rightN.add(v);
            }
        }
    }


    public List<Hero1> ArrrT() {
        List<Hero1> heroes = new ArrayList<>();
        if (null != leftN) {
            heroes.addAll(leftN.ArrrT());
        }
        heroes.add(bloodV);
        if(null != rightN){
            heroes.addAll(rightN.ArrrT());
        }
        return heroes;
    }

    public static void main(String[] args) {
        Hero1[] herot = new Hero1[5];
        for(int i= 0; i<5 ;i++){
            herot[i] = new Hero1("name "+i,(int)Math.random()*100);
        }
        var test = new HeroNode();
        for(Hero1 number:herot){
            test.add(number);
        }
        System.out.println(test.ArrrT());

    }
}
class Hero1  {
    public Hero1() {
    }

    public String name;
    public int bloodv;

    public Hero1(String name, int bloodv) {
        this.bloodv = bloodv;
        this.name = name;
    }
}
