package com.corrsolutions.quest.geodata;


import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {

    public static void main(String[] args){

        for (int i = 1; i < 2000; i++ ){
            try {
                Socket s = new Socket("localhost", i);
                System.out.println("An Application is running on port number " + i );
            }catch (UnknownHostException ex) {
                System.out.println("Break ");
                break;
            }catch (IOException ex) {
                System.out.println(ex.getLocalizedMessage() );
            }
        }
        System.out.println("Loop finished!");
    }
}
