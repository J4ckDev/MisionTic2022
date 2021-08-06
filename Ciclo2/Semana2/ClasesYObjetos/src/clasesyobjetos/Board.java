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
public class Board {

    private final PacMan player;
    private int level;

    public Board(PacMan player) {
        this.player = player;
        level = 0;
    }

    public int checkCurrentLevel() {
        int score = player.getScore();
        level = (int) Math.floor(score / 25);
        return level;
    }
}
