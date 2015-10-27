package lecture4;

import lecture1.Stul;

import java.util.*;

public class Lecture4 {

    public static void main (String args[]){
        Stul styl1 = new Stul(100, 45);
        Stul styl2 = new Stul(120, 564);
        Stul styl3 = new Stul(107, 34345345);

        List<Stul> lists = new ArrayList<Stul>();
        lists.add(styl1);
        lists.add(styl2);
        lists.add(styl3);

        Map<Stul, String> mapa = new HashMap<Stul, String>();
        mapa.put(styl1, "один");
        mapa.put(styl2, "два");

        Set<Stul> set = mapa.keySet();
        Iterator<Stul> it = set.iterator();
        while (it.hasNext()) {
            Stul stul = it.next();
            if (stul.height < 100) {
                System.out.println(mapa.get(stul));
            }
        }



    }
}
