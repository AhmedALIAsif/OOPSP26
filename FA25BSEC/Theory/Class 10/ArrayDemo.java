public class ArrayDemo {
    public static void main(String[] args) {
        int list[];
        list=new int[20];
        list[0]=1;
        System.out.println(list[0]);

        String namesList[] =new String[30];
        int [] a,b,c=new int[6];
        a=new int[5];

        double array[]={1,2,3,34,5};
        // data type symbol/identifier [] =new datatype[array size];

        //Time timeList[]=new Time[5];
        Time timeList[]={new Time(1,1,1),new Time(2,2,2)};

        //timeList[1]=new Time(1,1,1);
        for(int i=0;i<timeList.length;i++)
            timeList[i]=new Time(1,1,1);

//        for(int i=0;i<timeList.length;i++)
//
//            System.out.println(timeList[i].getSeconds());


        for(Time var:timeList)
            System.out.println(var);

        System.out.println(timeList.length);








    }
}
