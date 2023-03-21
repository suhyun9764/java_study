package generics;

public class TreeDprinter_Test {

    public static void main(String[] args){

        TreeDprinter<Powder> printer = new TreeDprinter();
        printer.setMaterial(new Powder());
        Powder powder =  printer.getMaterial();

        TreeDprinter<Plastic> printerPlastic = new TreeDprinter();
        printerPlastic.setMaterial(new Plastic());
        Plastic plastic =  printerPlastic.getMaterial();

        System.out.println(printer);
        System.out.println(printerPlastic);

        printer.Printing();
        printerPlastic.Printing();


    }


}
