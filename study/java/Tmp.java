import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tmp {
   public static void main(String[] args) {
      String hostName = System.getProperty("hostName");
      int portNumber = Integer.parseInt(System.getProperty("portNumber"));

      System.out.println("Hi " + Tmp.class.getSimpleName() + " here!");
      System.out.println("hostName: " + hostName);
      System.out.println("portNumber: " + portNumber);
   }
}
