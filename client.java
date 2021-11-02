package com.company;
import java.net.*;
import java.io.*;

public class client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("localhost",4999);
        InputStreamReader ip=new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(ip);
        System.out.println(bf.readLine());

    }
}
