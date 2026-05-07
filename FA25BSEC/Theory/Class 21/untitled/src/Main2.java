public class Main2 {
    public static void main(String[] args) {

        PrintText printText=new PrintText();
        printText.printIt("Hello World");

        //PrintThings printThings=new PrintText();
//        PrintThings printThings=new PrintThings() {
//            @Override
//            public void printIt(String text) {
//                System.out.println(text);
//            }
//        };
//        printThings.printIt("Anonymous definition");

        PrintThings printThings= e ->  System.out.println(e);

        printThings.printIt("short method");


    }
}
