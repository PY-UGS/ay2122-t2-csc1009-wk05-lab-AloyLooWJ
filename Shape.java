public abstract class Shape 
{
    double dim1;
    double dim2;
    static final double PI = 3.14;

    public abstract double area();
}

class Rectangle extends Shape
{
    public Rectangle()
    {
        this.dim1 = 0;
        this.dim2 = 0;
    }

    public Rectangle(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area()
    {
        double area = dim1 * dim2;
        System.out.println("Inside Area for Rectangle.");
        return area;
    }
}

class Triangle extends Shape
{
    public Triangle()
    {
        this.dim1 = 0;
        this.dim2 = 0;
    }

    public Triangle(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area()
    {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Inside Area for Triangle.");
        return area;
    }
}

class Circle extends Shape
{
    public Circle()
    {
        this.dim1 = 0;
        this.dim2 = 0;
    }

    public Circle(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area()
    {
        double area = PI * dim1 * dim1;
        System.out.println("Inside Area for Circle.");
        return area;
    }
}

class Ellipse extends Shape
{
    public Ellipse()
    {
        this.dim1 = 0;
        this.dim2 = 0;
    }

    public Ellipse(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area()
    {
        double area = PI * dim1 * dim2;
        System.out.println("Inside Area for Ellipse.");
        return area;
    }
}

class Square extends Shape
{
    public Square()
    {
        this.dim1 = 0;
        this.dim2 = 0;
    }

    public Square(double dim1, double dim2)
    {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area()
    {
        double area = dim1 * dim2;
        System.out.println("Inside Area for Square.");
        return area;
    }
}