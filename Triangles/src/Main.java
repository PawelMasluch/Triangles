public class Main {
    public static void main(String [] args){

        GeneralTriangle T1 = new GeneralTriangle(1.9,2.,0.99);
        T1.print();

        System.out.println("\n");

        EquilateralTriangle T2 = new EquilateralTriangle(1.);
        T2.print();

        System.out.println("\n");

        RightTriangle T3 = new RightTriangle(3.,4.);
        T3.print();
    }
}
