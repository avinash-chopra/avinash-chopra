package tic_tac_toe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/**
 * 
 * @author Avinash 
 * Date 24-july-2016 
 * This class use to get and hold user input character
 *
 */
public class UserCharacter { 
	char USER_CHARACTER; 
	char COMPUTER_CHARACTER;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	/**
	 * 
	 * @return // return the 0 or x take 0 or x as a input and return it
	 */
	 void getZeroOrCross() {
		String inputString = "";
		System.out.println("Choose either 0 or x ");
		char inputChar;
		try {
			// take the input character 
			inputString = br.readLine();
			// assign characters according to input 
			if (inputString.equals("0") || inputString.equals("x")
					|| inputString.equals("X")) {
				inputChar = inputString.charAt(0);
				if(inputChar == 'X' || inputChar == 'x'){
					USER_CHARACTER = 'X';
					COMPUTER_CHARACTER = '0' ;
				}
				else{
					USER_CHARACTER = '0';
					COMPUTER_CHARACTER = 'X' ;
				}
				
			}else{
				System.out.println("Please Enter the correct input");
				getZeroOrCross();
			}
		} catch (Exception e) {
			System.out.println("Please Enter the correct input");
			getZeroOrCross();
		}
	}	
}

