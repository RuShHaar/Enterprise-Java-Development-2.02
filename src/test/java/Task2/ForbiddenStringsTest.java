package Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForbiddenStringsTest {

    @Test
    void isForbidden() {


        ForbiddenStrings test1 = new ForbiddenStrings();

        String sentence1 = "Ist die Welt nicht schoen";
        String sentence2 = "You break my heart";

        assertEquals(false, test1.isForbidden(sentence1));
        assertEquals(true, test1.isForbidden(sentence2));
    }
}