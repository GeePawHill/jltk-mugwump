package org.geepawhill.mugwump;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class LocationTest {
    @Test
    void equalityTests() {
        assertEquals(new Location(1, 1), new Location(1, 1));
        assertNotEquals(new Location(1, 1), new Location(1, 2));
    }

    @Test
    void distance() {
        Location origin = new Location(0, 0);
        Location rightAngle = new Location(3, 4);
        assertEquals(origin.distanceTo(rightAngle), 5.0, 0.1);
    }

}
