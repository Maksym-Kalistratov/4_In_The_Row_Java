package tests;
import Engine.Engine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DLLLoaderForJUnit.class)
public class InitializationTests {
    @Test
    public void boardSizeTest(){
        Assertions.assertEquals(6, Engine.getBoardSize());
        for (int i = 0; i < Engine.getBoardSize(); i++) {
            Assertions.assertEquals(7, Engine.getBoardSize(i));
        }
    }
    @Test
    public void testingIfBoardIsEmpty(){
        for (int i = 0; i < Engine.getBoardSize(); i++) {
            for (int j = 0; j < Engine.getBoardSize(i); j++) {
                Assertions.assertEquals(0, Engine.getColor(i,j));
            }
        }
    }
    @Test
    public void gameStateInitTest() {
        Assertions.assertEquals(0, Engine.getState());
    }
    @Test
    public void countInitTest() {
        Assertions.assertEquals(0, Engine.getCount(0));
        Assertions.assertEquals(0, Engine.getCount(1));
    }
    @Test
    public void currTurnTest() {
        Assertions.assertEquals(1, Engine.getTurn());
        Engine.nextMove(1);
        Assertions.assertEquals(2, Engine.getTurn());
        Engine.nextMove(1);
        Assertions.assertEquals(1, Engine.getTurn());
        Assertions.assertEquals(0, Engine.getCount(1));
    }
    @Test
    public void resettingWithoutCountTest(){
        Engine.nextMove(1);
        Engine.nextMove(1);
        Engine.nextMove(2);
        Engine.resetBoard(false);
        testingIfBoardIsEmpty();
    }
    @Test
    public void resettingWithCountTest(){
        GameOutcomeTests test = new GameOutcomeTests();
        test.testingBlueHorizontalWin();
        Engine.resetBoard(false);
        test.testingRedVerticalWin();
        Engine.resetBoard(true);
        testingIfBoardIsEmpty();
        countInitTest();
    }
}
