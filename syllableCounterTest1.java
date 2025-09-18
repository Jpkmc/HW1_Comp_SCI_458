package Problem_3;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class syllableCounterTest1 {
    @Test
    public void testBasicWords() {
        assertEquals(3, syllableCounter1.countSyllables("syllable"));
        assertEquals(3, syllableCounter1.countSyllables("computer"));
        assertEquals(1, syllableCounter1.countSyllables("rhythm"));
    }

    @Test
    public void testTrickyWords() {
        assertEquals(2, syllableCounter1.countSyllables("apple"));
        assertEquals(2, syllableCounter1.countSyllables("business"));
        assertEquals(3, syllableCounter1.countSyllables("family"));
    }

    @Test
    public void testWordsWithSilentE() {
        assertEquals(2, syllableCounter1.countSyllables("table")); // 'le' ending counts
        assertEquals(3, syllableCounter1.countSyllables("beautiful"));
    }

    @Test
    public void testSingleSyllableWords() {
        assertEquals(1, syllableCounter1.countSyllables("strengths"));
        assertEquals(1, syllableCounter1.countSyllables("queue"));
    }

    @Test
    public void testEdgeCases() {
        assertEquals(1, syllableCounter1.countSyllables("a")); // very short word
        assertEquals(0, syllableCounter1.countSyllables(""));  // empty string
        assertEquals(0, syllableCounter1.countSyllables(null)); // null input
    }


    @Test
    public void testEXBasicWords() {
        assertEquals(1, syllableCounter1.countSyllables("Sky"));
        assertEquals(1, syllableCounter1.countSyllables("Rhythm"));
        assertEquals(1, syllableCounter1.countSyllables("Book"));
        assertEquals(2, syllableCounter1.countSyllables("Apple"));
        assertEquals(2, syllableCounter1.countSyllables("Happy"));
        assertEquals(2, syllableCounter1.countSyllables("Open"));
        assertEquals(3, syllableCounter1.countSyllables("Animal"));
        assertEquals(3, syllableCounter1.countSyllables("Chocolate"));
        assertEquals(3, syllableCounter1.countSyllables("Computer"));
        assertEquals(4, syllableCounter1.countSyllables("Celebration"));
        assertEquals(4, syllableCounter1.countSyllables("Voluntary"));
        assertEquals(4, syllableCounter1.countSyllables("California"));
        assertEquals(5, syllableCounter1.countSyllables("Incomparable"));
        assertEquals(5, syllableCounter1.countSyllables("Opportunity"));
        assertEquals(5, syllableCounter1.countSyllables("Misunderstanding"));
    }

    @Test
    public void testLongWords() {
        assertTrue(syllableCounter1.countSyllables("Unintentionally") >= 6);
        assertTrue(syllableCounter1.countSyllables("Misinterpretation") >= 6);
        assertTrue(syllableCounter1.countSyllables("Incomprehensible") >= 6);
        assertTrue(syllableCounter1.countSyllables("Disproportionately") >= 6);
        assertTrue(syllableCounter1.countSyllables("Unconstitutionalities") >= 7);
        assertTrue(syllableCounter1.countSyllables("Incomprehensibility") >= 7);
        assertTrue(syllableCounter1.countSyllables("Internationalization") >= 7);
        assertTrue(syllableCounter1.countSyllables("Antidisestablishmentarianism") >= 10);
    }
}


