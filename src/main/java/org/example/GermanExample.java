package org.example;

import okhttp3.OkHttpClient;


public class GermanExample {



    public static void main(String[] args) {

        OkHttpClient client = new OkHttpClient();

        System.out.println("Hello world!");
    }

    public static String printingSomething(){
     return   "Hola German desde Gradle!! TEst";
    }
}