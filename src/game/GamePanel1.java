package game;

import player.*;
import player.ai.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class GamePanel1 extends JPanel implements GameEngine {
    //Declare Variables

    public GamePanel1(){
        this.setBackground(Color.WHITE);
        this.setLayout(new BorderLayout());

        startBtn = new JLabel("Start Game").addMouseListener(l);
        playerBtn = new JLabel("Choose Players");

        JPanel reversiBoard = new JPanel();
        reversiBoard.setLayout(new GridLayout(8,8));
        reversiBoard.setPreferredSize(new Dimension(500,500));
        reversiBoard.setBackground(new Color(41,100, 59));
    }

    @Override
    public int getBoardValue(int i, int j) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setBoardValue(int i, int j, int value) {
        // TODO Auto-generated method stub

    }

    @Override
    public void handleClick(int i, int j) {
        // TODO Auto-generated method stub
    }

}