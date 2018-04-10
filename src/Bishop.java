import javafx.scene.control.Label;
import javafx.scene.text.Font;

/**
 * Bishop.
 *
 * @author Sze, Victor
 * @version 1.0
 */
public class Bishop extends Label implements chessPieces {

    private String blackPiece = "\u265D";
    private String whitePiece = "\u2657";
    private Player player;
    public int col;
    public int row;
    
    public Bishop(ClickListener clickListener, Player player, int col, int row) {
        this.player = player;
        this.col = col;
        this.row = row;
        if(player.getColor() == 0) {
            setText(whitePiece);
        } else {
            setText(blackPiece);
        }
        setFont(new Font(40));
        setOnMouseClicked(clickListener);

    }

    @Override
    public boolean move(int destCol, int destRow) {
        if(destCol + destRow == col + row || destCol - destRow == col - row)
            return true;
        return false;
    }

    @Override
    public Player getPlayer() {
        return player;
    }

    @Override
    public boolean check() {
        return false;
    }

    @Override
    public int getCol() {
        return col;
    }

    @Override
    public void setCol(int col) {
        this.col = col;
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public void setRow(int row) {
        this.row = row;
    }

}
