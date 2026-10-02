/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FlappyBird;

/**
 *
 * @author DELL
 */
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

public class FlappyBird extends JPanel implements ActionListener, KeyListener {

    int birdX = 100;
    int birdY = 200;
    int birdWidth = 30;
    int birdHeight = 30;

    int velocityY = 0;
    int gravity = 1;
 
    Timer timer;
    boolean gameOver = false;

    class Pipe {
        int x, y, width = 60, height;
        Pipe(int x, int y, int height) {
            this.x = x;
            this.y = y;
            this.height = height;
        }
    }

    ArrayList<Pipe> pipes = new ArrayList<>(); 
    Random rand = new Random();

    FlappyBird() {
        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(400, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);
        frame.setVisible(true);
        frame.addKeyListener(this);

        timer = new Timer(20, this);
        timer.start();
        

        addPipe();
    }

    void addPipe() {
        int gap = 150;
        int topHeight = rand.nextInt(200) + 50;

        pipes.add(new Pipe(400, 0, topHeight));
        pipes.add(new Pipe(400, topHeight + gap, 600 - topHeight - gap));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Background
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 400, 600);

        // Bird
        g.setColor(Color.red);
        g.fillRect(birdX, birdY, birdWidth, birdHeight);

        // Pipes
        g.setColor(Color.green);
        for (Pipe p : pipes) {
            g.fillRect(p.x, p.y, p.width, p.height);
        }

        if (gameOver) {
            g.setColor(Color.black);
            g.setFont(new Font("Arial", Font.BOLD, 30));
            g.drawString("Game Over", 100, 300);
        }
    }

    public void actionPerformed(ActionEvent e) {
        if (gameOver) return;

        velocityY += gravity;
        birdY += velocityY;

        for (Pipe p : pipes) {
            p.x -= 5;
        }

        // Add new pipes
        if (pipes.get(0).x < -60) {
            pipes.remove(0);
            pipes.remove(0);
            addPipe();
        }

        // Collision detection
        Rectangle bird = new Rectangle(birdX, birdY, birdWidth, birdHeight);
        for (Pipe p : pipes) {
            Rectangle pipe = new Rectangle(p.x, p.y, p.width, p.height);
            if (bird.intersects(pipe)) {
                gameOver = true;
            }
        }

        // Ground collision
        if (birdY > 570 || birdY < 0) {
            gameOver = true;
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE && !gameOver) {
            velocityY = -10;
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new FlappyBird();
    }
}