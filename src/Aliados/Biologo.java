package Aliados;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import Entity.Enemy;
import Entity.Player;
import Game.GamePanel;

public class Biologo implements Aliado{
  GamePanel gp;
  BufferedImage imagen;
  boolean onScreen;
  int counter = 120;
  Rectangle box;
  private Player player; 
  public Biologo(GamePanel gp, Player player){
    this.gp = gp;
    this.player = player;
    box = new Rectangle(player.getX()-200, player.getY()-200, 400, 400);
    onScreen = false;
    set();
  }
  public void set(){
    imagen = gp.getRutas().getImagen("biologo.png");
  }

  public void update(){
    if(onScreen){
      for(Enemy e: gp.enemies){
        if(e.getBox().intersects(getBox())){
            attack(e);
          }
        }
      }
    }
  
  public void attack(Enemy e){
    e.setLife(e.getLife()-150);
  }
  public void paint(Graphics g){
    if(onScreen){
      g.drawImage(imagen, player.getX()-200, player.getY()-200,null);
    }
  }
  public boolean onScreen() {
    return onScreen;
  }
  public void setOnScreen(boolean onScreen) {
    this.onScreen = onScreen;
  }
  public Rectangle getBox(){
    return new Rectangle(player.getX()-200, player.getY()-200, 400, 400);
  }
}
