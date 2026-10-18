import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class VerticalPongGame extends JPanel implements KeyListener, ActionListener {
    private int ballX = 300; // Initial x-coordinate of the ball
    private int ballY = 200; // Initial y-coordinate of the ball
    private int ballXSpeed = 2; // Horizontal speed of the ball
    private int ballYSpeed = 2; // Vertical speed of the ball
    private int ballSize = 20; // Ball diameter
    private int paddle1Y = 150; // Initial y-coordinate of player 1's paddle
    private int paddle2Y = 150; // Initial y-coordinate of player 2's paddle
    private int paddleWidth = 10; // Paddle width
    private int paddleHeight = 80; // Paddle height
    private boolean player1UpKeyPressed = false;
    private boolean player1DownKeyPressed = false;
    private boolean player2UpKeyPressed = false;
    private boolean player2DownKeyPressed = false;
    private boolean gameRunning = true;
    private Timer timer;

    public VerticalPongGame() {
        timer = new Timer(10, this);
        timer.start();
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    public void moveBall() {
        if (!gameRunning)
            return;

        ballX += ballXSpeed;
        ballY += ballYSpeed;

        // Check if the ball hits the top or bottom walls
        if (ballY <= 0 || ballY + ballSize >= getHeight()) {
            ballYSpeed = -ballYSpeed; // Reverse vertical direction
        }

        // Check if the ball hits player 1's paddle
        if (ballX <= paddleWidth && ballY >= paddle1Y && ballY <= paddle1Y + paddleHeight) {
            ballXSpeed = -ballXSpeed; // Reverse horizontal direction
        }

        // Check if the ball hits player 2's paddle
        if (ballX + ballSize >= getWidth() - paddleWidth && ballY >= paddle2Y && ballY <= paddle2Y + paddleHeight) {
            ballXSpeed = -ballXSpeed; // Reverse horizontal direction
        }

        // Check if the ball goes out of bounds
        if (ballX <= 0) {
            gameRunning = false;
        }

        if (ballX + ballSize >= getWidth()) {
            gameRunning = false;
        }
    }

    public void movePaddles() {
        if (player1UpKeyPressed && paddle1Y > 0) {
            paddle1Y -= 5;
        }
        if (player1DownKeyPressed && paddle1Y + paddleHeight < getHeight()) {
            paddle1Y += 5;
        }
        if (player2UpKeyPressed && paddle2Y > 0) {
            paddle2Y -= 5;
        }
        if (player2DownKeyPressed && paddle2Y + paddleHeight < getHeight()) {
            paddle2Y += 5;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveBall();
        movePaddles();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, getWidth(), getHeight()); // Background

        if (gameRunning) {
            g.setColor(Color.BLUE);
            g.fillOval(ballX, ballY, ballSize, ballSize); // Ball

            g.setColor(Color.RED);
            g.fillRect(0, paddle1Y, paddleWidth, paddleHeight); // Player 1's paddle
            g.fillRect(getWidth() - paddleWidth, paddle2Y, paddleWidth, paddleHeight); // Player 2's paddle
        } else {
            // Game over screen
            g.setColor(Color.RED);
            g.setFont(new Font("Arial", Font.BOLD, 36));
            g.drawString("Game Over", getWidth() / 2 - 100, getHeight() / 2);
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            player1UpKeyPressed = true;
        }
        if (key == KeyEvent.VK_S) {
            player1DownKeyPressed = true;
        }
        if (key == KeyEvent.VK_UP) {
            player2UpKeyPressed = true;
        }
        if (key == KeyEvent.VK_DOWN) {
            player2DownKeyPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_W) {
            player1UpKeyPressed = false;
        }
        if (key == KeyEvent.VK_S) {
            player1DownKeyPressed = false;
        }
        if (key == KeyEvent.VK_UP) {
            player2UpKeyPressed = false;
        }
        if (key == KeyEvent.VK_DOWN) {
            player2DownKeyPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // Not needed for this game
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Vertical Pong Game");
        VerticalPongGame game = new VerticalPongGame();

        frame.add(game);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
