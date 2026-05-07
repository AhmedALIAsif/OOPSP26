public abstract class Shape {
    int x=5;
    int y=5;
    public abstract void draw();

    public void erase(){
        System.out.println("Shape is erased.");
    }

    public void moveLeft(Shape s, int newX){
        s.erase();
        s.x=s.x+newX;
        s.draw();
    }

}
