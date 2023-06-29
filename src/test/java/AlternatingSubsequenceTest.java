import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AlternatingSubsequenceTest {
    AlternatingSubsequence alternatingSubsequence = new AlternatingSubsequence();

    @Test
    void should1(){

        //given
        int length = 5;
        Long[] sequence = {1L, 2L, 3L, -1L,-2L};

        //when

        Long result = alternatingSubsequence.alternatingSequence(length, Arrays.stream(sequence).toList());

        //then
        assertEquals(2, result);
    }

    @Test
    void should2(){

        //given
        int length = 4;
        Long[] sequence = {-1L, -2L, -1L, -3L};

        //when

        Long result = alternatingSubsequence.alternatingSequence(length, Arrays.stream(sequence).toList());

        //then
        assertEquals(-1, result);
    }

    @Test
    void should3(){

        //given
        int length = 10;
        Long[] sequence = {-2L, 8L, 3L, 8L, -4L, -15L, 5L, -2L, -3L, 1L};

        //when

        Long result = alternatingSubsequence.alternatingSequence(length, Arrays.stream(sequence).toList());

        //then
        assertEquals(6, result);
    }
    @Test
    void should4(){

        //given
        int length = 6;
        Long[] sequence = {1L, -1000000000L, 1L, -1000000000L, 1L, -1000000000L};

        //when

        Long result = alternatingSubsequence.alternatingSequence(length, Arrays.stream(sequence).toList());

        //then
        assertEquals(-2999999997L, result);
    }


}