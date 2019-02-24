import java.net.ServerSocket;
import java.net.Socket;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ZServerSocket {
   public static void main(String[] args) {
      int portNumber = Integer.parseInt(System.getProperty("portNumber"));

      System.out.println("Hi " + ZServerSocket.class.getSimpleName() + " here!");
      try(ServerSocket echoServer = new ServerSocket(portNumber);
          Socket serverClientSocket = echoServer.accept();
          PrintWriter out = new PrintWriter(serverClientSocket.getOutputStream(),true);
          BufferedReader in = new BufferedReader(new InputStreamReader(serverClientSocket.getInputStream()));
          BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
          ){
         String inputLine, outputLine;
         while ((inputLine = in.readLine()) != null) {
        outputLine = inputLine;
        out.println(outputLine);
        if (outputLine.equals("Bye."))
            break;
    }

      } catch(IOException e) {
      }
   }
}
