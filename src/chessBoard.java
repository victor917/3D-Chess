import javafx.scene.*;
import javafx.scene.layout.*;

/**
 * 
 * chessBoard.
 *
 * @author Sze, Victor
 * @version 1.0
 */
public abstract class chessBoard extends GridPane {
 
    private Player[] players;
    private int squareColor;
    public int rowSelect = -1;
    public int colSelect = -1;
    private chessPieces pieceSelect;
    private int turn = 1;

    public chessBoard(Player[] players) {
        this.players = players;
        addSquares();
    }

    abstract void addSquares();

    public String determineColor() {
        if (squareColor == 0) {
            squareColor = 1;
            return "White";
        } else {
            squareColor = 0;
            return "Black";
        }
    }

    abstract void setRow(int rowSelect);

    abstract void setCol(int colSelect);

    abstract void setPiece(chessPieces pieceSelect);

    abstract void turns();

    abstract void movePiece(int col, int row);
    
}