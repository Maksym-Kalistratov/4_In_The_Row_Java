package Engine;

public class Engine {


    public static native int getColor(int x, int y);
    public static native int nextMove(int col);
    public static native int getState();
    public static native int getTurn();
    public static native void resetBoard(boolean resetCount);
    public static native int getCount(int i);
    public static native int getBoardSize();
    public static native int getBoardSize(int i);
    public static native int testCase( int[][] testBoard,int x,int y);





}
