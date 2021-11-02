package com.company;

import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;
        DataInputStream in = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        Socket socket = null;
        ServerSocket ss = new ServerSocket(9999);
        while (true) {
            socket = ss.accept();
            inputStreamReader = new InputStreamReader(socket.getInputStream());
            bufferedReader = new BufferedReader(inputStreamReader);
            System.out.println("Client connected");
            try {
                while (true) {
                    String str = bufferedReader.readLine();
                    System.out.println("client:" + str);

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

