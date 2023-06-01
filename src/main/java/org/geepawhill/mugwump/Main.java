package org.geepawhill.mugwump;

public class Main {
    public static void main(String... args) {
        MugWump mugWump = new MugWump();
        ConsoleMugWump io = new ConsoleMugWump(mugWump);
        io.play();
    }
}
