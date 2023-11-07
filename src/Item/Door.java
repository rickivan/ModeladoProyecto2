package Item;

import java.awt.Color;
import java.awt.Graphics2D;

import Game.GamePanel;

public class Door extends Objeto{
    GamePanel gp;
    int x;
    int y; 
    int width; 
    int height; 
    boolean solid;
    int id;
    public Door(GamePanel gp, int x, int y, int width, int height, boolean solid, int id){
        super(gp, x, y, width, height, solid, id);
    }

    @Override
    public void paint(Graphics2D g2) {
        g2.setColor(Color.BLUE);
        g2.fillRect(x, y, width, height);
    }
    
}
