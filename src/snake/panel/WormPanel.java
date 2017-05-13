package snake.panel;

import snake.entity.Food;
import snake.entity.Worm;
import snake.tools.ProFood;

/**
 * Created by lvbowen on 2017/5/10.
 * we will be the best
 */
public class WormPanel {
    public static final int rows = 25;
    public static final int cols = 30;
    private Worm worm;


    public WormPanel() {
        this.worm = new Worm();
        System.out.println(worm.toString());
    }

    public void print(){

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(i==0||i==rows-1){
                    System.out.print("—");
                } else if(j==0||j==cols-1){
                    System.out.print("|");
                }else if(worm.contains(i,j)){
                    if (worm.getHead().getI() == i && worm.getHead().getJ() == j){
                        System.out.print("@");
                    }else {
                        System.out.print("*");
                    }

                }else if (worm.getFood().containts(i,j)){

                    System.out.print("0");
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public Worm getWorm() {
        return worm;
    }

    public void setWorm(Worm worm) {
        this.worm = worm;
    }


}
