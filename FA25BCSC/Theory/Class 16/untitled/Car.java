public class Car extends Vehicle{


    @Override
    public void drive() {
        System.out.println("drive method of Car class");
    }

    public int getNumberOfSeats(){
        return 4;
    }
}
