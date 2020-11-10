package H2J;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrrayList {
    public static void main(String[] args) {
        List<LOL> lollist = new ArrayList<>();
        lollist.add(new Hero("garen"));
        lollist.add(new Item("killingbook"));
        for(int i=0;i<lollist.size();i++){
            LOL som= lollist.get(i);
            System.out.println(som);
        }
        for(LOL e : lollist ){System.out.println(e);}
    }
}
class  Hero extends  LOL{
        public Hero(String name){
            super(name);
        }
}
class Item extends  LOL{
    public Item(String name ){
        super(name);
    }
}
