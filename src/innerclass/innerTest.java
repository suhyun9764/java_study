package innerclass;

class OutClass{

    private int num =10;
    private static int sNum=20;
    private Inclass inclass;

    public OutClass() {
        inclass = new Inclass();
    }
    class Inclass{
        int inNum = 200;
        //static sInNum = 100;

        void inTest(){
            System.out.println(num);
            System.out.println(sNum);
        }


    }

    public void usingInTest(){
        inclass.inTest();
    }

    static class InStaticClass{
        int iNum = 100;
        static int sInNum= 200;

        void inTest(){
            sNum+=10;
            System.out.println(sNum);
            System.out.println(iNum);
            System.out.println(sInNum);
        }

        static void sTest(){
            System.out.println(sNum);
            System.out.println(sInNum);
        }
    }
}

public class innerTest {
    public static void main(String[] args){
        /*OutClass outClass = new OutClass();
        outClass.usingInTest();

        OutClass.InStaticClass staticClass = new OutClass.InStaticClass();
        staticClass.inTest();
        */
        OutClass.InStaticClass.sTest();

    }


}
