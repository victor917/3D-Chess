import javafx.scene.Node;

public class chessBoard2D extends chessBoard {

    private Player[] players;
    private int squareColor;
    public int rowSelect = -1;
    public int colSelect = -1;
    private chessPieces pieceSelect;
    private int turn = 1;

    public chessBoard2D(Player[] players) {
        super(players);
        addSquares();
    }

    public final void addSquares() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                add(new Squares(new ClickListener(this), determineColor(), col, row), col, row);
            }
            determineColor();

        }
    }

    public final String determineColor() {
        if (squareColor == 0) {
            squareColor = 1;
            return "White";
        } else {
            squareColor = 0;
            return "Black";
        }
    }

    public void setRow(int rowSelect) {
        this.rowSelect = rowSelect;
    }

    public void setCol(int colSelect) {
        this.colSelect = colSelect;
    }

    public void setPiece(chessPieces pieceSelect) {
        this.pieceSelect = pieceSelect;
    }

    public void turns() {
        if (turn < 2) {
            turn++;
        } else {
            turn = 1;
        }
    }

    public void movePiece(int col, int row) {
        if ((pieceSelect != null) && pieceSelect.move(col, row)
                && rowSelect >= 0 && colSelect >= 0
                && pieceSelect.getPlayer().getPlayerNumber() == turn) {
            getChildren().remove(pieceSelect);
            add((Node) pieceSelect, col, row);
//          int curColumn =  chessBoard.getColumnIndex((Node) pieceSelect);
//          int curRow = chessBoard\.getRowIndex((Node) pieceSelect);
           
           pieceSelect.setCol(col);
           pieceSelect.setRow(row);
           
           turns();

//           System.out.println(pieceSelect.getCol());
//           System.out.println(pieceSelect.getRow());
            pieceSelect = null;
            rowSelect = -1;
            colSelect = -1;
        }
    }
}

