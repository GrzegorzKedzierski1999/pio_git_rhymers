package edu.kis.vh.nursery;

/**
 * Creates FIFO implementation of CountingOutRhymer
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    /**
     * instance of DefaultCountingOutRhymer
     */
    private final DefaultCountingOutRhymer dRhymer = new DefaultCountingOutRhymer();

    /**
     * @return instance of DefaultCountingOutRhymer
     */
    public DefaultCountingOutRhymer getDRhymer() {
        return dRhymer;
    }

    /**
     * Counts out first element of rhymer
     * @return first element
     */
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
