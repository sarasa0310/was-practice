package org.example;

import java.io.IOException;

// GET: /calculate?operand1={number}&operator={operator}&operand2={number}
public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWapApplicationServer(8080).start();
    }
}