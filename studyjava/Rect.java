package studyjava;

public class Rect extends Shape {
    private int sum;

    public Rect() {
        super();
    }

    public Rect(int x,int y, int sum) {
        super();
        this.sum = sum;

    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("sum"+sum);
    }
}

