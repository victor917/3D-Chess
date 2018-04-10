import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
/**
 * game.
 *
 * @author Sze, Victor
 * @version 1.0
 */
public class Game extends Application {
    
    private chessBoard3D chessBoard3D; 
    
    Player[] player = {new Player(1, 0), new Player(2, 1)};    
    
    @Override
    public void start(Stage primaryStage) {
        chessBoard3D = new chessBoard3D(player);

        setWhiteBoard();
        setBlackBoard();

        primaryStage.setTitle("Chess");
        primaryStage.setScene(new Scene(chessBoard3D, 1320, 440));
        primaryStage.show(); 
    }
    
    public void setWhiteBoard() {
        for (int i = 0; i < 8; i++) {
        chessBoard3D.add(new Pawn(new ClickListener(chessBoard3D),player[0], i , 6), i , 6);
        }
        chessBoard3D.add(new Rook(new ClickListener(chessBoard3D),player[0], 0, 7), 0, 7);
        chessBoard3D.add(new Rook(new ClickListener(chessBoard3D),player[0], 7, 7), 7, 7);
        chessBoard3D.add(new Knight(new ClickListener(chessBoard3D),player[0], 1, 7), 1, 7);
        chessBoard3D.add(new Knight(new ClickListener(chessBoard3D),player[0], 6, 7), 6, 7);
        chessBoard3D.add(new Bishop(new ClickListener(chessBoard3D),player[0], 2, 7), 2, 7);
        chessBoard3D.add(new Bishop(new ClickListener(chessBoard3D),player[0], 5, 7), 5, 7);
        chessBoard3D.add(new Queen(new ClickListener(chessBoard3D),player[0], 3, 7), 3, 7);
        chessBoard3D.add(new King(new ClickListener(chessBoard3D),player[0], 4, 7), 4, 7);

        
//        chessBoard3D.add(new Knight(new ClickListener(chessBoard3D),player[0], 2, 4), 2, 4);

    }

    public void setBlackBoard() {
        for (int i = 0; i < 8; i++) {
        chessBoard3D.add(new Pawn(new ClickListener(chessBoard3D),player[1],i , 1), i , 1);
        }
        chessBoard3D.add(new Rook(new ClickListener(chessBoard3D),player[1], 0, 0), 0, 0);
        chessBoard3D.add(new Rook(new ClickListener(chessBoard3D),player[1], 7 , 0), 7, 0);
        chessBoard3D.add(new Knight(new ClickListener(chessBoard3D),player[1], 1, 0), 1, 0);
        chessBoard3D.add(new Knight(new ClickListener(chessBoard3D),player[1], 6, 0), 6, 0);
        chessBoard3D.add(new Bishop(new ClickListener(chessBoard3D),player[1], 2, 0), 2, 0);
        chessBoard3D.add(new Bishop(new ClickListener(chessBoard3D),player[1], 5, 0), 5, 0);
        chessBoard3D.add(new Queen(new ClickListener(chessBoard3D),player[1], 3, 0), 3, 0);
        chessBoard3D.add(new King(new ClickListener(chessBoard3D),player[1], 4, 0), 4, 0);
        
        
//        chessBoard3D.add(new Knight(new ClickListener(chessBoard3D),player[1], 5, 5), 5, 5);

    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

 

}
