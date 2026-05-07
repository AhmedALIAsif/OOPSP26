public class Main2 {
    public static void main(String[] args) {

        Shape s[]=new Shape[5];
        s[0]=new Rectangle();
        s[1]=new Circle();


        ShapeBevaiour shapeBevaiour = new Cube();
        Shape shape=new Circle();

        if(shapeBevaiour instanceof Cube)
            System.out.println("ShapeBehaviou is instance of Cube");

        s[2]=new Circle();

        Utils.drawShapes(s);

        Utils.eraseAll(s);


    }



}
