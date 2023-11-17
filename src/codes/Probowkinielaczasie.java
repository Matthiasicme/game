package codes;

import javax.swing.*;

public class Probowkinielaczasie extends JFrame {

    Probowkinielaczasie(){
        String[] oki = {"Ok! :("};
        ImageIcon sad = new ImageIcon("src/resources/sad.png");
        JOptionPane.showOptionDialog(null,"The test tubes do not connect. :(", "ERROR",
                JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, sad,oki,0);
    }
}
