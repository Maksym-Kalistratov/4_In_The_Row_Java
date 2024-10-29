package tests;
import Engine.Engine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DLLLoaderForJUnit.class)
public class GameOutcomeTest {
    @Test
    public void testingRedVerticalWin(){
        System.out.println("one");
        Assertions.assertEquals(0, Engine.nextMove(1));
        Engine.nextMove(2);
        Engine.nextMove(1);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(1);
        Engine.nextMove(2);
        Assertions.assertEquals(0, Engine.nextMove(1));
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0), "hello"); //2
        System.out.println(Engine.getCount(0));
        Engine.resetBoard(false);
    }
    @Test
    public void testingHorizontalRedWin(){
        System.out.println("two");
        Assertions.assertEquals(0, Engine.nextMove(1));
        Engine.nextMove(1);
        Assertions.assertEquals(0, Engine.nextMove(2));
        Engine.nextMove(2);
        Assertions.assertEquals(0, Engine.nextMove(3));
        Engine.nextMove(3);
        Assertions.assertEquals(0, Engine.nextMove(4));
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0), "hello");
        System.out.println(Engine.getCount(0));
        Engine.resetBoard(false);
    }
    @Test
    public void testingDiagonalWinLeftToRight(){
        System.out.println("three");
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
        Assertions.assertEquals(1, Engine.getCount(0), "hello"); //3
        System.out.println(Engine.getCount(0));
        Engine.resetBoard(false);
    }
}
