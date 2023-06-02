package org.geepawhill.mugwump;

public class MugWump {

    private Board board = new Board();
    private int turnsRemaining = 10;

    void reset(Location... mugwumpLocations) {
        turnsRemaining = 10;
    }
    
}
