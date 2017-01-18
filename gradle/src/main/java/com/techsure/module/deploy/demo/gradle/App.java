package com.techsure.module.deploy.demo.gradle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException{
    	System.out.println("Hello world!");
        System.out.println( "Press any key to continue..." );
        new BufferedReader(new InputStreamReader(System.in)).readLine();
        System.exit(0);
    }
}
