import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ZSocket {
   public static void main(String[] args) {
      String hostName = System.getProperty("hostName");
      int portNumber = Integer.parseInt(System.getProperty("portNumber"));

      System.out.println("Hi " + ZSocket.class.getSimpleName() + " here!");
      try(Socket echoClient = new Socket(hostName,portNumber);
          PrintWriter out = new PrintWriter(echoClient.getOutputStream(),true);
          BufferedReader in = new BufferedReader(new InputStreamReader(echoClient.getInputStream()));
          BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
          ){
         String userInput;
    while ((userInput = stdIn.readLine()) != null) {
    out.println(userInput);
    System.out.println("echo: " + in.readLine());
}
      } catch(IOException e) {
      }
   }
}
