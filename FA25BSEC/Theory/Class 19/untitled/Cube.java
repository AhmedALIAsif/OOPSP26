import java.io.Serializable;

public class Cube extends Shape implements ShapeBevaiour, Interface2 {

    @Override
    public void draw() {
        System.out.println("Draw method of Cube");

    }

    @Override
    public void fill() {
        System.out.println("This is fill method of cube");
    }
    @Override
    public void add() {

    }

    @Override
    public double calPayableAmount() {
        return 0;
    }
}
