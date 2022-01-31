package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer dRhymer = new DefaultCountingOutRhymer();

    public DefaultCountingOutRhymer getDRhymer() {
        return dRhymer;
    }

    @Override
    public int countOut() {
        while (!callCheck())
            getDRhymer().countIn(super.countOut());

        int ret = getDRhymer().countOut();

        while (!getDRhymer().callCheck())
            countIn(getDRhymer().countOut());

        return ret;
    }
}
