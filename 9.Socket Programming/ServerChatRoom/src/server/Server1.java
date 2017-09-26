/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dilini Danushika
 */
public class Server1 {
    public static void main(String[] args) {
        try {
            ServerSocket sk=new ServerSocket(5050);
            while (true) {                
                Socket socket=sk.accept();
                ServerChatRoom scr=new ServerChatRoom(socket);
                scr.setVisible(true);
            }
            
        } catch (IOException ex) {
            Logger.getLogger(Server1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
