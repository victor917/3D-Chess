import javafx.scene.control.Label;
import javafx.scene.text.Font;

/**
 * Pawn.
 *
 * @author Sze, Victor
 * @version 1.0
 */
public class Pawn extends Label implements chessPieces {
    
    private String blackPiece = "\u265F";
    private String whitePiece = "\u2659";
    private Player player;
    public int col;
    public int row;
    
    public Pawn(ClickListener clickListener, Player player, int col, int row) {
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
        if(player.getColor() == 0) {
            if(((row == 6 && destRow == row - 2) && destCol == col) 
                || ((row == 6 && destRow == row - 2) && destCol == (col + 8)) 
                || ((row == 6 && destRow == row - 2) && destCol == (col + 16))
                || ((row == 6 && destRow == row - 2) && destCol == (col - 8)))
                return true;
           if((destCol == col && destRow == row - 1) 
               || (destCol == (col + 8) && destRow == row - 1)
               || (destCol == (col + 16) && destRow == row - 1)
               || (destCol == (col - 8) && destRow == row - 1))
               return true;
        } else {
            if(((row == 1 && destRow == row + 2) && destCol == col) 
                || ((row == 1 && destRow == row + 2) && destCol == (col + 8))
                || ((row == 1 && destRow == row + 2) && destCol == (col + 16))
                || ((row == 1 && destRow == row + 2) && destCol == (col - 8)))
                return true;
            if((destCol == col && destRow == row + 1) 
                || (destCol == (col + 8) && destRow == row + 1) 
                || (destCol == (col + 16) && destRow == row + 1)
                || (destCol == (col - 8) && destRow == row + 1))
                return true;
            }
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
