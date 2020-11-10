package studyjava;

public interface Healer {
    public void  heal();
    default public void revive() {
        System.out.println("本英雄复活了");
    }
}
