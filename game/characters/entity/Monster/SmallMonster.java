package game.characters.entity.Monster;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class SmallMonster extends Monster {
    public SmallMonster(){
        super();
        healthPoints = 15;
        movementSpeed = 2;
        reward = 5;
        monster = new Circle(path.get(0).getExactX() , path.get(0).getExactY() , radius);
        monster.setRadius(9);
        monster.setFill(Color.ALICEBLUE);
    }
}
