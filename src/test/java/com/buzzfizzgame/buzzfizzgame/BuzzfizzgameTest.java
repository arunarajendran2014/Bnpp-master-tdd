package com.buzzfizzgame.buzzfizzgame;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class BuzzfizzgameTest {
	
	@Test
	public void returnAsSameNumberNotMultipleOf3And5() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();		
		String expected = "2";
		assertEquals(expected, gfService.getGameResult(2));			
	}
	
	@Test
	public void returnFizzWithMultiplesOf3() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();		
		String expected = "Fizz";
		assertEquals(expected, gfService.getGameResult(9));			
	}
	
	@Test
	public void returnBuzzWithMultiplesOf5() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();		
		String expected = "Buzz";
		assertEquals(expected, gfService.getGameResult(10));			
	}
	
	@Test
	public void returnFizzBuzzWithmultiplesOf3And5() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();		
		String expected = "Fizz Buzz";
		assertEquals(expected, gfService.getGameResult(45));			
	}
	
	@Test
	public void returnWithSameBigIntAsInput() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();		
		String expected = "5765878";
		assertEquals(expected, gfService.getGameResult(5765878));			
	}	

}
