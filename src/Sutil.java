
import java.awt.Component;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Sutil {
 
        public static void msg(Component parentComponent,String message) {
        JOptionPane.showMessageDialog(parentComponent,
                message,
                "App Information",
                1); // 1 = information icon
    }
        public static int msq(Component parentComponent,String message){
            int respon=JOptionPane.showOptionDialog(parentComponent, message, 
                    "App Info", JOptionPane.YES_NO_OPTION, 3 ,null, null, null);
            return respon;
        }
        public static String mss(Component parentComponent,String message){
            String text=JOptionPane.showInputDialog(parentComponent, message, "Player Name", 1);
            return text;
        }
}
