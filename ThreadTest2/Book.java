package ThreadTest2;

public class Book {
    boolean flag;//true:有书，通知消费者消费，false：没有书，通知生产者生产
    private String name;
    private String rmb;

    public void setName(String name) {
        this.name = name;
    }

    public void setRmb(String rmb) {
        this.rmb = rmb;
    }

    public String getName() {
        return name;
    }

    public String getRmb() {
        return rmb;
    }
}
