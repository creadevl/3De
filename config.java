import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class config {
  File TDEHOME = new File("~/.3De/");
  public boolean does3DeFolderExist(){   
    if (TDEHOME.exists() && TDEHOME.isDirectory()){
      return true; 
    } else {
      return false;
    }
  }
  public void firstrun(){
    boolean setup00 = does3DeFolderExist();
    if (setup00 == false){

    }
  }
}
