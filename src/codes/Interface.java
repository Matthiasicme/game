package codes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * Klasa Menu odpowiada za JFrame wyświetlany na początku włączenia gry, za menu gry.
 *
 * Znajdują się w niej przyciski:
 * graj- odpowiedzialny za przejście do następnego okienka, gry
 * zamknij- odpowiedzialny za zamykanie panelu info o autorze
 * IoA- odpowiedzialny za uruchomienie panelu info o autorze
 * poradybutton- odpowiedzialny za uruchomienie panelu porady
 * poradyzamknij- odpowiedzialny za zamknięcie panelu porady
 * wyjdż- odpowiedzialny za zakończenie gry i zamknięcie menu
 *
 * Znajdują się w niej labele odpowiedzialne za:
 * infooautorzelabel- tekst w panelu infooautorze
 * poradylabel- tekst w panelu porady
 *
 * Oraz znajdują się w niej dwa panele:
 * infooautorze- panel z labelem infooautorzelabel i przyciskiem zamknij
 * poradypanel- panel z labelem poradylabel i przyciskiem poradyzamknij
 *
 * Klasa Menu zawiera konstruktor Menu oraz param e odpowiedzialny za akcje
 */

public class Interface extends JFrame implements ActionListener {
    JButton playbio;
    JButton playchem;
    JButton close;

    /**
     *
     * W konstruktorze Menu zapisany został nowy label odpowiedzialny za tło, parametry i właściwości paneli,
     * przycisków i labeli z klasy Menu. zapisałem w nim również parametry tego frame-u i dodałem do niego
     * wszystkie panele, labele i przyciski oraz logo znajdujące się na samym dole.
     *
     */
    public Interface() {
        ImageIcon background = new ImageIcon("src/resources/maininterface.png");
        JLabel label = new JLabel();
        label.setIcon(background);


        playbio = new JButton();
        playbio.setBounds(200,420,210,60);
        playbio.setOpaque(false);
        playbio.setContentAreaFilled(false);
        playbio.setBorderPainted(false);
        playbio.addActionListener(this);

        playchem = new JButton();
        playchem.setBounds(850,420,210,60);
        playchem.setOpaque(false);
        playchem.setContentAreaFilled(false);
        playchem.setBorderPainted(false);
        playchem.addActionListener(this);


        close = new JButton();
        close.setBounds(530,930,210,60);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        close.addActionListener(this);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Secret Lab");
        this.setSize(1280, 1024);
        this.setVisible(true);
        this.add(close);
        this.add(playbio);
        this.add(playchem);
        this.add(label);

        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());
    }

    /**
     * W param e zapisane zostały wszystkie akcje, za które odpowiedzialne są naciskane przyciski w JFrame.
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==playbio){
            this.dispose();
            Menubiol Menubiol = new Menubiol();
        }
        if(e.getSource()==playchem){
            this.dispose();
            Menu Menu = new Menu();
        }
        if (e.getSource()==close){
            this.dispose();
        }
    }
}


