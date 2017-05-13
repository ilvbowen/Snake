package snake.entity;

import snake.panel.WormPanel;
import snake.tools.ProFood;

import java.util.LinkedList;

/**
 * Created by lvbowen on 2017/5/10.
 * we will be the best
 */
public class Worm {

    public final int UP = -10;
    public final int DOWN = 10;
    public final int LEFT = -1;
    public final int RIGHT = 1;

    private LinkedList<Node> nodes = new LinkedList<>();

    private Node head;

    private Food food;

    public Food getFood() {
        return food;
    }

    public Node getHead() {
        return head;
    }


    private int dir = 0;

    public Worm() {
        nodes.add(new Node(3,5));
        nodes.add(new Node(3,4));
        nodes.add(new Node(3,3));
        head = nodes.getFirst();
        this.food = ProFood.proFood(this);
        System.out.println("test" +nodes.contains(new Node(7,11)));
        dir = RIGHT;
    }

    /*
        沿着当前方向走
     */
    public void step(){
        Node head = nodes.getFirst();
        int i = head.getI() + dir/10;
        int j = head.getJ() + dir%10;
        nodes.addFirst(new Node(i,j));
        this.head = nodes.getFirst();
        nodes.removeLast();
        eat();
        if (death()){
            System.exit(0);
        }
    }
    /*
        换方向走
     */
    public void step(int dir){
        if (this.dir + dir == 0){
            throw  new RuntimeException("别闹");
        }
            this.dir = dir;
            step();
    }
    public boolean contains(int i, int j){
        return nodes.contains(new Node(i,j));
    }

    /*
      吃食物
     */
    public void eat(){
        if (this.contains(food.getI(),food.getJ())){
            Node node = nodes.getLast();
            Node node1= nodes.get(nodes.size() -1);
            int i = node1.getI() - node.getI();
            int j = node1.getJ() - node.getJ();
            Node node2 = new Node(node.getI()+i,node.getJ()+j);
            nodes.add(node2);
            this.food = ProFood.proFood(this);
        }
    }

    /*
        死亡判断
     */
    public boolean death(){
        Node node = nodes.getFirst();
        LinkedList<Node> body = new LinkedList<>(nodes);
        body.removeFirst();
        if (body.contains(node)){
            return true;
        } else if (node.getI() == WormPanel.rows-1 || node.getJ() == WormPanel.cols-1) {
            return true;
        }

        return false;

    }




    @Override
    public String
    toString() {
        return "Worm{" +
                "UP=" + UP +
                ", DOWN=" + DOWN +
                ", LEFT=" + LEFT +
                ", RIGHT=" + RIGHT +
                ", nodes=" + nodes.toString() +
                ", dir=" + dir +
                '}';
    }
}
