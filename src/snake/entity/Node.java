package snake.entity;

/**
 * Created by lvbowen on 2017/5/10.
 * we will be the best
 */
public class Node {
    private int i;
    private int j;

    public Node() {
    }

    public Node(int i, int j) {
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
    @Override
    public boolean equals(Object obj) {
        if (obj == null){
            return false;
        }
        if (this == obj){
            return true;
        }
        if (obj instanceof Node){
            return i == ((Node) obj).getI() && j == ((Node) obj).getJ();
        }
        return false;
    }

    @Override
    public String toString() {
        return "Node{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
