import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * 
 * Squares.
 *
 * @author Sze, Victor
 * @version 1.0
 */
public class Squares extends Rectangle {

    private boolean chessPieceExists = false;
    private chessPieces chessPiece;
    private int col;
    private int row;

    public Squares(ClickListener click, String color, int col, int row) {
        super(55, 55);
        this.col = col;
        this.row = row;
        if (color.equalsIgnoreCase("White")) {
            setFill(Color.WHITE);
        } else {
            setFill(Color.HOTPINK);
            if(col >= 8 && col <= 15)
                setFill(Color.PINK);
        }
        setOnMouseClicked(click);
    }

    public void setChessPieceExists() {
        chessPieceExists = !chessPieceExists;
    }

    public boolean getChessPieceExists() {
        return chessPieceExists;
    }

    public void addChessPiece(chessPieces chessPiece) {
        this.chessPiece = chessPiece;
    }

    public void removeChessPiece() {
        chessPiece = null;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

}

