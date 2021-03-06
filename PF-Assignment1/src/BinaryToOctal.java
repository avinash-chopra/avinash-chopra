/**
 * This class convert binary number into octal number 
 * i make two functions to do this
 * first make binary to decimal and then decimal to binary
 */
/**
 * @author admin
 *
 */
public class BinaryToOctal {

	/**
	 * @param args
	 */	

	public int convertBinaryToOctal(int number){
		/*
		 * This function convert binary number into octal number 
		 * by using two functions convertBinaryToDecimal and
		 * convertDecimalToBinary 
		 */
		int octalNumber;
		int decimalNumber;
		
		decimalNumber = convertBinaryToDecimal(number);
		octalNumber = convertDecimalToOctal(decimalNumber);
		
		return octalNumber;
	}
	
	
	public int	convertBinaryToDecimal(int number){
		/*
		 * This Function convert binary to decimal by using very simple 
		 * divide and remainder 
		 */
		int decimalNumber;
		int position;
		decimalNumber = 0 ;
		position = 0 ;
		
		while(number > 0){
			int lastDigit;
			int powerResult;
			powerResult = power(2,position);
			lastDigit = number%10;
			decimalNumber = decimalNumber + ( lastDigit * powerResult );
			number = number / 10;
			position++;
		}
		return decimalNumber;
	}
	
	public int convertDecimalToOctal(int number){
		/*
		 * This Function convert decimal to binary by using very simple 
		 * divide and remainder 
		 */
		int octalNumber;
		int remender;
		int position;
		int remenderInTenMultiple;
		
		position =0;
		octalNumber = 0;
		remender = 0;
		
		while(number > 0){
			int tenPower;
			tenPower = power(10, position);
			remender = number % 8;
			remenderInTenMultiple = remender * tenPower;
			octalNumber = octalNumber + remenderInTenMultiple;
			number = number / 8;
			position++;
		}
		
		return octalNumber;
	}
	
	public int power(int base, int exponent){
		/*
		 * This function use to get power of a number
		 */
		int powerResult;
		powerResult = 1;
		
		while( exponent > 0 ){
			powerResult = powerResult * base;
			exponent-- ;
		}
		
		return powerResult;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryToOctal temp = new BinaryToOctal();
		System.out.println(temp.convertBinaryToOctal(110101));
		
		
		
		
		
		
	}

}
