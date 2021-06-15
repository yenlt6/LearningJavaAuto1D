package oneD.Buoi15;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class CountStringTest {

    @Test
    public void checkCountCapitalizeLetter() {
        String inputStr = new String("You Only Live Once. But if You do it right. once is Enough");
        CountString countString = new CountString();
        assertEquals(7, countString.countCapitalizeLetter(inputStr));
    }

    @Test
    public void checkVietHoaChuDauTienCach1() {
        String inputStr = new String("You Only Live Once. But if You do it right. once is Enough");
        String testString = "You Only Live Once. But If You Do It Right. Once Is Enough";
        CountString countString = new CountString();
//        assertEquals("You Only Live Once. But If You Do It Right. Once Is Enough",countString.vietHoaChuDauTienCach1(inputStr));
        assertThat(testString).isEqualTo(countString.vietHoaChuDauTienCach1(inputStr));


    }


    @Test
    public void checkChuyenKyTuSauDauCham2() {
        String inputStr = new String("You Only Live Once. but if You do it right. once is Enough");
        StringBuilder testString = new StringBuilder("You Only Live Once. But if You do it right. Once is Enough. ");
        CountString countString = new CountString();
//        assertEquals("You Only Live Once. But If You Do It Right. Once Is Enough",countString.vietHoaChuDauTienCach1(inputStr));
        assertThat(testString).isEqualTo(countString.chuyenKyTuSauDauCham2(inputStr));

    }


}