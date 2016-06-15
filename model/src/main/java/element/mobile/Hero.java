package element.mobile;

import element.Element;
import element.Sprite;

import java.awt.*;

/**
 * Created by Asus on 14/06/2016.
 */
public class Hero {
    private int x;
    private int y;
    public Hero(int x,int y){
    this.x = x;
        this.y = y;
    }



    public int getX() {

        return this.x;
    }

    public void setX(final int x) {
    this.x = x;
    }

    public int getY() {

        return this.y;
    }

    public void setY(final int y) {
        this.y = y;
    }


    public void moveUp() {
        this.setY(this.getY() - 1);
    }

    public void moveLEFT() {
        this.setX(this.getX() - 1);
    }

    public void moveDOWN() {
        this.setY(this.getY() + 1);
    }

    public void moveRIGHT() {
        this.setX(this.getX() + 1);
    }

}
