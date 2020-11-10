package ThreadCaseFilm;

public class TestMyCinema {
    public static void main(String[] args) {
        Mycinema mycinema1 = new Mycinema();
        Mycinema mycinema2 = new Mycinema();
        Mycinema mycinema3 = new Mycinema();
        mycinema1.setName("张飞");
        mycinema2.setName("关羽");
        mycinema3.setName("刘备");
        mycinema1.start();
        mycinema2.start();
        mycinema3.start();

    }
}
