package game;

import javax.swing.*;

public class GameWindow extends JFrame {

    public GameWindow(){
        GamePanel gp = new GamePanel();
        this.add(gp);
        this.setTitle("Reversi - Jordi Jaspers");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setSize(700,500);
        this.setResizable(false);
    }

    public static void main(String[] args) {
        new GameWindow();
    }

}
