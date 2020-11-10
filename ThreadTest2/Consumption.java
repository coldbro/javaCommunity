package ThreadTest2;

public class Consumption implements Runnable {
    private Book book;

    public Consumption() {
    }

    public Consumption(Book book) {
        this.book = book;

    }

    @Override
    public void run() {
        while (true) {
            synchronized (book) {
                if (!book.flag) {
                    try {
                        book.wait();//等待，如果生产者通知有书就往下走
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(book.getName() + " ----- " + book.getRmb());
                book.flag = false;
                book.notify();
            }


        }
    }
}
