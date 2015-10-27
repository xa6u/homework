package lecture2;

import java.lang.reflect.Array;
import java.util.ArrayList;


public  class ListHomework {


    public static void main(String[] args){



        final int CONST = 5;
        int stringLength;
        String stringElement;
        int i;


        ArrayList <String> stringList = new ArrayList<String>();

        for (i = 0; i < CONST; i++ ){

            stringList.add("Element " + i);
        }


        stringLength = stringList.size();
        stringElement = stringList.get(3);
        System.out.println("Размер списка = " + stringLength);
        System.out.println("Третий элемент списка = " + stringElement);
        System.out.println("\n");
        
        for (i = 0; i<stringList.size(); i++){

            System.out.println(i + 1 +" элемент массива arraylist " + stringList.get(i));

        }
        System.out.println("\n");

        Integer arr[]={2,6,9,4,6,0,7,3,21,};

        for (i = 0; i<arr.length; i++){

            System.out.println(i+1 +" элемент массива " + arr[i]);
        }

    }

}