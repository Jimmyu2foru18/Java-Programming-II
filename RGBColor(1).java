class RGBColor {
    private int red;
    private int green;
    private int blue;


    private static final int MIN_CHANNEL_VALUE = 0;
    private static final int MAX_CHANNEL_VALUE = 255;

    public RGBColor() {
        red = green = blue = MIN_CHANNEL_VALUE;
    }

    public RGBColor(int red, int green, int blue) {
        setRed(red);
        setGreen(green);
        setBlue(blue);
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        if (red >= MIN_CHANNEL_VALUE && red <= MAX_CHANNEL_VALUE) {
            this.red = red;
        }
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        if (green >= MIN_CHANNEL_VALUE && green <= MAX_CHANNEL_VALUE) {
            this.green = green;
        }
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        if (blue >= MIN_CHANNEL_VALUE && blue <= MAX_CHANNEL_VALUE) {
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

    public void printMaxChannel() {
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
