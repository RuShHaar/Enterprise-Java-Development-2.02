package Task1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class OddIntegersTest {

    @Test
    void oddNums() {

        OddIntegers test1 = new OddIntegers();
        assertArrayEquals(new Integer []{1,3}, test1.oddNums(3));

    }
}