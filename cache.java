import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileDescriptor;
import java.io.IOException;
public class cache {
    String rootdir = "~/.3De/";
    String cachedir = "cachefiles/";
    String unpackedgames = "lodedgames/";
    public void SaveTo(String input,String location) {
        String unsavedcontents = input;
        if (location == "cache"){
            FileWriter filee;
			try {
				filee = new FileWriter(rootdir + cachedir + location);
                filee.write(unsavedcontents);
                filee.close();
			} catch (IOException e) {
				// TODO: Auto-generated catch block
				e.printStackTrace();
			}
        }
    }
}
