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
 * play- odpowiedzialny za przejście do następnego okienka, gry
 * goBack- odpowiedzialny za zamykanie panelu info o autorze
 * htp- odpowiedzialny za uruchomienie panelu info o autorze
 * htpButton- odpowiedzialny za uruchomienie panelu porady
 * htpGoBack- odpowiedzialny za zamknięcie panelu porady
 * wyjdż- odpowiedzialny za zakończenie gry i zamknięcie menu
 *
 * Znajdują się w niej labele odpowiedzialne za:
 * infooautorzelabel- tekst w panelu infooautorze
 * htpLabel- tekst w panelu porady
 *
 * Oraz znajdują się w niej dwa panele:
 * infooautorze- panel z labelem infooautorzelabel i przyciskiem goBack
 * htpPanel- panel z labelem htpLabel i przyciskiem htpGoBack
 *
 * Klasa Menu zawiera konstruktor Menu oraz param e odpowiedzialny za akcje
 */

public class Menubiol extends JFrame implements ActionListener {
    JButton funcell;
    JButton baccell;
    JButton placell;
    JButton anicell;
    JButton goBack;


    /**
     *
     * W konstruktorze Menu zapisany został nowy label odpowiedzialny za tło, parametry i właściwości paneli,
     * przycisków i labeli z klasy Menu. zapisałem w nim również parametry tego frame-u i dodałem do niego
     * wszystkie panele, labele i przyciski oraz logo znajdujące się na samym dole.
     *
     * @param
     */
    public Menubiol() {
        ImageIcon background = new ImageIcon("src/resources/BIOINTERFACE.png");
        JLabel label = new JLabel();
        label.setIcon(background);

        baccell = new JButton();
        baccell.setBounds(120,140,350,390);
        baccell.setOpaque(false);
        baccell.setContentAreaFilled(false);
        baccell.setBorderPainted(false);
        baccell.addActionListener(this);

        funcell = new JButton();
        funcell.setBounds(790,135,390,400);
        funcell.setOpaque(false);
        funcell.setContentAreaFilled(false);
        funcell.setBorderPainted(false);
        funcell.addActionListener(this);

        placell = new JButton();
        placell.setBounds(120,550,350,400);
        placell.setOpaque(false);
        placell.setContentAreaFilled(false);
        placell.setBorderPainted(false);
        placell.addActionListener(this);

        anicell = new JButton();
        anicell.setBounds(790,550,390,400);
        anicell.setOpaque(false);
        anicell.setContentAreaFilled(false);
        anicell.setBorderPainted(false);
        anicell.addActionListener(this);

        goBack = new JButton();
        goBack.setBounds(570,940,120,58);
        goBack.setOpaque(false);
        goBack.setContentAreaFilled(false);
        goBack.setBorderPainted(false);
        goBack.addActionListener(this);


        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Secret Lab");
        this.setSize(1280, 1024);
        this.setVisible(true);
        this.add(goBack);
        this.add(baccell);
        this.add(funcell);
        this.add(placell);
        this.add(anicell);
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
        if(e.getSource()==baccell){
            this.dispose();
            Baccell Baccell = new Baccell();
        }
        if(e.getSource()==funcell){
            this.dispose();
            Funcell Funcell = new Funcell();
        }
        if(e.getSource()==placell){
            this.dispose();
            Placell Placell = new Placell();
        }
        if(e.getSource()==anicell){
            this.dispose();
            Anicell Anicell = new Anicell();
        }
        if(e.getSource()==goBack){
            this.dispose();
            Interface Interface = new Interface();
        }

    }
}


