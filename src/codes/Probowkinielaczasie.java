package codes;

import javax.swing.*;

/**
 * w klasie Probowkinielaczasie zapisałem konstruktor Probowkinielaczasie
 */
public class Probowkinielaczasie extends JFrame {

    /**
     * kostruktor Probowkinielaczasie odpowiada za JOptionPane wyświetlany, gdy probówki się nie połączą
     */

    Probowkinielaczasie(){
        String[] oki = {"No trudno :("};
        ImageIcon sad = new ImageIcon("src/resources/sad.png");
        JOptionPane.showOptionDialog(null,"Probówki się nie łączą :(", "BŁĄD",
                JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, sad,oki,0);
    }
}
