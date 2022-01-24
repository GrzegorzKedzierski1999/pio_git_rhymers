package edu.kis.vh.nursery;

// Użycie skrótów alt + ← oraz alt + →, przełącza w środowisku IntelliJ otworzone karty plików

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekBoo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
