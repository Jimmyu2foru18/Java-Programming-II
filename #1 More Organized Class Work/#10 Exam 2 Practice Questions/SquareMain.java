public class SquareMain 
{
    public static void main(String[] args) 
    {
        Square square1 = new Square();
        Square square2 = new Square(3.0);
        Square square3 = new Square(-3.0);
        
       
        System.out.println("Equations:");
        Square.printEquations(); 
        
        System.out.println("\nSquare 1:");
        System.out.println(square1.toString());
        
        System.out.println("\nSquare 1 side:");
        System.out.println(square1.getSide());
        
        System.out.println("Square 1 Area:");
        System.out.println(square1.calculateArea());
        
        System.out.println("Square 1 Perimeter:");
        System.out.println(square1.calculatePerimeter());

        System.out.println("\nSquare 2:");
        System.out.println(square2.toString());
        
        System.out.println("\nSquare 2 side:");
        System.out.println(square2.getSide());
        
        System.out.println("Square 2 Area:");
        System.out.println(square2.calculateArea());
        
        System.out.println("Square 2 Perimeter:");
        System.out.println(square2.calculatePerimeter());
        
        System.out.println("\nSquare 3:");
        System.out.println(square3.toString());
        
        System.out.println("\nSquare 3 side:");
        System.out.println(square3.getSide());
        
        System.out.println("Square 3 Area:");
        System.out.println(square3.calculateArea());
        
        System.out.println("Square 3 Perimeter:");
        System.out.println(square3.calculatePerimeter());

    }
}
