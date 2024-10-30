package tests;
import Engine.Engine;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DLLLoaderForJUnit.class)
public class GameOutcomeTests {
    @AfterEach
    public void reset(){
        Engine.resetBoard(true);
    }
    @Test
    public void testingRedVerticalWin(){
        System.out.println("RedOne");
        Assertions.assertEquals(0, Engine.nextMove(1));
        Engine.nextMove(2);
        Engine.nextMove(1);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(1);
        Engine.nextMove(2);
        Assertions.assertEquals(0, Engine.nextMove(1));
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0)); //2
        System.out.println(Engine.getCount(0));

    }
    @Test
    public void testingRedHorizontalWin(){
        System.out.println("RedTwo");
        Assertions.assertEquals(0, Engine.nextMove(1));
        Engine.nextMove(1);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(2);
        Assertions.assertEquals(0, Engine.nextMove(3));
        Engine.nextMove(3);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0));
        //System.out.println(Engine.getCount(0));
    }
    @Test
    public void testingRedDiagonalWinLeftToRight(){
        System.out.println("RedThree");
        Assertions.assertEquals(0, Engine.nextMove(1));
        Engine.nextMove(2);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(3);
        Assertions.assertEquals(0, Engine.nextMove(3));
        Engine.nextMove(4);
        Assertions.assertEquals(0, Engine.nextMove(3));
        Engine.nextMove(4);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Engine.nextMove(6);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0)); //3
        //System.out.println(Engine.getCount(0));
    }
    @Test
    public void testingRedDiagonalWinRightToLeft(){
        System.out.println("RedFrour");
        Assertions.assertEquals(0, Engine.nextMove(7));
        Engine.nextMove(6);
        Assertions.assertEquals(0, Engine.nextMove(6));
        Engine.nextMove(5);
        Assertions.assertEquals(0, Engine.nextMove(5));
        Engine.nextMove(4);
        Assertions.assertEquals(0, Engine.nextMove(5));
        Engine.nextMove(4);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Engine.nextMove(2);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0));
    }
    @Test
    public void testingBlueVerticalWin(){
        System.out.println("BlueOne");
        Engine.nextMove(1);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(1);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(1);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(3);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Assertions.assertEquals(2, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(1));
    }
    @Test
    public void testingBlueHorizontalWin(){
        System.out.println("BlueTwo");
        Engine.nextMove(1);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(1);
        Assertions.assertEquals(0, Engine.nextMove(3));
        Engine.nextMove(2);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Engine.nextMove(3);
        Assertions.assertEquals(0, Engine.nextMove(5));
        Assertions.assertEquals(2, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(1));
    }
    @Test
    public void testingBlueDiagonalLeftToRightWin(){
        System.out.println("BlueThree");
        Engine.nextMove(2);
        Assertions.assertEquals(0, Engine.nextMove(1));
        Engine.nextMove(3);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(3);
        Assertions.assertEquals(0, Engine.nextMove(3));
        Engine.nextMove(4);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Engine.nextMove(4);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Assertions.assertEquals(2, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(1));
    }
    @Test
    public void testingBlueDiagonalRightToLeftWin(){
        System.out.println("BlueFour");
        Engine.nextMove(6);
        Assertions.assertEquals(0, Engine.nextMove(7));
        Engine.nextMove(5);
        Assertions.assertEquals(0, Engine.nextMove(6));
        Engine.nextMove(5);
        Assertions.assertEquals(0, Engine.nextMove(5));
        Engine.nextMove(4);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Engine.nextMove(4);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Assertions.assertEquals(2, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(1));
    }
}
