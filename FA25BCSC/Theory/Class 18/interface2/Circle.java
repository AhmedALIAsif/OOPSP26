package interface2;

public class Circle extends Shape{

    public double radius;
    @Override
    public void draw() {
        System.out.println("Draw method of circle");
    }

    @Override
    public void fill() {
        System.out.println("Fill method of Circle");
    }
}
