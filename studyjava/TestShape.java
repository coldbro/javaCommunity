package studyjava;

public class TestShape {
    public static void main(String[] args) {
        TestShape testShape = new TestShape();
        Rect rect = new Rect(1,3,8);
        testShape.draw(rect);
    }
    public  void draw (Shape x){
        x.show();//Shape x = new Rect();
    }
}
