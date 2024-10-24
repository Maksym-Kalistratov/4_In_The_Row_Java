package Game;

public class TestEngine {
    private static int[][] arr = {
            {0,0,0,0,0,0,0},
            {0,0,2,1,2,0,0},
            {0,0,2,2,2,0,0},
            {0,0,2,2,2,0,0},
            {0,2,2,2,2,2,0},
            {0,2,2,0,2,2,0}

    };
    private static int turn = 2;
    public static int getColor(int x, int y){
        return arr[x][y];
    }
    public static int getTurn(){
        return turn;
    }
}
