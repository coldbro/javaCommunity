package ThreadCaseFilm;

public class TestMyCinema2 {
    public static void main(String[] args) {
        Mycinema2 mycinema2 = new Mycinema2();
        Thread m1 = new Thread(mycinema2, "刘");
        Thread m2 = new Thread(mycinema2, "关");
        Thread m3 = new Thread(mycinema2, "张");
        m1.start();
        m2.start();
        m3.start();


    }
}
