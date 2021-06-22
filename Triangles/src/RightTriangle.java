import static java.lang.Math.*;

public class RightTriangle extends AbstractClassTriangle {

    // perpendicular (to each other) sides
    private double a,b; // a,b > 0

    // public constructor
    public RightTriangle(double __a, double __b){
        a = __a;
        b = __b;
    }

    // public copy constructor
    public RightTriangle(RightTriangle other){
        a = other.a;
        b = other.b;
    }

    // side "c", opposite to the right angle
    private double c(){
        return sqrt( a*a + b*b );
    }

    // gives the length of the side "a"
    public double getA(){
        return a;
    }

    // gives the length of the side "b"
    public double getB(){
        return b;
    }

    // gives the length of the side "c"
    public double getC(){
        return this.c();
    }

    // area
    @Override
    public double area() {
        return 0.5*a*b;
    }

    // perimeter
    @Override
    public double perimeter() {
        return a + b + this.c();
    }

    // radius of the incircle
    @Override
    public double r() {
        return 2. * this.area() / this.perimeter();
    }

    // radius of the circumcircle
    @Override
    public double R() {
        return a*b*this.c() / 4. / this.area();
    }

    // altitude perpendicular to a line containing the side "a"
    public double ha(){
        return 2. * this.area() / a;
    }

    // altitude perpendicular to a line containing the side "b"
    public double hb(){
        return 2. * this.area() / b;
    }

    // altitude perpendicular to a line containing the side "c"
    public double hc(){
        return 2. * this.area() / this.c();
    }

    // the angle opposite to the side "a" (in radians)
    public double alfaInRadians(){
        return acos(   ( (b*b) + ( this.c() * this.c() ) - (a*a) ) / 2. / b / this.c()   );
    }

    // the angle opposite to the side "a" (in degrees)
    public double alfaInDegrees(){
        return this.alfaInRadians() * 180. / PI;
    }

    // the angle opposite to the side "b" (in radians)
    public double betaInRadians(){
        return acos(   ( ( this.c() * this.c() ) + (a*a) - (b*b) ) / 2. / this.c() / a   );
    }

    // the angle opposite to the side "b" (in degrees)
    public double betaInDegrees(){
        return this.betaInRadians() * 180. / PI;
    }

    // the angle opposite to the side "c" (in radians)
    public double gammaInRadians(){
        return acos(   ( (a*a) + (b*b) - ( this.c() * this.c() ) ) / 2. / a / b   );
    }

    // the angle opposite to the side "c" (in degrees)
    public double gammaInDegrees(){
        return this.gammaInRadians() * 180. / PI;
    }

    // the length of the median dividing the side "a"
    public double ma(){
        return sqrt(   0.5*(   (b*b) + ( this.c() * this.c() ) - (0.5*a*a)   )   );
    }

    // the length of the median dividing the side "b"
    public double mb(){
        return sqrt(   0.5*(   ( this.c() * this.c() ) + (a*a) - (0.5*b*b)   )   );
    }

    // the length of the median dividing the side "c"
    public double mc(){
        return sqrt(   0.5*(   (a*a) + (b*b) - ( 0.5 * this.c() * this.c() )   )   );
    }

    // the length of the bisector dividing the angle "alfa" and the side "a"
    public double ba(){
        return sqrt( b*this.c()*(b+this.c()-a)*(b+this.c()+a) ) / (b+this.c());
    }

    // the length of the bisector dividing the angle "beta" and the side "b"
    public double bb(){
        return sqrt( this.c()*a*(this.c()+a-b)*(this.c()+a+b) ) / (this.c()+a);
    }

    // the length of the bisector dividing the angle "gamma" and the side "c"
    public double bc(){
        return sqrt( a*b*(a+b-this.c())*(a+b+this.c()) ) / (a+b);
    }

    // the length of the cevian dividing the angle "alfa" and the side "a"
    public double ca(double ratio){ // ratio in (0,INFINITY) ; for ratio -> 0 (the cevian goes to the left side): ca -> b; for ratio -> INF (the cevian goes to the right side): ca -> c;
        return sqrt( ratio*(b*b+this.c()*this.c()-a*a) + b*b + ratio*ratio*this.c()*this.c() ) / (ratio+1);
    }

    // the length of the cevian dividing the angle "beta" and the side "b"
    public double cb(double ratio){ // ratio in (0,INFINITY) ; for ratio -> 0 (the cevian goes to the left side): cb -> c; for ratio -> INF (the cevian goes to the right side): cb -> a;
        return sqrt( ratio*(this.c()*this.c()+a*a-b*b) + this.c()*this.c() + ratio*ratio*a*a ) / (ratio+1);
    }

    // the length of the cevian dividing the angle "gamma" and the side "c"
    public double cc(double ratio){ // ratio in (0,INFINITY) ; for ratio -> 0 (the cevian goes to the left side): cc -> a; for ratio -> INF (the cevian goes to the right side): cc -> b;
        return sqrt( ratio*(a*a+b*b-this.c()*this.c()) + a*a + ratio*ratio*b*b ) / (ratio+1);
    }

    // prints an information about the triangle
    public void print(){
        System.out.println( "a = " + a );
        System.out.println( "b = " + b );
        System.out.println( "c = " + this.c() );
        super.print();
        System.out.println( "ha = " + this.ha() );
        System.out.println( "hb = " + this.hb() );
        System.out.println( "hc = " + this.hc() );
        System.out.println( "ma = " + this.ma() );
        System.out.println( "mb = " + this.mb() );
        System.out.println( "mc = " + this.mc() );
        System.out.println( "ba = " + this.ba() );
        System.out.println( "bb = " + this.bb() );
        System.out.println( "bc = " + this.bc() );
        System.out.println( "ca = " + this.ca(7.) );
        System.out.println( "cb = " + this.cb(4.) );
        System.out.println( "cc = " + this.cc(6.) );
        System.out.println( "alfa = " + this.alfaInDegrees() );
        System.out.println( "beta = " + this.betaInDegrees() );
        System.out.println( "gamma = " + this.gammaInDegrees() );
    }
}
