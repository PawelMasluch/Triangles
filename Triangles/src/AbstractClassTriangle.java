import static java.lang.Math.sqrt;

public abstract class AbstractClassTriangle {
    public abstract double area();
    public abstract double perimeter();
    public abstract double r();
    public abstract double R();

    public double d(){
        double __R = this.R();
        double __r = this.r();

        return sqrt(   __R * ( __R - 2 * __r )   );
    }

    public void print(){
        System.out.println( "perimeter = " + this.perimeter() );
        System.out.println( "area = " + this.area() );
        System.out.println( "r = " + this.r() );
        System.out.println( "R = " + this.R() );
        System.out.println( "d = " + this.d() );
    }
}
