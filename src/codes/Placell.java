package codes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Placell extends JFrame implements ActionListener {

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
    JButton ribosomes13;

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
    JButton cellWall4;
    JButton cellWall5;
    JButton cellWall6;
    JButton cellWall7;
    JButton cellWall8;
    JButton cellWall9;

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

    JPanel golgiApparatusPanel;
    JLabel golgiApparatusLabel;
    JButton golgiApparatusButton;
    JPanel golgiApparatusPanelDescription;
    JLabel golgiApparatusLabelDescription;
    JButton golgiApparatusPanelClose;
    JLabel golgiApparatusLabelGreen;
    JButton golgiApparatus1;
    JButton golgiApparatus2;
    JButton golgiApparatus3;

    JPanel cytoskeletonPanel;
    JLabel cytoskeletonLabel;
    JButton cytoskeletonButton;
    JPanel cytoskeletonPanelDescription;
    JLabel cytoskeletonLabelDescription;
    JButton cytoskeletonPanelClose;
    JLabel cytoskeletonLabelGreen;
    JButton cytoskeleton1;
    JButton cytoskeleton2;

    JPanel peroxisomePanel;
    JLabel peroxisomeLabel;
    JButton peroxisomeButton;
    JPanel peroxisomePanelDescription;
    JLabel peroxisomeLabelDescription;
    JButton peroxisomePanelClose;
    JLabel peroxisomeLabelGreen;
    JButton peroxisome1;
    JButton peroxisome2;
    JButton peroxisome3;
    JButton peroxisome4;

    JPanel plasmodesmataPanel;
    JLabel plasmodesmataLabel;
    JButton plasmodesmataButton;
    JPanel plasmodesmataPanelDescription;
    JLabel plasmodesmataLabelDescription;
    JButton plasmodesmataPanelClose;
    JLabel plasmodesmataLabelGreen;
    JButton plasmodesmata1;
    JButton plasmodesmata2;

    JPanel chloroplastPanel;
    JLabel chloroplastLabel;
    JButton chloroplastButton;
    JPanel chloroplastPanelDescription;
    JLabel chloroplastLabelDescription;
    JButton chloroplastPanelClose;
    JLabel chloroplastLabelGreen;
    JButton chloroplast1;

    JButton goBack;
    String pass3;
    JProgressBar progressBar = new JProgressBar();
    int i=0;

    public Placell(String pass3) {
        this.pass3 = pass3;
        ImageIcon background = new ImageIcon("src/resources/PLACELL.png");
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
        nucleusPanel.setBounds(930,190,250,40);
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
        nucleusButton.setBounds(930,190,250,40);
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
                "<html>The nucleus's function in plant cells is to store " +
                        "and regulate DNA. The main function of the nucleus " +
                        "is to store DNA. The nucleus does this by condensing " +
                        "DNA into a coiled form called chromatin around small " +
                        "proteins called histones.<html>");
        nucleusLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        ImageIcon porzam = new ImageIcon("src/resources/porzam.png");
        nucleusPanelClose = new JButton();
        nucleusPanelClose.setBounds(650,0,50,50);
        nucleusPanelClose.setIcon(porzam);
        nucleusPanelClose.setBorderPainted(false);
        nucleusPanelClose.addActionListener(this);

        nucleus1 = new JButton();
        nucleus1.setBounds(530,217,270,220);
        nucleus1.setOpaque(false);
        nucleus1.setContentAreaFilled(false);
        nucleus1.setBorderPainted(false);
        nucleus1.addActionListener(this);
        nucleus1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrionPanel = new JPanel();
        mitochondrionPanel.setVisible(true);
        mitochondrionPanel.setBounds(930,230,250,40);
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
        mitochondrionButton.setBounds(930,230,250,40);
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
                "<html>Mitochondria are the \"powerhouses\" of the cell, breaking " +
                        "down fuel molecules and capturing energy in cellular " +
                        "respiration. Chloroplasts are found in plants and algae. " +
                        "They're responsible for capturing light energy to make " +
                        "sugars in photosynthesis.<html>");
        mitochondrionLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        mitochondrionPanelClose = new JButton();
        mitochondrionPanelClose.setBounds(650,0,50,50);
        mitochondrionPanelClose.setIcon(porzam);
        mitochondrionPanelClose.setBorderPainted(false);
        mitochondrionPanelClose.addActionListener(this);

        mitochondrion1 = new JButton();
        mitochondrion1.setBounds(110,560,130,70);
        mitochondrion1.setOpaque(false);
        mitochondrion1.setContentAreaFilled(false);
        mitochondrion1.setBorderPainted(false);
        mitochondrion1.addActionListener(this);
        mitochondrion1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrion2 = new JButton();
        mitochondrion2.setBounds(280,560,100,60);
        mitochondrion2.setOpaque(false);
        mitochondrion2.setContentAreaFilled(false);
        mitochondrion2.setBorderPainted(false);
        mitochondrion2.addActionListener(this);
        mitochondrion2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrion3 = new JButton();
        mitochondrion3.setBounds(540,580,140,73);
        mitochondrion3.setOpaque(false);
        mitochondrion3.setContentAreaFilled(false);
        mitochondrion3.setBorderPainted(false);
        mitochondrion3.addActionListener(this);
        mitochondrion3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrion4 = new JButton();
        mitochondrion4.setBounds(335,532,62,54);
        mitochondrion4.setOpaque(false);
        mitochondrion4.setContentAreaFilled(false);
        mitochondrion4.setBorderPainted(false);
        mitochondrion4.addActionListener(this);
        mitochondrion4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomesPanel = new JPanel();
        ribosomesPanel.setVisible(true);
        ribosomesPanel.setBounds(930,270,250,40);
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
        ribosomesButton.setBounds(930,270,250,40);
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
                "<html>A ribosome functions as a micro-machine for making " +
                        "proteins. Ribosomes are composed of special " +
                        "proteins and nucleic acids. The TRANSLATION " +
                        "of information and the Linking of AMINO ACIDS " +
                        "are at the heart of the protein production process.<html>");
        ribosomesLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        ribosomesPanelClose = new JButton();
        ribosomesPanelClose.setBounds(650,0,50,50);
        ribosomesPanelClose.setIcon(porzam);
        ribosomesPanelClose.setBorderPainted(false);
        ribosomesPanelClose.addActionListener(this);

        ribosomes1 = new JButton();
        ribosomes1.setBounds(173,534,15,20);
        ribosomes1.setOpaque(false);
        ribosomes1.setContentAreaFilled(false);
        ribosomes1.setBorderPainted(false);
        ribosomes1.addActionListener(this);
        ribosomes1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes2 = new JButton();
        ribosomes2.setBounds(238,578,30,14);
        ribosomes2.setOpaque(false);
        ribosomes2.setContentAreaFilled(false);
        ribosomes2.setBorderPainted(false);
        ribosomes2.addActionListener(this);
        ribosomes2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes3 = new JButton();
        ribosomes3.setBounds(253,610,20,20);
        ribosomes3.setOpaque(false);
        ribosomes3.setContentAreaFilled(false);
        ribosomes3.setBorderPainted(false);
        ribosomes3.addActionListener(this);
        ribosomes3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes4 = new JButton();
        ribosomes4.setBounds(300,535,30,20);
        ribosomes4.setOpaque(false);
        ribosomes4.setContentAreaFilled(false);
        ribosomes4.setBorderPainted(false);
        ribosomes4.addActionListener(this);
        ribosomes4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes5 = new JButton();
        ribosomes5.setBounds(380,595,25,20);
        ribosomes5.setOpaque(false);
        ribosomes5.setContentAreaFilled(false);
        ribosomes5.setBorderPainted(false);
        ribosomes5.addActionListener(this);
        ribosomes5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes6 = new JButton();
        ribosomes6.setBounds(405,510,15,30);
        ribosomes6.setOpaque(false);
        ribosomes6.setContentAreaFilled(false);
        ribosomes6.setBorderPainted(false);
        ribosomes6.addActionListener(this);
        ribosomes6.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes7 = new JButton();
        ribosomes7.setBounds(410,551,30,10);
        ribosomes7.setOpaque(false);
        ribosomes7.setContentAreaFilled(false);
        ribosomes7.setBorderPainted(false);
        ribosomes7.addActionListener(this);
        ribosomes7.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes8 = new JButton();
        ribosomes8.setBounds(448,497,25,10);
        ribosomes8.setOpaque(false);
        ribosomes8.setContentAreaFilled(false);
        ribosomes8.setBorderPainted(false);
        ribosomes8.addActionListener(this);
        ribosomes8.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes9 = new JButton();
        ribosomes9.setBounds(453,560,25,15);
        ribosomes9.setOpaque(false);
        ribosomes9.setContentAreaFilled(false);
        ribosomes9.setBorderPainted(false);
        ribosomes9.addActionListener(this);
        ribosomes9.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes10 = new JButton();
        ribosomes10.setBounds(455,585,20,20);
        ribosomes10.setOpaque(false);
        ribosomes10.setContentAreaFilled(false);
        ribosomes10.setBorderPainted(false);
        ribosomes10.addActionListener(this);
        ribosomes10.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes11 = new JButton();
        ribosomes11.setBounds(503,615,27,20);
        ribosomes11.setOpaque(false);
        ribosomes11.setContentAreaFilled(false);
        ribosomes11.setBorderPainted(false);
        ribosomes11.addActionListener(this);
        ribosomes11.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes12 = new JButton();
        ribosomes12.setBounds(770,520,20,20);
        ribosomes12.setOpaque(false);
        ribosomes12.setContentAreaFilled(false);
        ribosomes12.setBorderPainted(false);
        ribosomes12.addActionListener(this);
        ribosomes12.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes13 = new JButton();
        ribosomes13.setBounds(798,460,14,24);
        ribosomes13.setOpaque(false);
        ribosomes13.setContentAreaFilled(false);
        ribosomes13.setBorderPainted(false);
        ribosomes13.addActionListener(this);
        ribosomes13.setCursor(new Cursor(Cursor.HAND_CURSOR));

        plasmaMembranePanel = new JPanel();
        plasmaMembranePanel.setVisible(true);
        plasmaMembranePanel.setBounds(930,310,250,40);
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
        plasmaMembraneButton.setBounds(930,310,250,40);
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
                "<html>In plants, as in all organisms, the plasma membrane " +
                        "serves two main roles: (1) the transport of solutes, " +
                        "both into and out of each cell, and (2) sensory " +
                        "transduction, i.e., the sensing and initiation of " +
                        "the cellular response to changing environmental conditions.<html>");
        plasmaMembraneLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        plasmaMembranePanelClose = new JButton();
        plasmaMembranePanelClose.setBounds(650,0,50,50);
        plasmaMembranePanelClose.setIcon(porzam);
        plasmaMembranePanelClose.setBorderPainted(false);
        plasmaMembranePanelClose.addActionListener(this);

        cellWallPanel = new JPanel();
        cellWallPanel.setVisible(true);
        cellWallPanel.setBounds(930,350,250,40);
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
        cellWallButton.setBounds(930,350,250,40);
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
                "<html>The plant cell wall thus has a “skeletal” role " +
                        "in supporting the structure of the plant as " +
                        "a whole, a protective role as an enclosure " +
                        "for each cell individually, and a transport " +
                        "role, helping to form channels for the movement " +
                        "of fluid in the plant.<html>");
        cellWallLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        cellWallPanelClose = new JButton();
        cellWallPanelClose.setBounds(650,0,50,50);
        cellWallPanelClose.setIcon(porzam);
        cellWallPanelClose.setBorderPainted(false);
        cellWallPanelClose.addActionListener(this);

        cellWall1 = new JButton();
        cellWall1.setBounds(680,620,220,80);
        cellWall1.setOpaque(false);
        cellWall1.setContentAreaFilled(false);
        cellWall1.setBorderPainted(false);
        cellWall1.addActionListener(this);
        cellWall1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall2 = new JButton();
        cellWall2.setBounds(765,570,135,50);
        cellWall2.setOpaque(false);
        cellWall2.setContentAreaFilled(false);
        cellWall2.setBorderPainted(false);
        cellWall2.addActionListener(this);
        cellWall2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall3 = new JButton();
        cellWall3.setBounds(830,270,50,310);
        cellWall3.setOpaque(false);
        cellWall3.setContentAreaFilled(false);
        cellWall3.setBorderPainted(false);
        cellWall3.addActionListener(this);
        cellWall3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall4 = new JButton();
        cellWall4.setBounds(385,710,175,260);
        cellWall4.setOpaque(false);
        cellWall4.setContentAreaFilled(false);
        cellWall4.setBorderPainted(false);
        cellWall4.addActionListener(this);
        cellWall4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall5 = new JButton();
        cellWall5.setBounds(280,708,107,104);
        cellWall5.setOpaque(false);
        cellWall5.setContentAreaFilled(false);
        cellWall5.setBorderPainted(false);
        cellWall5.addActionListener(this);
        cellWall5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall6 = new JButton();
        cellWall6.setBounds(100,700,180,200);
        cellWall6.setOpaque(false);
        cellWall6.setContentAreaFilled(false);
        cellWall6.setBorderPainted(false);
        cellWall6.addActionListener(this);
        cellWall6.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall7 = new JButton();
        cellWall7.setBounds(10,450,90,320);
        cellWall7.setOpaque(false);
        cellWall7.setContentAreaFilled(false);
        cellWall7.setBorderPainted(false);
        cellWall7.addActionListener(this);
        cellWall7.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall8 = new JButton();
        cellWall8.setBounds(210,900,180,60);
        cellWall8.setOpaque(false);
        cellWall8.setContentAreaFilled(false);
        cellWall8.setBorderPainted(false);
        cellWall8.addActionListener(this);
        cellWall8.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellWall9 = new JButton();
        cellWall9.setBounds(100,630,90,70);
        cellWall9.setOpaque(false);
        cellWall9.setContentAreaFilled(false);
        cellWall9.setBorderPainted(false);
        cellWall9.addActionListener(this);
        cellWall9.setCursor(new Cursor(Cursor.HAND_CURSOR));

        vacuolePanel = new JPanel();
        vacuolePanel.setVisible(true);
        vacuolePanel.setBounds(930,390,250,40);
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
        vacuoleButton.setBounds(930,390,250,40);
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
                "<html>In plants, the vacuole is crucial for growth " +
                        "and development and has a variety of functions, " +
                        "including storage and transport, intracellular " +
                        "environmental stability, and response to injury. " +
                        "Depending on the cell type and growth conditions, " +
                        "the size of vacuoles is highly dynamic<html>");
        vacuoleLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        vacuolePanelClose = new JButton();
        vacuolePanelClose.setBounds(650,0,50,50);
        vacuolePanelClose.setIcon(porzam);
        vacuolePanelClose.setBorderPainted(false);
        vacuolePanelClose.addActionListener(this);

        vacuole1 = new JButton();
        vacuole1.setBounds(170,280,250,220);
        vacuole1.setOpaque(false);
        vacuole1.setContentAreaFilled(false);
        vacuole1.setBorderPainted(false);
        vacuole1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        vacuole1.addActionListener(this);

        vacuole2 = new JButton();
        vacuole2.setBounds(330,230,180,200);
        vacuole2.setOpaque(false);
        vacuole2.setContentAreaFilled(false);
        vacuole2.setBorderPainted(false);
        vacuole2.addActionListener(this);
        vacuole2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        vacuole3 = new JButton();
        vacuole3.setBounds(510,250,20,120);
        vacuole3.setOpaque(false);
        vacuole3.setContentAreaFilled(false);
        vacuole3.setBorderPainted(false);
        vacuole3.addActionListener(this);
        vacuole3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellulosePanel = new JPanel();
        cellulosePanel.setVisible(true);
        cellulosePanel.setBounds(930,430,250,40);
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
        celluloseButton.setBounds(930,430,250,40);
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
                "<html>The biological function of cellulose in plants is to " +
                        "provide shape and rigidity to the cell wall. In plants, " +
                        "cellulose is embedded within a matrix consisting of " +
                        "pectin and lignin. Pectin and lignin fill in any of " +
                        "the empty spaces found between rows of cellulose to " +
                        "help increase the strength of the cell wall.<html>");
        celluloseLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        cellulosePanelClose = new JButton();
        cellulosePanelClose.setBounds(650,0,50,50);
        cellulosePanelClose.setIcon(porzam);
        cellulosePanelClose.setBorderPainted(false);
        cellulosePanelClose.addActionListener(this);

        roughEndoplasmicReticulumPanel = new JPanel();
        roughEndoplasmicReticulumPanel.setVisible(true);
        roughEndoplasmicReticulumPanel.setBounds(930,470,250,40);
        roughEndoplasmicReticulumPanel.setLayout(new BorderLayout());
        roughEndoplasmicReticulumPanel.setBackground(new Color(0x6af6be));

        roughEndoplasmicReticulumLabel = new JLabel();
        roughEndoplasmicReticulumLabel.setBounds(0, 0, 200, 100);
        roughEndoplasmicReticulumLabel.setVisible(true);
        roughEndoplasmicReticulumLabel.setText("RER and SER");
        roughEndoplasmicReticulumLabel.setFont(new Font("Arial",Font.PLAIN,25));

        roughEndoplasmicReticulumLabelGreen = new JLabel();
        roughEndoplasmicReticulumLabelGreen.setBounds(0, 0, 200, 100);
        roughEndoplasmicReticulumLabelGreen.setVisible(false);
        roughEndoplasmicReticulumLabelGreen.setOpaque(false);
        roughEndoplasmicReticulumLabelGreen.setText("RER and SER");
        roughEndoplasmicReticulumLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        roughEndoplasmicReticulumLabelGreen.setForeground(new Color(0x1F7A1F));
        roughEndoplasmicReticulumLabelGreen.setBackground(new Color(0x6af6be));

        roughEndoplasmicReticulumButton = new JButton();
        roughEndoplasmicReticulumButton.setBounds(930,470,250,40);
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
                "<html>The SER is generally used for the creation/ " +
                        "storage of lipids and steroids, while the RER plays a " +
                        "significant role in the synthesis of various proteins. " +
                        "The RER is termed \"rough\" due ribosomal attachments to " +
                        "the surface compared to the SER, which does not have ribosomes.<html>");
        roughEndoplasmicReticulumLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        roughEndoplasmicReticulumPanelClose = new JButton();
        roughEndoplasmicReticulumPanelClose.setBounds(650,0,50,50);
        roughEndoplasmicReticulumPanelClose.setIcon(porzam);
        roughEndoplasmicReticulumPanelClose.setBorderPainted(false);
        roughEndoplasmicReticulumPanelClose.addActionListener(this);

        roughEndoplasmicReticulum1 = new JButton();
        roughEndoplasmicReticulum1.setBounds(475,435,270,110);
        roughEndoplasmicReticulum1.setOpaque(false);
        roughEndoplasmicReticulum1.setContentAreaFilled(false);
        roughEndoplasmicReticulum1.setBorderPainted(false);
        roughEndoplasmicReticulum1.addActionListener(this);
        roughEndoplasmicReticulum1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        roughEndoplasmicReticulum2 = new JButton();
        roughEndoplasmicReticulum2.setBounds(485,545,220,30);
        roughEndoplasmicReticulum2.setOpaque(false);
        roughEndoplasmicReticulum2.setContentAreaFilled(false);
        roughEndoplasmicReticulum2.setBorderPainted(false);
        roughEndoplasmicReticulum2.addActionListener(this);
        roughEndoplasmicReticulum2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        roughEndoplasmicReticulum3 = new JButton();
        roughEndoplasmicReticulum3.setBounds(745,435,45,60);
        roughEndoplasmicReticulum3.setOpaque(false);
        roughEndoplasmicReticulum3.setContentAreaFilled(false);
        roughEndoplasmicReticulum3.setBorderPainted(false);
        roughEndoplasmicReticulum3.addActionListener(this);
        roughEndoplasmicReticulum3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        golgiApparatusPanel = new JPanel();
        golgiApparatusPanel.setVisible(true);
        golgiApparatusPanel.setBounds(930,510,250,40);
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
        golgiApparatusButton.setBounds(930,510,250,40);
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
                "<html>The function of the Golgi apparatus is processing and " +
                        "packaging proteins that have exited the rough endoplasmic " +
                        "reticulum to be further transported inside and/or outside " +
                        "the cell. In plant cells, the Golgi body also serves as the " +
                        "site for the synthesis of complex polysaccharides.<html>");
        golgiApparatusLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        golgiApparatusPanelClose = new JButton();
        golgiApparatusPanelClose.setBounds(650,0,50,50);
        golgiApparatusPanelClose.setIcon(porzam);
        golgiApparatusPanelClose.setBorderPainted(false);
        golgiApparatusPanelClose.addActionListener(this);

        golgiApparatus1 = new JButton();
        golgiApparatus1.setBounds(100,480,70,70);
        golgiApparatus1.setOpaque(false);
        golgiApparatus1.setContentAreaFilled(false);
        golgiApparatus1.setBorderPainted(false);
        golgiApparatus1.addActionListener(this);
        golgiApparatus1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        golgiApparatus2 = new JButton();
        golgiApparatus2.setBounds(280,620,220,90);
        golgiApparatus2.setOpaque(false);
        golgiApparatus2.setContentAreaFilled(false);
        golgiApparatus2.setBorderPainted(false);
        golgiApparatus2.addActionListener(this);
        golgiApparatus2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        golgiApparatus3 = new JButton();
        golgiApparatus3.setBounds(705,545,60,70);
        golgiApparatus3.setOpaque(false);
        golgiApparatus3.setContentAreaFilled(false);
        golgiApparatus3.setBorderPainted(false);
        golgiApparatus3.addActionListener(this);
        golgiApparatus3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cytoskeletonPanel = new JPanel();
        cytoskeletonPanel.setVisible(true);
        cytoskeletonPanel.setBounds(930,550,250,40);
        cytoskeletonPanel.setLayout(new BorderLayout());
        cytoskeletonPanel.setBackground(new Color(0x6af6be));

        cytoskeletonLabel = new JLabel();
        cytoskeletonLabel.setBounds(0, 0, 200, 100);
        cytoskeletonLabel.setVisible(true);
        cytoskeletonLabel.setText("Cytoskeleton");
        cytoskeletonLabel.setFont(new Font("Arial",Font.PLAIN,25));

        cytoskeletonLabelGreen = new JLabel();
        cytoskeletonLabelGreen.setBounds(0, 0, 200, 100);
        cytoskeletonLabelGreen.setVisible(false);
        cytoskeletonLabelGreen.setOpaque(false);
        cytoskeletonLabelGreen.setText("Cytoskeleton");
        cytoskeletonLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        cytoskeletonLabelGreen.setForeground(new Color(0x1F7A1F));
        cytoskeletonLabelGreen.setBackground(new Color(0x6af6be));

        cytoskeletonButton = new JButton();
        cytoskeletonButton.setBounds(930,550,250,40);
        cytoskeletonButton.setOpaque(false);
        cytoskeletonButton.setContentAreaFilled(false);
        cytoskeletonButton.setBorderPainted(true);
        cytoskeletonButton.addActionListener(this);

        cytoskeletonPanelDescription = new JPanel();
        cytoskeletonPanelDescription.setVisible(false);
        cytoskeletonPanelDescription.setOpaque(true);
        cytoskeletonPanelDescription.setBounds(230,190,700,250);
        cytoskeletonPanelDescription.setLayout(new BorderLayout());
        cytoskeletonPanelDescription.setBackground(Color.cyan);

        cytoskeletonLabelDescription = new JLabel();
        cytoskeletonLabelDescription.setVerticalAlignment(JLabel.CENTER);
        cytoskeletonLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        cytoskeletonLabelDescription.setVisible(true);
        cytoskeletonLabelDescription.setText(
                "<html>The plant cytoskeleton is a highly dynamic " +
                        "and versatile intracellular scaffold composed " +
                        "of microtubules and actin microfilaments and plays " +
                        "an important role in many aspects of plant cell growth " +
                        "and development, including such fundamental processes as " +
                        "cell division, cell expansion, and intracellular " +
                        "organization and motility <html>");
        cytoskeletonLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        cytoskeletonPanelClose = new JButton();
        cytoskeletonPanelClose.setBounds(650,0,50,50);
        cytoskeletonPanelClose.setIcon(porzam);
        cytoskeletonPanelClose.setBorderPainted(false);
        cytoskeletonPanelClose.addActionListener(this);

        cytoskeleton1 = new JButton();
        cytoskeleton1.setBounds(545,652,35,30);
        cytoskeleton1.setOpaque(false);
        cytoskeleton1.setContentAreaFilled(false);
        cytoskeleton1.setBorderPainted(false);
        cytoskeleton1.addActionListener(this);
        cytoskeleton1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cytoskeleton2 = new JButton();
        cytoskeleton2.setBounds(192,635,60,50);
        cytoskeleton2.setOpaque(false);
        cytoskeleton2.setContentAreaFilled(false);
        cytoskeleton2.setBorderPainted(false);
        cytoskeleton2.addActionListener(this);
        cytoskeleton2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        peroxisomePanel = new JPanel();
        peroxisomePanel.setVisible(true);
        peroxisomePanel.setBounds(930,590,250,40);
        peroxisomePanel.setLayout(new BorderLayout());
        peroxisomePanel.setBackground(new Color(0x6af6be));

        peroxisomeLabel = new JLabel();
        peroxisomeLabel.setBounds(0, 0, 200, 100);
        peroxisomeLabel.setVisible(true);
        peroxisomeLabel.setText("Peroxisome");
        peroxisomeLabel.setFont(new Font("Arial",Font.PLAIN,25));

        peroxisomeLabelGreen = new JLabel();
        peroxisomeLabelGreen.setBounds(0, 0, 200, 100);
        peroxisomeLabelGreen.setVisible(false);
        peroxisomeLabelGreen.setOpaque(false);
        peroxisomeLabelGreen.setText("Peroxisome");
        peroxisomeLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        peroxisomeLabelGreen.setForeground(new Color(0x1F7A1F));
        peroxisomeLabelGreen.setBackground(new Color(0x6af6be));

        peroxisomeButton = new JButton();
        peroxisomeButton.setBounds(930,590,250,40);
        peroxisomeButton.setOpaque(false);
        peroxisomeButton.setContentAreaFilled(false);
        peroxisomeButton.setBorderPainted(true);
        peroxisomeButton.addActionListener(this);

        peroxisomePanelDescription = new JPanel();
        peroxisomePanelDescription.setVisible(false);
        peroxisomePanelDescription.setOpaque(true);
        peroxisomePanelDescription.setBounds(230,190,700,250);
        peroxisomePanelDescription.setLayout(new BorderLayout());
        peroxisomePanelDescription.setBackground(Color.cyan);

        peroxisomeLabelDescription = new JLabel();
        peroxisomeLabelDescription.setVerticalAlignment(JLabel.CENTER);
        peroxisomeLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        peroxisomeLabelDescription.setVisible(true);
        peroxisomeLabelDescription.setText(
                "<html>Peroxisomes are organelles that sequester diverse oxidative " +
                        "reactions and play important roles in metabolism, reactive " +
                        "oxygen species detoxification, and signaling. Oxidative " +
                        "pathways housed in peroxisomes include fatty acid " +
                        "β-oxidation, which contributes to embryogenesis, " +
                        "seedling growth, and stomatal opening.<html>");
        peroxisomeLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        peroxisomePanelClose = new JButton();
        peroxisomePanelClose.setBounds(650,0,50,50);
        peroxisomePanelClose.setIcon(porzam);
        peroxisomePanelClose.setBorderPainted(false);
        peroxisomePanelClose.addActionListener(this);

        peroxisome1 = new JButton();
        peroxisome1.setBounds(403,570,40,25);
        peroxisome1.setOpaque(false);
        peroxisome1.setContentAreaFilled(false);
        peroxisome1.setBorderPainted(false);
        peroxisome1.addActionListener(this);
        peroxisome1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        peroxisome2 = new JButton();
        peroxisome2.setBounds(423,518,40,35);
        peroxisome2.setOpaque(false);
        peroxisome2.setContentAreaFilled(false);
        peroxisome2.setBorderPainted(false);
        peroxisome2.addActionListener(this);
        peroxisome2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        peroxisome3 = new JButton();
        peroxisome3.setBounds(477,573,48,37);
        peroxisome3.setOpaque(false);
        peroxisome3.setContentAreaFilled(false);
        peroxisome3.setBorderPainted(false);
        peroxisome3.addActionListener(this);
        peroxisome3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        peroxisome4 = new JButton();
        peroxisome4.setBounds(777,495,35,25);
        peroxisome4.setOpaque(false);
        peroxisome4.setContentAreaFilled(false);
        peroxisome4.setBorderPainted(false);
        peroxisome4.addActionListener(this);
        peroxisome4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        plasmodesmataPanel = new JPanel();
        plasmodesmataPanel.setVisible(true);
        plasmodesmataPanel.setBounds(930,630,250,40);
        plasmodesmataPanel.setLayout(new BorderLayout());
        plasmodesmataPanel.setBackground(new Color(0x6af6be));

        plasmodesmataLabel = new JLabel();
        plasmodesmataLabel.setBounds(0, 0, 200, 100);
        plasmodesmataLabel.setVisible(true);
        plasmodesmataLabel.setText("Plasmodesmata");
        plasmodesmataLabel.setFont(new Font("Arial",Font.PLAIN,25));

        plasmodesmataLabelGreen = new JLabel();
        plasmodesmataLabelGreen.setBounds(0, 0, 200, 100);
        plasmodesmataLabelGreen.setVisible(false);
        plasmodesmataLabelGreen.setOpaque(false);
        plasmodesmataLabelGreen.setText("Plasmodesmata");
        plasmodesmataLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        plasmodesmataLabelGreen.setForeground(new Color(0x1F7A1F));
        plasmodesmataLabelGreen.setBackground(new Color(0x6af6be));

        plasmodesmataButton = new JButton();
        plasmodesmataButton.setBounds(930,630,250,40);
        plasmodesmataButton.setOpaque(false);
        plasmodesmataButton.setContentAreaFilled(false);
        plasmodesmataButton.setBorderPainted(true);
        plasmodesmataButton.addActionListener(this);

        plasmodesmataPanelDescription = new JPanel();
        plasmodesmataPanelDescription.setVisible(false);
        plasmodesmataPanelDescription.setOpaque(true);
        plasmodesmataPanelDescription.setBounds(230,190,700,250);
        plasmodesmataPanelDescription.setLayout(new BorderLayout());
        plasmodesmataPanelDescription.setBackground(Color.cyan);

        plasmodesmataLabelDescription = new JLabel();
        plasmodesmataLabelDescription.setVerticalAlignment(JLabel.CENTER);
        plasmodesmataLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        plasmodesmataLabelDescription.setVisible(true);
        plasmodesmataLabelDescription.setText(
                "<html>Plasmodesmata facilitate the movement of molecules between " +
                        "cells, ranging from small photosynthetic products to " +
                        "large proteins and mRNA. In vascular tissue, plasmodesmata " +
                        "are crucial for the movement of nutrients. They are also " +
                        "crucial during development because, unlike animal cells, " +
                        "plant cells do not move.<html>");
        plasmodesmataLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        plasmodesmataPanelClose = new JButton();
        plasmodesmataPanelClose.setBounds(650,0,50,50);
        plasmodesmataPanelClose.setIcon(porzam);
        plasmodesmataPanelClose.setBorderPainted(false);
        plasmodesmataPanelClose.addActionListener(this);

        plasmodesmata1 = new JButton();
        plasmodesmata1.setBounds(560,700,240,160);
        plasmodesmata1.setOpaque(false);
        plasmodesmata1.setContentAreaFilled(false);
        plasmodesmata1.setBorderPainted(false);
        plasmodesmata1.addActionListener(this);
        plasmodesmata1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        plasmodesmata2 = new JButton();
        plasmodesmata2.setBounds(280,810,105,90);
        plasmodesmata2.setOpaque(false);
        plasmodesmata2.setContentAreaFilled(false);
        plasmodesmata2.setBorderPainted(false);
        plasmodesmata2.addActionListener(this);
        plasmodesmata2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        chloroplastPanel = new JPanel();
        chloroplastPanel.setVisible(true);
        chloroplastPanel.setBounds(930,670,250,40);
        chloroplastPanel.setLayout(new BorderLayout());
        chloroplastPanel.setBackground(new Color(0x6af6be));

        chloroplastLabel = new JLabel();
        chloroplastLabel.setBounds(0, 0, 200, 100);
        chloroplastLabel.setVisible(true);
        chloroplastLabel.setText("Chloroplast");
        chloroplastLabel.setFont(new Font("Arial",Font.PLAIN,25));

        chloroplastLabelGreen = new JLabel();
        chloroplastLabelGreen.setBounds(0, 0, 200, 100);
        chloroplastLabelGreen.setVisible(false);
        chloroplastLabelGreen.setOpaque(false);
        chloroplastLabelGreen.setText("Chloroplast");
        chloroplastLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        chloroplastLabelGreen.setForeground(new Color(0x1F7A1F));
        chloroplastLabelGreen.setBackground(new Color(0x6af6be));

        chloroplastButton = new JButton();
        chloroplastButton.setBounds(930,670,250,40);
        chloroplastButton.setOpaque(false);
        chloroplastButton.setContentAreaFilled(false);
        chloroplastButton.setBorderPainted(true);
        chloroplastButton.addActionListener(this);

        chloroplastPanelDescription = new JPanel();
        chloroplastPanelDescription.setVisible(false);
        chloroplastPanelDescription.setOpaque(true);
        chloroplastPanelDescription.setBounds(230,190,700,250);
        chloroplastPanelDescription.setLayout(new BorderLayout());
        chloroplastPanelDescription.setBackground(Color.cyan);

        chloroplastLabelDescription = new JLabel();
        chloroplastLabelDescription.setVerticalAlignment(JLabel.CENTER);
        chloroplastLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        chloroplastLabelDescription.setVisible(true);
        chloroplastLabelDescription.setText(
                "<html>Chloroplasts produce energy through photosynthesis " +
                        "and oxygen-release processes, which sustain plant growth " +
                        "and crop yield. As such, chloroplasts are responsible for " +
                        "the biosynthesis of active compounds such as amino acids, " +
                        "phytohormones, nucleotides, vitamins, lipids, and " +
                        "secondary metabolites.<html>");
        chloroplastLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        chloroplastPanelClose = new JButton();
        chloroplastPanelClose.setBounds(650,0,50,50);
        chloroplastPanelClose.setIcon(porzam);
        chloroplastPanelClose.setBorderPainted(false);
        chloroplastPanelClose.addActionListener(this);

        chloroplast1 = new JButton();
        chloroplast1.setBounds(193,500,87,60);
        chloroplast1.setOpaque(false);
        chloroplast1.setContentAreaFilled(false);
        chloroplast1.setBorderPainted(false);
        chloroplast1.addActionListener(this);
        chloroplast1.setCursor(new Cursor(Cursor.HAND_CURSOR));

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
        this.add(ribosomes13);

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
        this.add(cellWall4);
        this.add(cellWall5);
        this.add(cellWall6);
        this.add(cellWall7);
        this.add(cellWall8);
        this.add(cellWall9);

        this.add(vacuolePanel);
        vacuolePanel.add(vacuoleLabel);
        this.add(vacuoleButton);
        this.add(vacuolePanelDescription);
        vacuolePanelDescription.add(vacuolePanelClose);
        vacuolePanelDescription.add(vacuoleLabelDescription);
        this.add(vacuole1);
        this.add(vacuole2);
        this.add(vacuole3);

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

        this.add(golgiApparatusPanel);
        golgiApparatusPanel.add(golgiApparatusLabel);
        this.add(golgiApparatusButton);
        this.add(golgiApparatusPanelDescription);
        golgiApparatusPanelDescription.add(golgiApparatusPanelClose);
        golgiApparatusPanelDescription.add(golgiApparatusLabelDescription);
        this.add(golgiApparatus1);
        this.add(golgiApparatus2);
        this.add(golgiApparatus3);

        this.add(cytoskeletonPanel);
        cytoskeletonPanel.add(cytoskeletonLabel);
        this.add(cytoskeletonButton);
        this.add(cytoskeletonPanelDescription);
        cytoskeletonPanelDescription.add(cytoskeletonPanelClose);
        cytoskeletonPanelDescription.add(cytoskeletonLabelDescription);
        this.add(cytoskeleton1);
        this.add(cytoskeleton2);

        this.add(peroxisomePanel);
        peroxisomePanel.add(peroxisomeLabel);
        this.add(peroxisomeButton);
        this.add(peroxisomePanelDescription);
        peroxisomePanelDescription.add(peroxisomePanelClose);
        peroxisomePanelDescription.add(peroxisomeLabelDescription);
        this.add(peroxisome1);
        this.add(peroxisome2);
        this.add(peroxisome3);
        this.add(peroxisome4);

        this.add(plasmodesmataPanel);
        plasmodesmataPanel.add(plasmodesmataLabel);
        this.add(plasmodesmataButton);
        this.add(plasmodesmataPanelDescription);
        plasmodesmataPanelDescription.add(plasmodesmataPanelClose);
        plasmodesmataPanelDescription.add(plasmodesmataLabelDescription);
        this.add(plasmodesmata1);
        this.add(plasmodesmata2);
        
        this.add(chloroplastPanel);
        chloroplastPanel.add(chloroplastLabel);
        this.add(chloroplastButton);
        this.add(chloroplastPanelDescription);
        chloroplastPanelDescription.add(chloroplastPanelClose);
        chloroplastPanelDescription.add(chloroplastLabelDescription);
        this.add(chloroplast1);

        this.add(progressBar);
        this.add(label);

        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==goBack){
            this.dispose();
            Menubiol Menubiol = new Menubiol(pass3);
        }
        if(e.getSource()==nucleusButton){
            nucleusPanelDescription.setVisible(true);
        }
        if(e.getSource()==nucleusPanelClose){
            if(!nucleusLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
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
                progressBar.setValue(i=i+8);
            }
            mitochondrionPanelDescription.setVisible(false);
            mitochondrionLabel.setVisible(false);
            mitochondrionLabelGreen.setVisible(true);
            mitochondrionLabelGreen.setOpaque(true);
            mitochondrionPanel.add(mitochondrionLabelGreen);
        }
        if(e.getSource()==mitochondrion1) {
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrion2) {
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrion3) {
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrion4) {
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomesButton){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomesPanelClose){
            if(!ribosomesLabelGreen.isVisible()){
                progressBar.setValue(i=i+7);
            }
            ribosomesPanelDescription.setVisible(false);
            ribosomesLabel.setVisible(false);
            ribosomesLabelGreen.setVisible(true);
            ribosomesLabelGreen.setOpaque(true);
            ribosomesPanel.add(ribosomesLabelGreen);
        }
        if(e.getSource()==ribosomes1) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes2) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes3) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes4) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes5) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes6) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes7) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes8) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes9) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes10) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes11) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes12) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomes13) {
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmaMembraneButton){
            plasmaMembranePanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmaMembranePanelClose){
            if(!plasmaMembraneLabelGreen.isVisible()){
                progressBar.setValue(i=i+7);
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
                progressBar.setValue(i=i+7);
            }
            cellWallPanelDescription.setVisible(false);
            cellWallLabel.setVisible(false);
            cellWallLabelGreen.setVisible(true);
            cellWallLabelGreen.setOpaque(true);
            cellWallPanel.add(cellWallLabelGreen);
            i++;
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
        if(e.getSource()==cellWall4){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==cellWall5){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==cellWall6){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==cellWall7){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==cellWall8){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==cellWall9){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuoleButton){
            vacuolePanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuolePanelClose){
            if(!vacuoleLabelGreen.isVisible()){
                progressBar.setValue(i=i+7);
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
        if(e.getSource()==celluloseButton){
            cellulosePanelDescription.setVisible(true);
        }
        if(e.getSource()==cellulosePanelClose){
            if(!celluloseLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
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
                progressBar.setValue(i=i+8);
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
        if(e.getSource()==golgiApparatusButton){
            golgiApparatusPanelDescription.setVisible(true);
        }
        if(e.getSource()==golgiApparatusPanelClose){
            if(!golgiApparatusLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
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
        if(e.getSource()==golgiApparatus2){
            golgiApparatusPanelDescription.setVisible(true);
        }
        if(e.getSource()==golgiApparatus3){
            golgiApparatusPanelDescription.setVisible(true);
        }
        if(e.getSource()==cytoskeletonButton){
            cytoskeletonPanelDescription.setVisible(true);
        }
        if(e.getSource()==cytoskeletonPanelClose){
            if(!cytoskeletonLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
            }
            cytoskeletonPanelDescription.setVisible(false);
            cytoskeletonLabel.setVisible(false);
            cytoskeletonLabelGreen.setVisible(true);
            cytoskeletonLabelGreen.setOpaque(true);
            cytoskeletonPanel.add(cytoskeletonLabelGreen);
        }
        if(e.getSource()==cytoskeleton1){
            cytoskeletonPanelDescription.setVisible(true);
        }
        if(e.getSource()==cytoskeleton2){
            cytoskeletonPanelDescription.setVisible(true);
        }
        if(e.getSource()==peroxisomeButton){
            peroxisomePanelDescription.setVisible(true);
        }
        if(e.getSource()==peroxisomePanelClose){
            if(!peroxisomeLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
            }
            peroxisomePanelDescription.setVisible(false);
            peroxisomeLabel.setVisible(false);
            peroxisomeLabelGreen.setVisible(true);
            peroxisomeLabelGreen.setOpaque(true);
            peroxisomePanel.add(peroxisomeLabelGreen);
        }
        if(e.getSource()==peroxisome1){
            peroxisomePanelDescription.setVisible(true);
        }
        if(e.getSource()==peroxisome2){
            peroxisomePanelDescription.setVisible(true);
        }
        if(e.getSource()==peroxisome3){
            peroxisomePanelDescription.setVisible(true);
        }
        if(e.getSource()==peroxisome4){
            peroxisomePanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmodesmataButton){
            plasmodesmataPanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmodesmataPanelClose){
            if(!plasmodesmataLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
            }
            plasmodesmataPanelDescription.setVisible(false);
            plasmodesmataLabel.setVisible(false);
            plasmodesmataLabelGreen.setVisible(true);
            plasmodesmataLabelGreen.setOpaque(true);
            plasmodesmataPanel.add(plasmodesmataLabelGreen);
        }
        if(e.getSource()==plasmodesmata1){
            plasmodesmataPanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmodesmata2){
            plasmodesmataPanelDescription.setVisible(true);
        }
        if(e.getSource()==chloroplastButton){
            chloroplastPanelDescription.setVisible(true);
        }
        if(e.getSource()==chloroplastPanelClose){
            if(!chloroplastLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
            }
            chloroplastPanelDescription.setVisible(false);
            chloroplastLabel.setVisible(false);
            chloroplastLabelGreen.setVisible(true);
            chloroplastLabelGreen.setOpaque(true);
            chloroplastPanel.add(chloroplastLabelGreen);
        }
        if(e.getSource()==chloroplast1){
            chloroplastPanelDescription.setVisible(true);
        }
    }
}


