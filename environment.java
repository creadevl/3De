import java.io.IOException;
public class environment {
  public static void startpygame(String game) {
    try{
      Process p = Runtime.getRuntime().exec("python3 ./libraries/pygame/main.py "+game);
    } catch (IOException e) {
      //TODO: create an error reporter
    }
  }
  public static void loadgame(String filelocate, String enginetouse, String options) {
    
  }
}
