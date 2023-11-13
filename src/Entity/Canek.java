package Entity;

import Game.GamePanel;

public class Canek extends NPC{
  public Canek(GamePanel gp, int x, int y, int width, int height){
    super(gp, x, y, width, height);
  }
  public void getEntityImage(){
    // Ingresar la ruta del personaje de canek
    imagen = gp.getRutas().getImagen("canek.png");
  }
  public void interact(){
    gp.player.startTalking("¿Ya acabaste con las chinches? ¿No? Estoy muy decepcionado de ti");
  }

}
