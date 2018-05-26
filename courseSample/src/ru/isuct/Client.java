package ru.isuct;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.go();
    }

    public void go(){
        try {
            Socket s = new Socket("127.0.0.1", 5000);
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println(advice);
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
