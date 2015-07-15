package com.laboon;

import static org.junit.Assert.*;

import org.junit.Test;



public class WorldTest {
	
	    @Test
		public void testWorld1() {
			World w = new World(10, 4, 10);
			String observed = w.toString();
		    String expected = 
			"  0123456789\n" + "0 ..X..X....\n" + "1 .X........\n" + "2 ...X.X....\n" 
			  + "3 ..........\n" + "4 ...X..X...\n" + "5 .......X..\n" + "6 ...XX..X.X\n"
			  + "7 .....X....\n" + "8 ..........\n" + "9 X.........\n";
			assertEquals(expected, observed);
			}
	
	    
	    
	    
	   @Test
	   public void testWorld2() {
			World w = new World(50, 4, 10);
			String observed = w.toString();
		    String expected =
	    	"  01234567890123456789012345678901234567890123456789\n"
	    	+ "0 ..X..X.....X...........X.X.................X..X...\n"
	    	+ "1 .......X.....XX..X.X.....X..............X.........\n"
	    	+ "2 .................X......X..XX...X...............X.\n"
	    	+ "3 .........X................................X....X..\n"
	    	+ "4 ........X................................XX.......\n"
	    	+ "5 ......XX.......X...........X......................\n"
	    	+ "6 .X.............................................XX.\n"
	    	+ "7 ........XX........................X......X........\n"
	    	+ "8 ................X.......X.....................X...\n"
	    	+ "9 .......X..X....X........X...X.X.....X............X\n"
	    	+ "0 .......X....X....XX.X...........X.............XX..\n"
	    	+ "1 ...........XX..........................X....XX..X.\n"
	    	+ "2 ........X............XX..XX.............X.X.......\n"
	    	+ "3 .....XX...........X...X.XX....X...................\n"
	    	+ "4 .............X.X..X..........X.X...X...X..........\n"
	    	+ "5 ..............................X....XX...X.........\n"
	    	+ "6 .........X....X..X................X..X............\n"
	    	+ "7 ........................X.XX......................\n"
	    	+ "8 .............................................XX...\n"
	    	+ "9 X................................X....X...X.......\n"
	    	+ "0 ...................X...XX.............X...........\n"
	    	+ "1 ..........X........X.X.........X..................\n"
	    	+ "2 ......XX.........................X................\n"
	    	+ "3 ..X...X.......................XX.................X\n"
	    	+ "4 ..........XX...............XX.....................\n"
	    	+ "5 .......X......X.X..X...................X..........\n"
	    	+ "6 ...X....X...X............................X........\n"
	    	+ "7 .................X................................\n"
	    	+ "8 .....................X..............X.....X.......\n"
	    	+ "9 ....X......X..X.........................X.........\n"
	    	+ "0 ..........X....X.........X..XX.....X..............\n"
	    	+ "1 ..............X..........XX.X......X.X....X.......\n"
	    	+ "2 ........X....X....X..............X.....XX.......X.\n"
	    	+ "3 .X.X.......X.X.X.X............X...................\n"
	    	+ "4 ....X..X.X........................................\n"
	    	+ "5 X.........X.X...............X...................X.\n"
	    	+ "6 ......................X...X.............XX........\n"
	    	+ "7 ..............X.........X...XXX...........XXX.....\n"
	    	+ "8 .........X.......X....X.......X...........X.......\n"
	    	+ "9 .....X..X.X.............X....X..............X.....\n"
	    	+ "0 ..........X..................X....................\n"
	    	+ "1 .XX..........X............................X.......\n"
	    	+ "2 X.X.........X..X....X..............X.XX........X..\n"
	    	+ "3 X....X....X............X.....................X....\n"
	    	+ "4 ...X.......X.......X.X...........X.........X..X.X.\n"
	    	+ "5 X...........X...XX.XX.....X.......X...X..X...X....\n"
	    	+ "6 ..............X.........................X........X\n"
	    	+ "7 ...X..........................X.X......X...X......\n"
	    	+ "8 X.....X..........X..........X.XXX.................\n"
	    	+ "9 .....X...X..........X..X........X..............X..\n";
		    assertEquals(expected, observed);
		}


	   
}
