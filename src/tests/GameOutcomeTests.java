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
        int[] moves = {1, 2, 1, 2, 1, 2, 1};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0)); //2
    }
    @Test
    public void testingRedHorizontalWin(){
        System.out.println("RedTwo");
        int[] moves = {1, 1, 2, 2, 3, 3, 4};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0));
    }

    @Test
    public void testingRedDiagonalWinLeftToRight(){
        System.out.println("RedThree");
        int[] moves = {1, 2, 2, 3, 3, 4, 3, 4, 4, 6, 4};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0)); //3
    }

    @Test
    public void testingRedDiagonalWinRightToLeft(){
        System.out.println("RedFour");
        int[] moves = {7, 6, 6, 5, 5, 4, 5, 4, 4, 2, 4};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(1, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(0));
    }
    @Test
    public void testingBlueVerticalWin(){
        System.out.println("BlueOne");
        int[] moves = {1, 2, 1, 2, 1, 2, 3, 2};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(2, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(1));
    }

    @Test
    public void testingBlueHorizontalWin(){
        System.out.println("BlueTwo");
        int[] moves = {1, 2, 1, 3, 2, 4, 3, 5};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(2, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(1));
    }

    @Test
    public void testingBlueDiagonalLeftToRightWin(){
        System.out.println("BlueThree");
        int[] moves = {2, 1, 3, 2, 3, 3, 4, 4, 4, 4};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(2, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(1));
    }

    @Test
    public void testingBlueDiagonalRightToLeftWin(){
        System.out.println("BlueFour");
        int[] moves = {6, 7, 5, 6, 5, 5, 4, 4, 4, 4};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(2, Engine.getState());
        Assertions.assertEquals(1, Engine.getCount(1));
    }
    @Test
    public void drawTest(){
        System.out.println("Draw");
        int[] moves = {1, 2, 3, 4, 5, 6, 7,
                       1, 2, 3, 4, 5, 6, 7,
                       1, 1, 2, 2, 1, 3, 3,
                       4, 4, 5, 5, 2, 6, 6,
                       7, 7, 7, 6, 4, 4, 5,
                       7, 3, 1, 2, 3, 6, 5};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(3, Engine.getState());
        Assertions.assertEquals(0, Engine.getCount(0));
        Assertions.assertEquals(0, Engine.getCount(1));

    }
    @Test
    public void testingIntermediateResultOne(){
        System.out.println("IntermediateOne");
        int[] moves = {1, 2, 1, 2, 1, 2, 7,1};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(0, Engine.getState());
        Assertions.assertEquals(0, Engine.getCount(0));
        Assertions.assertEquals(0, Engine.getCount(1));
    }
    @Test
    public void testingIntermediateResultTwo(){
        System.out.println("IntermediateTwo");
        int[] moves = {1, 2, 2, 3, 3, 4, 3, 4, 4, 6, 7,4};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(0, Engine.getState());
        Assertions.assertEquals(0, Engine.getCount(0));
        Assertions.assertEquals(0, Engine.getCount(1));
    }
    @Test
    public void testingIntermediateResultThree(){
        System.out.println("IntermediateThree");
        int[] moves = {1, 2, 1, 3, 2, 4, 3, 7, 5};
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(0, Engine.getState());
        Assertions.assertEquals(0, Engine.getCount(0));
        Assertions.assertEquals(0, Engine.getCount(1));
    }
    @Test
    public void testingIntermediateResultFour(){
        System.out.println("IntermediateFour");
        int[] moves = {6, 7, 5, 6, 5, 5, 4, 4, 4, 7 ,4 };
        for (int i : moves) {
            Assertions.assertEquals(0, Engine.nextMove(i));
        }
        Assertions.assertEquals(0, Engine.getState());
        Assertions.assertEquals(0, Engine.getCount(0));
        Assertions.assertEquals(0, Engine.getCount(1));
    }
}
