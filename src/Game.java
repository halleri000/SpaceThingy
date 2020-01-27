import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import static java.awt.event.KeyEvent.VK_SPACE;

public class Game extends JFrame implements KeyListener {

    Board board;
    boolean spacePressed, rightPressed, leftPressed;

    public Game(){


        setTitle("SPACE THINGY");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new Board(this);

        add(board);
        addKeyListener(this);
        pack();
        board.setUp();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){

        new Game();

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if(e.getKeyCode() == VK_SPACE){
            spacePressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            leftPressed = true;
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            rightPressed = true;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_SPACE){
            spacePressed = false;
        }

        if(e.getKeyCode() == KeyEvent.VK_LEFT){
            leftPressed = false;
        }

        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            rightPressed = false;
        }

    }

    public boolean isSpacePressed(){
       return spacePressed;
    }

    public boolean isLeftPressed(){
        return leftPressed;
    }

    public boolean isRightPressed(){
        return rightPressed;
    }
}
