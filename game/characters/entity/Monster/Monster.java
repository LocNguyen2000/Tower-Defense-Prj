package game.characters.entity.Monster;

import game.characters.Coordinate;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import java.io.File;
import java.util.ArrayList;

public abstract class Monster {
    protected static ArrayList<Coordinate> path;
    protected Circle monster;
    protected final int radius = 10;
    protected int healthPoints;
    protected int movementSpeed;
    protected int reward;
    protected int nodeDirection;
    protected boolean moveX;
    protected boolean isDead;
    protected boolean pathFinished;
    private MediaPlayer deadSound = new MediaPlayer(new Media(new File("src/game/characters/res/sound/enemyDeath.wav").toURI().toString()));

    public Monster(){
        pathFinished = false;
        moveX = true;
        nodeDirection = 1;
    }

    public int getX(){
        return ((int)monster.getCenterX());
    }
    public int getY(){
        return ((int)monster.getCenterY());
    }
    public int getReward(){
        return reward;
    }
    public Shape getmonster(){
        return monster;
    }

    public MediaPlayer getDeadSound() {
        return deadSound;
    }

    public boolean isDead(){
        return isDead;
    }
    public int getMovementSpeed() {
        return movementSpeed;
    }

    public boolean isPathFinished(){
        return pathFinished;
    }

    public static void setPath(ArrayList<Coordinate> pathSet){
        path = pathSet;
    }

    public void takeDamage(int damage){
        healthPoints = healthPoints - damage;
        if (healthPoints <= 0){
            isDead = true;
            pathFinished = false;
        }
    }

    public void updateLocation(int distance){

        // Move along the x axis
        if(moveX){
            if (monster.getCenterX() < path.get(nodeDirection).getExactX()) {
                monster.setCenterX(monster.getCenterX() + distance);
            }
            else{
                monster.setCenterX(monster.getCenterX() - distance);
            }

            if(monster.getCenterX() == path.get(nodeDirection).getExactX()){
                moveX = false;
                nodeDirection++;

                if(nodeDirection == path.size()){
                    pathFinished = true;
                    isDead = true;
                }
            }
        }
        else{
            if(monster.getCenterY() < path.get(nodeDirection).getExactY()) {
                monster.setCenterY(monster.getCenterY() + distance);
            }
            else{
                monster.setCenterY(monster.getCenterY() - distance);
            }
            if(monster.getCenterY() == path.get(nodeDirection).getExactY() ){
                nodeDirection++;
                moveX = true;
                if(nodeDirection == path.size()){
                    pathFinished = true;
                    isDead = true;
                }
            }
        }

    }

}
