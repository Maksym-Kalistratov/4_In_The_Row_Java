import Menu.MenuFrame;
import Game.InstructionsFrame;
import Game.GameFrame;
import Engine.Engine;
public class Main {
    public static void main(String[] args) {
        System.loadLibrary("UTP_Project1_Lib");
        new MenuFrame();
        //new GameFrame();
        //Engine.greeter();
        //System.out.println(Engine.getColor(1,3));
    }
}
