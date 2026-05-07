package interfacepackage;

public interface InterfaceA {

       void method1();


       default  void printName(){
              System.out.println("InterfaceA");
       }
}
