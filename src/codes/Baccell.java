package codes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Baccell extends JFrame implements ActionListener {

    JPanel fimbriaePanel;
    JLabel fimbriaeLabel;
    JButton fimbriaeButton;
    JPanel fimbriaePanelDescription;
    JLabel fimbriaeLabelDescription;
    JButton fimbriaePanelClose;
    JLabel fimbriaeLabelGreen;

    JButton goBack;

    public Baccell() {
        ImageIcon background = new ImageIcon("src/resources/BACCELL.png");
        JLabel label = new JLabel();
        label.setIcon(background);

        Border border = BorderFactory.createLineBorder(Color.green, 5);
        fimbriaePanel = new JPanel();
        fimbriaePanel.setVisible(true);
        fimbriaePanel.setBounds(1000,190,200,40);
        fimbriaePanel.setLayout(new BorderLayout());
        fimbriaePanel.setBackground(new Color(0x6af6be));
        fimbriaePanel.setBorder(border);

        fimbriaeLabel = new JLabel();
        fimbriaeLabel.setBounds(0, 0, 200, 100);
        fimbriaeLabel.setVisible(true);
        fimbriaeLabel.setText("fimbriae");
        fimbriaeLabel.setFont(new Font("Arial",Font.PLAIN,25));

        fimbriaeLabelGreen = new JLabel();
        fimbriaeLabelGreen.setBounds(0, 0, 200, 100);
        fimbriaeLabelGreen.setVisible(false);
        fimbriaeLabelGreen.setOpaque(false);
        fimbriaeLabelGreen.setText("fimbriae");
        fimbriaeLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        fimbriaeLabelGreen.setForeground(Color.green);
        fimbriaeLabelGreen.setBackground(new Color(0x6af6be));

        fimbriaeButton = new JButton();
        fimbriaeButton.setBounds(1000,190,200,40);
        fimbriaeButton.setOpaque(false);
        fimbriaeButton.setContentAreaFilled(false);
        fimbriaeButton.setBorderPainted(true);
        fimbriaeButton.addActionListener(this);

        fimbriaePanelDescription = new JPanel();
        fimbriaePanelDescription.setVisible(false);
        fimbriaePanelDescription.setOpaque(true);
        fimbriaePanelDescription.setBounds(300,190,700,400);
        fimbriaePanelDescription.setLayout(new BorderLayout());
        fimbriaePanelDescription.setBackground(Color.cyan);
        fimbriaePanelDescription.setBorder(border);

        fimbriaeLabelDescription = new JLabel();
        fimbriaeLabelDescription.setVerticalAlignment(JLabel.CENTER);
        fimbriaeLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        fimbriaeLabelDescription.setVisible(true);
        fimbriaeLabelDescription.setText("lorem ipsum");
        fimbriaeLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        ImageIcon porzam = new ImageIcon("src/resources/porzam.png");
        fimbriaePanelClose = new JButton();
        fimbriaePanelClose.setBounds(650,0,50,50);
        fimbriaePanelClose.setIcon(porzam);
        fimbriaePanelClose.setBorderPainted(true);
        fimbriaePanelClose.addActionListener(this);

        goBack = new JButton();
        goBack.setBounds(1060,900,120,40);
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

        this.add(fimbriaePanel);
        fimbriaePanel.add(fimbriaeLabel);
        this.add(fimbriaeButton);
        this.add(fimbriaePanelDescription);
        fimbriaePanelDescription.add(fimbriaePanelClose);
        fimbriaePanelDescription.add(fimbriaeLabelDescription);


        this.add(label);

        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==goBack){
            this.dispose();
            Menubiol Menubiol = new Menubiol();
        }
        if(e.getSource()==fimbriaeButton){
            fimbriaePanelDescription.setVisible(true);
        }
        if(e.getSource()==fimbriaePanelClose){
            fimbriaePanelDescription.setVisible(false);
            fimbriaeLabel.setVisible(false);
            fimbriaeLabelGreen.setVisible(true);
            fimbriaeLabelGreen.setOpaque(true);
            fimbriaePanel.add(fimbriaeLabelGreen);
        }
    }
}


