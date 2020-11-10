package How2J;

public class Hero {
    String name ;
    int HP;
    int MP;
    public void legendary(){
        System.out.println("你超神了");
    }
    public float getHp(){
        System.out.println("现在血量"+HP);
        return HP;
    }
    public float recovery(float blood){
        System.out.println("本次回血"+blood);
        return HP+blood;
    }
}
