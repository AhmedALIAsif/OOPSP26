package interfacepackage;

public interface InterfaceB extends InterfaceA {
     public static final int count=1;
     void methodB();

     void add();

     default void confusionMethod(){
          System.out.println("Confusion B");
     }
}
