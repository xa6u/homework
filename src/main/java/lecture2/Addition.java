package lecture2;

public class Addition implements Count {

    Addition(int someNuber){

    }
    public void count() {
        System.out.println("addition of " + someNumber);
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