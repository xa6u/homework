package lecture1;

public class Stul extends Taburet {

    public int width = 0;
    public int height = 0;

    public Stul(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void addAction() {
        System.out.println("New action");
    }
}
