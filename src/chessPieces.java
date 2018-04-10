/**
 * 
 * Pieces.
 *
 * @author Sze, Victor
 * @version 1.0
 */
public interface chessPieces  {
    
    boolean move(int destCol, int destRow);
    
    Player getPlayer();

    boolean check();
        
    int getCol();

    void setCol(int col);

    int getRow();

    void setRow(int row);

}
