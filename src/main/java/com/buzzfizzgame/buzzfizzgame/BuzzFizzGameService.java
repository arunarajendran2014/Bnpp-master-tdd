package com.buzzfizzgame.buzzfizzgame;

public class BuzzFizzGameService {

	public String getGameResult(int actual) {
		
		String multipleOf3 = "Fizz";
		String multipleOf5 = "Buzz";
		
		if ((actual % 3 == 0) && (actual % 5 == 0))
		{
		return multipleOf3+ " " +multipleOf5;
		} 
		else {
				if (actual % 3 == 0) 
				{
					return multipleOf3;
				}
			}		
				if (actual % 5 == 0)
				{
					return multipleOf5;
				}
				
						
		return Integer.toString(actual);
	}
	
	

}
