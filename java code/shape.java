abstract class shape {
    public abstract double area();
    public abstract double perimeter();
}
class rectangle extends shape{
    private double l;
    private double b;
    public rectangle(double l,double b)
    {
        this.l=l;
        this.b=b;
    }
    @Override
    public double area()
    {
        return l*b;
    }
    @Override
    public double perimeter()
    {
        return 2*(l+b);
    }
}
class circle extends shape{
    private double r;
    public circle(double r)
    {
        this.r=r;
    }
    @Override
    public double area()
    {
        return Math.PI*r*r;
    }
    @Override
    public double perimeter()
    {
        return 2*Math.PI*r;
    }
}
class shapedemo1{
    public static void main(String args[])
    {
        shape x=new rectangle(3.0,4.0);
        shape y=new circle(7.5);
        System.out.println("area of rectangle is"+x.area());
        System.out.println("perimeter of rectangle is"+x.perimeter());
        System.out.println("area of circle is"+y.area());
        System.out.println("perimeter of circle is"+y.perimeter());
    }
}
//abstract-interface