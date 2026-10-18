class Square {
    private double side;

    public Square() {
        // Default constructor
        side = 1.0;
    }

    public Square(double side) {
        // Valued constructor
        if (side > 0) {
            this.side = side;
        } else {
            this.side = 1.0;
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public double calculatePerimeter() {
        return 4.0 * side;
    }

    public double calculateArea() {
        return side * side;
    }

    public String toString() {
        return "Square with side " + side + ", perimeter " + calculatePerimeter() + ", and area " + calculateArea();
    }

    public static void printEquations() {
        System.out.println("Perimeter = 4 * side");
        System.out.println("Area = side * side");
    }

    public static void main(String[] args) {
        // Create Square objects and test methods
        Square square1 = new Square();
        Square square2 = new Square(3.0);

        System.out.println("Square 1:");
        System.out.println(square1.toString());

        System.out.println("Square 2:");
        System.out.println(square2.toString());

        // Test the static method
        System.out.println("Equations:");
        Square.printEquations();
    }
}

