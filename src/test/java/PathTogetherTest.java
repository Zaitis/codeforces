import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathTogetherTest {
    int xA, xB, xC, yA, yB, yC;
    int result;

    PathTogether pathTogether = new PathTogether();

    @Test
    void should1(){
        //given
        xA= 3;
        yA= 1;

        xB= 1;
        yB= 3;

        xC= 6;
        yC= 4;

        //then

        result= pathTogether.pathTogeters(xA, yA, xB, yB, xC, yC);

        //when
        assertEquals(3, result);

    }

    @Test
    void should2(){
        //given
        xA= 5;
        yA= 2;

        xB= 2;
        yB= 2;

        xC= 7;
        yC= 2;

        //then

        result= pathTogether.pathTogeters(xA, yA, xB, yB, xC, yC);

        //when
        assertEquals(1, result);

    }

    @Test
    void should3(){
        //given
        xA=1;
        yA= 1;

        xB= 4;
        yB= 3;

        xC= 5;
        yC= 5;

        //then

        result= pathTogether.pathTogeters(xA, yA, xB, yB, xC, yC);

        //when
        assertEquals(6, result);

    }

}