import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class EquilateralTriangle extends AbstractClassTriangle {

    // side
    private double a; // a > 0

    // public constructor
    EquilateralTriangle(double __a){
        a = __a;
    }

    // public copy constructor
    EquilateralTriangle(EquilateralTriangle other){
        a = other.a;
    }

    // gives the length of the side "a"
    public double getA(){
        return a;
    }

    /*
    public void setA(double __a){
        a = __a;
    }
     */

    // perimeter
    @Override
    public double perimeter() {
        return 3. * a;
    }

    // area
    @Override
    public double area() {
        return 0.25 * a * a * sqrt(3.);
    }

    // altitude
    public double h(){
        return 0.5 * a * sqrt(3.);
    }

    // median
    public double m(){
        return 0.5 * a * sqrt(3.);
    }

    // bisector
    public double b(){
        return 0.5 * a * sqrt(3.);
    }

    // the length of the cevian dividing the inside angle and the side
    public double c(double ratio){ // ratio in (0,INFINITY) ; for ratio -> 0 (the cevian goes to the left side): c -> a; for ratio -> INF (the cevian goes to the right side): c -> a;
        return sqrt( ratio*(a*a) + a*a + ratio*ratio*a*a ) / (ratio+1);
    }

    // radius of incircle
    @Override
    public double r() {
        return a * sqrt(3.) / 6.;
    }

    // radius of circumcircle
    @Override
    public double R() {
        return a * sqrt(3.) / 3.;
    }

    // inside angle (in degrees)
    public double insideAngleInDegrees(){
        return 60.;
    }

    // inside angle (in degrees)
    public double insideAngleInRadians(){
        return PI / 3.;
    }

    // prints an information about the triangle
    public void print(){
        System.out.println( "a = " + a );
        super.print();
        System.out.println( "h = " + this.h() );
        System.out.println( "m = " + this.m() );
        System.out.println( "b = " + this.b() );
        System.out.println( "c = " + this.c(3.4) );
        System.out.println( "alfa = " + this.insideAngleInDegrees() );
    }
}
