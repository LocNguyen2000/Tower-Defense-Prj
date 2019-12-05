package game.characters.entity.Monster;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BossMonster extends Monster{
    public BossMonster(){
        super();
        healthPoints = 500;
        movementSpeed = 1;
        reward = 100;
        monster = new Circle(path.get(0).getExactX() , path.get(0).getExactY() , radius);
        monster.setFill(Color.DARKGRAY);
        monster.setRadius(18);
    }
}
