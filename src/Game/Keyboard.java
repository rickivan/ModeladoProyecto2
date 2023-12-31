package Game;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class Keyboard implements KeyListener{
    //GamePanel gp;
    //State state;
    boolean up = false, down = false, right = false, left = false, 
    w = false, a = false, s = false, d = false, q = false,
    k1 = false, k2 = false, k3 = false, k4 = false, k5 = false, esc = false, enter = false;

    public Keyboard(){
        //this.gp = gp;
        //state = gp.getEstado();
    }
    /*
     * Revisa si el jugador ha presionado una tecla
     */
    @Override
    public void keyTyped(KeyEvent e) {

    }
    /*
     * Revisa si el jugador esta presionando una tecla actualmente
     */
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
            up = true;
        }
        if(key == KeyEvent.VK_DOWN){
            down = true;
        }
        if(key == KeyEvent.VK_LEFT){
            left = true;
        }
        if(key == KeyEvent.VK_RIGHT){
            right = true;
        }
        if(key == KeyEvent.VK_W){
            w = true;
        }
        if(key== KeyEvent.VK_A){
            a = true;
        }
        if(key == KeyEvent.VK_S){
            s = true;
        }
        if(key == KeyEvent.VK_D){
            d = true;
        }
        if(key == KeyEvent.VK_1){
            k1 = true;
        }
        if(key== KeyEvent.VK_2){
            k2 = true;
        }
        if(key == KeyEvent.VK_3){
            k3 = true;
        }
        if(key == KeyEvent.VK_4){
            k4 = true;
        }
        if(key == KeyEvent.VK_5){
            k5 = true;
        }
        if(key == KeyEvent.VK_Q){
          q = true;
        }
        if(key == KeyEvent.VK_ESCAPE){
          esc = true;
        }
        if(key == KeyEvent.VK_ENTER){
          enter = true;
        }
    }
    /*
     * Revisa si el jugador ha soltado la tecla que estaba presionando
     */
    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if(key == KeyEvent.VK_UP){
            up = false;
        }
        if(key == KeyEvent.VK_DOWN){
            down = false;
        }
        if(key == KeyEvent.VK_LEFT){
            left = false;
        }
        if(key == KeyEvent.VK_RIGHT){
            right = false;
        }
        if(key == KeyEvent.VK_W){
            w = false;
        }
        if(key== KeyEvent.VK_A){
            a = false;
        }
        if(key == KeyEvent.VK_S){
            s = false;
        }
        if(key == KeyEvent.VK_D){
            d = false;
        }
        if(key == KeyEvent.VK_1){
            k1 = false;
        }
        if(key== KeyEvent.VK_2){
            k2 = false;
        }
        if(key == KeyEvent.VK_3){
            k3 = false;
        }
        if(key == KeyEvent.VK_4){
            k4 = false;
        }
        if(key == KeyEvent.VK_5){
            k5 = false;
        }
        if(key == KeyEvent.VK_Q){
          q = false;  
        }
        if(key == KeyEvent.VK_ESCAPE){
          esc = false;
        }
        if(key == KeyEvent.VK_ENTER){
            enter = false;
        }
    }
    /*
     * Regresa si se esta presionando el boton de arriba
     * @return Boolean up
     */
    public Boolean pressUp(){
        return up;
    }
    /*
     * Regresa si se esta presionando el boton de abajo
     * @return Boolean down
     */
    public Boolean pressDown(){
        return down;
    }
    /*
     * Regresa si se esta presionando el boton de derecho
     * @return Boolean right
     */
    public Boolean pressRight(){
        return right;
    }
    /*
     * Regresa si se esta presionando el boton de izquierda
     * @return Boolean left
     */
    public Boolean pressLeft(){
        return left;
    }
    /*
     * Regresa si se esta presionando la W
     * @return Boolean w
     */
    public Boolean pressW(){
        return w;
    }
    /*
     * Regresa si se esta presionando la A
     * @return Boolean a
     */
    public Boolean pressA(){
        return a;
    }
    /*
     * Regresa si se esta presionando la S
     * @return Boolean s
     */
    public Boolean pressS(){
        return s;
    }
    /*
     * Regresa si se esta presionando la d
     * @return Boolean d
     */
    public Boolean pressD(){
        return d;
    }
    /*
     * Regresa si se esta presionando el 1
     * @return Boolean k1
     */
    public Boolean press1(){
        return k1;
    }
    /*
     * Regresa si se esta presionando el 2
     * @return Boolean k2
     */
    public Boolean press2(){
        return k2;
    }
    /*
     * Regresa si se esta presionando el 3
     * @return Boolean k3
     */
    public Boolean press3(){
        return k3;
    }
    /*
     * Regresa si se esta presionando el 4
     * @return Boolean k4
     */
    public Boolean press4(){
        return k4;
    }
    /*
     * Regresa si se esta presionando el 5
     * @return Boolean k5
     */
    public Boolean press5(){
        return k5;
    }
    /*
     * Regresa si se esta presionando la tecla q
     * @return Boolean q
     */
    public Boolean pressQ(){
        return q;
    }
    /* 
     * Regresa si se esta presionando el Escape
     * @return Boolean esc
     */
    public Boolean pressEsc(){
        return esc;
    }
    /*
     * Regresa si se esta presionando el Enter
     * @return Boolean enter
     */
    public Boolean pressEnter(){
        return enter;
    }
    
}
