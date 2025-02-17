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
    JButton fimbriae1;
    JButton fimbriae2;

    JPanel nucleoidPanel;
    JLabel nucleoidLabel;
    JButton nucleoidButton;
    JPanel nucleoidPanelDescription;
    JLabel nucleoidLabelDescription;
    JButton nucleoidPanelClose;
    JLabel nucleoidLabelGreen;
    JButton nucleoid1;
    
    JPanel ribosomesPanel;
    JLabel ribosomesLabel;
    JButton ribosomesButton;
    JPanel ribosomesPanelDescription;
    JLabel ribosomesLabelDescription;
    JButton ribosomesPanelClose;
    JLabel ribosomesLabelGreen;
    JButton ribosomes1;
    JButton ribosomes2;
    JButton ribosomes3;
    JButton ribosomes4;
    JButton ribosomes5;
    JButton ribosomes6;
    JButton ribosomes7;
    JButton ribosomes8;
    JButton ribosomes9;
    JButton ribosomes10;
    JButton ribosomes11;
    JButton ribosomes12;

    JPanel plasmaMembranePanel;
    JLabel plasmaMembraneLabel;
    JButton plasmaMembraneButton;
    JPanel plasmaMembranePanelDescription;
    JLabel plasmaMembraneLabelDescription;
    JButton plasmaMembranePanelClose;
    JLabel plasmaMembraneLabelGreen;    
    
    JPanel cellWallPanel;
    JLabel cellWallLabel;
    JButton cellWallButton;
    JPanel cellWallPanelDescription;
    JLabel cellWallLabelDescription;
    JButton cellWallPanelClose;
    JLabel cellWallLabelGreen;   
    
    JPanel plasmidPanel;
    JLabel plasmidLabel;
    JButton plasmidButton;
    JPanel plasmidPanelDescription;
    JLabel plasmidLabelDescription;
    JButton plasmidPanelClose;
    JLabel plasmidLabelGreen;
    JButton plasmid1;
    
    JPanel cellulosePanel;
    JLabel celluloseLabel;
    JButton celluloseButton;
    JPanel cellulosePanelDescription;
    JLabel celluloseLabelDescription;
    JButton cellulosePanelClose;
    JLabel celluloseLabelGreen;
    
    JPanel capsulePanel;
    JLabel capsuleLabel;
    JButton capsuleButton;
    JPanel capsulePanelDescription;
    JLabel capsuleLabelDescription;
    JButton capsulePanelClose;
    JLabel capsuleLabelGreen;
    JButton capsule1;
    JButton capsule2;
    JButton capsule3;
    JButton capsule4;
    JButton capsule5;

    JPanel flagellaPanel;
    JLabel flagellaLabel;
    JButton flagellaButton;
    JPanel flagellaPanelDescription;
    JLabel flagellaLabelDescription;
    JButton flagellaPanelClose;
    JLabel flagellaLabelGreen;
    JButton flagella1;
    JButton flagella2;
    JButton flagella3;
    JButton flagella4;
    JButton flagella5;

    JButton goBack;
    String pass2;
    JProgressBar progressBar = new JProgressBar();
    int i=0;

    public Baccell(String pass2) {
        this.pass2 = pass2;
        ImageIcon background = new ImageIcon("src/resources/BACCELL.png");
        JLabel label = new JLabel();
        label.setIcon(background);

        Border border = BorderFactory.createLineBorder(Color.BLUE, 1);

        progressBar.setValue(0);
        progressBar.setBounds(390,120,500,50);
        progressBar.setStringPainted(true);
        progressBar.setBorderPainted(true);
        progressBar.setBorder(border);
        progressBar.setForeground(Color.green);
        progressBar.setBackground(Color.RED);

        fimbriaePanel = new JPanel();
        fimbriaePanel.setVisible(true);
        fimbriaePanel.setBounds(930,190,280,40);
        fimbriaePanel.setLayout(new BorderLayout());
        fimbriaePanel.setBackground(new Color(0x6af6be));

        fimbriaeLabel = new JLabel();
        fimbriaeLabel.setBounds(0, 0, 200, 100);
        fimbriaeLabel.setVisible(true);
        fimbriaeLabel.setText("Fimbriae");
        fimbriaeLabel.setFont(new Font("Arial",Font.PLAIN,25));

        fimbriaeLabelGreen = new JLabel();
        fimbriaeLabelGreen.setBounds(0, 0, 200, 100);
        fimbriaeLabelGreen.setVisible(false);
        fimbriaeLabelGreen.setOpaque(false);
        fimbriaeLabelGreen.setText("Fimbriae");
        fimbriaeLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        fimbriaeLabelGreen.setForeground(new Color(0x1F7A1F));
        fimbriaeLabelGreen.setBackground(new Color(0x6af6be));

        fimbriaeButton = new JButton();
        fimbriaeButton.setBounds(930,190,280,40);
        fimbriaeButton.setOpaque(false);
        fimbriaeButton.setContentAreaFilled(false);
        fimbriaeButton.setBorderPainted(true);
        fimbriaeButton.addActionListener(this);

        fimbriaePanelDescription = new JPanel();
        fimbriaePanelDescription.setVisible(false);
        fimbriaePanelDescription.setOpaque(true);
        fimbriaePanelDescription.setBounds(230,190,700,250);
        fimbriaePanelDescription.setLayout(new BorderLayout());
        fimbriaePanelDescription.setBackground(Color.cyan);

        fimbriaeLabelDescription = new JLabel();
        fimbriaeLabelDescription.setVerticalAlignment(JLabel.CENTER);
        fimbriaeLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        fimbriaeLabelDescription.setVisible(true);
        fimbriaeLabelDescription.setText(
                "<html>Fimbriae are long filamentous polymeric protein <br/>" +
                "structures located at the surface of bacterial cells. <br/>" +
                "They enable the bacteria to bind to specific receptor <br/>" +
                "structures and thereby to colonise specific surfaces.<html>");
        fimbriaeLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        ImageIcon porzam = new ImageIcon("src/resources/porzam.png");
        fimbriaePanelClose = new JButton();
        fimbriaePanelClose.setBounds(650,0,50,50);
        fimbriaePanelClose.setIcon(porzam);
        fimbriaePanelClose.setBorderPainted(false);
        fimbriaePanelClose.addActionListener(this);

        fimbriae1 = new JButton();
        fimbriae1.setBounds(285,410,50,55);
        fimbriae1.setOpaque(false);
        fimbriae1.setContentAreaFilled(false);
        fimbriae1.setBorderPainted(false);
        fimbriae1.addActionListener(this);
        fimbriae1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        fimbriae2 = new JButton();
        fimbriae2.setBounds(150,420,110,250);
        fimbriae2.setOpaque(false);
        fimbriae2.setContentAreaFilled(false);
        fimbriae2.setBorderPainted(false);
        fimbriae2.addActionListener(this);
        fimbriae2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        nucleoidPanel = new JPanel();
        nucleoidPanel.setVisible(true);
        nucleoidPanel.setBounds(930,230,280,40);
        nucleoidPanel.setLayout(new BorderLayout());
        nucleoidPanel.setBackground(new Color(0x6af6be));

        nucleoidLabel = new JLabel();
        nucleoidLabel.setBounds(0, 0, 200, 100);
        nucleoidLabel.setVisible(true);
        nucleoidLabel.setText("Nucleoid");
        nucleoidLabel.setFont(new Font("Arial",Font.PLAIN,25));

        nucleoidLabelGreen = new JLabel();
        nucleoidLabelGreen.setBounds(0, 0, 200, 100);
        nucleoidLabelGreen.setVisible(false);
        nucleoidLabelGreen.setOpaque(false);
        nucleoidLabelGreen.setText("Nucleoid");
        nucleoidLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        nucleoidLabelGreen.setForeground(new Color(0x1F7A1F));
        nucleoidLabelGreen.setBackground(new Color(0x6af6be));

        nucleoidButton = new JButton();
        nucleoidButton.setBounds(930,230,280,40);
        nucleoidButton.setOpaque(false);
        nucleoidButton.setContentAreaFilled(false);
        nucleoidButton.setBorderPainted(true);
        nucleoidButton.addActionListener(this);

        nucleoidPanelDescription = new JPanel();
        nucleoidPanelDescription.setVisible(false);
        nucleoidPanelDescription.setOpaque(true);
        nucleoidPanelDescription.setBounds(230,190,700,250);
        nucleoidPanelDescription.setLayout(new BorderLayout());
        nucleoidPanelDescription.setBackground(Color.cyan);

        nucleoidLabelDescription = new JLabel();
        nucleoidLabelDescription.setVerticalAlignment(JLabel.CENTER);
        nucleoidLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        nucleoidLabelDescription.setVisible(true);
        nucleoidLabelDescription.setText(
                "<html>The nucleoid is essential for controlling the activity " +
                        "and reproduction of the prokaryotic cell. In this place " +
                        "transcription and replication of DNA take place. Nucleoid " +
                        "binding proteins are abundant and have a lower molecular mass.<html>");
        nucleoidLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));
        
        nucleoidPanelClose = new JButton();
        nucleoidPanelClose.setBounds(650,0,50,50);
        nucleoidPanelClose.setIcon(porzam);
        nucleoidPanelClose.setBorderPainted(false);
        nucleoidPanelClose.addActionListener(this);

        nucleoid1 = new JButton();
        nucleoid1.setBounds(450,500,270,110);
        nucleoid1.setOpaque(false);
        nucleoid1.setContentAreaFilled(false);
        nucleoid1.setBorderPainted(false);
        nucleoid1.addActionListener(this);
        nucleoid1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomesPanel = new JPanel();
        ribosomesPanel.setVisible(true);
        ribosomesPanel.setBounds(930,270,280,40);
        ribosomesPanel.setLayout(new BorderLayout());
        ribosomesPanel.setBackground(new Color(0x6af6be));

        ribosomesLabel = new JLabel();
        ribosomesLabel.setBounds(0, 0, 200, 100);
        ribosomesLabel.setVisible(true);
        ribosomesLabel.setText("Ribosomes");
        ribosomesLabel.setFont(new Font("Arial",Font.PLAIN,25));

        ribosomesLabelGreen = new JLabel();
        ribosomesLabelGreen.setBounds(0, 0, 200, 100);
        ribosomesLabelGreen.setVisible(false);
        ribosomesLabelGreen.setOpaque(false);
        ribosomesLabelGreen.setText("Ribosomes");
        ribosomesLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        ribosomesLabelGreen.setForeground(new Color(0x1F7A1F));
        ribosomesLabelGreen.setBackground(new Color(0x6af6be));

        ribosomesButton = new JButton();
        ribosomesButton.setBounds(930,270,280,40);
        ribosomesButton.setOpaque(false);
        ribosomesButton.setContentAreaFilled(false);
        ribosomesButton.setBorderPainted(true);
        ribosomesButton.addActionListener(this);

        ribosomesPanelDescription = new JPanel();
        ribosomesPanelDescription.setVisible(false);
        ribosomesPanelDescription.setOpaque(true);
        ribosomesPanelDescription.setBounds(230,190,700,250);
        ribosomesPanelDescription.setLayout(new BorderLayout());
        ribosomesPanelDescription.setBackground(Color.cyan);

        ribosomesLabelDescription = new JLabel();
        ribosomesLabelDescription.setVerticalAlignment(JLabel.CENTER);
        ribosomesLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        ribosomesLabelDescription.setVisible(true);
        ribosomesLabelDescription.setText(
                "<html>Bacterial ribosomes are composed of two " +
                "subunits with densities of 50S and 30S, as opposed to " +
                "60S and 40S in eukaryotic cells. Ribosomes function as a " +
                "workbench for protein synthesis whereby they receive and translate " +
                "genetic instructions for the formation of specific proteins.<html>");
        ribosomesLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));
        
        ribosomesPanelClose = new JButton();
        ribosomesPanelClose.setBounds(650,0,50,50);
        ribosomesPanelClose.setIcon(porzam);
        ribosomesPanelClose.setBorderPainted(false);
        ribosomesPanelClose.addActionListener(this);

        ribosomes1 = new JButton();
        ribosomes1.setBounds(350,460,30,30);
        ribosomes1.setOpaque(false);
        ribosomes1.setContentAreaFilled(false);
        ribosomes1.setBorderPainted(false);
        ribosomes1.addActionListener(this);
        ribosomes1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes2 = new JButton();
        ribosomes2.setBounds(320,570,30,30);
        ribosomes2.setOpaque(false);
        ribosomes2.setContentAreaFilled(false);
        ribosomes2.setBorderPainted(false);
        ribosomes2.addActionListener(this);
        ribosomes2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes3 = new JButton();
        ribosomes3.setBounds(390,629,30,30);
        ribosomes3.setOpaque(false);
        ribosomes3.setContentAreaFilled(false);
        ribosomes3.setBorderPainted(false);
        ribosomes3.addActionListener(this);
        ribosomes3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes4 = new JButton();
        ribosomes4.setBounds(430,500,20,30);
        ribosomes4.setOpaque(false);
        ribosomes4.setContentAreaFilled(false);
        ribosomes4.setBorderPainted(false);
        ribosomes4.addActionListener(this);
        ribosomes4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes5 = new JButton();
        ribosomes5.setBounds(520,610,30,30);
        ribosomes5.setOpaque(false);
        ribosomes5.setContentAreaFilled(false);
        ribosomes5.setBorderPainted(false);
        ribosomes5.addActionListener(this);
        ribosomes5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes6 = new JButton();
        ribosomes6.setBounds(580,620,30,30);
        ribosomes6.setOpaque(false);
        ribosomes6.setContentAreaFilled(false);
        ribosomes6.setBorderPainted(false);
        ribosomes6.addActionListener(this);
        ribosomes6.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes7 = new JButton();
        ribosomes7.setBounds(580,460,30,30);
        ribosomes7.setOpaque(false);
        ribosomes7.setContentAreaFilled(false);
        ribosomes7.setBorderPainted(false);
        ribosomes7.addActionListener(this);
        ribosomes7.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes8 = new JButton();
        ribosomes8.setBounds(640,650,30,30);
        ribosomes8.setOpaque(false);
        ribosomes8.setContentAreaFilled(false);
        ribosomes8.setBorderPainted(false);
        ribosomes8.addActionListener(this);
        ribosomes8.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes9 = new JButton();
        ribosomes9.setBounds(680,630,30,30);
        ribosomes9.setOpaque(false);
        ribosomes9.setContentAreaFilled(false);
        ribosomes9.setBorderPainted(false);
        ribosomes9.addActionListener(this);
        ribosomes9.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes10 = new JButton();
        ribosomes10.setBounds(740,550,30,30);
        ribosomes10.setOpaque(false);
        ribosomes10.setContentAreaFilled(false);
        ribosomes10.setBorderPainted(false);
        ribosomes10.addActionListener(this);
        ribosomes10.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes11 = new JButton();
        ribosomes11.setBounds(780,640,30,30);
        ribosomes11.setOpaque(false);
        ribosomes11.setContentAreaFilled(false);
        ribosomes11.setBorderPainted(false);
        ribosomes11.addActionListener(this);
        ribosomes11.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes12 = new JButton();
        ribosomes12.setBounds(820,580,30,30);
        ribosomes12.setOpaque(false);
        ribosomes12.setContentAreaFilled(false);
        ribosomes12.setBorderPainted(false);
        ribosomes12.addActionListener(this);
        ribosomes12.setCursor(new Cursor(Cursor.HAND_CURSOR));

        plasmaMembranePanel = new JPanel();
        plasmaMembranePanel.setVisible(true);
        plasmaMembranePanel.setBounds(930,310,280,40);
        plasmaMembranePanel.setLayout(new BorderLayout());
        plasmaMembranePanel.setBackground(new Color(0x6af6be));

        plasmaMembraneLabel = new JLabel();
        plasmaMembraneLabel.setBounds(0, 0, 200, 100);
        plasmaMembraneLabel.setVisible(true);
        plasmaMembraneLabel.setText("Plasma membrane");
        plasmaMembraneLabel.setFont(new Font("Arial",Font.PLAIN,25));

        plasmaMembraneLabelGreen = new JLabel();
        plasmaMembraneLabelGreen.setBounds(0, 0, 200, 100);
        plasmaMembraneLabelGreen.setVisible(false);
        plasmaMembraneLabelGreen.setOpaque(false);
        plasmaMembraneLabelGreen.setText("Plasma membrane");
        plasmaMembraneLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        plasmaMembraneLabelGreen.setForeground(new Color(0x1F7A1F));
        plasmaMembraneLabelGreen.setBackground(new Color(0x6af6be));

        plasmaMembraneButton = new JButton();
        plasmaMembraneButton.setBounds(930,310,280,40);
        plasmaMembraneButton.setOpaque(false);
        plasmaMembraneButton.setContentAreaFilled(false);
        plasmaMembraneButton.setBorderPainted(true);
        plasmaMembraneButton.addActionListener(this);

        plasmaMembranePanelDescription = new JPanel();
        plasmaMembranePanelDescription.setVisible(false);
        plasmaMembranePanelDescription.setOpaque(true);
        plasmaMembranePanelDescription.setBounds(230,190,700,250);
        plasmaMembranePanelDescription.setLayout(new BorderLayout());
        plasmaMembranePanelDescription.setBackground(Color.cyan);

        plasmaMembraneLabelDescription = new JLabel();
        plasmaMembraneLabelDescription.setVerticalAlignment(JLabel.CENTER);
        plasmaMembraneLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        plasmaMembraneLabelDescription.setVisible(true);
        plasmaMembraneLabelDescription.setText(
                        "<html>In bacterial and plant cells, a cell wall is " +
                        "attached to the plasma membrane on its outside " +
                        "surface. The plasma membrane consists of a lipid " +
                        "bilayer that is semipermeable. The plasma membrane " +
                        "regulates the transport of materials entering and " +
                        "exiting the cell.<html>");
        plasmaMembraneLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));
        
        plasmaMembranePanelClose = new JButton();
        plasmaMembranePanelClose.setBounds(650,0,50,50);
        plasmaMembranePanelClose.setIcon(porzam);
        plasmaMembranePanelClose.setBorderPainted(false);
        plasmaMembranePanelClose.addActionListener(this);
        
        cellWallPanel = new JPanel();
        cellWallPanel.setVisible(true);
        cellWallPanel.setBounds(930,350,280,40);
        cellWallPanel.setLayout(new BorderLayout());
        cellWallPanel.setBackground(new Color(0x6af6be));

        cellWallLabel = new JLabel();
        cellWallLabel.setBounds(0, 0, 200, 100);
        cellWallLabel.setVisible(true);
        cellWallLabel.setText("Cell wall");
        cellWallLabel.setFont(new Font("Arial",Font.PLAIN,25));

        cellWallLabelGreen = new JLabel();
        cellWallLabelGreen.setBounds(0, 0, 200, 100);
        cellWallLabelGreen.setVisible(false);
        cellWallLabelGreen.setOpaque(false);
        cellWallLabelGreen.setText("Cell wall");
        cellWallLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        cellWallLabelGreen.setForeground(new Color(0x1F7A1F));
        cellWallLabelGreen.setBackground(new Color(0x6af6be));

        cellWallButton = new JButton();
        cellWallButton.setBounds(930,350,280,40);
        cellWallButton.setOpaque(false);
        cellWallButton.setContentAreaFilled(false);
        cellWallButton.setBorderPainted(true);
        cellWallButton.addActionListener(this);

        cellWallPanelDescription = new JPanel();
        cellWallPanelDescription.setVisible(false);
        cellWallPanelDescription.setOpaque(true);
        cellWallPanelDescription.setBounds(230,190,700,250);
        cellWallPanelDescription.setLayout(new BorderLayout());
        cellWallPanelDescription.setBackground(Color.cyan);

        cellWallLabelDescription = new JLabel();
        cellWallLabelDescription.setVerticalAlignment(JLabel.CENTER);
        cellWallLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        cellWallLabelDescription.setVisible(true);
        cellWallLabelDescription.setText(
                                "<html>The bacterial cell wall is a complex," +
                                " mesh-like structure that in most bacteria is " +
                                "essential for maintenance of cell shape " +
                                "and structural integrity.<html>");
        cellWallLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));
        
        cellWallPanelClose = new JButton();
        cellWallPanelClose.setBounds(650,0,50,50);
        cellWallPanelClose.setIcon(porzam);
        cellWallPanelClose.setBorderPainted(false);
        cellWallPanelClose.addActionListener(this);     
        
        plasmidPanel = new JPanel();
        plasmidPanel.setVisible(true);
        plasmidPanel.setBounds(930,390,280,40);
        plasmidPanel.setLayout(new BorderLayout());
        plasmidPanel.setBackground(new Color(0x6af6be));

        plasmidLabel = new JLabel();
        plasmidLabel.setBounds(0, 0, 200, 100);
        plasmidLabel.setVisible(true);
        plasmidLabel.setText("Plasmid");
        plasmidLabel.setFont(new Font("Arial",Font.PLAIN,25));

        plasmidLabelGreen = new JLabel();
        plasmidLabelGreen.setBounds(0, 0, 200, 100);
        plasmidLabelGreen.setVisible(false);
        plasmidLabelGreen.setOpaque(false);
        plasmidLabelGreen.setText("Plasmid");
        plasmidLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        plasmidLabelGreen.setForeground(new Color(0x1F7A1F));
        plasmidLabelGreen.setBackground(new Color(0x6af6be));

        plasmidButton = new JButton();
        plasmidButton.setBounds(930,390,280,40);
        plasmidButton.setOpaque(false);
        plasmidButton.setContentAreaFilled(false);
        plasmidButton.setBorderPainted(true);
        plasmidButton.addActionListener(this);

        plasmidPanelDescription = new JPanel();
        plasmidPanelDescription.setVisible(false);
        plasmidPanelDescription.setOpaque(true);
        plasmidPanelDescription.setBounds(230,190,700,250);
        plasmidPanelDescription.setLayout(new BorderLayout());
        plasmidPanelDescription.setBackground(Color.cyan);

        plasmidLabelDescription = new JLabel();
        plasmidLabelDescription.setVerticalAlignment(JLabel.CENTER);
        plasmidLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        plasmidLabelDescription.setVisible(true);
        plasmidLabelDescription.setText(
                        "<html>In bacterial cells, the plasmids " +
                        "play a vital role in: Help in " +
                        "the conjugation of bacteria. " +
                        "Enable the metabolism of nutrients. " +
                        "Transfer the information from one " +
                        "cell to another.<html>");
        plasmidLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));
        
        plasmidPanelClose = new JButton();
        plasmidPanelClose.setBounds(650,0,50,50);
        plasmidPanelClose.setIcon(porzam);
        plasmidPanelClose.setBorderPainted(false);
        plasmidPanelClose.addActionListener(this);

        plasmid1 = new JButton();
        plasmid1.setBounds(745,480,80,50);
        plasmid1.setOpaque(false);
        plasmid1.setContentAreaFilled(false);
        plasmid1.setBorderPainted(false);
        plasmid1.addActionListener(this);
        plasmid1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellulosePanel = new JPanel();
        cellulosePanel.setVisible(true);
        cellulosePanel.setBounds(930,430,280,40);
        cellulosePanel.setLayout(new BorderLayout());
        cellulosePanel.setBackground(new Color(0x6af6be));

        celluloseLabel = new JLabel();
        celluloseLabel.setBounds(0, 0, 200, 100);
        celluloseLabel.setVisible(true);
        celluloseLabel.setText("Cellulose");
        celluloseLabel.setFont(new Font("Arial",Font.PLAIN,25));

        celluloseLabelGreen = new JLabel();
        celluloseLabelGreen.setBounds(0, 0, 200, 100);
        celluloseLabelGreen.setVisible(false);
        celluloseLabelGreen.setOpaque(false);
        celluloseLabelGreen.setText("Cellulose");
        celluloseLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        celluloseLabelGreen.setForeground(new Color(0x1F7A1F));
        celluloseLabelGreen.setBackground(new Color(0x6af6be));

        celluloseButton = new JButton();
        celluloseButton.setBounds(930,430,280,40);
        celluloseButton.setOpaque(false);
        celluloseButton.setContentAreaFilled(false);
        celluloseButton.setBorderPainted(true);
        celluloseButton.addActionListener(this);

        cellulosePanelDescription = new JPanel();
        cellulosePanelDescription.setVisible(false);
        cellulosePanelDescription.setOpaque(true);
        cellulosePanelDescription.setBounds(230,190,700,250);
        cellulosePanelDescription.setLayout(new BorderLayout());
        cellulosePanelDescription.setBackground(Color.cyan);

        celluloseLabelDescription = new JLabel();
        celluloseLabelDescription.setVerticalAlignment(JLabel.CENTER);
        celluloseLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        celluloseLabelDescription.setVisible(true);
        celluloseLabelDescription.setText(
                "<html>Exclusively an extracellular product," +
                        " bacterial cellulose appears to fulfill " +
                        "diverse biological roles within the natural " +
                        "habitat, conferring mechanical, chemical, " + 
                        "and physiological protection<html>");
        celluloseLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));
        
        cellulosePanelClose = new JButton();
        cellulosePanelClose.setBounds(650,0,50,50);
        cellulosePanelClose.setIcon(porzam);
        cellulosePanelClose.setBorderPainted(false);
        cellulosePanelClose.addActionListener(this);
        
        capsulePanel = new JPanel();
        capsulePanel.setVisible(true);
        capsulePanel.setBounds(930,470,280,40);
        capsulePanel.setLayout(new BorderLayout());
        capsulePanel.setBackground(new Color(0x6af6be));

        capsuleLabel = new JLabel();
        capsuleLabel.setBounds(0, 0, 200, 100);
        capsuleLabel.setVisible(true);
        capsuleLabel.setText("Capsule");
        capsuleLabel.setFont(new Font("Arial",Font.PLAIN,25));

        capsuleLabelGreen = new JLabel();
        capsuleLabelGreen.setBounds(0, 0, 200, 100);
        capsuleLabelGreen.setVisible(false);
        capsuleLabelGreen.setOpaque(false);
        capsuleLabelGreen.setText("Capsule");
        capsuleLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        capsuleLabelGreen.setForeground(new Color(0x1F7A1F));
        capsuleLabelGreen.setBackground(new Color(0x6af6be));

        capsuleButton = new JButton();
        capsuleButton.setBounds(930,470,280,40);
        capsuleButton.setOpaque(false);
        capsuleButton.setContentAreaFilled(false);
        capsuleButton.setBorderPainted(true);
        capsuleButton.addActionListener(this);

        capsulePanelDescription = new JPanel();
        capsulePanelDescription.setVisible(false);
        capsulePanelDescription.setOpaque(true);
        capsulePanelDescription.setBounds(230,190,700,250);
        capsulePanelDescription.setLayout(new BorderLayout());
        capsulePanelDescription.setBackground(Color.cyan);

        capsuleLabelDescription = new JLabel();
        capsuleLabelDescription.setVerticalAlignment(JLabel.CENTER);
        capsuleLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        capsuleLabelDescription.setVisible(true);
        capsuleLabelDescription.setText(
                        "<html>Capsules act as a sort of magic cloak, " +
                        "protecting bacteria from toxic compounds " +
                        "and desiccation and allowing them to " +
                        "adhere to surfaces and to escape the " +
                        "immune system of the host<html>");
        capsuleLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));
        
        capsulePanelClose = new JButton();
        capsulePanelClose.setBounds(650,0,50,50);
        capsulePanelClose.setIcon(porzam);
        capsulePanelClose.setBorderPainted(false);
        capsulePanelClose.addActionListener(this);

        capsule1 = new JButton();
        capsule1.setBounds(260,465,55,210);
        capsule1.setOpaque(false);
        capsule1.setContentAreaFilled(false);
        capsule1.setBorderPainted(false);
        capsule1.addActionListener(this);
        capsule1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        capsule2 = new JButton();
        capsule2.setBounds(315,660,320,50);
        capsule2.setOpaque(false);
        capsule2.setContentAreaFilled(false);
        capsule2.setBorderPainted(false);
        capsule2.addActionListener(this);
        capsule2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        capsule3 = new JButton();
        capsule3.setBounds(635,680,230,50);
        capsule3.setOpaque(false);
        capsule3.setContentAreaFilled(false);
        capsule3.setBorderPainted(false);
        capsule3.addActionListener(this);
        capsule3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        capsule4 = new JButton();
        capsule4.setBounds(850,450,68,250);
        capsule4.setOpaque(false);
        capsule4.setContentAreaFilled(false);
        capsule4.setBorderPainted(false);
        capsule4.addActionListener(this);
        capsule4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        capsule5 = new JButton();
        capsule5.setBounds(340,430,520,30);
        capsule5.setOpaque(false);
        capsule5.setContentAreaFilled(false);
        capsule5.setBorderPainted(false);
        capsule5.addActionListener(this);
        capsule5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        flagellaPanel = new JPanel();
        flagellaPanel.setVisible(true);
        flagellaPanel.setBounds(930,510,280,40);
        flagellaPanel.setLayout(new BorderLayout());
        flagellaPanel.setBackground(new Color(0x6af6be));

        flagellaLabel = new JLabel();
        flagellaLabel.setBounds(0, 0, 200, 100);
        flagellaLabel.setVisible(true);
        flagellaLabel.setText("Flagella");
        flagellaLabel.setFont(new Font("Arial",Font.PLAIN,25));

        flagellaLabelGreen = new JLabel();
        flagellaLabelGreen.setBounds(0, 0, 200, 100);
        flagellaLabelGreen.setVisible(false);
        flagellaLabelGreen.setOpaque(false);
        flagellaLabelGreen.setText("Flagella");
        flagellaLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        flagellaLabelGreen.setForeground(new Color(0x1F7A1F));
        flagellaLabelGreen.setBackground(new Color(0x6af6be));

        flagellaButton = new JButton();
        flagellaButton.setBounds(930,510,280,40);
        flagellaButton.setOpaque(false);
        flagellaButton.setContentAreaFilled(false);
        flagellaButton.setBorderPainted(true);
        flagellaButton.addActionListener(this);

        flagellaPanelDescription = new JPanel();
        flagellaPanelDescription.setVisible(false);
        flagellaPanelDescription.setOpaque(true);
        flagellaPanelDescription.setBounds(230,190,700,250);
        flagellaPanelDescription.setLayout(new BorderLayout());
        flagellaPanelDescription.setBackground(Color.cyan);

        flagellaLabelDescription = new JLabel();
        flagellaLabelDescription.setVerticalAlignment(JLabel.CENTER);
        flagellaLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        flagellaLabelDescription.setVisible(true);
        flagellaLabelDescription.setText(
                "<html>Flagella (singular: flagellum) are " +
                        "long, thin, whip-like appendages " +
                        "attached to a bacterial cell that " +
                        "allow for bacterial movement<html>");
        flagellaLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));
        
        flagellaPanelClose = new JButton();
        flagellaPanelClose.setBounds(650,0,50,50);
        flagellaPanelClose.setIcon(porzam);
        flagellaPanelClose.setBorderPainted(false);
        flagellaPanelClose.addActionListener(this);

        flagella1 = new JButton();
        flagella1.setBounds(80,230,440,140);
        flagella1.setOpaque(false);
        flagella1.setContentAreaFilled(false);
        flagella1.setBorderPainted(false);
        flagella1.addActionListener(this);
        flagella1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        flagella2 = new JButton();
        flagella2.setBounds(80,370,70,170);
        flagella2.setOpaque(false);
        flagella2.setContentAreaFilled(false);
        flagella2.setBorderPainted(false);
        flagella2.addActionListener(this);
        flagella2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        flagella3 = new JButton();
        flagella3.setBounds(400,370,120,60);
        flagella3.setOpaque(false);
        flagella3.setContentAreaFilled(false);
        flagella3.setBorderPainted(false);
        flagella3.addActionListener(this);
        flagella3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        flagella4 = new JButton();
        flagella4.setBounds(190,680,140,200);
        flagella4.setOpaque(false);
        flagella4.setContentAreaFilled(false);
        flagella4.setBorderPainted(false);
        flagella4.addActionListener(this);
        flagella4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        flagella5 = new JButton();
        flagella5.setBounds(330,800,400,150);
        flagella5.setOpaque(false);
        flagella5.setContentAreaFilled(false);
        flagella5.setBorderPainted(false);
        flagella5.addActionListener(this);
        flagella5.setCursor(new Cursor(Cursor.HAND_CURSOR));

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
        this.add(fimbriae1);
        this.add(fimbriae2);

        this.add(nucleoidPanel);
        nucleoidPanel.add(nucleoidLabel);
        this.add(nucleoidButton);
        this.add(nucleoidPanelDescription);
        nucleoidPanelDescription.add(nucleoidPanelClose);
        nucleoidPanelDescription.add(nucleoidLabelDescription);
        this.add(nucleoid1);
        
        this.add(ribosomesPanel);
        ribosomesPanel.add(ribosomesLabel);
        this.add(ribosomesButton);
        this.add(ribosomesPanelDescription);
        ribosomesPanelDescription.add(ribosomesPanelClose);
        ribosomesPanelDescription.add(ribosomesLabelDescription);
        this.add(ribosomes1);
        this.add(ribosomes2);
        this.add(ribosomes3);
        this.add(ribosomes4);
        this.add(ribosomes5);
        this.add(ribosomes6);
        this.add(ribosomes7);
        this.add(ribosomes8);
        this.add(ribosomes9);
        this.add(ribosomes10);
        this.add(ribosomes11);
        this.add(ribosomes12);

        this.add(plasmaMembranePanel);
        plasmaMembranePanel.add(plasmaMembraneLabel);
        this.add(plasmaMembraneButton);
        this.add(plasmaMembranePanelDescription);
        plasmaMembranePanelDescription.add(plasmaMembranePanelClose);
        plasmaMembranePanelDescription.add(plasmaMembraneLabelDescription);      
        
        this.add(cellWallPanel);
        cellWallPanel.add(cellWallLabel);
        this.add(cellWallButton);
        this.add(cellWallPanelDescription);
        cellWallPanelDescription.add(cellWallPanelClose);
        cellWallPanelDescription.add(cellWallLabelDescription);
        
        this.add(plasmidPanel);
        plasmidPanel.add(plasmidLabel);
        this.add(plasmidButton);
        this.add(plasmidPanelDescription);
        plasmidPanelDescription.add(plasmidPanelClose);
        plasmidPanelDescription.add(plasmidLabelDescription);
        this.add(plasmid1);
        
        this.add(cellulosePanel);
        cellulosePanel.add(celluloseLabel);
        this.add(celluloseButton);
        this.add(cellulosePanelDescription);
        cellulosePanelDescription.add(cellulosePanelClose);
        cellulosePanelDescription.add(celluloseLabelDescription);
        
        this.add(capsulePanel);
        capsulePanel.add(capsuleLabel);
        this.add(capsuleButton);
        this.add(capsulePanelDescription);
        capsulePanelDescription.add(capsulePanelClose);
        capsulePanelDescription.add(capsuleLabelDescription);
        this.add(capsule1);
        this.add(capsule2);
        this.add(capsule3);
        this.add(capsule4);
        this.add(capsule5);

        this.add(flagellaPanel);
        flagellaPanel.add(flagellaLabel);
        this.add(flagellaButton);
        this.add(flagellaPanelDescription);
        flagellaPanelDescription.add(flagellaPanelClose);
        flagellaPanelDescription.add(flagellaLabelDescription);
        this.add(flagella1);
        this.add(flagella2);
        this.add(flagella3);
        this.add(flagella4);
        this.add(flagella5);

        this.add(progressBar);
        this.add(label);

        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==goBack){
            this.dispose();
            Menubiol Menubiol = new Menubiol(pass2);
        }
        if(e.getSource()==fimbriaeButton){
            fimbriaePanelDescription.setVisible(true);
        }
        if(e.getSource()==fimbriaePanelClose){
            if(!fimbriaeLabelGreen.isVisible()){
                progressBar.setValue(i=i+12);
            }
            fimbriaePanelDescription.setVisible(false);
            fimbriaeLabel.setVisible(false);
            fimbriaeLabelGreen.setVisible(true);
            fimbriaeLabelGreen.setOpaque(true);
            fimbriaePanel.add(fimbriaeLabelGreen);
        }
        if(e.getSource()==fimbriae1){
            fimbriaePanelDescription.setVisible(true);
        }
        if(e.getSource()==fimbriae2){
            fimbriaePanelDescription.setVisible(true);
        }
        if(e.getSource()==nucleoidButton){
            nucleoidPanelDescription.setVisible(true);
        }
        if(e.getSource()==nucleoidPanelClose){
            if(!nucleoidLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            nucleoidPanelDescription.setVisible(false);
            nucleoidLabel.setVisible(false);
            nucleoidLabelGreen.setVisible(true);
            nucleoidLabelGreen.setOpaque(true);
            nucleoidPanel.add(nucleoidLabelGreen);
        }
        if(e.getSource()==nucleoid1){
            nucleoidPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomesButton){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomesPanelClose){
            if(!ribosomesLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            ribosomesPanelDescription.setVisible(false);
            ribosomesLabel.setVisible(false);
            ribosomesLabelGreen.setVisible(true);
            ribosomesLabelGreen.setOpaque(true);
            ribosomesPanel.add(ribosomesLabelGreen);
        }
        if(e.getSource()==ribosomes1){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes2){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes3){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes4){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes5){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes6){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes7){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes8){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes9){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes10){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes11){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes12){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmaMembraneButton){
            plasmaMembranePanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmaMembranePanelClose){
            if(!plasmaMembraneLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            plasmaMembranePanelDescription.setVisible(false);
            plasmaMembraneLabel.setVisible(false);
            plasmaMembraneLabelGreen.setVisible(true);
            plasmaMembraneLabelGreen.setOpaque(true);
            plasmaMembranePanel.add(plasmaMembraneLabelGreen);
        }
        if(e.getSource()==cellWallButton){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==cellWallPanelClose){
            if(!cellWallLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            cellWallPanelDescription.setVisible(false);
            cellWallLabel.setVisible(false);
            cellWallLabelGreen.setVisible(true);
            cellWallLabelGreen.setOpaque(true);
            cellWallPanel.add(cellWallLabelGreen);
        }
        if(e.getSource()==plasmidButton){
            plasmidPanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmidPanelClose){
            if(!plasmidLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            plasmidPanelDescription.setVisible(false);
            plasmidLabel.setVisible(false);
            plasmidLabelGreen.setVisible(true);
            plasmidLabelGreen.setOpaque(true);
            plasmidPanel.add(plasmidLabelGreen);
        }
        if(e.getSource()==plasmid1){
            plasmidPanelDescription.setVisible(true);
        }
        if(e.getSource()==celluloseButton){
            cellulosePanelDescription.setVisible(true);
        }
        if(e.getSource()==cellulosePanelClose){
            if(!celluloseLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            cellulosePanelDescription.setVisible(false);
            celluloseLabel.setVisible(false);
            celluloseLabelGreen.setVisible(true);
            celluloseLabelGreen.setOpaque(true);
            cellulosePanel.add(celluloseLabelGreen);
        }
        if(e.getSource()==capsuleButton){
            capsulePanelDescription.setVisible(true);
        }
        if(e.getSource()==capsulePanelClose){
            if(!capsuleLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            capsulePanelDescription.setVisible(false);
            capsuleLabel.setVisible(false);
            capsuleLabelGreen.setVisible(true);
            capsuleLabelGreen.setOpaque(true);
            capsulePanel.add(capsuleLabelGreen);
        }
        if(e.getSource()==capsule1){
            capsulePanelDescription.setVisible(true);
        }
        if(e.getSource()==capsule2){
            capsulePanelDescription.setVisible(true);
        }
        if(e.getSource()==capsule3){
            capsulePanelDescription.setVisible(true);
        }
        if(e.getSource()==capsule4){
            capsulePanelDescription.setVisible(true);
        }
        if(e.getSource()==capsule5){
            capsulePanelDescription.setVisible(true);
        }
        if(e.getSource()==flagellaButton){
            flagellaPanelDescription.setVisible(true);
        }
        if(e.getSource()==flagellaPanelClose){
            if(!flagellaLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            flagellaPanelDescription.setVisible(false);
            flagellaLabel.setVisible(false);
            flagellaLabelGreen.setVisible(true);
            flagellaLabelGreen.setOpaque(true);
            flagellaPanel.add(flagellaLabelGreen);
        }
        if(e.getSource()==flagella1){
            flagellaPanelDescription.setVisible(true);
        }
        if(e.getSource()==flagella2){
            flagellaPanelDescription.setVisible(true);
        }
        if(e.getSource()==flagella3){
            flagellaPanelDescription.setVisible(true);
        }
        if(e.getSource()==flagella4){
            flagellaPanelDescription.setVisible(true);
        }
        if(e.getSource()==flagella5){
            flagellaPanelDescription.setVisible(true);
        }
    }
}


