/*package lecture3;

import lecture2.Addition;

import java.util.*;

public class lecture3 {

    public static void main(String[] args) {

        String[] arr = {"hello", "world"};
//        Addition[] add = {new Addition(), new Addition()};

        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
//        System.out.println(list.size());

//        Addition addition = new Addition();
//        System.out.println(addition.hashCode());

        Set<Addition> set = new HashSet<Addition>();
//        set.add(new Addition());
//        set.add(new Addition());
//        System.out.println(set.size());

        Map<String, String> mapa = new HashMap<String, String>();
        mapa.put("textfield1.label", "Test1");
        mapa.put("key2", "value2");
//        System.out.println(mapa.get("key2"));

        for(String vasya : list) {
            System.out.println(vasya);
        }

        System.out.println("\n");

        Map<Integer, Integer> supermap = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100; i++) {
            supermap.put(i, Double.valueOf(100 * Math.random()).intValue());
        }

        Set<Integer> keys = supermap.keySet();
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println(key + " : " + supermap.get(key));
        }

    }
}*/
