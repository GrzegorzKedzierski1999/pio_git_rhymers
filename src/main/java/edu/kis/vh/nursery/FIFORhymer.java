package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer dRhymer = new DefaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            dRhymer.countIn(super.countOut());

        int ret = dRhymer.countOut();

        while (!dRhymer.callCheck())
            countIn(dRhymer.countOut());

        return ret;
    }
}
