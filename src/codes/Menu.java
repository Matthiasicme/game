package codes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {
JButton play;
JButton goBack;
JButton htpButton;
JButton htpGoBack;

JLabel htpLabel;

JPanel htpPanel;
String pass;

    public Menu(String pass) {
        this.pass = pass;
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
        htpLabel.setText("<html>\n" +
                "    Here are some valuable tips on how to play SecretLab!<br/>\n" +
                "    1) Almost everything can be combined with water<br/>\n" +
                "    2) You can turn on the water by clicking on the barrel<br/>\n" +
                "    3) Acids and bases yield salts<br/>\n" +
                "    4) The test tube undo button is on the counter<br/>\n" +
                "    5) Mix carefully; you cannot exceed 3 test tubes at once, nor can you take 2 test tubes from the same row, \n" +
                "    ensured for safety purposes :D<br/>\n" +
                "    There are 42 correct combinations, and you? Will you find them all?\n" +
                "</html>\n");
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==play){
            this.dispose();
            Game Game = new Game(pass);
        }
        if(e.getSource()==goBack){
            this.dispose();
            Interface Interface = new Interface(true, pass);
        }
        if (e.getSource()==htpButton){
            htpPanel.setVisible(true);
        }
        if (e.getSource()==htpGoBack){
            htpPanel.setVisible(false);
        }
    }
}


