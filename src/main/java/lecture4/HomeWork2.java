package lecture4;


import java.util.*;

public class HomeWork2 {


    public static void main(String args[]) {
        Person persAge;

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");  
        list.add("two");
        list.add("one");


        StringBuilder stringRes = new StringBuilder();
        for (String s : list){
            stringRes.append(s);
        }

        System.out.println("Concatenated string = " + stringRes);

        Person p = new Person(1, "Peter");
        p = new Person(2, "Peter");
        p = new Person(3, "Peter");

        Person person = new Person(12,"Dave");
        Person person1 = new Person(25,"John");
        Person person2 = new Person(67,"Mike");
        Person person3 = new Person(1367,"McLaud");

        List<Person> persList = new ArrayList<Person>();
                persList.add(person);
                persList.add(person1);
                persList.add(person2);
                persList.add(person3);
        persList.clear();
        persList = new ArrayList<Person>();

        Map<String, List<Person>> map = new HashMap<String, List<Person>>();

        Set set = map.keySet();
        Iterator it = set.iterator();
        List<Person> r = map.get(it.next());
        Person per = r.get(0);


        int count = 0;
        for (int i=0; i<persList.size();i++) {
            persAge = persList.get(i);
            if (persAge.age > 25){
                count++;
            }
        }
        System.out.println(count);




           /* for (Person str : persList){
                if (str.age > 25){

                }
                System.out.println("str = " + str);
            }*/

    }
}

