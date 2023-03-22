package lamda;

public class TestStringConcat {

    public static void main(String[] args) {
        StringConcatImpl sImpl = new StringConcatImpl();
        sImpl.makeStirng("hello","java");

        StringConcat concat =(s1,s2)->{System.out.println(s1+" "+s2);};
        concat.makeStirng("hello","java");

        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeStirng(String s1, String s2) {
                System.out.println(s1+" "+s2);
            }
        };

        concat2.makeStirng("hello","String");
    }
}
