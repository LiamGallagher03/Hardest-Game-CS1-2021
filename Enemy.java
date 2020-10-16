package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author liam
 */
public class Enemy {
    private int x, y, vx, vy;
    private final static int speed = 2;
    private final static int width = 25, height = 25;
    private final static Color color = Color.WHITE;
    //4.a constructor
    public Enemy(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
    }
    //4.b draws a circle (oval)
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawOval(x, y, width, height);
    }
    //4.c getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getVx() {
        return vx;
    }

    public int getVy() {
        return vy;
    }

    public static int getSpeed() {
        return speed;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }

    public static Color getColor() {
        return color;
    }
    
}