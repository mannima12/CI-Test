package CI.Test;

import junit.framework.Assert;
import org.junit.Test;

public class AdvancedTest {
    @Test
    public void testSum() {
        // Given
        Library classUnderTest = new Library();
        // When
        int result = classUnderTest.sum(classUnderTest.multiply(4, 6), 2);
        // Then
        if (result != 26) {   // if 2 + 2 != 4
            Assert.fail();
        }
    }

    @Test
    public void testMinus() {
        Library classUnderTest = new Library();
        Assert.assertEquals(22, classUnderTest.minus(classUnderTest.multiply(4, 6), 2));
    }

    @Test
    public void testDivide() {
        Library classUnderTest = new Library();
        Assert.assertEquals(10, classUnderTest.divide(classUnderTest.multiply(10, 3), 3));
    }
}
