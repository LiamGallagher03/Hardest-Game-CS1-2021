package hardestgame;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author liam
 */
public class Player {
    private int x, y;
    //constants
    private final static int width = 50, height = 50;
    private final static Color color = Color.RED;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //1. draw outline on shape
    public void draw(Graphics g) {        
        g.setColor(color);
        g.fillRect(x, y, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(x, y, width, height);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }    
    
}
