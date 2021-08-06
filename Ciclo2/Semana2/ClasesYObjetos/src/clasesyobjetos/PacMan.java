/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesyobjetos;

/**
 *
 * @author j4ckdev
 */
public class PacMan {

    private String color;
    private int score;
    private byte lifes;

    public PacMan() {
        color = "Amarillo";
        score = 0;
        lifes = 3;
    }

    public PacMan(String color, int score, byte lifes) {
        this.color = color;
        this.score = score;
        this.lifes = lifes;
    }

    public void sumScore() {
        score++;
    }
    
    public int getScore(){
        return score;
    }
    
    public void subtractLife(){
        lifes--;
    }
    
    public boolean isAlive(){
        return lifes > 0;
    }
}
