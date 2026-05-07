package interface2;

public abstract class Shape implements FillShapes{

    public void erase(){

        System.out.println("Erase method is called");

    }

    public abstract void draw();

}
