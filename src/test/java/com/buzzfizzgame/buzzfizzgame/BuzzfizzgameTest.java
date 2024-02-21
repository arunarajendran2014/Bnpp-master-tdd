package com.buzzfizzgame.buzzfizzgame;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class BuzzfizzgameTest {
	
	@Test
	public void normalNumberBfGame() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();
		//int actual = 1;
		String expected = "2";
		assertEquals(expected, gfService.getGameResult(2));			
	}
	
	@Test
	public void multiplesOf3BfGame() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();
		//int actual = 1;
		String expected = "Fizz";
		assertEquals(expected, gfService.getGameResult(9));			
	}
	
	@Test
	public void multiplesOf5BfGame() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();
		//int actual = 1;
		String expected = "Buzz";
		assertEquals(expected, gfService.getGameResult(10));			
	}
	
	@Test
	public void multiplesOf3And5BfGame() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();
		//int actual = 1;
		String expected = "Fizz Buzz";
		assertEquals(expected, gfService.getGameResult(45));			
	}
	
	@Test
	public void bigIntInputBfGame() {
		BuzzFizzGameService gfService = new BuzzFizzGameService();
		//int actual = 1;
		String expected = "5765878";
		assertEquals(expected, gfService.getGameResult(5765878));			
	}
	
	
	
	

}
