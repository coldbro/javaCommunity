package studyjava;

public class TGD {
    public static void main(String[] args) {


//    GiantDragos dragos = new GiantDragos();
        GiantDragos dragos = GiantDragos.getInstance();
        GiantDragos dragos2 = GiantDragos.getInstance();
        //都是同一个对象
        System.out.println(dragos == dragos2);
        GD gd = GD.getGtest();
        GD gd2 = GD .getGtest();
        System.out.println(gd==gd2);
    }
}


