package org.geepawhill.mugwump;

public class Board {

    public static final int SQUARE_SIZE = 10;

    private CellContents[][] cells = new CellContents[SQUARE_SIZE][SQUARE_SIZE];

    Board() {
        clear();
    }

    public void clear() {
        for (int x = 0; x < SQUARE_SIZE; x++) {
            for (int y = 0; y < SQUARE_SIZE; y++) {
                cells[x][y] = CellContents.unknown;
            }
        }
    }

    public CellContents get(int x, int y) {
        if (invalidLocation(x, y)) return CellContents.invalid;
        return cells[x][y];
    }


    public CellContents get(Location location) {
        return get(location.x, location.y);
    }

    public void put(Location location, CellContents contents) {
        put(location.x, location.y, contents);
    }

    public void put(int x, int y, CellContents contents) {
        if (!invalidLocation(x, y)) cells[x][y] = contents;
    }

    private static boolean invalidLocation(int x, int y) {
        return x < 0 || x >= SQUARE_SIZE || y < 0 || y >= SQUARE_SIZE;
    }
}
