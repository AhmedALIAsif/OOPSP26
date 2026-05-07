public class ExceptionTest2 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            divide(a, b);
        }
        catch (ArithmeticException e){
            System.out.println("Exception occur");
            System.out.println(e.getMessage());
        }
    }

    private static double divide(int a, int b) {

        return divide2(a,b);
    }

    public static double divide2(int a, int b){
        return a/b;
    }

}
