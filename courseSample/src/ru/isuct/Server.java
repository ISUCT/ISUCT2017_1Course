package ru.isuct;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {

    public static void main(String[] args) {
        Server server = new Server();
        server.go();
    }

    public void go(){
        try {
            ServerSocket servSock = new ServerSocket(5000);
            while(true){
                Socket sock = servSock.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                writer.println("Hello " + new Date());
                writer.close();
                System.out.println("One out " + new Date());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
