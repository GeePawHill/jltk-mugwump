package org.geepawhill.mugwump;

public class ConsoleMugWump {
    public ConsoleMugWump(MugWump mugWump) {
    }

    public void play() {
        welcome();
    }

    public void welcome() {
        System.out.println(
                "Welcome to MugWump!\n" +
                        "The object of this game is to find 4 MugWumps hiding\n" +
                        "in a 10 x 10 grid in less than 10 turns. Each turn, enter \n" +
                        "a row and a column to look. If you find one, we'll tell you, and \n" +
                        "either way, we'll tell you the distance between that cell and \n" +
                        "all the remaining MugWumps.\n" +
                        "\n" +
                        "Let's Go!");
    }
}
