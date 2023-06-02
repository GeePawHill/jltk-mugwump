package org.geepawhill.mugwump;

import java.util.*;

import static java.lang.Math.*;

public class Location {
    final int x;
    final int y;

    Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    double distanceTo(Location other) {
        double xdist = this.x - other.x;
        double ydist = this.y - other.y;
        return sqrt(xdist * xdist + ydist * ydist);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return x == location.x && y == location.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

}
