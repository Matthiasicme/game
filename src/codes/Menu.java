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

public class Menu extends JFrame implements ActionListener {
JButton Graj;
JButton zamknij;
JButton IoA;
JButton poradybutton;
JButton poradyzamknij;
JButton wyjdz;

JLabel infooautorzelabel;
JLabel poradylabel;

JPanel infooautorze;
JPanel poradypanel;

    /**
     *
     * W konstruktorze Menu zapisany został nowy label odpowiedzialny za tło, parametry i właściwości paneli,
     * przycisków i labeli z klasy Menu. zapisałem w nim również parametry tego frame-u i dodałem do niego
     * wszystkie panele, labele i przyciski oraz logo znajdujące się na samym dole.
     *
     */
    public Menu() {
        ImageIcon background = new ImageIcon("src/resources/INTERFACE.png");
        JLabel label = new JLabel();
        label.setIcon(background);

        infooautorze = new JPanel();
        infooautorze.setVisible(false);
        infooautorze.setOpaque(true);
        infooautorze.setBackground(new Color(255, 150, 180));
        infooautorze.setBounds(190,300,900,400);
        infooautorze.setLayout(new BorderLayout());
        
        poradypanel = new JPanel();
        poradypanel.setVisible(false);
        poradypanel.setOpaque(true);
        poradypanel.setBackground(Color.cyan);
        poradypanel.setBounds(190,300,900,400);
        poradypanel.setLayout(new BorderLayout());

        Graj = new JButton();
        Graj.setBounds(750,577,320,77);
        Graj.setOpaque(false);
        Graj.setContentAreaFilled(false);
        Graj.setBorderPainted(false);
        Graj.addActionListener(this);

        IoA = new JButton();
        IoA.setBounds(165,617,300,88);
        IoA.setOpaque(false);
        IoA.setContentAreaFilled(false);
        IoA.setBorderPainted(false);
        IoA.addActionListener(this);

        poradybutton = new JButton();
        poradybutton.setBounds(158,800,315,58);
        poradybutton.setOpaque(false);
        poradybutton.setContentAreaFilled(false);
        poradybutton.setBorderPainted(false);
        poradybutton.addActionListener(this);

        ImageIcon zam = new ImageIcon("src/resources/zam.png");
        infooautorzelabel = new JLabel();
        infooautorzelabel.setText("<html>Cześć przyjacielu, mam na imię Matthias Nawrocki.<br/>Tematem projektu jest " +
                "gra komputerowa „Secret lab”, która jest grą typu serious. Oznacza to, że " +
                "poza rozrywką dostarczać będzie ona wiedzę w zakresie chemii.<br/>Jestem studentem IBM oraz" +
                " Software Development.<br/>Mam obecnie 22 lata.<br/>Mój ulubiony smak lodów to waniliowe." +
                "<br/>Lubię soki owocowe, nie lubię ich robić.<br/>Życzę udanej gry :)<html>");
        infooautorzelabel.setForeground(Color.BLACK);
        infooautorzelabel.setFont(new Font("Arial",Font.PLAIN,35));
        infooautorzelabel.setVerticalAlignment(JLabel.CENTER);
        infooautorzelabel.setHorizontalAlignment(JLabel.CENTER);

        ImageIcon porzam = new ImageIcon("src/resources/porzam.png");
        poradylabel = new JLabel();
        poradylabel.setText("<html>Oto kilka cennych wskazówek jak grać w SecretLab!<br/>1) prawie wszystko można " +
                "łączyć z wodą<br/>2) wode włączysz klikając baniak<br/>3) kwasy " +
                "i zasady dają sole<br/>4) przycisk cofania probówek jest na ladzie<br/>5) mieszaj ostrożnie, nie " +
                "można przekraczyć 3 probówek jednocześnie, ani nie można wziąć 2 probówek z jednego rzędu," +
                " zapewnione w celach bezpieczeństwa :D<br/>Są 42 poprawne kombinacje, a Ty? Znajdziesz je wszystkie? <html>");
        poradylabel.setForeground(Color.BLACK);
        poradylabel.setFont(new Font("Arial",Font.PLAIN,35));
        poradylabel.setVerticalAlignment(JLabel.CENTER);
        poradylabel.setHorizontalAlignment(JLabel.CENTER);

        zamknij = new JButton();
        zamknij.setBounds(840,10,50,50);
        zamknij.setIcon(zam);
        zamknij.setBorderPainted(false);
        zamknij.addActionListener(this);

        poradyzamknij = new JButton();
        poradyzamknij.setBounds(840,10,50,50);
        poradyzamknij.setIcon(porzam);
        poradyzamknij.setBorderPainted(false);
        poradyzamknij.addActionListener(this);

        wyjdz = new JButton();
        wyjdz.setBounds(220,940,200,50);
        wyjdz.setOpaque(false);
        wyjdz.setContentAreaFilled(false);
        wyjdz.setBorderPainted(false);
        wyjdz.addActionListener(this);
      
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Secret Lab");
        this.setSize(1280, 1024);
        this.setVisible(true);
        this.add(wyjdz);
        this.add(Graj);
        this.add(IoA);
        this.add(poradybutton);
        this.add(poradypanel);
        poradypanel.add(poradyzamknij);
        poradypanel.add(poradylabel);
        this.add(infooautorze);
        infooautorze.add(zamknij);
        infooautorze.add(infooautorzelabel);
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
        if(e.getSource()==Graj){
            this.dispose();
            Game gameinterface = new Game();


        }
        if (e.getSource()==IoA){
            infooautorze.setVisible(true);
        }
        if (e.getSource()==poradybutton){
            poradypanel.setVisible(true);
        }
        if (e.getSource()==zamknij){
            infooautorze.setVisible(false);
        }
        if (e.getSource()==poradyzamknij){
            poradypanel.setVisible(false);
        }
        if (e.getSource()==wyjdz){
            this.dispose();
        }
    }
}


