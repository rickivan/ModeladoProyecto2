package Aliados;


import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import Entity.Enemy;
import Entity.Player;
import Game.GamePanel;

public class Actuario implements Aliado{
  GamePanel gp;
  BufferedImage imagen;
  boolean onScreen;
  private Player player; 
  public Actuario(GamePanel gp, Player player){
    this.gp = gp;
    this.player = player;
    onScreen = false;
    set();
  }
  public void set(){
    imagen = gp.getRutas().getImagen("actuario.png");
  }
  public void update(){

  }
  
  public void attack(Enemy e){
    e.setLife(e.getLife()-150);
  }
  public void paint(Graphics g){
    if(onScreen){
      g.drawImage(imagen, player.getX()-300, player.getY()-100,200, 200, null);
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
  public int getAtaque(){
    return 100;
  }
}
