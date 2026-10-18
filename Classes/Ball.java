import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ball extends JPanel {
    private int x = 50; // Initial x-coordinate
    private int y = 50; // Initial y-coordinate
    private int xSpeed = 2; // Horizontal speed
    private int ySpeed = 2; // Vertical speed
    private int ballSize = 30; // Ball diameter

    public void move() {
        // Update the ball's position
        x += xSpeed;
        y += ySpeed;

        // Check if the ball hits the screen borders
        if (x <= 0 || x + ballSize >= getWidth()) {
            xSpeed = -xSpeed; // Reverse horizontal direction
        }
        if (y <= 0 || y + ballSize >= getHeight()) {
            ySpeed = -ySpeed; // Reverse vertical direction
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, ballSize, ballSize);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        Ball ball = new Ball();

        frame.add(ball);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        while (true) {
            ball.move();
            ball.repaint();
            try {
                Thread.sleep(10); // Pause for a moment
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
