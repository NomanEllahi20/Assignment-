class calculateTriangle
{
    public static void main (String arg[])
 { 
    Triangle tria = new Triangle(51, 12, 4, 9,);
    system.out.printIn("Area = " + tria.getArea());
    system.out.printIn("Perimeter = " + tria.getPerimeter());
 }
}
class Triangle
{
    int height;
    int base;
    int s_a;
    int s_c;
    Triangle(int h, int b, int a, int c)
    {
        this.height = height;
        this.base = base;
        this s_a = a;
        this s_c = c;
    }
    int getArea()
    {
        return (height * base)/2;
    }
    int getPerimeter()
    {
        return s_a + base + s_c;
    }
}