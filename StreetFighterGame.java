import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class StreetFighterGame extends JPanel implements KeyListener, ActionListener {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int PLAYER_SPEED = 5;

    private Rectangle player1;
    private Rectangle player2;

    private Timer timer;

    public StreetFighterGame() {
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
        setFocusable(true);
        addKeyListener(this);

        player1 = new Rectangle(100, 300, 50, 100);
        player2 = new Rectangle(600, 300, 50, 100);

        timer = new Timer(16, this);
        timer.start();
    }

    private void update() {
        // Update player1's position
        if (isKeyPressed(KeyEvent.VK_A)) {
            player1.x -= PLAYER_SPEED;
        }
        if (isKeyPressed(KeyEvent.VK_D)) {
            player1.x += PLAYER_SPEED;
        }
        if (isKeyPressed(KeyEvent.VK_W)) {
            player1.y -= PLAYER_SPEED;
        }
        if (isKeyPressed(KeyEvent.VK_S)) {
            player1.y += PLAYER_SPEED;
        }

        // Update player2's position
        if (isKeyPressed(KeyEvent.VK_LEFT)) {
            player2.x -= PLAYER_SPEED;
        }
        if (isKeyPressed(KeyEvent.VK_RIGHT)) {
            player2.x += PLAYER_SPEED;
        }
        if (isKeyPressed(KeyEvent.VK_UP)) {
            player2.y -= PLAYER_SPEED;
        }
        if (isKeyPressed(KeyEvent.VK_DOWN)) {
            player2.y += PLAYER_SPEED;
        }

        // Ensure players stay within the screen boundaries
        player1.x = Math.max(0, player1.x);
        player1.x = Math.min(WIDTH - player1.width, player1.x);
        player1.y = Math.max(0, player1.y);
        player1.y = Math.min(HEIGHT - player1.height, player1.y);

        player2.x = Math.max(0, player2.x);
        player2.x = Math.min(WIDTH - player2.width, player2.x);
        player2.y = Math.max(0, player2.y);
        player2.y = Math.min(HEIGHT - player2.height, player2.y);
    }

    private boolean[] keys = new boolean[256];

    private boolean isKeyPressed(int keyCode) {
        return keys[keyCode];
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        update();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Draw players
        g.setColor(Color.RED);
        g.fillRect(player1.x, player1.y, player1.width, player1.height);

        g.setColor(Color.BLUE);
        g.fillRect(player2.x, player2.y, player2.width, player2.height);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Street Fighter Clone");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setResizable(false);
            frame.add(new StreetFighterGame());
            frame.pack();
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
        });
    }
}