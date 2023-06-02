package org.geepawhill.mugwump;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BoardTest {

    Board board = new Board();

    @Test
    void newBoardIsAllUnknowns() {
        for (int x = 0; x < Board.SQUARE_SIZE; x++) {
            for (int y = 0; y < Board.SQUARE_SIZE; y++) {
                assertEquals(CellContents.unknown, board.get(x, y));
            }
        }
    }

    @Test
    void illegalCoordinatesAreInvalid() {
        assertEquals(CellContents.invalid, board.get(-1, 0));
        assertEquals(CellContents.invalid, board.get(0, -1));
        assertEquals(CellContents.invalid, board.get(Board.SQUARE_SIZE, 0));
        assertEquals(CellContents.invalid, board.get(0, Board.SQUARE_SIZE));
    }

    @Test
    void legalPutWorks() {
        board.put(0, 0, CellContents.revealed);
        assertEquals(CellContents.revealed, board.get(0, 0));
    }
}
