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

public class Menu extends JFrame implements ActionListener {
JButton play;
JButton goBack;
JButton htpButton;
JButton htpGoBack;

JLabel htpLabel;

JPanel htpPanel;


    /**
     *
     * W konstruktorze Menu zapisany został nowy label odpowiedzialny za tło, parametry i właściwości paneli,
     * przycisków i labeli z klasy Menu. zapisałem w nim również parametry tego frame-u i dodałem do niego
     * wszystkie panele, labele i przyciski oraz logo znajdujące się na samym dole.
     *
     * @param
     */
    public Menu() {
        ImageIcon background = new ImageIcon("src/resources/INTERFACE.png");
        JLabel label = new JLabel();
        label.setIcon(background);
        
        htpPanel = new JPanel();
        htpPanel.setVisible(false);
        htpPanel.setOpaque(true);
        htpPanel.setBackground(Color.cyan);
        htpPanel.setBounds(190,300,900,400);
        htpPanel.setLayout(new BorderLayout());

        play = new JButton();
        play.setBounds(770,590,280,77);
        play.setOpaque(false);
        play.setContentAreaFilled(false);
        play.setBorderPainted(false);
        play.addActionListener(this);

        htpButton = new JButton();
        htpButton.setBounds(180,720,290,145);
        htpButton.setOpaque(false);
        htpButton.setContentAreaFilled(false);
        htpButton.setBorderPainted(false);
        htpButton.addActionListener(this);

        ImageIcon porzam = new ImageIcon("src/resources/porzam.png");
        htpLabel = new JLabel();
        htpLabel.setText("<html>Oto kilka cennych wskazówek jak grać w SecretLab!<br/>1) prawie wszystko można " +
                "łączyć z wodą<br/>2) wode włączysz klikając baniak<br/>3) kwasy " +
                "i zasady dają sole<br/>4) przycisk cofania probówek jest na ladzie<br/>5) mieszaj ostrożnie, nie " +
                "można przekraczyć 3 probówek jednocześnie, ani nie można wziąć 2 probówek z jednego rzędu," +
                " zapewnione w celach bezpieczeństwa :D<br/>Są 42 poprawne kombinacje, a Ty? Znajdziesz je wszystkie? <html>");
        htpLabel.setForeground(Color.BLACK);
        htpLabel.setFont(new Font("Arial",Font.PLAIN,35));
        htpLabel.setVerticalAlignment(JLabel.CENTER);
        htpLabel.setHorizontalAlignment(JLabel.CENTER);

        goBack = new JButton();
        goBack.setBounds(215,940,210,58);
        goBack.setOpaque(false);
        goBack.setContentAreaFilled(false);
        goBack.setBorderPainted(false);
        goBack.addActionListener(this);

        htpGoBack = new JButton();
        htpGoBack.setBounds(840,10,50,50);
        htpGoBack.setIcon(porzam);
        htpGoBack.setBorderPainted(false);
        htpGoBack.addActionListener(this);
      
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Secret Lab");
        this.setSize(1280, 1024);
        this.setVisible(true);
        this.add(goBack);
        this.add(play);
        this.add(htpButton);
        this.add(htpPanel);
        htpPanel.add(htpGoBack);
        htpPanel.add(htpLabel);
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
        if(e.getSource()==play){
            this.dispose();
            Game Game = new Game();
        }
        if(e.getSource()==goBack){
            this.dispose();
            Interface Interface = new Interface();
        }
        if (e.getSource()==htpButton){
            htpPanel.setVisible(true);
        }
        if (e.getSource()==htpGoBack){
            htpPanel.setVisible(false);
        }
    }
}


