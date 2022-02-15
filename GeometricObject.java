import java.time.LocalDateTime;

public class GeometricObject 
{
    LocalDateTime dateCreated;
    String color;
    boolean filled;

    public GeometricObject()
    {
        setColor("white");
        setFilled(false);
    }

    public GeometricObject(String color, boolean filled)
    {
        setColor(color);
        setFilled(filled);
    }

    public String getColor()
    {
        return color;
    }
    
    public void setColor(String newcolor)
    {
        color = newcolor;
    }

    public boolean isFilled()
    {
        return filled;
    }

    public void setFilled(boolean newFilled)
    {
        filled = newFilled;
    }

    public LocalDateTime getDateCreated()
    {
        dateCreated = LocalDateTime.now();
        return dateCreated;
    }

    public String toString()
    {
        String output = "created on ";
        return output + getDateCreated();
    }
}

class Circle extends GeometricObject
{
    double radius;

    public Circle()
    {
        setRadius(0);
    }

    public Circle(double radius)
    {
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled)
    {
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        double area = radius * radius * 3.1415;
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = 2 * radius * 3.1415;
        return perimeter;
    }

    public double getDiameter()
    {
        double diameter = 2 * radius;
        return diameter;
    }

    public void printCircle()
    {
        
    }
}

class Rectangle extends GeometricObject
{
    double width;
    double height;

    public Rectangle()
    {
        setWidth(0);
        setHeight(0);
    }

    public Rectangle(double width, double height)
    {
        setWidth(width);
        setHeight(height);
    }

    public Rectangle(double width, double height, String color, boolean filled)
    {
        setWidth(width);
        setHeight(height);
        setColor(color);
        setFilled(filled);
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getArea()
    {
        double area = height * width;
        return area;
    }

    public double getPerimeter()
    {
        double perimeter = 2 * (height + width);
        return perimeter;
    }
}