package com.company;
import java.net.*;
import java.io.*;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(4999);
        while(true) {
            Socket s = ss.accept();
            System.out.println("client connected");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(ss.accept().getOutputStream());
            BufferedWriter bw = new BufferedWriter(outputStreamWriter);
            bw.write("Ping");
            bw.newLine();
            bw.flush();
        }

    }
}

