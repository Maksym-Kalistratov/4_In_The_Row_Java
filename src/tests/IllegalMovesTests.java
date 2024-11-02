package tests;
import Engine.Engine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(DLLLoaderForJUnit.class)

public class IllegalMovesTests {
    @Test
    public void testingLegalMoves(){
        for (int i = 1; i <= 7; i++) {
            for (int j = 0; j < 6; j++) {
                Assertions.assertEquals(0, Engine.nextMove(i));
            }
            Assertions.assertEquals(1, Engine.nextMove(i));
            Engine.resetBoard(true);
        }

    }

}
