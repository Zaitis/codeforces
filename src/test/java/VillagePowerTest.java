import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VillagePowerTest {
    int n, k, result;
    List<Integer> list = new ArrayList<>();
    VillagePower villagePower = new VillagePower();

    @AfterEach
    void after(){
        list.clear();
    }




    @Test
    void test1(){
        //given
        n=4;
        k=2;
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(2);

        //when
        result = villagePower.count(n, k, list);

        //then
        assertEquals(4, result);
    }

    @Test
    void test2(){
        //given
        n=6;
        k=3;
        list.add(1);
        list.add(9);
        list.add(12);
        list.add(4);
        list.add(7);
        list.add(2);

        //when
        result = villagePower.count(n, k, list);

        //then
        assertEquals(11, result);
    }

    @Test
    void test3(){
        //given
        n=12;
        k=8;
        list.add(1);
        list.add(9);
        list.add(8);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(1);
        list.add(8);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(2);

        //when
        result = villagePower.count(n, k, list);

        //then
        assertEquals(2, result);
    }



}