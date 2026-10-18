class RGBColor {
    private int red;
    private int green;
    private int blue;


    public static final int Min_C_Value = 0;
    public static final int Max_C_Value= 255;

    public RGBColor() 
    {
        red = green = blue = Min_C_Value;
    }

    public RGBColor(int red, int green, int blue) 
    {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if (red >= Min_C_Value && red <= Max_C_Value) {
            this.red = red;
        }
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if (green >= Min_C_Value && green <= Max_C_Value) {
            this.green = green;
        }
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if (blue >= Min_C_Value && blue <= Max_C_Value) {
            this.blue = blue;
        }
    }

    public void setRGB(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public void swapRedAndGreen() {
        int temp = red;
        red = green;
        green = temp;
    }

    public void printMaxC() {
        int max = Math.max(red, Math.max(green, blue));
        if (red == max) {
            System.out.println("R: " + red);
        }
        if (green == max) {
            System.out.println("G: " + green);
        }
        if (blue == max) {
            System.out.println("B: " + blue);
        }
    }

    public String toString() {
        return "R: " + red + ", G: " + green + ", B: " + blue;
    }
}
