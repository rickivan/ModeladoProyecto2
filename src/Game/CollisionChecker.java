package Game;

import Entity.Enemy;
import Entity.Entity;
import Entity.NPC;
import Entity.Player;
import Entity.Proyectiles;
import Item.Item;
import Item.StairsDown;
import Item.StairsUp;

public class CollisionChecker {
    GamePanel gp;

    public CollisionChecker(GamePanel gp){
        this.gp = gp;
    }
    /*
     * Revisa si el jugador ha chocado con alguna entidad
     */
    public boolean checkPlayer(Entity entity) {
        boolean contactPlayer = false;
        if(gp.player.getBox().intersects(entity.getBox())){
            entity.setCollision(true);
            contactPlayer = true;
        }
        return contactPlayer;    
    }
    /*
     *
     * Revisa si el proyectil ha chocado con alguna entidad 
     * */
    public void checkProyectil(Entity entidad){
      int removidos = 0;
      for(int i = 0; i < gp.player.getProyectiles().size(); i++){
        if(gp.player.getProyectiles().get(i).getBox().intersects(entidad.getBox())){
          int atackDirection = gp.player.getProyectiles().get(i).getVelocidad();
          gp.player.getProyectiles().remove(gp.player.getProyectiles().get(i)); 
          removidos++;
          if(entidad instanceof Enemy){
            gp.player.setAtackDirection(atackDirection);
            gp.player.attack((Enemy)entidad);
          }
        }
      }
    }
    /*
     * Revisa si algun aliado ha chocado con un enemigo
     * @param Entity entidad
     */
    public void checkAliados(Entity entidad){
        if(gp.telefono.getAliado() != null){
            if(gp.telefono.getBox().intersects(entidad.getBox())){
                if(entidad instanceof Enemy){
                    gp.player.specialAttack((Enemy) entidad, gp.telefono.getAliado());
                }
            }
        } 
    }
    /*
     * Regresa si un proyectil ha chocado con algun objeto y elimina ese proyectil
     * @param Proyectiles proyectil
     */
    public void checkProyectilItem(Proyectiles proyectil){
      for(Item i : gp.items){
        if(i.isSolid()){
          if(proyectil.getBox().intersects(i.getBox()))
            gp.player.getProyectiles().remove(proyectil);
        }
      }
    }

    /*
     * Revisa si algun npc choco con el jugador
     * @return npc n
     */
    public void checkNPC(NPC n) {
            if(n!=null){
                if(n.getBox().intersects(gp.player.getBox())){
                    gp.player.setCollision(true);
                    n.interact();
                }
            }
        }
    /*
     * Revisa si un enemigo ha chocado con el jugador y ataca al jugador en caso positivo
     * @param Enemy e
     */
    public void checkEnemy(Enemy e){
            if(e!=null){
                if(e.getBox().intersects(gp.player.getBox())){
                    gp.player.setCollision(true);
                    e.attack();
                }
            }
        }
    /*
     * Revisa si alguna entidad ha chocado con una pared o piso
     */
    public void checkItem(Entity entity) {
        for(Item i: gp.items){
            if(i.isSolid()){
                if(entity.getBoxUp().intersects(i.getBox())){
                    entity.setSpeedY(0);
                    entity.setY(entity.getY()+gp.getScale());
                }
                if(entity.getBoxDown().intersects(i.getBox())){
                    entity.setSpeedY(0);
                    entity.setOnFloor(true);
                }
                if(entity.getBoxLeft().intersects(i.getBox())){
                    entity.setCollision(true);
                    entity.setY(entity.getY()-gp.getScale());
                    entity.setX(entity.getX()+gp.getScale());
                    //entity.setDirection("right");
                }
                if(entity.getBoxRight().intersects(i.getBox())){
                    entity.setY(entity.getY()-gp.getScale());
                    entity.setX(entity.getX()-gp.getScale());
                    entity.setCollision(true);
                    //entity.setDirection("left");
                }
            }
        }
    }
    /*
     * Revisa si las entidades se encuentran en el suelo
     */
    public boolean checkOnFloor(Entity entity){
        for(Item i: gp.items){
                if(entity.getBoxDown().intersects(i.getBox())){
                return true;
            }
        }
        return false;
    }
    /* Revisa si el jugador esta al alcance de una escalera */
    public void checkStairs(Player player){
        for(Item i: gp.items){
            if(i instanceof StairsUp){
                if(player.getBox().intersects(i.getBox())){
                    i.setInRange(true);
                    if(gp.kb.pressW()){
                        player.setY(player.getY()-gp.scale*80);
                        i.setInRange(false);
                    }
                }
            }
            else if(i instanceof StairsDown){
                if(player.getBox().intersects(i.getBox())){
                    i.setInRange(true);
                    if(gp.kb.pressS()){
                        player.setY(player.getY()+gp.scale*20);
                        i.setInRange(false);
                    }
                }
            }
            else{
                i.setInRange(false);
            }
        }
    }
}
