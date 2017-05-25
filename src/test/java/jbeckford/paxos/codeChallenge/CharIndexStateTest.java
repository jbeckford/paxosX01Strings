package jbeckford.paxos.codeChallenge;

import junit.framework.TestCase;

/**
 * Created by Jesus on 5/22/2017.
 */
public class CharIndexStateTest extends TestCase {
    private CharIndexState charIndexState;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        charIndexState = new CharIndexState(0);
    }

    public void testIncrement_simpleCharIndexState_returnsFalseBeforeIncrementReturnsTrueAfterIncrement() throws Exception {
        assertFalse(charIndexState.increment());
        assertTrue(charIndexState.increment());
    }

    public void testIsActive_simpleCharIndexState_returnsFalseBeforeIncrementReturnsTrueAfterIncrement() throws Exception {
        assertFalse(charIndexState.isActive());
        charIndexState.increment();
        assertTrue(charIndexState.isActive());
    }

    public void testGetIndex_simpleCharIndexState0_returns0() throws Exception {
        assertEquals(0, charIndexState.getIndex());
    }

    public void testToString__simpleCharIndexState_returns0BeforeIncrementReturns1AfterIncrement() throws Exception {
        assertEquals("0", charIndexState.toString());
        charIndexState.increment();
        assertEquals("1", charIndexState.toString());
    }
}