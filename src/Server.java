import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Server {
    public static void main(String[] args) {
        int port = 8081;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is running on the port: " + port);

            // Waiting client
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected!");

            // Getting and read the stream
            BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);

            writer.println("Hello! Please provide a greeting.");

            String clientMessage = reader.readLine();
            System.out.println("Client's greeting: " + clientMessage);

            // Checking russian words
            if (isRussianLetters(clientMessage)) {
                writer.println("What is 'паляниця'?");
                String answer = reader.readLine();

                if ("хліб".equalsIgnoreCase(answer.trim())) {
                    writer.println("Current date and time: " + LocalDateTime.now());
                } else {
                    writer.println("Incorrect answer. Disconnecting...");
                    clientSocket.close();
                }
            } else {
                writer.println("Goodbye!");
                clientSocket.close();
            }

            // Closing connection
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static boolean isRussianLetters(String input) {
        for (char c : input.toCharArray()) {
            if (Character.UnicodeBlock.of(c) == Character.UnicodeBlock.CYRILLIC) {
                return true;
            }
        }
        return false;
    }
}