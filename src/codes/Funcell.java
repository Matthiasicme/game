package codes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Funcell extends JFrame implements ActionListener {

    JPanel nucleusPanel;
    JLabel nucleusLabel;
    JButton nucleusButton;
    JPanel nucleusPanelDescription;
    JLabel nucleusLabelDescription;
    JButton nucleusPanelClose;
    JLabel nucleusLabelGreen;
    JButton nucleus1;

    JPanel mitochondrionPanel;
    JLabel mitochondrionLabel;
    JButton mitochondrionButton;
    JPanel mitochondrionPanelDescription;
    JLabel mitochondrionLabelDescription;
    JButton mitochondrionPanelClose;
    JLabel mitochondrionLabelGreen;
    JButton mitochondrion1;
    JButton mitochondrion2;
    JButton mitochondrion3;
    JButton mitochondrion4;
    JButton mitochondrion5;

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
    JButton cellWall1;
    JButton cellWall2;
    JButton cellWall3;

    JPanel vacuolePanel;
    JLabel vacuoleLabel;
    JButton vacuoleButton;
    JPanel vacuolePanelDescription;
    JLabel vacuoleLabelDescription;
    JButton vacuolePanelClose;
    JLabel vacuoleLabelGreen;
    JButton vacuole1;
    JButton vacuole2;
    JButton vacuole3;
    JButton vacuole4;

    JPanel cellulosePanel;
    JLabel celluloseLabel;
    JButton celluloseButton;
    JPanel cellulosePanelDescription;
    JLabel celluloseLabelDescription;
    JButton cellulosePanelClose;
    JLabel celluloseLabelGreen;

    JPanel roughEndoplasmicReticulumPanel;
    JLabel roughEndoplasmicReticulumLabel;
    JButton roughEndoplasmicReticulumButton;
    JPanel roughEndoplasmicReticulumPanelDescription;
    JLabel roughEndoplasmicReticulumLabelDescription;
    JButton roughEndoplasmicReticulumPanelClose;
    JLabel roughEndoplasmicReticulumLabelGreen;
    JButton roughEndoplasmicReticulum1;
    JButton roughEndoplasmicReticulum2;
    JButton roughEndoplasmicReticulum3;
    JButton roughEndoplasmicReticulum4;

    JPanel golgiApparatusPanel;
    JLabel golgiApparatusLabel;
    JButton golgiApparatusButton;
    JPanel golgiApparatusPanelDescription;
    JLabel golgiApparatusLabelDescription;
    JButton golgiApparatusPanelClose;
    JLabel golgiApparatusLabelGreen;
    JButton golgiApparatus1;

    JButton goBack;
    String passone;
    JProgressBar progressBar = new JProgressBar();
    int i=0;

    public Funcell(String passone) {
        this.passone = passone;
        ImageIcon background = new ImageIcon("src/resources/FUNCELL.png");
        JLabel label = new JLabel();
        label.setIcon(background);

        Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
        Border bb = BorderFactory.createLineBorder(Color.RED, 1);

        progressBar.setValue(0);
        progressBar.setBounds(390,120,500,50);
        progressBar.setStringPainted(true);
        progressBar.setBorderPainted(true);
        progressBar.setBorder(border);
        progressBar.setForeground(Color.green);
        progressBar.setBackground(Color.RED);

        nucleusPanel = new JPanel();
        nucleusPanel.setVisible(true);
        nucleusPanel.setBounds(930,190,280,40);
        nucleusPanel.setLayout(new BorderLayout());
        nucleusPanel.setBackground(new Color(0x6af6be));

        nucleusLabel = new JLabel();
        nucleusLabel.setBounds(0, 0, 200, 100);
        nucleusLabel.setVisible(true);
        nucleusLabel.setText("Nucleus");
        nucleusLabel.setFont(new Font("Arial",Font.PLAIN,25));

        nucleusLabelGreen = new JLabel();
        nucleusLabelGreen.setBounds(0, 0, 200, 100);
        nucleusLabelGreen.setVisible(false);
        nucleusLabelGreen.setOpaque(false);
        nucleusLabelGreen.setText("Nucleus");
        nucleusLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        nucleusLabelGreen.setForeground(new Color(0x1F7A1F));
        nucleusLabelGreen.setBackground(new Color(0x6af6be));

        nucleusButton = new JButton();
        nucleusButton.setBounds(930,190,280,40);
        nucleusButton.setOpaque(false);
        nucleusButton.setContentAreaFilled(false);
        nucleusButton.setBorderPainted(true);
        nucleusButton.addActionListener(this);

        nucleusPanelDescription = new JPanel();
        nucleusPanelDescription.setVisible(false);
        nucleusPanelDescription.setOpaque(true);
        nucleusPanelDescription.setBounds(230,190,700,250);
        nucleusPanelDescription.setLayout(new BorderLayout());
        nucleusPanelDescription.setBackground(Color.cyan);

        nucleusLabelDescription = new JLabel();
        nucleusLabelDescription.setVerticalAlignment(JLabel.CENTER);
        nucleusLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        nucleusLabelDescription.setVisible(true);
        nucleusLabelDescription.setText(
                "<html>The nuclei cooperate, compete or combat. " +
                        "It is proposed that in addition to their " +
                        "classical role in heredity, supernumerary " +
                        "nuclei in filamentous fungi serve as store " +
                        "house for nitrogen and phosphorus in the " +
                        "form of DNA which is degraded by regulated " +
                        "autophagy. Consists of: nuclear envelope, " +
                        "nucleous and chromatine.<html>");
        nucleusLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        ImageIcon porzam = new ImageIcon("src/resources/porzam.png");
        nucleusPanelClose = new JButton();
        nucleusPanelClose.setBounds(650,0,50,50);
        nucleusPanelClose.setIcon(porzam);
        nucleusPanelClose.setBorderPainted(false);
        nucleusPanelClose.addActionListener(this);

        nucleus1 = new JButton();
        nucleus1.setBounds(335,470,170,150);
        nucleus1.setOpaque(false);
        nucleus1.setContentAreaFilled(false);
        nucleus1.setBorderPainted(false);
        nucleus1.addActionListener(this);
        nucleus1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrionPanel = new JPanel();
        mitochondrionPanel.setVisible(true);
        mitochondrionPanel.setBounds(930,230,280,40);
        mitochondrionPanel.setLayout(new BorderLayout());
        mitochondrionPanel.setBackground(new Color(0x6af6be));

        mitochondrionLabel = new JLabel();
        mitochondrionLabel.setBounds(0, 0, 200, 100);
        mitochondrionLabel.setVisible(true);
        mitochondrionLabel.setText("Mitochondrion");
        mitochondrionLabel.setFont(new Font("Arial",Font.PLAIN,25));

        mitochondrionLabelGreen = new JLabel();
        mitochondrionLabelGreen.setBounds(0, 0, 200, 100);
        mitochondrionLabelGreen.setVisible(false);
        mitochondrionLabelGreen.setOpaque(false);
        mitochondrionLabelGreen.setText("Mitochondrion");
        mitochondrionLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        mitochondrionLabelGreen.setForeground(new Color(0x1F7A1F));
        mitochondrionLabelGreen.setBackground(new Color(0x6af6be));

        mitochondrionButton = new JButton();
        mitochondrionButton.setBounds(930,230,280,40);
        mitochondrionButton.setOpaque(false);
        mitochondrionButton.setContentAreaFilled(false);
        mitochondrionButton.setBorderPainted(true);
        mitochondrionButton.addActionListener(this);

        mitochondrionPanelDescription = new JPanel();
        mitochondrionPanelDescription.setVisible(false);
        mitochondrionPanelDescription.setOpaque(true);
        mitochondrionPanelDescription.setBounds(230,190,700,250);
        mitochondrionPanelDescription.setLayout(new BorderLayout());
        mitochondrionPanelDescription.setBackground(Color.cyan);

        mitochondrionLabelDescription = new JLabel();
        mitochondrionLabelDescription.setVerticalAlignment(JLabel.CENTER);
        mitochondrionLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        mitochondrionLabelDescription.setVisible(true);
        mitochondrionLabelDescription.setText(
                "<html>In fungal pathogens, mitochondria play roles " +
                        "in developmental and morphogenetic switches " +
                        "such as hyphal differentiation and biofilm " +
                        "formation, adaptation to stress, cell wall " +
                        "biosynthesis and structure, innate immune " +
                        "cell interaction and susceptibility to antifungal drugs<html>");
        mitochondrionLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        mitochondrionPanelClose = new JButton();
        mitochondrionPanelClose.setBounds(650,0,50,50);
        mitochondrionPanelClose.setIcon(porzam);
        mitochondrionPanelClose.setBorderPainted(false);
        mitochondrionPanelClose.addActionListener(this);

        mitochondrion1 = new JButton();
        mitochondrion1.setBounds(80,550,60,100);
        mitochondrion1.setOpaque(false);
        mitochondrion1.setContentAreaFilled(false);
        mitochondrion1.setBorderPainted(false);
        mitochondrion1.addActionListener(this);
        mitochondrion1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrion2 = new JButton();
        mitochondrion2.setBounds(670,490,60,90);
        mitochondrion2.setOpaque(false);
        mitochondrion2.setContentAreaFilled(false);
        mitochondrion2.setBorderPainted(false);
        mitochondrion2.addActionListener(this);
        mitochondrion2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrion3 = new JButton();
        mitochondrion3.setBounds(315,780,100,60);
        mitochondrion3.setOpaque(false);
        mitochondrion3.setContentAreaFilled(false);
        mitochondrion3.setBorderPainted(false);
        mitochondrion3.addActionListener(this);
        mitochondrion3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrion4 = new JButton();
        mitochondrion4.setBounds(400,250,90,60);
        mitochondrion4.setOpaque(false);
        mitochondrion4.setContentAreaFilled(false);
        mitochondrion4.setBorderPainted(false);
        mitochondrion4.addActionListener(this);
        mitochondrion4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrion5 = new JButton();
        mitochondrion5.setBounds(570,300,70,80);
        mitochondrion5.setOpaque(false);
        mitochondrion5.setContentAreaFilled(false);
        mitochondrion5.setBorderPainted(false);
        mitochondrion5.addActionListener(this);
        mitochondrion5.setCursor(new Cursor(Cursor.HAND_CURSOR));

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
                "<html>Ribosomes translate messenger RNA into proteins. " +
                        "They are formed at the nucleolus and subsequently spread " +
                        "throughout the cytoplasm.<html>");
        ribosomesLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        ribosomesPanelClose = new JButton();
        ribosomesPanelClose.setBounds(650,0,50,50);
        ribosomesPanelClose.setIcon(porzam);
        ribosomesPanelClose.setBorderPainted(false);
        ribosomesPanelClose.addActionListener(this);

        ribosomes1 = new JButton();
        ribosomes1.setBounds(340,300,20,20);
        ribosomes1.setOpaque(false);
        ribosomes1.setContentAreaFilled(false);
        ribosomes1.setBorderPainted(false);
        ribosomes1.addActionListener(this);
        ribosomes1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes2 = new JButton();
        ribosomes2.setBounds(630,413,20,20);
        ribosomes2.setOpaque(false);
        ribosomes2.setContentAreaFilled(false);
        ribosomes2.setBorderPainted(false);
        ribosomes2.addActionListener(this);
        ribosomes2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes3 = new JButton();
        ribosomes3.setBounds(605,500,20,20);
        ribosomes3.setOpaque(false);
        ribosomes3.setContentAreaFilled(false);
        ribosomes3.setBorderPainted(false);
        ribosomes3.addActionListener(this);
        ribosomes3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes4 = new JButton();
        ribosomes4.setBounds(595,620,20,20);
        ribosomes4.setOpaque(false);
        ribosomes4.setContentAreaFilled(false);
        ribosomes4.setBorderPainted(false);
        ribosomes4.addActionListener(this);
        ribosomes4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes5 = new JButton();
        ribosomes5.setBounds(715,610,20,20);
        ribosomes5.setOpaque(false);
        ribosomes5.setContentAreaFilled(false);
        ribosomes5.setBorderPainted(false);
        ribosomes5.addActionListener(this);
        ribosomes5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes6 = new JButton();
        ribosomes6.setBounds(430,765,20,20);
        ribosomes6.setOpaque(false);
        ribosomes6.setContentAreaFilled(false);
        ribosomes6.setBorderPainted(false);
        ribosomes6.addActionListener(this);
        ribosomes6.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes7 = new JButton();
        ribosomes7.setBounds(185,665,20,20);
        ribosomes7.setOpaque(false);
        ribosomes7.setContentAreaFilled(false);
        ribosomes7.setBorderPainted(false);
        ribosomes7.addActionListener(this);
        ribosomes7.setCursor(new Cursor(Cursor.HAND_CURSOR));

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
                "<html>The prime function of the membranes of fungi, " +
                        "like those of other eukaryotic cells, is to " +
                        "provide a barrier between the cell and its " +
                        "environment. Plasma membranes are composed " +
                        "of a phospholipid bilayer, but this is not " +
                        "a static barrier.<html>");
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
                "<html>The fungal cell wall is uniquely composed " +
                        "of mannoproteins, chitins, and α- and β- " +
                        "linked glucans and serves many functions, " +
                        "including providing cell rigidity and shape, " +
                        "metabolism, ion exchange, and interactions " +
                        "with host defense mechanisms.<html>");
        cellWallLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        cellWallPanelClose = new JButton();
        cellWallPanelClose.setBounds(650,0,50,50);
        cellWallPanelClose.setIcon(porzam);
        cellWallPanelClose.setBorderPainted(false);
        cellWallPanelClose.addActionListener(this);

        cellWall1 = new JButton();
        cellWall1.setBounds(105,845,500,120);
        cellWall1.setOpaque(false);
        cellWall1.setContentAreaFilled(false);
        cellWall1.setBorderPainted(false);
        cellWall1.addActionListener(this);
        cellWall1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall2 = new JButton();
        cellWall2.setBounds(185,170,400,80);
        cellWall2.setOpaque(false);
        cellWall2.setContentAreaFilled(false);
        cellWall2.setBorderPainted(false);
        cellWall2.addActionListener(this);
        cellWall2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall3 = new JButton();
        cellWall3.setBounds(0,400,70,400);
        cellWall3.setOpaque(false);
        cellWall3.setContentAreaFilled(false);
        cellWall3.setBorderPainted(false);
        cellWall3.addActionListener(this);
        cellWall3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        vacuolePanel = new JPanel();
        vacuolePanel.setVisible(true);
        vacuolePanel.setBounds(930,390,280,40);
        vacuolePanel.setLayout(new BorderLayout());
        vacuolePanel.setBackground(new Color(0x6af6be));

        vacuoleLabel = new JLabel();
        vacuoleLabel.setBounds(0, 0, 200, 100);
        vacuoleLabel.setVisible(true);
        vacuoleLabel.setText("Vacuole");
        vacuoleLabel.setFont(new Font("Arial",Font.PLAIN,25));

        vacuoleLabelGreen = new JLabel();
        vacuoleLabelGreen.setBounds(0, 0, 200, 100);
        vacuoleLabelGreen.setVisible(false);
        vacuoleLabelGreen.setOpaque(false);
        vacuoleLabelGreen.setText("Vacuole");
        vacuoleLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        vacuoleLabelGreen.setForeground(new Color(0x1F7A1F));
        vacuoleLabelGreen.setBackground(new Color(0x6af6be));

        vacuoleButton = new JButton();
        vacuoleButton.setBounds(930,390,280,40);
        vacuoleButton.setOpaque(false);
        vacuoleButton.setContentAreaFilled(false);
        vacuoleButton.setBorderPainted(true);
        vacuoleButton.addActionListener(this);

        vacuolePanelDescription = new JPanel();
        vacuolePanelDescription.setVisible(false);
        vacuolePanelDescription.setOpaque(true);
        vacuolePanelDescription.setBounds(230,190,700,250);
        vacuolePanelDescription.setLayout(new BorderLayout());
        vacuolePanelDescription.setBackground(Color.cyan);

        vacuoleLabelDescription = new JLabel();
        vacuoleLabelDescription.setVerticalAlignment(JLabel.CENTER);
        vacuoleLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        vacuoleLabelDescription.setVisible(true);
        vacuoleLabelDescription.setText(
                "<html>The fungal vacuole is a large, membrane-bounded " +
                        "organelle that functions as a reservoir for the " +
                        "storage of small molecules (including polyphosphate, " +
                        "amino acids, several divalent cations (e.g. calcium), " +
                        "other ions, and other small molecules) as well as " +
                        "being the primary compartment for degradation.<html>");
        vacuoleLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        vacuolePanelClose = new JButton();
        vacuolePanelClose.setBounds(650,0,50,50);
        vacuolePanelClose.setIcon(porzam);
        vacuolePanelClose.setBorderPainted(false);
        vacuolePanelClose.addActionListener(this);

        vacuole1 = new JButton();
        vacuole1.setBounds(80,440,150,110);
        vacuole1.setOpaque(false);
        vacuole1.setContentAreaFilled(false);
        vacuole1.setBorderPainted(false);
        vacuole1.addActionListener(this);
        vacuole1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        vacuole2 = new JButton();
        vacuole2.setBounds(100,320,180,120);
        vacuole2.setOpaque(false);
        vacuole2.setContentAreaFilled(false);
        vacuole2.setBorderPainted(false);
        vacuole2.addActionListener(this);
        vacuole2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        vacuole3 = new JButton();
        vacuole3.setBounds(600,640,120,170);
        vacuole3.setOpaque(false);
        vacuole3.setContentAreaFilled(false);
        vacuole3.setBorderPainted(false);
        vacuole3.addActionListener(this);
        vacuole3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        vacuole4 = new JButton();
        vacuole4.setBounds(500,720,100,100);
        vacuole4.setOpaque(false);
        vacuole4.setContentAreaFilled(false);
        vacuole4.setBorderPainted(false);
        vacuole4.addActionListener(this);
        vacuole4.setCursor(new Cursor(Cursor.HAND_CURSOR));

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
                        " fungal cellulose appears to fulfill " +
                        "diverse biological roles within the natural " +
                        "habitat, conferring mechanical, chemical, " +
                        "and physiological protection<html>");
        celluloseLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        cellulosePanelClose = new JButton();
        cellulosePanelClose.setBounds(650,0,50,50);
        cellulosePanelClose.setIcon(porzam);
        cellulosePanelClose.setBorderPainted(false);
        cellulosePanelClose.addActionListener(this);

        roughEndoplasmicReticulumPanel = new JPanel();
        roughEndoplasmicReticulumPanel.setVisible(true);
        roughEndoplasmicReticulumPanel.setBounds(930,470,280,40);
        roughEndoplasmicReticulumPanel.setLayout(new BorderLayout());
        roughEndoplasmicReticulumPanel.setBackground(new Color(0x6af6be));

        roughEndoplasmicReticulumLabel = new JLabel();
        roughEndoplasmicReticulumLabel.setBounds(0, 0, 200, 100);
        roughEndoplasmicReticulumLabel.setVisible(true);
        roughEndoplasmicReticulumLabel.setText("RER");
        roughEndoplasmicReticulumLabel.setFont(new Font("Arial",Font.PLAIN,25));

        roughEndoplasmicReticulumLabelGreen = new JLabel();
        roughEndoplasmicReticulumLabelGreen.setBounds(0, 0, 200, 100);
        roughEndoplasmicReticulumLabelGreen.setVisible(false);
        roughEndoplasmicReticulumLabelGreen.setOpaque(false);
        roughEndoplasmicReticulumLabelGreen.setText("RER");
        roughEndoplasmicReticulumLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        roughEndoplasmicReticulumLabelGreen.setForeground(new Color(0x1F7A1F));
        roughEndoplasmicReticulumLabelGreen.setBackground(new Color(0x6af6be));

        roughEndoplasmicReticulumButton = new JButton();
        roughEndoplasmicReticulumButton.setBounds(930,470,280,40);
        roughEndoplasmicReticulumButton.setOpaque(false);
        roughEndoplasmicReticulumButton.setContentAreaFilled(false);
        roughEndoplasmicReticulumButton.setBorderPainted(true);
        roughEndoplasmicReticulumButton.addActionListener(this);

        roughEndoplasmicReticulumPanelDescription = new JPanel();
        roughEndoplasmicReticulumPanelDescription.setVisible(false);
        roughEndoplasmicReticulumPanelDescription.setOpaque(true);
        roughEndoplasmicReticulumPanelDescription.setBounds(230,190,700,250);
        roughEndoplasmicReticulumPanelDescription.setLayout(new BorderLayout());
        roughEndoplasmicReticulumPanelDescription.setBackground(Color.cyan);

        roughEndoplasmicReticulumLabelDescription = new JLabel();
        roughEndoplasmicReticulumLabelDescription.setVerticalAlignment(JLabel.CENTER);
        roughEndoplasmicReticulumLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        roughEndoplasmicReticulumLabelDescription.setVisible(true);
        roughEndoplasmicReticulumLabelDescription.setText(
                "<html>The endoplasmic reticulum is rough, and in general its " +
                        "function is to produce proteins for the rest of the " +
                        "cell to function. The rough endoplasmic reticulum " +
                        "has on it ribosomes, which are small, round organelles" +
                        " whose function it is to make those proteins.<html>");
        roughEndoplasmicReticulumLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        roughEndoplasmicReticulumPanelClose = new JButton();
        roughEndoplasmicReticulumPanelClose.setBounds(650,0,50,50);
        roughEndoplasmicReticulumPanelClose.setIcon(porzam);
        roughEndoplasmicReticulumPanelClose.setBorderPainted(false);
        roughEndoplasmicReticulumPanelClose.addActionListener(this);

        roughEndoplasmicReticulum1 = new JButton();
        roughEndoplasmicReticulum1.setBounds(505,470,80,220);
        roughEndoplasmicReticulum1.setOpaque(false);
        roughEndoplasmicReticulum1.setContentAreaFilled(false);
        roughEndoplasmicReticulum1.setBorderPainted(false);
        roughEndoplasmicReticulum1.addActionListener(this);
        roughEndoplasmicReticulum1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        roughEndoplasmicReticulum2 = new JButton();
        roughEndoplasmicReticulum2.setBounds(250,630,250,90);
        roughEndoplasmicReticulum2.setOpaque(false);
        roughEndoplasmicReticulum2.setContentAreaFilled(false);
        roughEndoplasmicReticulum2.setBorderPainted(false);
        roughEndoplasmicReticulum2.addActionListener(this);
        roughEndoplasmicReticulum2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        roughEndoplasmicReticulum3 = new JButton();
        roughEndoplasmicReticulum3.setBounds(230,440,105,190);
        roughEndoplasmicReticulum3.setOpaque(false);
        roughEndoplasmicReticulum3.setContentAreaFilled(false);
        roughEndoplasmicReticulum3.setBorderPainted(false);
        roughEndoplasmicReticulum3.addActionListener(this);
        roughEndoplasmicReticulum3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        roughEndoplasmicReticulum4 = new JButton();
        roughEndoplasmicReticulum4.setBounds(335,370,200,100);
        roughEndoplasmicReticulum4.setOpaque(false);
        roughEndoplasmicReticulum4.setContentAreaFilled(false);
        roughEndoplasmicReticulum4.setBorderPainted(false);
        roughEndoplasmicReticulum4.addActionListener(this);
        roughEndoplasmicReticulum4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        golgiApparatusPanel = new JPanel();
        golgiApparatusPanel.setVisible(true);
        golgiApparatusPanel.setBounds(930,510,280,40);
        golgiApparatusPanel.setLayout(new BorderLayout());
        golgiApparatusPanel.setBackground(new Color(0x6af6be));

        golgiApparatusLabel = new JLabel();
        golgiApparatusLabel.setBounds(0, 0, 200, 100);
        golgiApparatusLabel.setVisible(true);
        golgiApparatusLabel.setText("Golgi apparatus");
        golgiApparatusLabel.setFont(new Font("Arial",Font.PLAIN,25));

        golgiApparatusLabelGreen = new JLabel();
        golgiApparatusLabelGreen.setBounds(0, 0, 200, 100);
        golgiApparatusLabelGreen.setVisible(false);
        golgiApparatusLabelGreen.setOpaque(false);
        golgiApparatusLabelGreen.setText("Golgi apparatus");
        golgiApparatusLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        golgiApparatusLabelGreen.setForeground(new Color(0x1F7A1F));
        golgiApparatusLabelGreen.setBackground(new Color(0x6af6be));

        golgiApparatusButton = new JButton();
        golgiApparatusButton.setBounds(930,510,280,40);
        golgiApparatusButton.setOpaque(false);
        golgiApparatusButton.setContentAreaFilled(false);
        golgiApparatusButton.setBorderPainted(true);
        golgiApparatusButton.addActionListener(this);

        golgiApparatusPanelDescription = new JPanel();
        golgiApparatusPanelDescription.setVisible(false);
        golgiApparatusPanelDescription.setOpaque(true);
        golgiApparatusPanelDescription.setBounds(230,190,700,250);
        golgiApparatusPanelDescription.setLayout(new BorderLayout());
        golgiApparatusPanelDescription.setBackground(Color.cyan);

        golgiApparatusLabelDescription = new JLabel();
        golgiApparatusLabelDescription.setVerticalAlignment(JLabel.CENTER);
        golgiApparatusLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        golgiApparatusLabelDescription.setVisible(true);
        golgiApparatusLabelDescription.setText(
                "<html>The Golgi apparatus performs crucial functions in the sorting " +
                        "and processing of proteins destined for secretion from " +
                        "eukaryotic cells. In filamentous fungi, organization of " +
                        "the Golgi apparatus reflects the unique challenges brought " +
                        "about by the highly polarized nature of hyphal growth.<html>");
        golgiApparatusLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        golgiApparatusPanelClose = new JButton();
        golgiApparatusPanelClose.setBounds(650,0,50,50);
        golgiApparatusPanelClose.setIcon(porzam);
        golgiApparatusPanelClose.setBorderPainted(false);
        golgiApparatusPanelClose.addActionListener(this);

        golgiApparatus1 = new JButton();
        golgiApparatus1.setBounds(160,730,110,110);
        golgiApparatus1.setOpaque(false);
        golgiApparatus1.setContentAreaFilled(false);
        golgiApparatus1.setBorderPainted(false);
        golgiApparatus1.addActionListener(this);
        golgiApparatus1.setCursor(new Cursor(Cursor.HAND_CURSOR));

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

        this.add(nucleusPanel);
        nucleusPanel.add(nucleusLabel);
        this.add(nucleusButton);
        this.add(nucleusPanelDescription);
        nucleusPanelDescription.add(nucleusPanelClose);
        nucleusPanelDescription.add(nucleusLabelDescription);
        this.add(nucleus1);

        this.add(mitochondrionPanel);
        mitochondrionPanel.add(mitochondrionLabel);
        this.add(mitochondrionButton);
        this.add(mitochondrionPanelDescription);
        mitochondrionPanelDescription.add(mitochondrionPanelClose);
        mitochondrionPanelDescription.add(mitochondrionLabelDescription);
        this.add(mitochondrion1);
        this.add(mitochondrion2);
        this.add(mitochondrion3);
        this.add(mitochondrion4);
        this.add(mitochondrion5);

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
        this.add(cellWall1);
        this.add(cellWall2);
        this.add(cellWall3);

        this.add(vacuolePanel);
        vacuolePanel.add(vacuoleLabel);
        this.add(vacuoleButton);
        this.add(vacuolePanelDescription);
        vacuolePanelDescription.add(vacuolePanelClose);
        vacuolePanelDescription.add(vacuoleLabelDescription);
        this.add(vacuole1);
        this.add(vacuole2);
        this.add(vacuole3);
        this.add(vacuole4);

        this.add(cellulosePanel);
        cellulosePanel.add(celluloseLabel);
        this.add(celluloseButton);
        this.add(cellulosePanelDescription);
        cellulosePanelDescription.add(cellulosePanelClose);
        cellulosePanelDescription.add(celluloseLabelDescription);

        this.add(roughEndoplasmicReticulumPanel);
        roughEndoplasmicReticulumPanel.add(roughEndoplasmicReticulumLabel);
        this.add(roughEndoplasmicReticulumButton);
        this.add(roughEndoplasmicReticulumPanelDescription);
        roughEndoplasmicReticulumPanelDescription.add(roughEndoplasmicReticulumPanelClose);
        roughEndoplasmicReticulumPanelDescription.add(roughEndoplasmicReticulumLabelDescription);
        this.add(roughEndoplasmicReticulum1);
        this.add(roughEndoplasmicReticulum2);
        this.add(roughEndoplasmicReticulum3);
        this.add(roughEndoplasmicReticulum4);

        this.add(golgiApparatusPanel);
        golgiApparatusPanel.add(golgiApparatusLabel);
        this.add(golgiApparatusButton);
        this.add(golgiApparatusPanelDescription);
        golgiApparatusPanelDescription.add(golgiApparatusPanelClose);
        golgiApparatusPanelDescription.add(golgiApparatusLabelDescription);
        this.add(golgiApparatus1);

        this.add(progressBar);
        this.add(label);

        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==goBack){
            this.dispose();
            Menubiol Menubiol = new Menubiol(passone);
        }
        if(e.getSource()==nucleusButton){
            nucleusPanelDescription.setVisible(true);
        }
        if(e.getSource()==nucleusPanelClose){
            if(!nucleusLabelGreen.isVisible()){
                progressBar.setValue(i=i+12);
            }
            nucleusPanelDescription.setVisible(false);
            nucleusLabel.setVisible(false);
            nucleusLabelGreen.setVisible(true);
            nucleusLabelGreen.setOpaque(true);
            nucleusPanel.add(nucleusLabelGreen);
        }
        if(e.getSource()==nucleus1){
            nucleusPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrionButton){
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrionPanelClose){
            if(!mitochondrionLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            mitochondrionPanelDescription.setVisible(false);
            mitochondrionLabel.setVisible(false);
            mitochondrionLabelGreen.setVisible(true);
            mitochondrionLabelGreen.setOpaque(true);
            mitochondrionPanel.add(mitochondrionLabelGreen);
        }
        if(e.getSource()==mitochondrion1){
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrion2){
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrion3){
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrion4){
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrion5){
            mitochondrionPanelDescription.setVisible(true);
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
            if(!celluloseLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            cellWallPanelDescription.setVisible(false);
            cellWallLabel.setVisible(false);
            cellWallLabelGreen.setVisible(true);
            cellWallLabelGreen.setOpaque(true);
            cellWallPanel.add(cellWallLabelGreen);
        }
        if(e.getSource()==cellWall1){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==cellWall2){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==cellWall3){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuoleButton){
            vacuolePanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuolePanelClose){
            if(!vacuoleLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            vacuolePanelDescription.setVisible(false);
            vacuoleLabel.setVisible(false);
            vacuoleLabelGreen.setVisible(true);
            vacuoleLabelGreen.setOpaque(true);
            vacuolePanel.add(vacuoleLabelGreen);
        }
        if(e.getSource()==vacuole1){
            vacuolePanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuole2){
            vacuolePanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuole3){
            vacuolePanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuole4){
            vacuolePanelDescription.setVisible(true);
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
        if(e.getSource()==roughEndoplasmicReticulumButton){
            roughEndoplasmicReticulumPanelDescription.setVisible(true);
        }
        if(e.getSource()==roughEndoplasmicReticulumPanelClose){
            if(!roughEndoplasmicReticulumLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            roughEndoplasmicReticulumPanelDescription.setVisible(false);
            roughEndoplasmicReticulumLabel.setVisible(false);
            roughEndoplasmicReticulumLabelGreen.setVisible(true);
            roughEndoplasmicReticulumLabelGreen.setOpaque(true);
            roughEndoplasmicReticulumPanel.add(roughEndoplasmicReticulumLabelGreen);
        }
        if(e.getSource()==roughEndoplasmicReticulum1){
            roughEndoplasmicReticulumPanelDescription.setVisible(true);
        }
        if(e.getSource()==roughEndoplasmicReticulum2){
            roughEndoplasmicReticulumPanelDescription.setVisible(true);
        }
        if(e.getSource()==roughEndoplasmicReticulum3){
            roughEndoplasmicReticulumPanelDescription.setVisible(true);
        }
        if(e.getSource()==roughEndoplasmicReticulum4){
            roughEndoplasmicReticulumPanelDescription.setVisible(true);
        }
        if(e.getSource()==golgiApparatusButton){
            golgiApparatusPanelDescription.setVisible(true);
        }
        if(e.getSource()==golgiApparatusPanelClose){
            if(!golgiApparatusLabelGreen.isVisible()){
                progressBar.setValue(i=i+11);
            }
            golgiApparatusPanelDescription.setVisible(false);
            golgiApparatusLabel.setVisible(false);
            golgiApparatusLabelGreen.setVisible(true);
            golgiApparatusLabelGreen.setOpaque(true);
            golgiApparatusPanel.add(golgiApparatusLabelGreen);
        }
        if(e.getSource()==golgiApparatus1){
            golgiApparatusPanelDescription.setVisible(true);
        }
    }
}


