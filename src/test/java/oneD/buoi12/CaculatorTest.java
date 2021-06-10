package oneD.buoi12;

import org.assertj.core.api.Java6Assertions;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaculatorTest {
    Caculator caculator = new Caculator();

    @Test
    public void checkSumcorrectly() {
        assertEquals(caculator.sum(4, 5), 9);
        Java6Assertions.assertThat(caculator.sum(2, 3)).isEqualTo(5);
    }

    @Test
    public void assertNotEqualsExample() {
        assertNotEquals(3, caculator.sum(1, 1));
    }

    @Test
    public void assertArrayEqualsExample() {
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }

//    assertSame(): khẳng định rằng 2 object có cùng tham chiếu tới chính xác cùng
//    một object
//    assertNotSame() : khẳng định rằng 2 object không tham chiếu đến cùng một
//    đối tượng
    @Test
    public void assertNull_assertNotNull() {
        String nullString = null;
        String notNullString = "Techmaster";
        assertNull(nullString);
        assertNotNull(notNullString);
    }

//    assertTrue(): dùng để xác minh điều kiện phải trả về true.
//    assetFalse(): dùng để xác minh điều kiện trả về là false
    @Test
    public void assertTrue_assertFalse() {
//Test will pass
        assertTrue(true);
        assertFalse(false);
        assertTrue(5 > 4, "5 is greater the 4");
        assertTrue(null == null, "null is equal to null");
        assertFalse(4 > 5, "5 is greater the 4");
    }

}