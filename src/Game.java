import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game extends JFrame implements KeyListener {
    Board board;
    boolean leftPressed = false;

    public Game(){

        setResizable(false);
        setVisible(true);
        setFocusable(true);
        setTitle("Brick Breaker");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        board = new Board(this);
        add(board);
        addKeyListener(this);
        pack();
        setLocationRelativeTo(null);

    }
    public static void main(String[]args){
        new Game();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            leftPressed = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            leftPressed = false;
        }


    }

    public boolean isLeftPressed() {
        return leftPressed;
    }
}
