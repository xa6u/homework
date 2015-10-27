package lecture2;

import java.util.ArrayList;

public class ListHomework {

    public static void main(String[] args){

    }

    final int CONST = 5;
    int stringLength;
    String stringElement;
    int i;


    ArrayList <String> stringList = new ArrayList<String>(); {

        for (i = 0; i < CONST; i++ ){

            stringList.add("FirstElement" + i);
        }


        stringLength = stringList.size();
        stringElement = stringList.get(3);
        System.out.println("Размер списка = " + stringLength);
        System.out.println("Третий элемент списка = " + stringElement);

    }


}

