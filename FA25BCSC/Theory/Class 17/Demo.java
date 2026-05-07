import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.println("WElcome to our System");


        int a=10;
        int b=0;
        Scanner sc=new Scanner(System.in);



        //risky statement
        try {
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a / b);
            int arr[]={1,2,3};
            System.out.println(arr[3]);

        }
        catch(ArithmeticException |InputMismatchException arg){
            System.out.println("Arithmetic overfow occurs");
        }

        catch (RuntimeException e){
            System.out.println("Parent catch block");
        }
        catch (Exception e){

        }


        //System.out.println(arr[5]);
        System.out.println("Thank you for using this software.");


    }
}
