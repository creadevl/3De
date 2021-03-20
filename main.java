/**
 * this is the main controller for 3De
 */
class main {
  public static void main(String[] args) {
      System.out.println("3De -- Powered by Java.\nVersion 0.0.0\nCreated by Creative Development [ https://github.com/creadevl ]\n"); // Display the string.
      try {
          if (args[0].equals("about")) {
              System.out.println("insert ~/3De/text/about.text here.");
          }
      } catch (java.lang.ArrayIndexOutOfBoundsException e) {
          System.err.println("[MAIN:Error]:No commands detected. Exiting...");
          System.exit(0);
      } finally {
          if (args[0].equals("about")) {
          System.out.println("insert ~/3De/text/about.text here.");
        }
      }
      
  }
}