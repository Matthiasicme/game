package codes;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Anicell extends JFrame implements ActionListener {

    JPanel nucleusPanel;
    JLabel nucleusLabel;
    JButton nucleusButton;
    JPanel nucleusPanelDescription;
    JLabel nucleusLabelDescription;
    JButton nucleusPanelClose;
    JLabel nucleusLabelGreen;
    JButton nucleus1;
    JButton nucleus2;

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

    JPanel ribosomesPanel;
    JLabel ribosomesLabel;
    JButton ribosomesButton;
    JPanel ribosomesPanelDescription;
    JLabel ribosomesLabelDescription;
    JButton ribosomesPanelClose;
    JLabel ribosomesLabelGreen;
    JButton ribosomes1;
    JButton ribosomes2;

    JPanel plasmaMembranePanel;
    JLabel plasmaMembraneLabel;
    JButton plasmaMembraneButton;
    JPanel plasmaMembranePanelDescription;
    JLabel plasmaMembraneLabelDescription;
    JButton plasmaMembranePanelClose;
    JLabel plasmaMembraneLabelGreen;
    JButton plasmamembrane1;
    JButton plasmamembrane2;

    JPanel centrosomePanel;
    JLabel centrosomeLabel;
    JButton centrosomeButton;
    JPanel centrosomePanelDescription;
    JLabel centrosomeLabelDescription;
    JButton centrosomePanelClose;
    JLabel centrosomeLabelGreen;
    JButton centrosome1;

    JPanel vacuolePanel;
    JLabel vacuoleLabel;
    JButton vacuoleButton;
    JPanel vacuolePanelDescription;
    JLabel vacuoleLabelDescription;
    JButton vacuolePanelClose;
    JLabel vacuoleLabelGreen;
    JButton vacuole1;
    JButton vacuole2;

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

    JPanel cytoskeletonPanel;
    JLabel cytoskeletonLabel;
    JButton cytoskeletonButton;
    JPanel cytoskeletonPanelDescription;
    JLabel cytoskeletonLabelDescription;
    JButton cytoskeletonPanelClose;
    JLabel cytoskeletonLabelGreen;
    JButton cytoskeleton1;
    JButton cytoskeleton2;
    JButton cytoskeleton3;
    JButton cytoskeleton4;
    JButton cytoskeleton5;
    JButton cytoskeleton6;
    JButton cytoskeleton7;

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

    JPanel lysosomePanel;
    JLabel lysosomeLabel;
    JButton lysosomeButton;
    JPanel lysosomePanelDescription;
    JLabel lysosomeLabelDescription;
    JButton lysosomePanelClose;
    JLabel lysosomeLabelGreen;
    JButton lysosome1;
    JButton lysosome2;
    JButton lysosome3;
    JButton lysosome4;

    JButton goBack;
    String pass4;
    JProgressBar progressBar = new JProgressBar();
    int i=0;

    public Anicell(String pass4) {
        this.pass4 = pass4;
        ImageIcon background = new ImageIcon("src/resources/ANICELL.png");
        JLabel label = new JLabel();
        label.setIcon(background);

        Border border = BorderFactory.createLineBorder(Color.BLUE, 1);
        Border bb = BorderFactory.createLineBorder(Color.RED, 1);

        progressBar.setValue(0);
        progressBar.setBounds(390,120,500,50);
        progressBar.setStringPainted(true);
        //progressBar.setString("Level");
        progressBar.setBorderPainted(true);
        progressBar.setBorder(border);
        progressBar.setForeground(Color.green);
        progressBar.setBackground(Color.RED);

        //Border border = BorderFactory.createLineBorder(Color.green, 5);
        nucleusPanel = new JPanel();
        nucleusPanel.setVisible(true);
        nucleusPanel.setBounds(930,190,280,40);
        nucleusPanel.setLayout(new BorderLayout());
        nucleusPanel.setBackground(new Color(0x6af6be));
        //nucleusPanel.setBorder(border);

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
        //nucleusPanelDescription.setBorder(border);

        nucleusLabelDescription = new JLabel();
        nucleusLabelDescription.setVerticalAlignment(JLabel.CENTER);
        nucleusLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        nucleusLabelDescription.setVisible(true);
        nucleusLabelDescription.setText(
                "<html>The nucleus controls and regulates " +
                        "the activities of the cell (e.g., " +
                        "growth and metabolism) and carries " +
                        "the genes, structures that contain " +
                        "the hereditary information. Nucleoli " +
                        "are small bodies often seen within " +
                        "the nucleus. Consists of: nuclear " +
                        "envelope, nucleous and chromatine.<html>");
        nucleusLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        ImageIcon porzam = new ImageIcon("src/resources/porzam.png");
        nucleusPanelClose = new JButton();
        nucleusPanelClose.setBounds(650,0,50,50);
        nucleusPanelClose.setIcon(porzam);
        nucleusPanelClose.setBorderPainted(false);
        nucleusPanelClose.addActionListener(this);

        nucleus1 = new JButton();
        nucleus1.setBounds(330,200,260,270);
        nucleus1.setOpaque(false);
        nucleus1.setContentAreaFilled(false);
        nucleus1.setBorderPainted(false);
        nucleus1.addActionListener(this);
        nucleus1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        nucleus2 = new JButton();
        nucleus2.setBounds(590,260,70,150);
        nucleus2.setOpaque(false);
        nucleus2.setContentAreaFilled(false);
        nucleus2.setBorderPainted(false);
        nucleus2.addActionListener(this);
        nucleus2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrionPanel = new JPanel();
        mitochondrionPanel.setVisible(true);
        mitochondrionPanel.setBounds(930,230,280,40);
        mitochondrionPanel.setLayout(new BorderLayout());
        mitochondrionPanel.setBackground(new Color(0x6af6be));
        //mitochondrionPanel.setBorder(border);

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
        //mitochondrionPanelDescription.setBorder(border);

        mitochondrionLabelDescription = new JLabel();
        mitochondrionLabelDescription.setVerticalAlignment(JLabel.CENTER);
        mitochondrionLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        mitochondrionLabelDescription.setVisible(true);
        mitochondrionLabelDescription.setText(
                "<html>Mitochondria are membrane-bound cell " +
                        "organelles (mitochondrion, singular) " +
                        "that generate most of the chemical " +
                        "energy needed to power the cell's " +
                        "biochemical reactions.<html>");
        mitochondrionLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        mitochondrionPanelClose = new JButton();
        mitochondrionPanelClose.setBounds(650,0,50,50);
        mitochondrionPanelClose.setIcon(porzam);
        mitochondrionPanelClose.setBorderPainted(false);
        mitochondrionPanelClose.addActionListener(this);

        mitochondrion1 = new JButton();
        mitochondrion1.setBounds(440,717,250,100);
        mitochondrion1.setOpaque(false);
        mitochondrion1.setContentAreaFilled(false);
        mitochondrion1.setBorderPainted(false);
        mitochondrion1.addActionListener(this);
        mitochondrion1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrion2 = new JButton();
        mitochondrion2.setBounds(730,545,130,68);
        mitochondrion2.setOpaque(false);
        mitochondrion2.setContentAreaFilled(false);
        mitochondrion2.setBorderPainted(false);
        mitochondrion2.addActionListener(this);
        mitochondrion2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        mitochondrion3 = new JButton();
        mitochondrion3.setBounds(780,450,90,95);
        mitochondrion3.setOpaque(false);
        mitochondrion3.setContentAreaFilled(false);
        mitochondrion3.setBorderPainted(false);
        mitochondrion3.addActionListener(this);
        mitochondrion3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomesPanel = new JPanel();
        ribosomesPanel.setVisible(true);
        ribosomesPanel.setBounds(930,270,280,40);
        ribosomesPanel.setLayout(new BorderLayout());
        ribosomesPanel.setBackground(new Color(0x6af6be));
        //ribosomesPanel.setBorder(border);

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
        //ribosomesPanelDescription.setBorder(border);

        ribosomesLabelDescription = new JLabel();
        ribosomesLabelDescription.setVerticalAlignment(JLabel.CENTER);
        ribosomesLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        ribosomesLabelDescription.setVisible(true);
        ribosomesLabelDescription.setText(
                "<html>A ribosome functions as a micro-machine " +
                        "for making proteins. Ribosomes are composed " +
                        "of special proteins and nucleic acids. " +
                        "The TRANSLATION of information and the " +
                        "Linking of AMINO ACIDS are at the heart " +
                        "of the protein production process.<html>");
        ribosomesLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        ribosomesPanelClose = new JButton();
        ribosomesPanelClose.setBounds(650,0,50,50);
        ribosomesPanelClose.setIcon(porzam);
        ribosomesPanelClose.setBorderPainted(false);
        ribosomesPanelClose.addActionListener(this);

        ribosomes1 = new JButton();
        ribosomes1.setBounds(70,590,60,55);
        ribosomes1.setOpaque(false);
        ribosomes1.setContentAreaFilled(false);
        ribosomes1.setBorderPainted(false);
        ribosomes1.addActionListener(this);
        ribosomes1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ribosomes2 = new JButton();
        ribosomes2.setBounds(460,602,80,68);
        ribosomes2.setOpaque(false);
        ribosomes2.setContentAreaFilled(false);
        ribosomes2.setBorderPainted(false);
        ribosomes2.addActionListener(this);
        ribosomes2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        plasmaMembranePanel = new JPanel();
        plasmaMembranePanel.setVisible(true);
        plasmaMembranePanel.setBounds(930,310,280,40);
        plasmaMembranePanel.setLayout(new BorderLayout());
        plasmaMembranePanel.setBackground(new Color(0x6af6be));
        //plasmaMembranePanel.setBorder(border);

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
        //plasmaMembranePanelDescription.setBorder(border);

        plasmaMembraneLabelDescription = new JLabel();
        plasmaMembraneLabelDescription.setVerticalAlignment(JLabel.CENTER);
        plasmaMembraneLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        plasmaMembraneLabelDescription.setVisible(true);
        plasmaMembraneLabelDescription.setText(
                "<html>The plasma membrane of a cell is a network of lipids " +
                        "and proteins that forms the boundary between a " +
                        "cell's contents and the outside of the cell. It " +
                        "is also simply called the cell membrane. The " +
                        "main function of the plasma membrane is to protect " +
                        "the cell from its surrounding environment.<html>");
        plasmaMembraneLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        plasmaMembranePanelClose = new JButton();
        plasmaMembranePanelClose.setBounds(650,0,50,50);
        plasmaMembranePanelClose.setIcon(porzam);
        plasmaMembranePanelClose.setBorderPainted(false);
        plasmaMembranePanelClose.addActionListener(this);

        plasmamembrane1 = new JButton();
        plasmamembrane1.setBounds(40,820,470,160);
        plasmamembrane1.setOpaque(false);
        plasmamembrane1.setContentAreaFilled(false);
        plasmamembrane1.setBorderPainted(false);
        plasmamembrane1.addActionListener(this);
        plasmamembrane1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        plasmamembrane2 = new JButton();
        plasmamembrane2.setBounds(550,820,300,160);
        plasmamembrane2.setOpaque(false);
        plasmamembrane2.setContentAreaFilled(false);
        plasmamembrane2.setBorderPainted(false);
        plasmamembrane2.addActionListener(this);
        plasmamembrane2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        centrosomePanel = new JPanel();
        centrosomePanel.setVisible(true);
        centrosomePanel.setBounds(930,350,280,40);
        centrosomePanel.setLayout(new BorderLayout());
        centrosomePanel.setBackground(new Color(0x6af6be));
        //centrosomePanel.setBorder(border);

        centrosomeLabel = new JLabel();
        centrosomeLabel.setBounds(0, 0, 200, 100);
        centrosomeLabel.setVisible(true);
        centrosomeLabel.setText("Centrosome");
        centrosomeLabel.setFont(new Font("Arial",Font.PLAIN,25));

        centrosomeLabelGreen = new JLabel();
        centrosomeLabelGreen.setBounds(0, 0, 200, 100);
        centrosomeLabelGreen.setVisible(false);
        centrosomeLabelGreen.setOpaque(false);
        centrosomeLabelGreen.setText("Centrosome");
        centrosomeLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        centrosomeLabelGreen.setForeground(new Color(0x1F7A1F));
        centrosomeLabelGreen.setBackground(new Color(0x6af6be));

        centrosomeButton = new JButton();
        centrosomeButton.setBounds(930,350,280,40);
        centrosomeButton.setOpaque(false);
        centrosomeButton.setContentAreaFilled(false);
        centrosomeButton.setBorderPainted(true);
        centrosomeButton.addActionListener(this);

        centrosomePanelDescription = new JPanel();
        centrosomePanelDescription.setVisible(false);
        centrosomePanelDescription.setOpaque(true);
        centrosomePanelDescription.setBounds(230,190,700,250);
        centrosomePanelDescription.setLayout(new BorderLayout());
        centrosomePanelDescription.setBackground(Color.cyan);
        //centrosomePanelDescription.setBorder(border);

        centrosomeLabelDescription = new JLabel();
        centrosomeLabelDescription.setVerticalAlignment(JLabel.CENTER);
        centrosomeLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        centrosomeLabelDescription.setVisible(true);
        centrosomeLabelDescription.setText(
                "<html>The centrosome is the primary microtubule-organizing " +
                        "centre (MTOC) in animal cells, and so it regulates " +
                        "cell motility, adhesion and polarity in interphase, " +
                        "and facilitates the organization of the spindle poles " +
                        "during mitosis.<html>");
        centrosomeLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        centrosomePanelClose = new JButton();
        centrosomePanelClose.setBounds(650,0,50,50);
        centrosomePanelClose.setIcon(porzam);
        centrosomePanelClose.setBorderPainted(false);
        centrosomePanelClose.addActionListener(this);

        centrosome1 = new JButton();
        centrosome1.setBounds(282,682,65,70);
        centrosome1.setOpaque(false);
        centrosome1.setContentAreaFilled(false);
        centrosome1.setBorderPainted(false);
        centrosome1.addActionListener(this);
        centrosome1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        vacuolePanel = new JPanel();
        vacuolePanel.setVisible(true);
        vacuolePanel.setBounds(930,390,280,40);
        vacuolePanel.setLayout(new BorderLayout());
        vacuolePanel.setBackground(new Color(0x6af6be));
        //vacuolePanel.setBorder(border);

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
        //vacuolePanelDescription.setBorder(border);

        vacuoleLabelDescription = new JLabel();
        vacuoleLabelDescription.setVerticalAlignment(JLabel.CENTER);
        vacuoleLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        vacuoleLabelDescription.setVisible(true);
        vacuoleLabelDescription.setText(
                "<html>A vacuole is a membrane-bound cell organelle. In animal " +
                        "cells, vacuoles are generally small and help " +
                        "sequester waste products. In plant cells, vacuoles " +
                        "help maintain water balance. Sometimes a single " +
                        "vacuole can take up most of the interior space of " +
                        "the plant cell.<html>");
        vacuoleLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        vacuolePanelClose = new JButton();
        vacuolePanelClose.setBounds(650,0,50,50);
        vacuolePanelClose.setIcon(porzam);
        vacuolePanelClose.setBorderPainted(false);
        vacuolePanelClose.addActionListener(this);

        vacuole1 = new JButton();
        vacuole1.setBounds(110,465,55,35);
        vacuole1.setOpaque(false);
        vacuole1.setContentAreaFilled(false);
        vacuole1.setBorderPainted(false);
        vacuole1.addActionListener(this);
        vacuole1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        vacuole2 = new JButton();
        vacuole2.setBounds(80,505,60,60);
        vacuole2.setOpaque(false);
        vacuole2.setContentAreaFilled(false);
        vacuole2.setBorderPainted(false);
        vacuole2.addActionListener(this);
        vacuole2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cellulosePanel = new JPanel();
        cellulosePanel.setVisible(true);
        cellulosePanel.setBounds(930,430,280,40);
        cellulosePanel.setLayout(new BorderLayout());
        cellulosePanel.setBackground(new Color(0x6af6be));
        //cellulosePanel.setBorder(border);

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
        //cellulosePanelDescription.setBorder(border);

        celluloseLabelDescription = new JLabel();
        celluloseLabelDescription.setVerticalAlignment(JLabel.CENTER);
        celluloseLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        celluloseLabelDescription.setVisible(true);
        celluloseLabelDescription.setText(
                "<html>Cellulose is a component of cell walls of bacteria and " +
                        "algae. It provides rigidity to these cells as well as " +
                        "maintains their shape and structure.<html>");
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
        //roughEndoplasmicReticulumPanel.setBorder(border);

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
        //roughEndoplasmicReticulumPanelDescription.setBorder(border);

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
        roughEndoplasmicReticulum1.setBounds(660,330,120,140);
        roughEndoplasmicReticulum1.setOpaque(false);
        roughEndoplasmicReticulum1.setContentAreaFilled(false);
        roughEndoplasmicReticulum1.setBorderPainted(false);
        roughEndoplasmicReticulum1.addActionListener(this);
        roughEndoplasmicReticulum1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        roughEndoplasmicReticulum2 = new JButton();
        roughEndoplasmicReticulum2.setBounds(360,470,370,130);
        roughEndoplasmicReticulum2.setOpaque(false);
        roughEndoplasmicReticulum2.setContentAreaFilled(false);
        roughEndoplasmicReticulum2.setBorderPainted(false);
        roughEndoplasmicReticulum2.addActionListener(this);
        roughEndoplasmicReticulum2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        roughEndoplasmicReticulum3 = new JButton();
        roughEndoplasmicReticulum3.setBounds(210,290,120,200);
        roughEndoplasmicReticulum3.setOpaque(false);
        roughEndoplasmicReticulum3.setContentAreaFilled(false);
        roughEndoplasmicReticulum3.setBorderPainted(false);
        roughEndoplasmicReticulum3.addActionListener(this);
        roughEndoplasmicReticulum3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        golgiApparatusPanel = new JPanel();
        golgiApparatusPanel.setVisible(true);
        golgiApparatusPanel.setBounds(930,510,280,40);
        golgiApparatusPanel.setLayout(new BorderLayout());
        golgiApparatusPanel.setBackground(new Color(0x6af6be));
        //golgiApparatusPanel.setBorder(border);

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
        //golgiApparatusPanelDescription.setBorder(border);

        golgiApparatusLabelDescription = new JLabel();
        golgiApparatusLabelDescription.setVerticalAlignment(JLabel.CENTER);
        golgiApparatusLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        golgiApparatusLabelDescription.setVisible(true);
        golgiApparatusLabelDescription.setText(
                "<html>The Golgi apparatus, or Golgi complex, functions " +
                        "as a factory in which proteins received from the " +
                        "ER are further processed and sorted for transport " +
                        "to their eventual destinations: lysosomes, the " +
                        "plasma membrane, or secretion. In addition, as " +
                        "noted earlier, glycolipids and sphingomyelin are " +
                        "synthesized within the Golgi.<html>");
        golgiApparatusLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        golgiApparatusPanelClose = new JButton();
        golgiApparatusPanelClose.setBounds(650,0,50,50);
        golgiApparatusPanelClose.setIcon(porzam);
        golgiApparatusPanelClose.setBorderPainted(false);
        golgiApparatusPanelClose.addActionListener(this);

        golgiApparatus1 = new JButton();
        golgiApparatus1.setBounds(182,680,100,60);
        golgiApparatus1.setOpaque(false);
        golgiApparatus1.setContentAreaFilled(false);
        golgiApparatus1.setBorderPainted(false);
        golgiApparatus1.addActionListener(this);
        golgiApparatus1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        golgiApparatus2 = new JButton();
        golgiApparatus2.setBounds(140,500,180,180);
        golgiApparatus2.setOpaque(false);
        golgiApparatus2.setContentAreaFilled(false);
        golgiApparatus2.setBorderPainted(false);
        golgiApparatus2.addActionListener(this);
        golgiApparatus2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cytoskeletonPanel = new JPanel();
        cytoskeletonPanel.setVisible(true);
        cytoskeletonPanel.setBounds(930,550,280,40);
        cytoskeletonPanel.setLayout(new BorderLayout());
        cytoskeletonPanel.setBackground(new Color(0x6af6be));
        //cytoskeletonPanel.setBorder(border);

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
        cytoskeletonButton.setBounds(930,550,280,40);
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
        //cytoskeletonPanelDescription.setBorder(border);

        cytoskeletonLabelDescription = new JLabel();
        cytoskeletonLabelDescription.setVerticalAlignment(JLabel.CENTER);
        cytoskeletonLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        cytoskeletonLabelDescription.setVisible(true);
        cytoskeletonLabelDescription.setText(
                "<html>The cytoskeleton of animal cells is one of the most " +
                        "complicated and functionally versatile structures, " +
                        "involved in processes such as endocytosis, cell division, " +
                        "intra-cellular transport, motility, force transmission, " +
                        "reaction to external forces, adhesion and preservation, " +
                        "and adaptation of cell shape.<html>");
        cytoskeletonLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        cytoskeletonPanelClose = new JButton();
        cytoskeletonPanelClose.setBounds(650,0,50,50);
        cytoskeletonPanelClose.setIcon(porzam);
        cytoskeletonPanelClose.setBorderPainted(false);
        cytoskeletonPanelClose.addActionListener(this);

        cytoskeleton1 = new JButton();
        cytoskeleton1.setBounds(780,280,60,170);
        cytoskeleton1.setOpaque(false);
        cytoskeleton1.setContentAreaFilled(false);
        cytoskeleton1.setBorderPainted(false);
        cytoskeleton1.addActionListener(this);
        cytoskeleton1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cytoskeleton2 = new JButton();
        cytoskeleton2.setBounds(600,220,120,35);
        cytoskeleton2.setOpaque(false);
        cytoskeleton2.setContentAreaFilled(false);
        cytoskeleton2.setBorderPainted(false);
        cytoskeleton2.addActionListener(this);
        cytoskeleton2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cytoskeleton3 = new JButton();
        cytoskeleton3.setBounds(120,360,90,95);
        cytoskeleton3.setOpaque(false);
        cytoskeleton3.setContentAreaFilled(false);
        cytoskeleton3.setBorderPainted(false);
        cytoskeleton3.addActionListener(this);
        cytoskeleton3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cytoskeleton4 = new JButton();
        cytoskeleton4.setBounds(60,455,50,50);
        cytoskeleton4.setOpaque(false);
        cytoskeleton4.setContentAreaFilled(false);
        cytoskeleton4.setBorderPainted(false);
        cytoskeleton4.addActionListener(this);
        cytoskeleton4.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cytoskeleton5 = new JButton();
        cytoskeleton5.setBounds(170,750,260,45);
        cytoskeleton5.setOpaque(false);
        cytoskeleton5.setContentAreaFilled(false);
        cytoskeleton5.setBorderPainted(false);
        cytoskeleton5.addActionListener(this);
        cytoskeleton5.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cytoskeleton6 = new JButton();
        cytoskeleton6.setBounds(760,615,85,70);
        cytoskeleton6.setOpaque(false);
        cytoskeleton6.setContentAreaFilled(false);
        cytoskeleton6.setBorderPainted(false);
        cytoskeleton6.addActionListener(this);
        cytoskeleton6.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cytoskeleton7 = new JButton();
        cytoskeleton7.setBounds(710,685,80,85);
        cytoskeleton7.setOpaque(false);
        cytoskeleton7.setContentAreaFilled(false);
        cytoskeleton7.setBorderPainted(false);
        cytoskeleton7.addActionListener(this);
        cytoskeleton7.setCursor(new Cursor(Cursor.HAND_CURSOR));

        peroxisomePanel = new JPanel();
        peroxisomePanel.setVisible(true);
        peroxisomePanel.setBounds(930,590,280,40);
        peroxisomePanel.setLayout(new BorderLayout());
        peroxisomePanel.setBackground(new Color(0x6af6be));
        //peroxisomePanel.setBorder(border);

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
        peroxisomeButton.setBounds(930,590,280,40);
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
        //peroxisomePanelDescription.setBorder(border);

        peroxisomeLabelDescription = new JLabel();
        peroxisomeLabelDescription.setVerticalAlignment(JLabel.CENTER);
        peroxisomeLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        peroxisomeLabelDescription.setVisible(true);
        peroxisomeLabelDescription.setText(
                "<html>Peroxisomes are specialized for carrying out " +
                        "oxidative reactions using molecular oxygen. " +
                        "They generate hydrogen peroxide, which they " +
                        "use for oxidative purposes—destroying the excess " +
                        "by means of the catalase they contain.<html>");
        peroxisomeLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        peroxisomePanelClose = new JButton();
        peroxisomePanelClose.setBounds(650,0,50,50);
        peroxisomePanelClose.setIcon(porzam);
        peroxisomePanelClose.setBorderPainted(false);
        peroxisomePanelClose.addActionListener(this);

        peroxisome1 = new JButton();
        peroxisome1.setBounds(360,630,80,100);
        peroxisome1.setOpaque(false);
        peroxisome1.setContentAreaFilled(false);
        peroxisome1.setBorderPainted(false);
        peroxisome1.addActionListener(this);
        peroxisome1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        peroxisome2 = new JButton();
        peroxisome2.setBounds(30,650,110,110);
        peroxisome2.setOpaque(false);
        peroxisome2.setContentAreaFilled(false);
        peroxisome2.setBorderPainted(false);
        peroxisome2.addActionListener(this);
        peroxisome2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        peroxisome3 = new JButton();
        peroxisome3.setBounds(690,250,80,70);
        peroxisome3.setOpaque(false);
        peroxisome3.setContentAreaFilled(false);
        peroxisome3.setBorderPainted(false);
        peroxisome3.addActionListener(this);
        peroxisome3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lysosomePanel = new JPanel();
        lysosomePanel.setVisible(true);
        lysosomePanel.setBounds(930,630,280,40);
        lysosomePanel.setLayout(new BorderLayout());
        lysosomePanel.setBackground(new Color(0x6af6be));
        //lysosomePanel.setBorder(border);

        lysosomeLabel = new JLabel();
        lysosomeLabel.setBounds(0, 0, 200, 100);
        lysosomeLabel.setVisible(true);
        lysosomeLabel.setText("Lysosome");
        lysosomeLabel.setFont(new Font("Arial",Font.PLAIN,25));

        lysosomeLabelGreen = new JLabel();
        lysosomeLabelGreen.setBounds(0, 0, 200, 100);
        lysosomeLabelGreen.setVisible(false);
        lysosomeLabelGreen.setOpaque(false);
        lysosomeLabelGreen.setText("Lysosome");
        lysosomeLabelGreen.setFont(new Font("Arial",Font.PLAIN,25));
        lysosomeLabelGreen.setForeground(new Color(0x1F7A1F));
        lysosomeLabelGreen.setBackground(new Color(0x6af6be));

        lysosomeButton = new JButton();
        lysosomeButton.setBounds(930,630,280,40);
        lysosomeButton.setOpaque(false);
        lysosomeButton.setContentAreaFilled(false);
        lysosomeButton.setBorderPainted(true);
        lysosomeButton.addActionListener(this);

        lysosomePanelDescription = new JPanel();
        lysosomePanelDescription.setVisible(false);
        lysosomePanelDescription.setOpaque(true);
        lysosomePanelDescription.setBounds(230,190,700,250);
        lysosomePanelDescription.setLayout(new BorderLayout());
        lysosomePanelDescription.setBackground(Color.cyan);
        //lysosomePanelDescription.setBorder(border);

        lysosomeLabelDescription = new JLabel();
        lysosomeLabelDescription.setVerticalAlignment(JLabel.CENTER);
        lysosomeLabelDescription.setHorizontalAlignment(JLabel.CENTER);
        lysosomeLabelDescription.setVisible(true);
        lysosomeLabelDescription.setText(
                "<html>Lysosomes function as the digestive system " +
                        "of the cell, serving both to degrade material " +
                        "taken up from outside the cell and to digest " +
                        "obsolete components of the cell itself.<html>");
        lysosomeLabelDescription.setFont(new Font("Arial",Font.PLAIN,25));

        lysosomePanelClose = new JButton();
        lysosomePanelClose.setBounds(650,0,50,50);
        lysosomePanelClose.setIcon(porzam);
        lysosomePanelClose.setBorderPainted(false);
        lysosomePanelClose.addActionListener(this);

        lysosome1 = new JButton();
        lysosome1.setBounds(147,705,35,35);
        lysosome1.setOpaque(false);
        lysosome1.setContentAreaFilled(false);
        lysosome1.setBorderPainted(false);
        lysosome1.addActionListener(this);
        lysosome1.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lysosome2 = new JButton();
        lysosome2.setBounds(460,680,35,35);
        lysosome2.setOpaque(false);
        lysosome2.setContentAreaFilled(false);
        lysosome2.setBorderPainted(false);
        lysosome2.addActionListener(this);
        lysosome2.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lysosome3 = new JButton();
        lysosome3.setBounds(517,830,35,35);
        lysosome3.setOpaque(false);
        lysosome3.setContentAreaFilled(false);
        lysosome3.setBorderPainted(false);
        lysosome3.addActionListener(this);
        lysosome3.setCursor(new Cursor(Cursor.HAND_CURSOR));

        lysosome4 = new JButton();
        lysosome4.setBounds(725,635,30,30);
        lysosome4.setOpaque(false);
        lysosome4.setContentAreaFilled(false);
        lysosome4.setBorderPainted(false);
        lysosome4.addActionListener(this);
        lysosome4.setCursor(new Cursor(Cursor.HAND_CURSOR));

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
        this.add(nucleus2);

        this.add(mitochondrionPanel);
        mitochondrionPanel.add(mitochondrionLabel);
        this.add(mitochondrionButton);
        this.add(mitochondrionPanelDescription);
        mitochondrionPanelDescription.add(mitochondrionPanelClose);
        mitochondrionPanelDescription.add(mitochondrionLabelDescription);
        this.add(mitochondrion1);
        this.add(mitochondrion2);
        this.add(mitochondrion3);

        this.add(ribosomesPanel);
        ribosomesPanel.add(ribosomesLabel);
        this.add(ribosomesButton);
        this.add(ribosomesPanelDescription);
        ribosomesPanelDescription.add(ribosomesPanelClose);
        ribosomesPanelDescription.add(ribosomesLabelDescription);
        this.add(ribosomes1);
        this.add(ribosomes2);

        this.add(plasmaMembranePanel);
        plasmaMembranePanel.add(plasmaMembraneLabel);
        this.add(plasmaMembraneButton);
        this.add(plasmaMembranePanelDescription);
        plasmaMembranePanelDescription.add(plasmaMembranePanelClose);
        plasmaMembranePanelDescription.add(plasmaMembraneLabelDescription);
        this.add(plasmamembrane1);
        this.add(plasmamembrane2);

        this.add(centrosomePanel);
        centrosomePanel.add(centrosomeLabel);
        this.add(centrosomeButton);
        this.add(centrosomePanelDescription);
        centrosomePanelDescription.add(centrosomePanelClose);
        centrosomePanelDescription.add(centrosomeLabelDescription);
        this.add(centrosome1);

        this.add(vacuolePanel);
        vacuolePanel.add(vacuoleLabel);
        this.add(vacuoleButton);
        this.add(vacuolePanelDescription);
        vacuolePanelDescription.add(vacuolePanelClose);
        vacuolePanelDescription.add(vacuoleLabelDescription);
        this.add(vacuole1);
        this.add(vacuole2);

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

        this.add(cytoskeletonPanel);
        cytoskeletonPanel.add(cytoskeletonLabel);
        this.add(cytoskeletonButton);
        this.add(cytoskeletonPanelDescription);
        cytoskeletonPanelDescription.add(cytoskeletonPanelClose);
        cytoskeletonPanelDescription.add(cytoskeletonLabelDescription);
        this.add(cytoskeleton1);
        this.add(cytoskeleton2);
        this.add(cytoskeleton3);
        this.add(cytoskeleton4);
        this.add(cytoskeleton5);
        this.add(cytoskeleton6);
        this.add(cytoskeleton7);

        this.add(peroxisomePanel);
        peroxisomePanel.add(peroxisomeLabel);
        this.add(peroxisomeButton);
        this.add(peroxisomePanelDescription);
        peroxisomePanelDescription.add(peroxisomePanelClose);
        peroxisomePanelDescription.add(peroxisomeLabelDescription);
        this.add(peroxisome1);
        this.add(peroxisome2);
        this.add(peroxisome3);

        this.add(lysosomePanel);
        lysosomePanel.add(lysosomeLabel);
        this.add(lysosomeButton);
        this.add(lysosomePanelDescription);
        lysosomePanelDescription.add(lysosomePanelClose);
        lysosomePanelDescription.add(lysosomeLabelDescription);
        this.add(lysosome1);
        this.add(lysosome2);
        this.add(lysosome3);
        this.add(lysosome4);

        this.add(progressBar);
        this.add(label);

        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==goBack){
            this.dispose();
            Menubiol Menubiol = new Menubiol(pass4);
        }
        if(e.getSource()==nucleusButton){
            nucleusPanelDescription.setVisible(true);
        }
        if(e.getSource()==nucleusPanelClose){
            if(!nucleusLabelGreen.isVisible()){
                progressBar.setValue(i=i+9);
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
        if(e.getSource()==nucleus2){
            nucleusPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrionButton){
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrionPanelClose){
            if(!mitochondrionLabelGreen.isVisible()){
                progressBar.setValue(i=i+9);
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
        if(e.getSource()==ribosomesButton){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomesPanelClose){
            if(!ribosomesLabelGreen.isVisible()){
                progressBar.setValue(i=i+9);
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
        if(e.getSource()==plasmaMembraneButton){
            plasmaMembranePanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmaMembranePanelClose){
            if(!plasmaMembraneLabelGreen.isVisible()){
                progressBar.setValue(i=i+9);
            }
            plasmaMembranePanelDescription.setVisible(false);
            plasmaMembraneLabel.setVisible(false);
            plasmaMembraneLabelGreen.setVisible(true);
            plasmaMembraneLabelGreen.setOpaque(true);
            plasmaMembranePanel.add(plasmaMembraneLabelGreen);
        }
        if(e.getSource()==plasmamembrane1){
            plasmaMembranePanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmamembrane2){
            plasmaMembranePanelDescription.setVisible(true);
        }
        if(e.getSource()==centrosomeButton){
            centrosomePanelDescription.setVisible(true);
        }
        if(e.getSource()==centrosomePanelClose){
            if(!centrosomeLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
            }
            centrosomePanelDescription.setVisible(false);
            centrosomeLabel.setVisible(false);
            centrosomeLabelGreen.setVisible(true);
            centrosomeLabelGreen.setOpaque(true);
            centrosomePanel.add(centrosomeLabelGreen);
        }
        if(e.getSource()==centrosome1){
            centrosomePanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuoleButton){
            vacuolePanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuolePanelClose){
            if(!vacuoleLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
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
        if(e.getSource()==cytoskeleton3){
            cytoskeletonPanelDescription.setVisible(true);
        }
        if(e.getSource()==cytoskeleton4){
            cytoskeletonPanelDescription.setVisible(true);
        }
        if(e.getSource()==cytoskeleton5){
            cytoskeletonPanelDescription.setVisible(true);
        }
        if(e.getSource()==cytoskeleton6){
            cytoskeletonPanelDescription.setVisible(true);
        }
        if(e.getSource()==cytoskeleton7){
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
        if(e.getSource()==lysosomeButton){
            lysosomePanelDescription.setVisible(true);
        }
        if(e.getSource()==lysosomePanelClose){
            if(!lysosomeLabelGreen.isVisible()){
                progressBar.setValue(i=i+8);
            }
            lysosomePanelDescription.setVisible(false);
            lysosomeLabel.setVisible(false);
            lysosomeLabelGreen.setVisible(true);
            lysosomeLabelGreen.setOpaque(true);
            lysosomePanel.add(lysosomeLabelGreen);
        }
        if(e.getSource()==lysosome1){
            lysosomePanelDescription.setVisible(true);
        }
        if(e.getSource()==lysosome2){
            lysosomePanelDescription.setVisible(true);
        }
        if(e.getSource()==lysosome3){
            lysosomePanelDescription.setVisible(true);
        }
        if(e.getSource()==lysosome4){
            lysosomePanelDescription.setVisible(true);
        }
    }
}


