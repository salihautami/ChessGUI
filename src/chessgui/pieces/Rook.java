package chessgui.pieces;

import chessgui.Board;

public class Rook extends Piece {

    public Rook(int x, int y, boolean is_white, String file_path, Board board)
    {
        super(x,y,is_white,file_path, board); //reference
    }
    
    @Override
    public boolean canMove(int destination_x, int destination_y)
    {
        
        //return a piece if theres one at that place, return null if there isnt one
        Piece possiblePiece = board.getPiece(destination_x, destination_y);
        
        if (possiblePiece != null){
            if (possiblePiece.isWhite() && this.isWhite()){
                return false;
            }
            if (possiblePiece.isBlack() && this.isBlack()){
                return false;
            }
        }
        
        return true;
    }
}
