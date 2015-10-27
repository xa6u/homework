package lecture2;

public class Addition extends Count {

    int someNumber = 0;

    Addition(int someNuber){

    }

    public void count() {
//        System.out.println("addition of " + someNumber);
    }

    @Override
    public int hashCode() {
        return 7;
    }

    @Override
    public boolean equals(Object o) {
        return true;
    }

}