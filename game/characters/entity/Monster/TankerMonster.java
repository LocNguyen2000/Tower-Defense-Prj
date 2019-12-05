package game.characters.entity.Monster;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class TankerMonster extends Monster{
    public TankerMonster(){
        super();
        healthPoints = 100;
        movementSpeed = 1;
        reward = 35;
        monster = new Circle(path.get(0).getExactX() , path.get(0).getExactY() , radius);
        monster.setRadius(15);
        monster.setFill(Color.CORNFLOWERBLUE);
    }
}
