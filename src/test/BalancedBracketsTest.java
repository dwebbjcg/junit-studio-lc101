package test;

import org.junit.Test;
import main.BalancedBrackets;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void twoOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[["));
    }

    @Test
    public void twoClosingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    @Test
    public void bracketsBetweenWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Sam[sung]Galaxy"));
    }

    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void unbalancedBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unbalancedBracketsBetweenWordsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Sam]sung[Galaxy"));
    }

    @Test
    public void bracketsBeforeWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Galaxy"));
    }

    @Test
    public void bracketsAfterWordsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Galaxy[]"));
    }

    @Test
    public void singleBracketBeforeWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Galaxy"));
    }

    @Test
    public void singleBracketAfterWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Galaxy]"));
    }

    @Test
    public void noBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
}