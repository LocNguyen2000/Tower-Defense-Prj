package game.characters.entity.Monster;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class NormalMonster extends Monster{
    public NormalMonster(){
        super();
        healthPoints = 30;
        movementSpeed = 1;
        reward = 10;
        monster = new Circle(path.get(0).getExactX() , path.get(0).getExactY() , radius);
        monster.setFill(Color.ORANGERED);
    }
}
