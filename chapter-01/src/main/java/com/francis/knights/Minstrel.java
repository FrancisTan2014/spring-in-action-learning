package com.francis.knights;

import java.io.PrintStream;

public class Minstrel {

    private PrintStream stream;

    public Minstrel(PrintStream stream) {
        this.stream = stream;
    }

    public void singBeforeQuest() {
        stream.println("====================================");
        stream.println("The Minstrel sings before quest.");
    }

    public void singAfterQuest() {
        stream.println("The Minstrel sings after quest.");
        stream.println("====================================");
    }

}