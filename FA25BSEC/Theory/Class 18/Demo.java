import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Welcome to our system.");
        // try
        // catch
        // finally
      int a=10;
      int b=0;
        System.out.println("Enter Numbers");
        Scanner sc=new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            a = sc.nextInt();  // risky statement

            System.out.print("Enter b:");
            b = sc.nextInt(); // risky statement

            System.out.println(a / b);  //risky statement
            System.out.println("other statments in try block");

//            System.out.printf("%b",3.1);
            int arr[]={a,b};
            System.out.println(arr[0]);

          //  throw new Throwable();
        }
        catch (ArithmeticException temp){
            System.out.println(" Arithmetic overflow");

        }
        catch (InputMismatchException | NumberFormatException  e){
            System.out.println("Input mismatch exception is thrown");
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("Null pointer exception is Caught");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds exception.");
        }
        catch (RuntimeException e){
            System.out.println("Runtime exception is caught.");
        }
        catch (Exception e){
            System.out.println("exception ");
        }
        catch (Throwable e){
            System.out.println("Throwable ");
        }
        finally {
            System.out.println("finally block executed.");
        }


//        try {
//            System.out.println("some message");
//        }
//        finally {
//
//        }



        System.out.println("Thank for using this system.");
    }
}
