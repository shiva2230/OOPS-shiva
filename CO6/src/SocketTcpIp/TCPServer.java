package SocketTcpIp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server started. Waiting for a client to connect...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected: " +
                    clientSocket.getInetAddress().getHostAddress());
            BufferedReader inFromClient = new BufferedReader(new
                    InputStreamReader(clientSocket.getInputStream()));
            PrintWriter outToClient = new PrintWriter(clientSocket.getOutputStream(), true);
            Thread readThread = new Thread(() -> {
                try {
                    String message;
                    while ((message = inFromClient.readLine()) != null) {
                        System.out.println("Received from client: " + message);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            readThread.start();
            BufferedReader inFromConsole = new BufferedReader(new
                    InputStreamReader(System.in));
            String serverMessage;
            while ((serverMessage = inFromConsole.readLine()) != null) {
                outToClient.println("Server says: " + serverMessage);
            }

            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
