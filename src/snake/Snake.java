package snake;

import Test.extendsandinterface.snake.entity.Food;
import Test.extendsandinterface.snake.entity.Worm;
import Test.extendsandinterface.snake.panel.WormPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.*;
import java.util.Timer;

/**
 * Created by lvbowen on 2017/5/9.
 * we will be the best
 */
public class Snake extends JFrame {
    private static boolean flag = true;
    public static void main(String[] args) {
        new Snake();

    }

    public Snake() throws HeadlessException {

        WormPanel wormPanel = new WormPanel();
        Worm worm = wormPanel.getWorm();
        wormPanel.print();
       Timer timer = new Timer();
       timer.schedule(new TimerTask() {

           @Override
           public void run() {
               worm.step();
               wormPanel.print();

           }
       },1000,500);

        this.setVisible(true);
        this.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {

                switch (e.getKeyCode()){
                    case KeyEvent.VK_UP:
                      worm.step(worm.UP);
                      wormPanel.print();
                      break;
                    case KeyEvent.VK_DOWN:
                        worm.step(worm.DOWN);
                        wormPanel.print();
                        break;
                    case KeyEvent.VK_LEFT:
                        worm.step(worm.LEFT);
                        wormPanel.print();
                        break;
                    case KeyEvent.VK_RIGHT:
                        worm.step(worm.RIGHT);
                        wormPanel.print();
                        break;
                }

            }
        });
    }


}
