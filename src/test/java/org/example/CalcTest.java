package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalcTest {
  Calc c = new Calc();

    @Test
    void testAddition() {
        assertEquals(4, c.add(2,2));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, c.subtract(4, 2));  // 预计会失败，因为 subtract 方法未实现。
    }

}