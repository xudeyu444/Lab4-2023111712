package org.example;

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        // 这里是正确的逻辑：1+1=2
        // 等会儿做第七步时，你要把这里的 2 改成 5
        Assert.assertEquals(2, calculator.add(1, 1));
    }
}