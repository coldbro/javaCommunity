package ThreadTest1;

public class Mystop extends  Thread {
    @Override
    public void run() {
        try {
            Mystop.sleep(1200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<20 ;i++)
             System.out.println(getName()+"——————"+i);
    }
}
