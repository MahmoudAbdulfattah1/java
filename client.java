package com.company;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class client {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        DataOutputStream out = null;
        DataInputStream in = null;
        InputStreamReader inputStreamReader = null;
        OutputStreamWriter outputStreamWriter = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            Socket s = new Socket("localhost", 9999);
            inputStreamReader = new InputStreamReader(s.getInputStream());
            outputStreamWriter = new OutputStreamWriter((s.getOutputStream()));
            bufferedReader = new BufferedReader(inputStreamReader);
            bufferedWriter = new BufferedWriter(outputStreamWriter);

            while (true) {
                String str = inp.nextLine();
                bufferedWriter.write(str);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
