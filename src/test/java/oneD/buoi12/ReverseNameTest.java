package oneD.buoi12;

import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
//import static org.hamcrest.MatcherAssert.assertThat;


import org.assertj.core.data.Offset;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ReverseNameTest {
    @Test
    public void assertReverseCorrectly() {
        ReverseName reverseName = new ReverseName();
        String str = "Le Thi Yen";
        assertEquals(reverseName.reverse(str),"Yen Thi Le");
    }

    @Test
    public void test1(){
        StringBuilder str1 = new StringBuilder("Thoa xynh");

        StringBuilder str2 = str1.reverse();
        assertThat(str2).isNotEmpty()
                .isEqualTo("hnyx aohT");

//        StringBuilder str3 = lessonString.reverseString(str2);
//        assertThat(str3.toString().trim()).isNotEmpty().isEqualTo("Thoa xynh");
//        chị viết thế này thì pass
//        nhưng viết đảo lại thì failed
//        StringBuilder str1 = new StringBuilder("Thoa xynh");
//
//        StringBuilder str2 = lessonString.reverseString(str1);
//        StringBuilder str3 = lessonString.reverseString(str2);
//        assertThat(str2.toString().trim()).isNotEmpty().isEqualTo("hnyx aohT");
//        assertThat(str3.toString().trim()).isNotEmpty().isEqualTo("Thoa xynh");
//        java.lang.StringBuilder str1 = new java.lang.StringBuilder("word");
//        java.lang.StringBuilder str2 = str1.reverse();
//        //System.out.println(str2);
//        assertThat((CharSequence) str2).isEqualTo("drow");
//       // chị viết như vậy thì fail
//        java.lang.StringBuilder str1 = new java.lang.StringBuilder("word");
//        java.lang.StringBuilder str2 = str1.reverse();

        assertThat((CharSequence) str2).isEqualTo(str1.reverse());





    }

}