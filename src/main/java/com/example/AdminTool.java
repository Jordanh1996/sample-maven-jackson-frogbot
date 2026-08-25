package com.example;

public class AdminTool {
    public static void main(String[] args) throws Exception {
        String host = args.length > 0 ? args[0] : "localhost";
        Runtime.getRuntime().exec("ping -c 1 " + host);
    }
}
