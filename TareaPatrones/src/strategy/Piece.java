package strategy;
import java.util.BitSet;

public abstract class Piece {

	private Position start;
	private Position end;
	private Board board;
	private Position oldEnPassantTarget;
	private BitSet oldCanCastleShort;
	private BitSet oldCanCastleLong;
	private boolean called;
	private int oldHalfMoveClock;

	public void perform() {
		//do Something
	}

	public String toString() {
		//do Something
	}

	public void undo() {
		//do Something
	}

	public boolean partial() {
		//do Something
	}

}


