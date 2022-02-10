package powerpackage;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PowerFinderTest {
    @Test
    public void oneRaisedToOneIsOne() {
        assertEquals(1,PowerFinder.calculatePower(1,1));
    }

    @Test
    public void twoRaisedToOneIsTwo() {
        
        assertEquals(2,PowerFinder.calculatePower(2,1));
    }

    @Test
    public void twoRaisedToPowerTwoIsFour() {
        assertEquals(4,PowerFinder.calculatePower(2,2));
    }

    @Test
    public void threeRaisedToPowerTwoIsNine() {
        assertEquals(9,PowerFinder.calculatePower(3,2));
    }
}
