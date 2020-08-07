/**
 * Copyright 2020 Dynatrace LLC
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package CI.Test;

import static org.junit.Assert.*;

import junit.framework.Assert;
import org.junit.Test;

public class LibraryTest {
    @Test
    public void testSum() {
        int a = 2;
        int b = 5;
        Library classUnderTest = new Library();
        int result = classUnderTest.sum(a, b);
        if (result != a + b) {
            Assert.fail();
        }
    }

    /*@Test
    public void testMinus() {
        Library classUnderTest = new Library();
        Assert.assertEquals(0, classUnderTest.minus(2, 2));
    }

    @Test
    public void testDivide() {
        Library classUnderTest = new Library();
        Assert.assertEquals(2, classUnderTest.divide(6, 3));
    }

    @Test
    public void testMultiply() {
        Library classUnderTest = new Library();
        Assert.assertEquals(6 * 3, classUnderTest.multiply(6, 3));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {
        Library classUnderTest = new Library();
        classUnderTest.divide(6, 0);
    }*/
}
