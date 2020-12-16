package logic;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TicTacToe_Test {

	public static TicTacToe ticTacToe;

	/*
	 * 
	 * Game setup and test of arrays
	 * 
	 */

	@BeforeAll
	public static void setUpBeforeClass() {

		ticTacToe = new TicTacToe();

		assertEquals(3, ticTacToe.board.length);
		assertEquals(3, ticTacToe.board[0].length);
		assertEquals(3, ticTacToe.board[1].length);
		assertEquals(3, ticTacToe.board[2].length);

		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			ticTacToe.getArrayLength(ticTacToe.board[3]);
		});

	}

	@DisplayName("Testing player marking")
	@Test
	public void testGetCurrentPlayerMark() {
		assertEquals('x', ticTacToe.getCurrentPlayerMark());
		assertFalse(ticTacToe.getCurrentPlayerMark() == 'a');

	}

	@DisplayName("Testing mark placement")
	@Test
	public void testGetPlacedMark() {

		assertFalse(ticTacToe.placeMark(7, 10));
		assertTrue(ticTacToe.placeMark(2, 2));
	}

	/*
	 * Testing player marking
	 * 
	 */
	@AfterAll
	public static void tearDownAfterClass() {

		assertTrue(!ticTacToe.isBoardFull());
		assertNotEquals(true, ticTacToe.isBoardFull());

	}

}
