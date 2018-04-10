/**
 * 
 * Player.
 *
 * @author Sze, Victor
 * @version 1.0
 */
public class Player {
    private int playerNumber;
    private int color;
    
    public Player(int playerNumber, int color) {
        this.playerNumber = playerNumber;
        this.color = color;
    }
    
    public int getColor() {
        return color;
    }
    
    public int getPlayerNumber() {
        return playerNumber;
    }
    
}
