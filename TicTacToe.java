package tic_tac_toe;

import java.io.IOException;

public class TicTacToe {

	public static void main(String[] args) throws NumberFormatException, IOException {

		UserCharacter userCharacter = new UserCharacter();
		Board board = new Board();
		WinLoss winLoss = new WinLoss();
		Move move = new Move();
		userCharacter.getZeroOrCross();
		char winingCharacter=0;
		while(winLoss.gameOn){
			move.nextMove(board, userCharacter);
			winingCharacter= winLoss.whoWinWhoLoss(board);
			if(winingCharacter != 'n'){
				if(winingCharacter == userCharacter.USER_CHARACTER){
					System.out.println("You win");
				}
				else{
					System.out.println("Sorry you loss,Computer win");
				}
			}
		}
		if(winingCharacter == 'n'){
			System.out.println("Match is Draw");
		}
			
	}

}
