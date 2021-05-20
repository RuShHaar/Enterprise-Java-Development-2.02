package Task2;

import java.util.Arrays;

public class ForbiddenStrings {

    private static String[] keywords = {"abstract", "continue", "for", "new", "switch", "assert", "default", "goto", "package",
            "synchronized", "boolean", "do", "if", "private", "this", "break",
            "double", "implements", "protected", "throw", "byte", "else", "import", "public",
            "throws", "case", "enum", "instanceof", "return", "transient", "catch", "extends",
            "int", "short", "try", "char", "final", "interface", "static", "void", "class", "finally",
            "long", "strictfp", "volatile", "const", "float", "native", "super", "while"};


    public boolean isForbidden(String sentence) {
        String[] individualWords = sentence.split(" ");
        boolean isIn = false;
        for (int i = 0; i < individualWords.length; i++) {
            if (Arrays.asList(keywords).contains(individualWords[i])) {
                isIn = true;
                break;
            }
        }
        return isIn;
    }
}
