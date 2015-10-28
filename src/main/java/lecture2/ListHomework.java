package lecture2;


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
        System.out.println("List size = " + stringLength);
        System.out.println("Third element of the list = " + stringElement);
        System.out.println("\n");

        for ( String listVar : stringList ){

            System.out.println("Array element arraylist " + listVar);

        }
        System.out.println("\n");

        Integer arr[]={2,6,9,4,6,0,7,3,21,};

        for (i = 0; i<arr.length; i++){

            System.out.println(i+1 +" array element " + arr[i]);
        }

    }

}