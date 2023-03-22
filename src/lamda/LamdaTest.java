package lamda;

interface PrintString{
    void showString(String str);
}
public class LamdaTest {

    public static void main(String[] args) {
        PrintString lamdaString = str -> {System.out.println(str);};
        lamdaString.showString("test");

        showMyString(lamdaString);

        PrintString restr = returnPrint();
        restr.showString("hello");
    }

    public static void showMyString(PrintString lamda){
        lamda.showString("test2");
    }

    public static PrintString returnPrint(){
        return s->System.out.println(s+"world");
    }
}
