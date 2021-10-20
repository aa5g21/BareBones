import java.io.*;
import java.util.regex.*;


public class BareBonesInterpreter {
  public static void main(String[] args) throws IOException {
    BareBonesInterpreter Interpreter = new BareBonesInterpreter();
    Interpreter.fileReader();
  }

  public String fileReader() throws FileNotFoundException, IOException {
    BufferedReader reader = new BufferedReader(new FileReader("src/Test.txt"));
    String line;
    while ((line = reader.readLine()) != null){
      System.out.println(line);
    }
    return "";
  }
}
