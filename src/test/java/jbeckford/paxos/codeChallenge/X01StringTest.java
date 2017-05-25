package jbeckford.paxos.codeChallenge;

import junit.framework.TestCase;

/**
 * Created by Jesus on 5/22/2017.
 */
public class X01StringTest extends TestCase {
    public void testPossibleStates_inputXX_returns4() throws Exception {
        X01String x01String = new X01String("XX");
        assertEquals(x01String.getPossibleStates(), 4);
    }

    public void testIncrement_XX_incrementsCycleFrom00to11() throws Exception {
        X01String x01String = new X01String("XX");
        assertEquals(x01String.toString(), "00");

        x01String.increment();
        assertEquals(x01String.toString(), "01");

        x01String.increment();
        assertEquals(x01String.toString(), "10");

        x01String.increment();
        assertEquals(x01String.toString(), "11");
    }

    public void testToString_XX_initialStateReturn00() throws Exception {
        X01String x01String = new X01String("XX");
        assertEquals(x01String.toString(), "00");
    }

}