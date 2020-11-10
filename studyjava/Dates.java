package studyjava;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {
    public void dateMethod() throws ParseException {
        String i = "1995/1/1 00:00:00";
        String h = "1995/12/31 23:59:59";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        long date1 = sdf.parse(i).getTime();
        long date2 = sdf.parse(h).getTime();
        long l = (long) (date1 + Math.random() * (date2 - date1 + 1));
        Date date = new Date(l);
        System.out.println(date.toString());
    }

    public void formatMethod() throws ParseException {
        /*准备一个长度是9的日期数组
    使用1970年-2000年之间的随机日期初始化该数组
    按照这些日期的时间进行升序排序
比如 1988-1-21 12:33:22 就会排在 1978-4-21 19:07:23 前面，因为它的时间更小，虽然日期更大 */
        Date[] dates = new Date[9];
        String start = "1970.0.0 00:00:00";
        String end = "2000.0.0 00:00:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
        long date1 = simpleDateFormat.parse(start).getTime();
        long date2 = simpleDateFormat.parse(end).getTime();
        long l = (long) (date1 + Math.random() * (date2 - date1 + 1));
        for (int i = 0; i < dates.length; i++) {
            dates[i] = new Date(l);
            System.out.println(dates[i].toString());
        }
    }

    public static void main(String[] args) {
        ;
    }

}
