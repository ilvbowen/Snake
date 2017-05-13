package snake.tools;

import snake.entity.Food;
import snake.entity.Worm;

import java.util.Random;

/**
 * Created by lvbowen on 2017/5/11.
 * we will be the best
 */
public class ProFood {

    public static Food proFood(Worm worm){
        Food food = randFood();
        while (worm.contains(food.getI(),food.getJ())){
            food = randFood();
        }
        return food;
    }
    private static Food randFood(){
        Random random = new Random();
        int i = random.nextInt(13) + 1;
        int j = random.nextInt(18) + 1;
        Food food =new Food(i,j);
        return food;
    }

}
