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

    JPanel mitochondrionPanel;
    JLabel mitochondrionLabel;
    JButton mitochondrionButton;
    JPanel mitochondrionPanelDescription;
    JLabel mitochondrionLabelDescription;
    JButton mitochondrionPanelClose;
    JLabel mitochondrionLabelGreen;

    JPanel ribosomesPanel;
    JLabel ribosomesLabel;
    JButton ribosomesButton;
    JPanel ribosomesPanelDescription;
    JLabel ribosomesLabelDescription;
    JButton ribosomesPanelClose;
    JLabel ribosomesLabelGreen;

    JPanel plasmaMembranePanel;
    JLabel plasmaMembraneLabel;
    JButton plasmaMembraneButton;
    JPanel plasmaMembranePanelDescription;
    JLabel plasmaMembraneLabelDescription;
    JButton plasmaMembranePanelClose;
    JLabel plasmaMembraneLabelGreen;

    JPanel centrosomePanel;
    JLabel centrosomeLabel;
    JButton centrosomeButton;
    JPanel centrosomePanelDescription;
    JLabel centrosomeLabelDescription;
    JButton centrosomePanelClose;
    JLabel centrosomeLabelGreen;

    JPanel vacuolePanel;
    JLabel vacuoleLabel;
    JButton vacuoleButton;
    JPanel vacuolePanelDescription;
    JLabel vacuoleLabelDescription;
    JButton vacuolePanelClose;
    JLabel vacuoleLabelGreen;

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

    JPanel golgiApparatusPanel;
    JLabel golgiApparatusLabel;
    JButton golgiApparatusButton;
    JPanel golgiApparatusPanelDescription;
    JLabel golgiApparatusLabelDescription;
    JButton golgiApparatusPanelClose;
    JLabel golgiApparatusLabelGreen;

    JPanel cytoskeletonPanel;
    JLabel cytoskeletonLabel;
    JButton cytoskeletonButton;
    JPanel cytoskeletonPanelDescription;
    JLabel cytoskeletonLabelDescription;
    JButton cytoskeletonPanelClose;
    JLabel cytoskeletonLabelGreen;

    JPanel peroxisomePanel;
    JLabel peroxisomeLabel;
    JButton peroxisomeButton;
    JPanel peroxisomePanelDescription;
    JLabel peroxisomeLabelDescription;
    JButton peroxisomePanelClose;
    JLabel peroxisomeLabelGreen;

    JPanel lysosomePanel;
    JLabel lysosomeLabel;
    JButton lysosomeButton;
    JPanel lysosomePanelDescription;
    JLabel lysosomeLabelDescription;
    JButton lysosomePanelClose;
    JLabel lysosomeLabelGreen;

    JButton goBack;
    String przekaz_47;

    public Anicell(String przekaz_47) {
        this.przekaz_47 = przekaz_47;
        ImageIcon background = new ImageIcon("src/resources/ANICELL.png");
        JLabel label = new JLabel();
        label.setIcon(background);

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

        this.add(mitochondrionPanel);
        mitochondrionPanel.add(mitochondrionLabel);
        this.add(mitochondrionButton);
        this.add(mitochondrionPanelDescription);
        mitochondrionPanelDescription.add(mitochondrionPanelClose);
        mitochondrionPanelDescription.add(mitochondrionLabelDescription);

        this.add(ribosomesPanel);
        ribosomesPanel.add(ribosomesLabel);
        this.add(ribosomesButton);
        this.add(ribosomesPanelDescription);
        ribosomesPanelDescription.add(ribosomesPanelClose);
        ribosomesPanelDescription.add(ribosomesLabelDescription);

        this.add(plasmaMembranePanel);
        plasmaMembranePanel.add(plasmaMembraneLabel);
        this.add(plasmaMembraneButton);
        this.add(plasmaMembranePanelDescription);
        plasmaMembranePanelDescription.add(plasmaMembranePanelClose);
        plasmaMembranePanelDescription.add(plasmaMembraneLabelDescription);

        this.add(centrosomePanel);
        centrosomePanel.add(centrosomeLabel);
        this.add(centrosomeButton);
        this.add(centrosomePanelDescription);
        centrosomePanelDescription.add(centrosomePanelClose);
        centrosomePanelDescription.add(centrosomeLabelDescription);

        this.add(vacuolePanel);
        vacuolePanel.add(vacuoleLabel);
        this.add(vacuoleButton);
        this.add(vacuolePanelDescription);
        vacuolePanelDescription.add(vacuolePanelClose);
        vacuolePanelDescription.add(vacuoleLabelDescription);

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

        this.add(golgiApparatusPanel);
        golgiApparatusPanel.add(golgiApparatusLabel);
        this.add(golgiApparatusButton);
        this.add(golgiApparatusPanelDescription);
        golgiApparatusPanelDescription.add(golgiApparatusPanelClose);
        golgiApparatusPanelDescription.add(golgiApparatusLabelDescription);

        this.add(cytoskeletonPanel);
        cytoskeletonPanel.add(cytoskeletonLabel);
        this.add(cytoskeletonButton);
        this.add(cytoskeletonPanelDescription);
        cytoskeletonPanelDescription.add(cytoskeletonPanelClose);
        cytoskeletonPanelDescription.add(cytoskeletonLabelDescription);

        this.add(peroxisomePanel);
        peroxisomePanel.add(peroxisomeLabel);
        this.add(peroxisomeButton);
        this.add(peroxisomePanelDescription);
        peroxisomePanelDescription.add(peroxisomePanelClose);
        peroxisomePanelDescription.add(peroxisomeLabelDescription);

        this.add(lysosomePanel);
        lysosomePanel.add(lysosomeLabel);
        this.add(lysosomeButton);
        this.add(lysosomePanelDescription);
        lysosomePanelDescription.add(lysosomePanelClose);
        lysosomePanelDescription.add(lysosomeLabelDescription);


        this.add(label);

        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==goBack){
            this.dispose();
            Menubiol Menubiol = new Menubiol(przekaz_47);
        }
        if(e.getSource()==nucleusButton){
            nucleusPanelDescription.setVisible(true);
        }
        if(e.getSource()==nucleusPanelClose){
            nucleusPanelDescription.setVisible(false);
            nucleusLabel.setVisible(false);
            nucleusLabelGreen.setVisible(true);
            nucleusLabelGreen.setOpaque(true);
            nucleusPanel.add(nucleusLabelGreen);
        }
        if(e.getSource()==mitochondrionButton){
            mitochondrionPanelDescription.setVisible(true);
        }
        if(e.getSource()==mitochondrionPanelClose){
            mitochondrionPanelDescription.setVisible(false);
            mitochondrionLabel.setVisible(false);
            mitochondrionLabelGreen.setVisible(true);
            mitochondrionLabelGreen.setOpaque(true);
            mitochondrionPanel.add(mitochondrionLabelGreen);
        }
        if(e.getSource()==ribosomesButton){
            ribosomesPanelDescription.setVisible(true);
        }
        if(e.getSource()==ribosomesPanelClose){
            ribosomesPanelDescription.setVisible(false);
            ribosomesLabel.setVisible(false);
            ribosomesLabelGreen.setVisible(true);
            ribosomesLabelGreen.setOpaque(true);
            ribosomesPanel.add(ribosomesLabelGreen);
        }
        if(e.getSource()==plasmaMembraneButton){
            plasmaMembranePanelDescription.setVisible(true);
        }
        if(e.getSource()==plasmaMembranePanelClose){
            plasmaMembranePanelDescription.setVisible(false);
            plasmaMembraneLabel.setVisible(false);
            plasmaMembraneLabelGreen.setVisible(true);
            plasmaMembraneLabelGreen.setOpaque(true);
            plasmaMembranePanel.add(plasmaMembraneLabelGreen);
        }
        if(e.getSource()==centrosomeButton){
            centrosomePanelDescription.setVisible(true);
        }
        if(e.getSource()==centrosomePanelClose){
            centrosomePanelDescription.setVisible(false);
            centrosomeLabel.setVisible(false);
            centrosomeLabelGreen.setVisible(true);
            centrosomeLabelGreen.setOpaque(true);
            centrosomePanel.add(centrosomeLabelGreen);
        }
        if(e.getSource()==vacuoleButton){
            vacuolePanelDescription.setVisible(true);
        }
        if(e.getSource()==vacuolePanelClose){
            vacuolePanelDescription.setVisible(false);
            vacuoleLabel.setVisible(false);
            vacuoleLabelGreen.setVisible(true);
            vacuoleLabelGreen.setOpaque(true);
            vacuolePanel.add(vacuoleLabelGreen);
        }
        if(e.getSource()==celluloseButton){
            cellulosePanelDescription.setVisible(true);
        }
        if(e.getSource()==cellulosePanelClose){
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
            roughEndoplasmicReticulumPanelDescription.setVisible(false);
            roughEndoplasmicReticulumLabel.setVisible(false);
            roughEndoplasmicReticulumLabelGreen.setVisible(true);
            roughEndoplasmicReticulumLabelGreen.setOpaque(true);
            roughEndoplasmicReticulumPanel.add(roughEndoplasmicReticulumLabelGreen);
        }
        if(e.getSource()==golgiApparatusButton){
            golgiApparatusPanelDescription.setVisible(true);
        }
        if(e.getSource()==golgiApparatusPanelClose){
            golgiApparatusPanelDescription.setVisible(false);
            golgiApparatusLabel.setVisible(false);
            golgiApparatusLabelGreen.setVisible(true);
            golgiApparatusLabelGreen.setOpaque(true);
            golgiApparatusPanel.add(golgiApparatusLabelGreen);
        }
        if(e.getSource()==cytoskeletonButton){
            cytoskeletonPanelDescription.setVisible(true);
        }
        if(e.getSource()==cytoskeletonPanelClose){
            cytoskeletonPanelDescription.setVisible(false);
            cytoskeletonLabel.setVisible(false);
            cytoskeletonLabelGreen.setVisible(true);
            cytoskeletonLabelGreen.setOpaque(true);
            cytoskeletonPanel.add(cytoskeletonLabelGreen);
        }
        if(e.getSource()==peroxisomeButton){
            peroxisomePanelDescription.setVisible(true);
        }
        if(e.getSource()==peroxisomePanelClose){
            peroxisomePanelDescription.setVisible(false);
            peroxisomeLabel.setVisible(false);
            peroxisomeLabelGreen.setVisible(true);
            peroxisomeLabelGreen.setOpaque(true);
            peroxisomePanel.add(peroxisomeLabelGreen);
        }
        if(e.getSource()==lysosomeButton){
            lysosomePanelDescription.setVisible(true);
        }
        if(e.getSource()==lysosomePanelClose){
            lysosomePanelDescription.setVisible(false);
            lysosomeLabel.setVisible(false);
            lysosomeLabelGreen.setVisible(true);
            lysosomeLabelGreen.setOpaque(true);
            lysosomePanel.add(lysosomeLabelGreen);
        }
    }
}


