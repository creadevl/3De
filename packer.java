import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.*;
public class packer {
    public static String LoadGameManifestFile(String gamefile) {
        try {
            ZipFile GameToUnPack = new ZipFile(gamefile); 
            ZipEntry ManifestFile = GameToUnPack.getEntry("GAMEINFO");
            GameToUnPack.close();
            String ManifestFileContent = ManifestFile.toString();
            return ManifestFileContent;
          } catch (FileNotFoundException e) {
            System.out.println("[PACKER:Error]:Could not find any game files at \""+gamefile+"\".");
            e.printStackTrace();
            return "FileNotFoundException";
          } catch (IOException e) {
            System.out.println("[PACKER:Error]:An Input/Output Error occured. Check your filesystem.");
            e.printStackTrace();
            return "IOException";
          }
    }
}

