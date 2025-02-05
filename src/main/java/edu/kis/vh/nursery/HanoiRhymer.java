package edu.kis.vh.nursery;

// Użycie skrótów alt + ← oraz alt + →, przełącza w środowisku IntelliJ otworzone karty plików

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int getTotalRejected() {
        return totalRejected;
    }

    public void setTotalRejected(int totalRejected) {
        this.totalRejected = totalRejected;
    }

    public int reportRejected() {
        return getTotalRejected();
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekBoo())
            setTotalRejected(getTotalRejected() + 1);
        else
            super.countIn(in);
    }

}
