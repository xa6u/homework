package lecture4;


import java.util.ArrayList;
import java.util.List;

public class HomeWork2 {


    public static void main(String args[]) {
        int i;
        Person persAge;

        List<String> list = new ArrayList<>();
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

        Person person = new Person(12,"Dave");
        Person person1 = new Person(25,"John");
        Person person2 = new Person(67,"Mike");
        Person person3 = new Person(1367,"McLaud");

        List<Person> persList = new ArrayList<>();
                persList.add(person);
                persList.add(person1);
                persList.add(person2);
                persList.add(person3);



            for (i=0; i<persList.size();i++){
               persAge = persList.get(i);
                    if (persAge.age > 25){
                        System.out.println("persList = " + persAge.name);
                    }

            }




           /* for (Person str : persList){
                if (str.age > 25){

                }
                System.out.println("str = " + str);
            }*/

    }
}

