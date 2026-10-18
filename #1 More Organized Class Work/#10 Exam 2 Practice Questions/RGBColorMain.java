public class RGBColorMain {
    public static void main(String[] args) {
        RGBColor color1 = new RGBColor();
        RGBColor color2 = new RGBColor(255, 0, 0);
        RGBColor color3 = new RGBColor(0, 255, 0);
        RGBColor color4 = new RGBColor(0, 0, 255);

        System.out.println("Color 1 (Default):");
        System.out.println(color1.toString());

        System.out.println("Color 2 (Red):");
        System.out.println(color2.toString());

        System.out.println("Color 3 (Green):");
        System.out.println(color3.toString());

        System.out.println("Color 4 (Blue):");
        System.out.println(color4.toString());

        color1.setRGB(250, 150, 0);
        color1.swapRedAndGreen();

        System.out.println("Color 1 (Gray with swapped R and G):");
        System.out.println(color1.toString());

        System.out.println("Maximum Channel in Color 2 (Red):");
        color2.printMaxC();
    }
}
