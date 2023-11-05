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

    JPanel cellWallPanel;
    JLabel cellWallLabel;
    JButton cellWallButton;
    JPanel cellWallPanelDescription;
    JLabel cellWallLabelDescription;
    JButton cellWallPanelClose;
    JLabel cellWallLabelGreen;

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

    JButton goBack;
    String przekazac;

    public Funcell(String przekazac) {
        this.przekazac = przekazac;
        ImageIcon background = new ImageIcon("src/resources/FUNCELL.png");
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
                "<html>Ribosomes translate messenger RNA into proteins. " +
                        "They are formed at the nucleolus and subsequently spread " +
                        "throughout the cytoplasm.<html>");
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
        //cellWallPanel.setBorder(border);

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
        //cellWallPanelDescription.setBorder(border);

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
        //roughEndoplasmicReticulumPanel.setBorder(border);

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
        //roughEndoplasmicReticulumPanelDescription.setBorder(border);

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

        this.add(cellWallPanel);
        cellWallPanel.add(cellWallLabel);
        this.add(cellWallButton);
        this.add(cellWallPanelDescription);
        cellWallPanelDescription.add(cellWallPanelClose);
        cellWallPanelDescription.add(cellWallLabelDescription);

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


        this.add(label);

        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==goBack){
            this.dispose();
            Menubiol Menubiol = new Menubiol(przekazac);
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
        if(e.getSource()==cellWallButton){
            cellWallPanelDescription.setVisible(true);
        }
        if(e.getSource()==cellWallPanelClose){
            cellWallPanelDescription.setVisible(false);
            cellWallLabel.setVisible(false);
            cellWallLabelGreen.setVisible(true);
            cellWallLabelGreen.setOpaque(true);
            cellWallPanel.add(cellWallLabelGreen);
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
    }
}


