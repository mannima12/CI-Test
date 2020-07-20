/**
 * Copyright 2020 Dynatrace LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
