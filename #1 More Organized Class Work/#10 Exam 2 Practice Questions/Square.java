/**
 * @author Jimmy M.
 */
class Square 
{
    private double side;

    public Square() 
    {
        side = 1.0;
    }

    public Square(double side) 
    {

        if (side > 0) 
        {
            this.side = side;
        } else 
        {
            this.side = 1.0;
        }
    }

    public double getSide() 
    {
        return side;
    }

    public void setSide(double side) 
    {
        if (side > 0) 
        {
            this.side = side;
        }
    }

    public double calculatePerimeter() 
    {
        return 4.0 * side;
    }

    public double calculateArea() 
    {
        return side * side;
    }

    public String toString() 
    {
        return "Square with side " + side + ", perimeter " + calculatePerimeter() + ", and area " + calculateArea();
    }

    public static void printEquations() 
    {
        System.out.println("Perimeter = 4 * side");
        System.out.println("Area = side * side");
    }

}

