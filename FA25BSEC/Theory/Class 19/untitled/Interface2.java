public interface Interface2 {
    int a=10;
    void add();
    double calPayableAmount();
    default void method(){
        System.out.println("Default method");
    }
}
