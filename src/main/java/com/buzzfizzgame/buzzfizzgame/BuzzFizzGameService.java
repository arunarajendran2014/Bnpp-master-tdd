package com.buzzfizzgame.buzzfizzgame;

public class BuzzFizzGameService {

	public String getGameResult(int input) {
		
		String returnMultiplesOf3 = "Fizz";
		String returnMultipleOf5 = "Buzz";
		
		if ((input % 3 == 0) && (input % 5 == 0)) return returnMultiplesOf3+ " " +returnMultipleOf5;
		
		else if (input % 3 == 0) return returnMultiplesOf3;
					
		else if (input % 5 == 0) return returnMultipleOf5;
				
						
		return Integer.toString(input);
	}
	
	

}
