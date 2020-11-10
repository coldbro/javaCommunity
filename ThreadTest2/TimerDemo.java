package ThreadTest2;

import java.util.Timer;
import java.util.TimerTask;

/*定时器，可以让我们在指定时间内做某件事，还可以重复做某件事。
Timer和TimerTask这两个类
    Timer定时：
    public Timer()
    public void schedule(TimerTask task,long delay) 在指定延迟后执行指定任务
    public void schedule(TimerTask task,long delay,long period)安排指定的任务从指定的延迟后开始进行重复的固定延迟执行
    cancle()终止计时器，丢弃所有当前已安排的任务
*/
public class TimerDemo {
    public static void main(String[] args) {
        Timer t = new Timer();
//        t.schedule(new MyTask(),3000);
        t.schedule(new MyTask(t),3000);
    }
}
class MyTask extends TimerTask{
    private  Timer t;
    public  MyTask(Timer t){
        this.t =t;

    }    @Override
    public  void run(){
        System.out.println("shang个厕所");
        t.cancel();
    }


}