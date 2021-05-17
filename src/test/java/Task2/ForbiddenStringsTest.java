package Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForbiddenStringsTest {

    @Test
    void isForbidden() {

        /* String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
                "synchronized", "boolean", "do", "if", "private", "this", "break",
                "double", "implements", "protected", "throw", "byte", "else", "import", "public",
                "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends",
                "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally",
                "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};
        */
        ForbiddenStrings test1 = new ForbiddenStrings();

        String sentence1 = "Ist die Welt nicht schoen";
        String sentence2 = "You break my heart";

        assertEquals(false, test1.isForbidden(sentence1));
        assertEquals(true, test1.isForbidden(sentence2));
    }
}