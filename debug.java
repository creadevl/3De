import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileDescriptor;
import java.time.*;
import java.util.logging.*;
public class debug {
    public static void FatalEscape(String SourceModule, String Cause, String DumpSeed){
        int lastDumpId = new File("~/.3De/Data/Dumpfiles/").listFiles().length;
        
        switch(DumpSeed) {
            case "0a":
                // code block
                break;
            case "0b":
                // code block
                break;
            default:
                // code block
            System.exit(0);
        }

    }
    public static void ssdm(){
      System.out.println("SUPERSECRETDEBUGMODE=ON");
      
    }
}
