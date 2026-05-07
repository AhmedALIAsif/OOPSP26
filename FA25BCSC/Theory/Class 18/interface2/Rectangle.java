package interface2;

public class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw method of rectangle");
    }

    @Override
    public void fill() {
        System.out.println("Fill method of rectangle");
    }
}
