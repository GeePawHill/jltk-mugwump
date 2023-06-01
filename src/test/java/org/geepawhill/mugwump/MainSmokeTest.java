package org.geepawhill.mugwump;

import org.geepawhill.jltk.script.*;
import org.junit.jupiter.api.*;

public class MainSmokeTest {
    @Test
    void onePlayThrough() {
        new ConsoleTester()
                .computerChattersUntil("Let's Go!", 10)
                .run(Main::main);

    }
}
