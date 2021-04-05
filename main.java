import java.io.File; //Without this statement, 3De would never be able to open any files.
import java.io.FileNotFoundException;  // in case of a file not found error
import java.util.Scanner; // reads text
/**
 * this is the main controller for 3De
 */
class main {
  public static void main(String[] args) {
      System.out.println("3De -- Powered by Java.\nVersion 0.0.1\nCreated by Creative Development [ https://github.com/creadevl ]\nProtected by the MIT LICENSE\n"); // Display the string.
      try {
          if (args[0].equals("about")) {
              loadinternaltext("about");
          }else if (args[0].equals("notevil")) {
              loadinternaltext("credits");
          }
      } catch (java.lang.ArrayIndexOutOfBoundsException e) {
          System.err.println("[MAIN:Error]:No commands detected. Exiting...");
          System.exit(0);
      }
  }
  public static void loadinternaltext(String textfile) {
    try {
      File texttoread = new File("./text/"+textfile+".text"); 
      Scanner textie = new Scanner(texttoread);
      while (textie.hasNextLine()) {
        String textdata = textie.nextLine();
        System.out.println(textdata);
      }
      textie.close();
    } catch (FileNotFoundException e) {
      System.out.println("[MAIN:Error]:Could not find an internal text file named \""+textfile+".text\".");
      e.printStackTrace();
    } 
  }
}