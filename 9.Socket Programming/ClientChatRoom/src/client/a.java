/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Dilini Danushika
 */
public class a {
        public static void main(String args[]){
                try{
                        ServerSocket sk1=new ServerSocket(5050);        
                        Socket s1= sk1.accept();
                        System.out.println(s1.getLocalAddress());
                }catch(IOException e){
                }
        }
}
}
