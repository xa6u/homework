package lecture2;

public class Multiplication implements Count {

    Multiplication(int firstMultiplicator, int secondMultiplicator){

        multiplicationResult = firstMultiplicator * secondMultiplicator;
    }
    public void count() {
        System.out.println("multiplication result " + multiplicationResult);
    }
}