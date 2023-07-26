package SocketTcpIp;

import java.io.*;
import java.net.*;
public class TCPClient {
    public static void main(String[] args) {
        try {
            Socket clientSocket = new Socket("192.168.1.62", 12345);
            BufferedReader inFromServer = new BufferedReader(new
                    InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToServer = new PrintWriter(clientSocket.getOutputStream(), true);
            Thread readThread = new Thread(() -> {
                try {
                    String response;
                    while ((response = inFromServer.readLine()) != null) {
                        System.out.println(response); // Print the server response
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }

            });
            readThread.start();
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            String message;
            do {
                System.out.flush();
                message = userInput.readLine();
                outToServer.println(message);
            } while (!message.equalsIgnoreCase("exit"));
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
