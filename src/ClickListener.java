import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;

/**
 * 
 * ClickListener.
 *
 * @author Sze, Victor
 * @version 1.0
 */
public class ClickListener implements EventHandler<MouseEvent> {
    
    private Squares squares;
    
    private chessBoard chessBoard;
    
    public ClickListener(chessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    @Override
    public void handle(MouseEvent event) {
        if (event.getSource().getClass().equals(Squares.class)) {
            squares = (Squares) event.getSource();
            chessBoard.movePiece(squares.getCol(), squares.getRow());
        } else {
            chessBoard.setCol(GridPane.getColumnIndex((Node) event.getSource()));
            chessBoard.setRow(GridPane.getRowIndex((Node) event.getSource()));
            chessBoard.setPiece((chessPieces) event.getSource());
        }        
    }

    
}
