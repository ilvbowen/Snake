package snake.entity;

/**
 * Created by lvbowen on 2017/5/11.
 * we will be the best
 */
public class Food {
    private int i;
    private int j;

    public Food(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    public boolean containts(int i ,int j){

        if (this.i == i && this.j == j){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Food{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
