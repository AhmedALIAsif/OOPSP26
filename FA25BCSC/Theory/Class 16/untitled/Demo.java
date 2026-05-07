public class Demo {
    public static void main(String[] args) {
        Vehicle v1;

        //v1.drive();


        Vehicle car=new Car();
        car.drive();


        car =new LoadingVehicle();

        car.drive();

        ((Car)car).getNumberOfSeats();


    }
}
