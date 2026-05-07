package interfacepackage;

public interface InterfaceC  extends InterfaceA{
    public static final int count=2;
    void methodC();

    void add();

    default void confusionMethod(){
        System.out.println("Confusion C");
    }
}
