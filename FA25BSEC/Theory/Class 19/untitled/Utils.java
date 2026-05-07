public class Utils {


    public static void drawShapes(Shape []shapes){
        for(Shape s:shapes)
            if(s!=null) {
                s.draw();
            }
    }

    public static  void eraseAll(Shape shapes[]){
        for(Shape s:shapes)
            if(s!=null) {
                s.erase();
                System.out.println(s.getClass().getSimpleName());
            }
    }
}
