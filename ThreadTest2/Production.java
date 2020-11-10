package ThreadTest2;

public class Production implements Runnable {
    private Book book;
    private int num = 0;

    public Production() {
    }

    public Production(Book book) {
        this.book = book;

    }

    @Override
    public void run() {
        while (true) {
            synchronized (book) {
                if (book.flag) {
                    try {
                        book.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (num % 2 == 0) {
                    book.setName("书本1");
                    book.setRmb("100");
                } else {
                    book.setName("书本2");
                    book.setRmb("200");
                }
                num++;
                book.flag = true;
                book.notify();//唤醒消费者

            }
        }
    }
}
