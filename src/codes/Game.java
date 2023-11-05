package codes;

import javax.swing.*;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * klasa Game odpowiada za sam gameplay
 * Zanjdują się w niej:
 * przyciski związków, przyciski  koncówka en odpowiedzialne za setEnable przycisków związków,
 * przyciski menu odpowiedzialny za powrót do menu i cofnij odpowiedzialny za resetowanie wybranych probówek.
 * labele np Felabel odpowiedzialne za pokazanie się probówki na ladzie
 * panele i labele z wynikami
 *
 * Klasa Game zawiera konstruktor Game oraz param e odpowiedzialny za akcje
 */
public class Game extends JFrame implements ActionListener {
JButton Fe;
JButton Feen;
JButton Zn;
JButton Znen;
JButton MnO2;
JButton MnO2en;
JButton Al;
JButton Alen;
JButton Mg;
JButton Mgen;
JButton H2SO4;
JButton H2SO4en;
JButton HCl;
JButton HClen;
JButton HNO3;
JButton HNO3en;
JButton NaOH;
JButton NaOHen;
JButton KOH;
JButton KOHen;
JButton CO2;
JButton CO2en;
JButton H2O;
JButton H2Oen;

JButton menubutton;
JButton cofnij;

JLabel Felabel;
JLabel Znlabel;
JLabel MnO2label;
JLabel Allabel;
JLabel Mglabel;
JLabel H2SO4label;
JLabel HCllabel;
JLabel HNO3label;
JLabel NaOHlabel;
JLabel KOHlabel;
JLabel CO2label;
JLabel H2Olabel;
    //WYNIKI
JPanel wynik1;
JLabel wynik1label;
JPanel wynik2;
JLabel wynik2label;
JPanel wynik3;
JLabel wynik3label;
JPanel wynik4;
JLabel wynik4label;
JPanel wynik5;
JLabel wynik5label;
JPanel wynik6;
JLabel wynik6label;
JPanel wynik7;
JLabel wynik7label;
JPanel wynik8;
JLabel wynik8label;
JPanel wynik9;
JLabel wynik9label;
JPanel wynik10;
JLabel wynik10label;
JPanel wynik11;
JLabel wynik11label;
JPanel wynik12;
JLabel wynik12label;
JPanel wynik13;
JLabel wynik13label;
JPanel wynik14;
JLabel wynik14label;
JPanel wynik15;
JLabel wynik15label;
JPanel wynik16;
JLabel wynik16label;
JPanel wynik17;
JLabel wynik17label;
JPanel wynik18;
JLabel wynik18label;
JPanel wynik19;
JLabel wynik19label;
JPanel wynik20;
JLabel wynik20label;
JPanel wynik21;
JLabel wynik21label;
JPanel wynik22;
JLabel wynik22label;
JPanel wynik23;
JLabel wynik23label;
JPanel wynik24;
JLabel wynik24label;
JPanel wynik25;
JLabel wynik25label;
JPanel wynik26;
JLabel wynik26label;
JPanel wynik27;
JLabel wynik27label;
JPanel wynik28;
JLabel wynik28label;
JPanel wynik29;
JLabel wynik29label;
JPanel wynik30;
JLabel wynik30label;
JPanel wynik31;
JLabel wynik31label;
JPanel wynik32;
JLabel wynik32label;
JPanel wynik33;
JLabel wynik33label;
JPanel wynik34;
JLabel wynik34label;
JPanel wynik35;
JLabel wynik35label;
JPanel wynik36;
JLabel wynik36label;
JPanel wynik37;
JLabel wynik37label;
JPanel wynik38;
JLabel wynik38label;
JPanel wynik39;
JLabel wynik39label;
JPanel wynik40;
JLabel wynik40label;
JPanel wynik41;
JLabel wynik41label;
JPanel wynik42;
JLabel wynik42label;
String pass;

    /**
     *
     * w konstruktorze Game zapisany został nowy label odpowiedzialny za tło, parametry i właściwości paneli,
     * przycisków i labeli z klasy Game. Zapisałem w nim również parametry tego frame-u i dodałem do niego
     * wszystkie panele, labele i przyciski oraz logo znajdujące się na samym dole.
     */
    public Game(String pass){
        this.pass = pass;

        //LABELE

        ImageIcon background = new ImageIcon("src/resources/scilab.png");
        JLabel label = new JLabel();
        label.setIcon(background);

        ImageIcon FeP = new ImageIcon("src/resources/Fe.png");
        Felabel = new JLabel();
        Felabel.setIcon(FeP);
        Felabel.setBounds(300, 652, 150, 196);
        Felabel.setVisible(false);

        ImageIcon ZnP = new ImageIcon("src/resources/Zn.png");
        Znlabel = new JLabel();
        Znlabel.setIcon(ZnP);
        Znlabel.setBounds(300, 652, 150, 196);
        Znlabel.setVisible(false);

        ImageIcon MnO2P = new ImageIcon("src/resources/MnO2.png");
        MnO2label = new JLabel();
        MnO2label.setIcon(MnO2P);
        MnO2label.setBounds(300, 652, 150, 196);
        MnO2label.setVisible(false);

        ImageIcon AlP = new ImageIcon("src/resources/Al.png");
        Allabel = new JLabel();
        Allabel.setIcon(AlP);
        Allabel.setBounds(300, 652, 171, 196);
        Allabel.setVisible(false);

        ImageIcon MgP = new ImageIcon("src/resources/Mg.png");
        Mglabel = new JLabel();
        Mglabel.setIcon(MgP);
        Mglabel.setBounds(300, 652, 150, 196);
        Mglabel.setVisible(false);

        ImageIcon H2SO4P = new ImageIcon("src/resources/H2SO4.png");
        H2SO4label = new JLabel();
        H2SO4label.setIcon(H2SO4P);
        H2SO4label.setBounds(500, 652, 150, 196);
        H2SO4label.setVisible(false);

        ImageIcon HClP = new ImageIcon("src/resources/HCl.png");
        HCllabel = new JLabel();
        HCllabel.setIcon(HClP);
        HCllabel.setBounds(500, 652, 150, 196);
        HCllabel.setVisible(false);

        ImageIcon HNO3P = new ImageIcon("src/resources/HNO3.png");
        HNO3label = new JLabel();
        HNO3label.setIcon(HNO3P);
        HNO3label.setBounds(500, 652, 150, 196);
        HNO3label.setVisible(false);

        ImageIcon NaOHP = new ImageIcon("src/resources/NaOH.png");
        NaOHlabel = new JLabel();
        NaOHlabel.setIcon(NaOHP);
        NaOHlabel.setBounds(700, 652, 150, 196);
        NaOHlabel.setVisible(false);

        ImageIcon KOHP = new ImageIcon("src/resources/KOH.png");
        KOHlabel = new JLabel();
        KOHlabel.setIcon(KOHP);
        KOHlabel.setBounds(700, 652, 150, 196);
        KOHlabel.setVisible(false);

        ImageIcon CO2P = new ImageIcon("src/resources/CO2.png");
        CO2label = new JLabel();
        CO2label.setIcon(CO2P);
        CO2label.setBounds(700, 652, 171, 196);
        CO2label.setVisible(false);

        ImageIcon H2OP = new ImageIcon("src/resources/H2O.png");
        H2Olabel = new JLabel();
        H2Olabel.setIcon(H2OP);
        H2Olabel.setBounds(188, 676, 114, 184);
        H2Olabel.setVisible(false);

        //GUZIKI

        Fe = new JButton();
        Fe.setBounds(100,45,1,1);
        Fe.setOpaque(false);
        Fe.setContentAreaFilled(false);
        Fe.setBorderPainted(false);
        Fe.addActionListener(this);
        Fe.setEnabled(false);

        Feen = new JButton();
        Feen.setBounds(100,45,85,115);
        Feen.setOpaque(false);
        Feen.setContentAreaFilled(false);
        Feen.setBorderPainted(false);
        Feen.addActionListener(this);

        Zn = new JButton();
        Zn.setBounds(211,45,1,1);
        Zn.setOpaque(false);
        Zn.setContentAreaFilled(false);
        Zn.setBorderPainted(false);
        Zn.addActionListener(this);
        Zn.setEnabled(false);

        Znen = new JButton();
        Znen.setBounds(211,45,120,133);
        Znen.setOpaque(false);
        Znen.setContentAreaFilled(false);
        Znen.setBorderPainted(false);
        Znen.addActionListener(this);

        MnO2 = new JButton();
        MnO2.setBounds(360,45,1,1);
        MnO2.setOpaque(false);
        MnO2.setContentAreaFilled(false);
        MnO2.setBorderPainted(false);
        MnO2.addActionListener(this);
        MnO2.setEnabled(false);

        MnO2en = new JButton();
        MnO2en.setBounds(360,45,110,133);
        MnO2en.setOpaque(false);
        MnO2en.setContentAreaFilled(false);
        MnO2en.setBorderPainted(false);
        MnO2en.addActionListener(this);

        Al = new JButton();
        Al.setBounds(565,40,1,1);
        Al.setOpaque(false);
        Al.setContentAreaFilled(false);
        Al.setBorderPainted(false);
        Al.addActionListener(this);
        Al.setEnabled(false);

        Alen = new JButton();
        Alen.setBounds(565,40,110,130);
        Alen.setOpaque(false);
        Alen.setContentAreaFilled(false);
        Alen.setBorderPainted(false);
        Alen.addActionListener(this);

        Mg = new JButton();
        Mg.setBounds(785,50,1,1);
        Mg.setOpaque(false);
        Mg.setContentAreaFilled(false);
        Mg.setBorderPainted(false);
        Mg.addActionListener(this);
        Mg.setEnabled(false);

        Mgen = new JButton();
        Mgen.setBounds(785,50,100,120);
        Mgen.setOpaque(false);
        Mgen.setContentAreaFilled(false);
        Mgen.setBorderPainted(false);
        Mgen.addActionListener(this);

        H2SO4 = new JButton();
        H2SO4.setBounds(160,210,1,1);
        H2SO4.setOpaque(false);
        H2SO4.setContentAreaFilled(false);
        H2SO4.setBorderPainted(false);
        H2SO4.addActionListener(this);
        H2SO4.setEnabled(false);

        H2SO4en = new JButton();
        H2SO4en.setBounds(160,210,110,150);
        H2SO4en.setOpaque(false);
        H2SO4en.setContentAreaFilled(false);
        H2SO4en.setBorderPainted(false);
        H2SO4en.addActionListener(this);

        HCl = new JButton();
        HCl.setBounds(389,215,1,1);
        HCl.setOpaque(false);
        HCl.setContentAreaFilled(false);
        HCl.setBorderPainted(false);
        HCl.addActionListener(this);
        HCl.setEnabled(false);

        HClen = new JButton();
        HClen.setBounds(389,215,110,130);
        HClen.setOpaque(false);
        HClen.setContentAreaFilled(false);
        HClen.setBorderPainted(false);
        HClen.addActionListener(this);

        HNO3 = new JButton();
        HNO3.setBounds(560,215,1,1);
        HNO3.setOpaque(false);
        HNO3.setContentAreaFilled(false);
        HNO3.setBorderPainted(false);
        HNO3.addActionListener(this);
        HNO3.setEnabled(false);

        HNO3en = new JButton();
        HNO3en.setBounds(560,215,90,120);
        HNO3en.setOpaque(false);
        HNO3en.setContentAreaFilled(false);
        HNO3en.setBorderPainted(false);
        HNO3en.addActionListener(this);

        NaOH = new JButton();
        NaOH.setBounds(75,400,1,1);
        NaOH.setOpaque(false);
        NaOH.setContentAreaFilled(false);
        NaOH.setBorderPainted(false);
        NaOH.addActionListener(this);
        NaOH.setEnabled(false);

        NaOHen = new JButton();
        NaOHen.setBounds(75,400,110,115);
        NaOHen.setOpaque(false);
        NaOHen.setContentAreaFilled(false);
        NaOHen.setBorderPainted(false);
        NaOHen.addActionListener(this);

        KOH = new JButton();
        KOH.setBounds(263,412,1,1);
        KOH.setOpaque(false);
        KOH.setContentAreaFilled(false);
        KOH.setBorderPainted(false);
        KOH.addActionListener(this);
        KOH.setEnabled(false);

        KOHen = new JButton();
        KOHen.setBounds(263,412,80,115);
        KOHen.setOpaque(false);
        KOHen.setContentAreaFilled(false);
        KOHen.setBorderPainted(false);
        KOHen.addActionListener(this);

        CO2 = new JButton();
        CO2.setBounds(425,395,1,1);
        CO2.setOpaque(false);
        CO2.setContentAreaFilled(false);
        CO2.setBorderPainted(false);
        CO2.addActionListener(this);
        CO2.setEnabled(false);

        CO2en = new JButton();
        CO2en.setBounds(425,395,110,125);
        CO2en.setOpaque(false);
        CO2en.setContentAreaFilled(false);
        CO2en.setBorderPainted(false);
        CO2en.addActionListener(this);

        H2O = new JButton();
        H2O.setBounds(55,560,1,1);
        H2O.setOpaque(false);
        H2O.setContentAreaFilled(false);
        H2O.setBorderPainted(false);
        H2O.addActionListener(this);
        H2O.setEnabled(false);

        H2Oen = new JButton();
        H2Oen.setBounds(55,560,110,280);
        H2Oen.setOpaque(false);
        H2Oen.setContentAreaFilled(false);
        H2Oen.setBorderPainted(false);
        H2Oen.addActionListener(this);

        ImageIcon cofnijicon = new ImageIcon("src/resources/zam.png");
        cofnij = new JButton();
        cofnij.setIcon(cofnijicon);
        cofnij.setBounds(500, 870,50,50);
        cofnij.setBorderPainted(false);
        cofnij.addActionListener(this);

        ImageIcon menuicon = new ImageIcon("src/resources/menubutton.png");
        menubutton = new JButton();
        menubutton.setIcon(menuicon);
        menubutton.setBounds(1130,25,100,50);
        menubutton.setBorderPainted(false);
        menubutton.addActionListener(this);

        //PANELE I LABELE WYNIKÓW

        wynik1 = new JPanel();
        wynik1.setVisible(false);
        wynik1.setOpaque(false);
        wynik1.setBackground(Color.green);
        wynik1.setBounds(650,20,468,929);
        wynik1.setLayout(new BorderLayout());

        ImageIcon w1 = new ImageIcon("src/resources/FeCl2.png");
        wynik1label = new JLabel();
        wynik1label.setIcon(w1);

        wynik2 = new JPanel();
        wynik2.setVisible(false);
        wynik2.setOpaque(false);
        wynik2.setBackground(Color.green);
        wynik2.setBounds(650,20,468,929);
        wynik2.setLayout(new BorderLayout());

        ImageIcon w2 = new ImageIcon("src/resources/FeSO4.png");
        wynik2label = new JLabel();
        wynik2label.setIcon(w2);

        wynik3 = new JPanel();
        wynik3.setVisible(false);
        wynik3.setOpaque(false);
        wynik3.setBackground(Color.green);
        wynik3.setBounds(650,20,468,929);
        wynik3.setLayout(new BorderLayout());

        ImageIcon w3 = new ImageIcon("src/resources/Fe3O4.png");
        wynik3label = new JLabel();
        wynik3label.setIcon(w3);

        wynik4 = new JPanel();
        wynik4.setVisible(false);
        wynik4.setOpaque(false);
        wynik4.setBackground(Color.green);
        wynik4.setBounds(650,20,468,929);
        wynik4.setLayout(new BorderLayout());

        ImageIcon w4 = new ImageIcon("src/resources/FeOH3+K.png");
        wynik4label = new JLabel();
        wynik4label.setIcon(w4);

        wynik5 = new JPanel();
        wynik5.setVisible(false);
        wynik5.setOpaque(false);
        wynik5.setBackground(Color.green);
        wynik5.setBounds(650,20,468,929);
        wynik5.setLayout(new BorderLayout());

        ImageIcon w5 = new ImageIcon("src/resources/FeOH3+Na.png");
        wynik5label = new JLabel();
        wynik5label.setIcon(w5);

        wynik6 = new JPanel();
        wynik6.setVisible(false);
        wynik6.setOpaque(false);
        wynik6.setBackground(Color.green);
        wynik6.setBounds(650,20,468,929);
        wynik6.setLayout(new BorderLayout());

        ImageIcon w6 = new ImageIcon("src/resources/FeNO33.png");
        wynik6label = new JLabel();
        wynik6label.setIcon(w6);

        wynik7 = new JPanel();
        wynik7.setVisible(false);
        wynik7.setOpaque(false);
        wynik7.setBackground(Color.green);
        wynik7.setBounds(650,20,468,929);
        wynik7.setLayout(new BorderLayout());

        ImageIcon w7 = new ImageIcon("src/resources/ZnNO32.png");
        wynik7label = new JLabel();
        wynik7label.setIcon(w7);

        wynik8 = new JPanel();
        wynik8.setVisible(false);
        wynik8.setOpaque(false);
        wynik8.setBackground(Color.green);
        wynik8.setBounds(650,20,468,929);
        wynik8.setLayout(new BorderLayout());

        ImageIcon w8 = new ImageIcon("src/resources/ZnCl2.png");
        wynik8label = new JLabel();
        wynik8label.setIcon(w8);

        wynik9 = new JPanel();
        wynik9.setVisible(false);
        wynik9.setOpaque(false);
        wynik9.setBackground(Color.green);
        wynik9.setBounds(650,20,468,929);
        wynik9.setLayout(new BorderLayout());

        ImageIcon w9 = new ImageIcon("src/resources/Na2ZnO2.png");
        wynik9label = new JLabel();
        wynik9label.setIcon(w9);

        wynik10 = new JPanel();
        wynik10.setVisible(false);
        wynik10.setOpaque(false);
        wynik10.setBackground(Color.green);
        wynik10.setBounds(650,20,468,929);
        wynik10.setLayout(new BorderLayout());

        ImageIcon w10 = new ImageIcon("src/resources/ZnSO4.png");
        wynik10label = new JLabel();
        wynik10label.setIcon(w10);

        wynik11 = new JPanel();
        wynik11.setVisible(false);
        wynik11.setOpaque(false);
        wynik11.setBackground(Color.green);
        wynik11.setBounds(650,20,468,929);
        wynik11.setLayout(new BorderLayout());

        ImageIcon w11 = new ImageIcon("src/resources/K2ZNOH4.png");
        wynik11label = new JLabel();
        wynik11label.setIcon(w11);

        wynik12 = new JPanel();
        wynik12.setVisible(false);
        wynik12.setOpaque(false);
        wynik12.setBackground(Color.green);
        wynik12.setBounds(650,20,468,929);
        wynik12.setLayout(new BorderLayout());

        ImageIcon w12 = new ImageIcon("src/resources/Mn2O3.png");
        wynik12label = new JLabel();
        wynik12label.setIcon(w12);

        wynik13 = new JPanel();
        wynik13.setVisible(false);
        wynik13.setOpaque(false);
        wynik13.setBackground(Color.green);
        wynik13.setBounds(650,20,468,929);
        wynik13.setLayout(new BorderLayout());

        ImageIcon w13 = new ImageIcon("src/resources/K2MnO4.png");
        wynik13label = new JLabel();
        wynik13label.setIcon(w13);

        wynik14 = new JPanel();
        wynik14.setVisible(false);
        wynik14.setOpaque(false);
        wynik14.setBackground(Color.green);
        wynik14.setBounds(650,20,468,929);
        wynik14.setLayout(new BorderLayout());

        ImageIcon w14 = new ImageIcon("src/resources/MnOH2.png");
        wynik14label = new JLabel();
        wynik14label.setIcon(w14);

        wynik15 = new JPanel();
        wynik15.setVisible(false);
        wynik15.setOpaque(false);
        wynik15.setBackground(Color.green);
        wynik15.setBounds(650,20,468,929);
        wynik15.setLayout(new BorderLayout());

        ImageIcon w15 = new ImageIcon("src/resources/Na2MnO4.png");
        wynik15label = new JLabel();
        wynik15label.setIcon(w15);

        wynik16 = new JPanel();
        wynik16.setVisible(false);
        wynik16.setOpaque(false);
        wynik16.setBackground(Color.green);
        wynik16.setBounds(650,20,468,929);
        wynik16.setLayout(new BorderLayout());

        ImageIcon w16 = new ImageIcon("src/resources/MnNO32.png");
        wynik16label = new JLabel();
        wynik16label.setIcon(w16);

        wynik17 = new JPanel();
        wynik17.setVisible(false);
        wynik17.setOpaque(false);
        wynik17.setBackground(Color.green);
        wynik17.setBounds(650,20,468,929);
        wynik17.setLayout(new BorderLayout());

        ImageIcon w17 = new ImageIcon("src/resources/MnCl2.png");
        wynik17label = new JLabel();
        wynik17label.setIcon(w17);

        wynik18 = new JPanel();
        wynik18.setVisible(false);
        wynik18.setOpaque(false);
        wynik18.setBackground(Color.green);
        wynik18.setBounds(650,20,468,929);
        wynik18.setLayout(new BorderLayout());

        ImageIcon w18 = new ImageIcon("src/resources/MnCO32.png");
        wynik18label = new JLabel();
        wynik18label.setIcon(w18);

        wynik19 = new JPanel();
        wynik19.setVisible(false);
        wynik19.setOpaque(false);
        wynik19.setBackground(Color.green);
        wynik19.setBounds(650,20,468,929);
        wynik19.setLayout(new BorderLayout());

        ImageIcon w19 = new ImageIcon("src/resources/AlCl3.png");
        wynik19label = new JLabel();
        wynik19label.setIcon(w19);

        wynik20 = new JPanel();
        wynik20.setVisible(false);
        wynik20.setOpaque(false);
        wynik20.setBackground(Color.green);
        wynik20.setBounds(650,20,468,929);
        wynik20.setLayout(new BorderLayout());

        ImageIcon w20 = new ImageIcon("src/resources/NaAlOH4.png");
        wynik20label = new JLabel();
        wynik20label.setIcon(w20);

        wynik21 = new JPanel();
        wynik21.setVisible(false);
        wynik21.setOpaque(false);
        wynik21.setBackground(Color.green);
        wynik21.setBounds(650,20,468,929);
        wynik21.setLayout(new BorderLayout());

        ImageIcon w21 = new ImageIcon("src/resources/AlNO33.png");
        wynik21label = new JLabel();
        wynik21label.setIcon(w21);

        wynik22 = new JPanel();
        wynik22.setVisible(false);
        wynik22.setOpaque(false);
        wynik22.setBackground(Color.green);
        wynik22.setBounds(650,20,468,929);
        wynik22.setLayout(new BorderLayout());

        ImageIcon w22 = new ImageIcon("src/resources/Al2SO43.png");
        wynik22label = new JLabel();
        wynik22label.setIcon(w22);

        wynik23 = new JPanel();
        wynik23.setVisible(false);
        wynik23.setOpaque(false);
        wynik23.setBackground(Color.green);
        wynik23.setBounds(650,20,468,929);
        wynik23.setLayout(new BorderLayout());

        ImageIcon w23 = new ImageIcon("src/resources/AlO.png");
        wynik23label = new JLabel();
        wynik23label.setIcon(w23);

        wynik24 = new JPanel();
        wynik24.setVisible(false);
        wynik24.setOpaque(false);
        wynik24.setBackground(Color.green);
        wynik24.setBounds(650,20,468,929);
        wynik24.setLayout(new BorderLayout());

        ImageIcon w24 = new ImageIcon("src/resources/K3AlOH6.png");
        wynik24label = new JLabel();
        wynik24label.setIcon(w24);

        wynik25 = new JPanel();
        wynik25.setVisible(false);
        wynik25.setOpaque(false);
        wynik25.setBackground(Color.green);
        wynik25.setBounds(650,20,468,929);
        wynik25.setLayout(new BorderLayout());

        ImageIcon w25 = new ImageIcon("src/resources/MgO.png");
        wynik25label = new JLabel();
        wynik25label.setIcon(w25);

        wynik26 = new JPanel();
        wynik26.setVisible(false);
        wynik26.setOpaque(false);
        wynik26.setBackground(Color.green);
        wynik26.setBounds(650,20,468,929);
        wynik26.setLayout(new BorderLayout());

        ImageIcon w26 = new ImageIcon("src/resources/MgSO4.png");
        wynik26label = new JLabel();
        wynik26label.setIcon(w26);

        wynik27 = new JPanel();
        wynik27.setVisible(false);
        wynik27.setOpaque(false);
        wynik27.setBackground(Color.green);
        wynik27.setBounds(650,20,468,929);
        wynik27.setLayout(new BorderLayout());

        ImageIcon w27 = new ImageIcon("src/resources/MgO+C.png");
        wynik27label = new JLabel();
        wynik27label.setIcon(w27);

        wynik28 = new JPanel();
        wynik28.setVisible(false);
        wynik28.setOpaque(false);
        wynik28.setBackground(Color.green);
        wynik28.setBounds(650,20,468,929);
        wynik28.setLayout(new BorderLayout());

        ImageIcon w28 = new ImageIcon("src/resources/MgNO32.png");
        wynik28label = new JLabel();
        wynik28label.setIcon(w28);

        wynik29 = new JPanel();
        wynik29.setVisible(false);
        wynik29.setOpaque(false);
        wynik29.setBackground(Color.green);
        wynik29.setBounds(650,20,468,929);
        wynik29.setLayout(new BorderLayout());

        ImageIcon w29 = new ImageIcon("src/resources/MgOH2.png");
        wynik29label = new JLabel();
        wynik29label.setIcon(w29);

        wynik30 = new JPanel();
        wynik30.setVisible(false);
        wynik30.setOpaque(false);
        wynik30.setBackground(Color.green);
        wynik30.setBounds(650,20,468,929);
        wynik30.setLayout(new BorderLayout());

        ImageIcon w30 = new ImageIcon("src/resources/MgOH2+K.png");
        wynik30label = new JLabel();
        wynik30label.setIcon(w30);

        wynik31 = new JPanel();
        wynik31.setVisible(false);
        wynik31.setOpaque(false);
        wynik31.setBackground(Color.green);
        wynik31.setBounds(650,20,468,929);
        wynik31.setLayout(new BorderLayout());

        ImageIcon w31 = new ImageIcon("src/resources/MgCl2.png");
        wynik31label = new JLabel();
        wynik31label.setIcon(w31);

        wynik32 = new JPanel();
        wynik32.setVisible(false);
        wynik32.setOpaque(false);
        wynik32.setBackground(Color.green);
        wynik32.setBounds(650,20,468,929);
        wynik32.setLayout(new BorderLayout());

        ImageIcon w32 = new ImageIcon("src/resources/H3O+SO4.png");
        wynik32label = new JLabel();
        wynik32label.setIcon(w32);

        wynik33 = new JPanel();
        wynik33.setVisible(false);
        wynik33.setOpaque(false);
        wynik33.setBackground(Color.green);
        wynik33.setBounds(650,20,468,929);
        wynik33.setLayout(new BorderLayout());

        ImageIcon w33 = new ImageIcon("src/resources/Cl2O.png");
        wynik33label = new JLabel();
        wynik33label.setIcon(w33);

        wynik34 = new JPanel();
        wynik34.setVisible(false);
        wynik34.setOpaque(false);
        wynik34.setBackground(Color.green);
        wynik34.setBounds(650,20,468,929);
        wynik34.setLayout(new BorderLayout());

        ImageIcon w34 = new ImageIcon("src/resources/H2O+NO2.png");
        wynik34label = new JLabel();
        wynik34label.setIcon(w34);

        wynik35 = new JPanel();
        wynik35.setVisible(false);
        wynik35.setOpaque(false);
        wynik35.setBackground(Color.green);
        wynik35.setBounds(650,20,468,929);
        wynik35.setLayout(new BorderLayout());

        ImageIcon w35 = new ImageIcon("src/resources/NaOH2.png");
        wynik35label = new JLabel();
        wynik35label.setIcon(w35);

        wynik36 = new JPanel();
        wynik36.setVisible(false);
        wynik36.setOpaque(false);
        wynik36.setBackground(Color.green);
        wynik36.setBounds(650,20,468,929);
        wynik36.setLayout(new BorderLayout());

        ImageIcon w36 = new ImageIcon("src/resources/H2CO3.png");
        wynik36label = new JLabel();
        wynik36label.setIcon(w36);

        wynik37 = new JPanel();
        wynik37.setVisible(false);
        wynik37.setOpaque(false);
        wynik37.setBackground(Color.green);
        wynik37.setBounds(650,20,468,929);
        wynik37.setLayout(new BorderLayout());

        ImageIcon w37 = new ImageIcon("src/resources/Na2SO4.png");
        wynik37label = new JLabel();
        wynik37label.setIcon(w37);

        wynik38 = new JPanel();
        wynik38.setVisible(false);
        wynik38.setOpaque(false);
        wynik38.setBackground(Color.green);
        wynik38.setBounds(650,20,468,929);
        wynik38.setLayout(new BorderLayout());

        ImageIcon w38 = new ImageIcon("src/resources/NaCl.png");
        wynik38label = new JLabel();
        wynik38label.setIcon(w38);

        wynik39 = new JPanel();
        wynik39.setVisible(false);
        wynik39.setOpaque(false);
        wynik39.setBackground(Color.green);
        wynik39.setBounds(650,20,468,929);
        wynik39.setLayout(new BorderLayout());

        ImageIcon w39 = new ImageIcon("src/resources/NaNO3.png");
        wynik39label = new JLabel();
        wynik39label.setIcon(w39);

        wynik40 = new JPanel();
        wynik40.setVisible(false);
        wynik40.setOpaque(false);
        wynik40.setBackground(Color.green);
        wynik40.setBounds(650,20,468,929);
        wynik40.setLayout(new BorderLayout());

        ImageIcon w40 = new ImageIcon("src/resources/KNO3.png");
        wynik40label = new JLabel();
        wynik40label.setIcon(w40);

        wynik41 = new JPanel();
        wynik41.setVisible(false);
        wynik41.setOpaque(false);
        wynik41.setBackground(Color.green);
        wynik41.setBounds(650,20,468,929);
        wynik41.setLayout(new BorderLayout());

        ImageIcon w41 = new ImageIcon("src/resources/KCl.png");
        wynik41label = new JLabel();
        wynik41label.setIcon(w41);

        wynik42 = new JPanel();
        wynik42.setVisible(false);
        wynik42.setOpaque(false);
        wynik42.setBackground(Color.green);
        wynik42.setBounds(650,20,468,929);
        wynik42.setLayout(new BorderLayout());

        ImageIcon w42 = new ImageIcon("src/resources/K2SO4.png");
        wynik42label = new JLabel();
        wynik42label.setIcon(w42);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Secret Lab");
        this.setSize(1280, 1024);
        this.setVisible(true);

        this.add(wynik1);
        wynik1.add(wynik1label);
        this.add(wynik2);
        wynik2.add(wynik2label);
        this.add(wynik3);
        wynik3.add(wynik3label);
        this.add(wynik4);
        wynik4.add(wynik4label);
        this.add(wynik5);
        wynik5.add(wynik5label);
        this.add(wynik6);
        wynik6.add(wynik6label);
        this.add(wynik7);
        wynik7.add(wynik7label);
        this.add(wynik8);
        wynik8.add(wynik8label);
        this.add(wynik9);
        wynik9.add(wynik9label);
        this.add(wynik10);
        wynik10.add(wynik10label);
        this.add(wynik11);
        wynik11.add(wynik11label);
        this.add(wynik12);
        wynik12.add(wynik12label);
        this.add(wynik13);
        wynik13.add(wynik13label);
        this.add(wynik14);
        wynik14.add(wynik14label);
        this.add(wynik15);
        wynik15.add(wynik15label);
        this.add(wynik16);
        wynik16.add(wynik16label);
        this.add(wynik17);
        wynik17.add(wynik17label);
        this.add(wynik18);
        wynik18.add(wynik18label);
        this.add(wynik19);
        wynik19.add(wynik19label);
        this.add(wynik20);
        wynik20.add(wynik20label);
        this.add(wynik21);
        wynik21.add(wynik21label);
        this.add(wynik22);
        wynik22.add(wynik22label);
        this.add(wynik23);
        wynik23.add(wynik23label);
        this.add(wynik24);
        wynik24.add(wynik24label);
        this.add(wynik25);
        wynik25.add(wynik25label);
        this.add(wynik26);
        wynik26.add(wynik26label);
        this.add(wynik27);
        wynik27.add(wynik27label);
        this.add(wynik28);
        wynik28.add(wynik28label);
        this.add(wynik29);
        wynik29.add(wynik29label);
        this.add(wynik30);
        wynik30.add(wynik30label);
        this.add(wynik31);
        wynik31.add(wynik31label);
        this.add(wynik32);
        wynik32.add(wynik32label);
        this.add(wynik33);
        wynik33.add(wynik33label);
        this.add(wynik34);
        wynik34.add(wynik34label);
        this.add(wynik35);
        wynik35.add(wynik35label);
        this.add(wynik36);
        wynik36.add(wynik36label);
        this.add(wynik37);
        wynik37.add(wynik37label);
        this.add(wynik38);
        wynik38.add(wynik38label);
        this.add(wynik39);
        wynik39.add(wynik39label);
        this.add(wynik40);
        wynik40.add(wynik40label);
        this.add(wynik41);
        wynik41.add(wynik41label);
        this.add(wynik42);
        wynik42.add(wynik42label);

        this.add(menubutton);
        this.add(Fe);
        this.add(Feen);
        this.add(Felabel);
        this.add(Zn);
        this.add(Znen);
        this.add(Znlabel);
        this.add(MnO2);
        this.add(MnO2en);
        this.add(MnO2label);
        this.add(Al);
        this.add(Alen);
        this.add(Allabel);
        this.add(Mg);
        this.add(Mgen);
        this.add(Mglabel);
        this.add(H2SO4);
        this.add(H2SO4en);
        this.add(H2SO4label);
        this.add(HCl);
        this.add(HClen);
        this.add(HCllabel);
        this.add(HNO3);
        this.add(HNO3en);
        this.add(HNO3label);
        this.add(NaOH);
        this.add(NaOHen);
        this.add(NaOHlabel);
        this.add(KOH);
        this.add(KOHen);
        this.add(KOHlabel);
        this.add(CO2);
        this.add(CO2en);
        this.add(CO2label);
        this.add(H2O);
        this.add(H2Oen);
        this.add(H2Olabel);
        this.add(cofnij);
        this.add(label);


        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());

    }

    /**
     * W param e zapisane zostały wszystkie akcje, za które odpowiedzialne są naciskane przyciski z końcówką en w JFrame,
     * wyniki reakcji oraz co się stanie gdy probówki nie reagują, przycisk cofnij odpowiedzialny za cofanie wybranych
     * probówek i menu odpowiedzialny za powrót do menu
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Feen){
            Felabel.setVisible(true);
            Fe.setEnabled(true);
            Feen.setEnabled(false);
            Znen.setEnabled(false);
            MnO2en.setEnabled(false);
            Alen.setEnabled(false);
            Mgen.setEnabled(false);
        }
        if(e.getSource()==Znen){
            Znlabel.setVisible(true);
            Zn.setEnabled(true);
            Feen.setEnabled(false);
            Znen.setEnabled(false);
            MnO2en.setEnabled(false);
            Alen.setEnabled(false);
            Mgen.setEnabled(false);

        }
        if(e.getSource()==MnO2en){
            MnO2label.setVisible(true);
            MnO2.setEnabled(true);
            Feen.setEnabled(false);
            Znen.setEnabled(false);
            MnO2en.setEnabled(false);
            Alen.setEnabled(false);
            Mgen.setEnabled(false);
        }
        if (e.getSource()==Alen){
            Allabel.setVisible(true);
            Al.setEnabled(true);
            Feen.setEnabled(false);
            Znen.setEnabled(false);
            MnO2en.setEnabled(false);
            Alen.setEnabled(false);
            Mgen.setEnabled(false);
        }
        if (e.getSource()==Mgen){
            Mglabel.setVisible(true);
            Mg.setEnabled(true);
            Feen.setEnabled(false);
            Znen.setEnabled(false);
            MnO2en.setEnabled(false);
            Alen.setEnabled(false);
            Mgen.setEnabled(false);
        }
        if (e.getSource()==H2SO4en){
            H2SO4label.setVisible(true);
            H2SO4.setEnabled(true);
            HClen.setEnabled(false);
            HNO3en.setEnabled(false);
            H2SO4en.setEnabled(false);
        }
        if (e.getSource()==HClen){
            HCllabel.setVisible(true);
            HCl.setEnabled(true);
            HClen.setEnabled(false);
            HNO3en.setEnabled(false);
            H2SO4en.setEnabled(false);
        }
        if (e.getSource()==HNO3en){
            HNO3label.setVisible(true);
            HNO3.setEnabled(true);
            HClen.setEnabled(false);
            HNO3en.setEnabled(false);
            H2SO4en.setEnabled(false);
        }
        if (e.getSource()==NaOHen){
            NaOHlabel.setVisible(true);
            NaOH.setEnabled(true);
            NaOHen.setEnabled(false);
            KOHen.setEnabled(false);
            CO2en.setEnabled(false);
        }
        if (e.getSource()==KOHen){
            KOHlabel.setVisible(true);
            KOH.setEnabled(true);
            NaOHen.setEnabled(false);
            KOHen.setEnabled(false);
            CO2en.setEnabled(false);
        }
        if (e.getSource()==CO2en){
            CO2label.setVisible(true);
            CO2.setEnabled(true);
            NaOHen.setEnabled(false);
            KOHen.setEnabled(false);
            CO2en.setEnabled(false);
        }
        if (e.getSource()==H2Oen){
            H2Olabel.setVisible(true);
            H2O.setEnabled(true);
            H2Oen.setEnabled(false);
        }

        if (Fe.isEnabled() && HCl.isEnabled()) {
            wynik1.setVisible(true);
        }
        if (Fe.isEnabled() && H2SO4.isEnabled()){
            wynik2.setVisible(true);
        }
        if (Fe.isEnabled() &&H2O.isEnabled()){
            wynik3.setVisible(true);
        }
        if (Fe.isEnabled() &&KOH.isEnabled()){
            wynik4.setVisible(true);
        }
        if (Fe.isEnabled() && NaOH.isEnabled()){
            wynik5.setVisible(true);
        }
        if (Fe.isEnabled() && HNO3.isEnabled()){
            wynik6.setVisible(true);
        }
        if (Fe.isEnabled() && CO2.isEnabled()){
            Probowkinielaczasie probowkinielaczasie = new Probowkinielaczasie();
            Fe.setEnabled(false);
        }

        if (Zn.isEnabled() && HNO3.isEnabled()){
            wynik7.setVisible(true);
        }
        if (Zn.isEnabled() && HCl.isEnabled()){
            wynik8.setVisible(true);
        }
        if (Zn.isEnabled() && NaOH.isEnabled()){
            wynik9.setVisible(true);
        }
        if (Zn.isEnabled() && H2SO4.isEnabled()){
            wynik10.setVisible(true);
        }
        if (Zn.isEnabled() && KOH.isEnabled() && H2O.isEnabled()){
            wynik11.setVisible(true);
        }
        if (Zn.isEnabled() && CO2.isEnabled()){
            Probowkinielaczasie probowkinielaczasie = new Probowkinielaczasie();
            Zn.setEnabled(false);
        }

        if (MnO2.isEnabled() && H2SO4.isEnabled()){
            wynik12.setVisible(true);
        }
        if (MnO2.isEnabled() && KOH.isEnabled()){
            wynik13.setVisible(true);
        }
        if (MnO2.isEnabled() && H2O.isEnabled()){
            wynik14.setVisible(true);
        }
        if (MnO2.isEnabled()&& NaOH.isEnabled()){
            wynik15.setVisible(true);
        }
        if (MnO2.isEnabled()&&HNO3.isEnabled()){
            wynik16.setVisible(true);
        }
        if (MnO2.isEnabled()&&HCl.isEnabled()){
            wynik17.setVisible(true);
        }
        if (MnO2.isEnabled()&&CO2.isEnabled()){
            wynik18.setVisible(true);
        }

        if (Al.isEnabled()&&HCl.isEnabled()){
            wynik19.setVisible(true);
        }
        if (Al.isEnabled()&&NaOH.isEnabled()&&H2O.isEnabled()){
            wynik20.setVisible(true);

        }
        if (Al.isEnabled()&&HNO3.isEnabled()){
            wynik21.setVisible(true);
        }
        if (Al.isEnabled()&&H2SO4.isEnabled()){
            wynik22.setVisible(true);
        }
        if (Al.isEnabled()&&CO2.isEnabled()){
            wynik23.setVisible(true);
        }
        if (Al.isEnabled()&&KOH.isEnabled()&&H2O.isEnabled()){
            wynik24.setVisible(true);
        }

        if (Mg.isEnabled()&&H2O.isEnabled()){
            wynik25.setVisible(true);
        }
        if (Mg.isEnabled()&&H2SO4.isEnabled()){
            wynik26.setVisible(true);
        }
        if (Mg.isEnabled()&&CO2.isEnabled()){
            wynik27.setVisible(true);
        }
        if (Mg.isEnabled()&&HNO3.isEnabled()){
            wynik28.setVisible(true);
        }
        if (Mg.isEnabled()&&NaOH.isEnabled()){
            wynik29.setVisible(true);
        }
        if (Mg.isEnabled()&&KOH.isEnabled()){
            wynik30.setVisible(true);
        }
        if (Mg.isEnabled()&&HCl.isEnabled()){
            wynik31.setVisible(true);
        }

        if (H2O.isEnabled()&&H2SO4.isEnabled()){
            wynik32.setVisible(true);
        }
        if(H2SO4.isEnabled()&&CO2.isEnabled()){
            Probowkinielaczasie probowkinielaczasie = new Probowkinielaczasie();
            H2SO4.setEnabled(false);
        }
        if (HCl.isEnabled()&&H2O.isEnabled()){
            wynik33.setVisible(true);
        }
        if (HCl.isEnabled()&&CO2.isEnabled()){
            Probowkinielaczasie probowkinielaczasie = new Probowkinielaczasie();
            HCl.setEnabled(false);
        }
        if (HNO3.isEnabled()&&CO2.isEnabled()){
            Probowkinielaczasie probowkinielaczasie = new Probowkinielaczasie();
            HNO3.setEnabled(false);
        }
        if (HNO3.isEnabled()&&H2O.isEnabled()){
            wynik34.setVisible(true);
        }
        if (NaOH.isEnabled()&&H2O.isEnabled()){
            wynik35.setVisible(true);
        }
        if (CO2.isEnabled()&&H2O.isEnabled()){
            wynik36.setVisible(true);
        }
        if (H2SO4.isEnabled()&&NaOH.isEnabled()){
            wynik37.setVisible(true);
        }
        if (HCl.isEnabled()&&NaOH.isEnabled()){
            wynik38.setVisible(true);
        }
        if (HNO3.isEnabled()&&NaOH.isEnabled()){
            wynik39.setVisible(true);
        }
        if (HNO3.isEnabled()&&KOH.isEnabled()){
            wynik40.setVisible(true);
        }
        if (HCl.isEnabled()&&KOH.isEnabled()){
            wynik41.setVisible(true);
        }
        if (H2SO4.isEnabled()&&KOH.isEnabled()){
            wynik42.setVisible(true);
        }


        if (e.getSource()==cofnij){

            Felabel.setVisible(false);
            Fe.setEnabled(false);
            Znlabel.setVisible(false);
            Zn.setEnabled(false);
            MnO2label.setVisible(false);
            MnO2.setEnabled(false);
            Allabel.setVisible(false);
            Al.setEnabled(false);
            Mglabel.setVisible(false);
            Mg.setEnabled(false);
            H2SO4label.setVisible(false);
            H2SO4.setEnabled(false);
            HCllabel.setVisible(false);
            HCl.setEnabled(false);
            HNO3label.setVisible(false);
            HNO3.setEnabled(false);
            NaOHlabel.setVisible(false);
            NaOH.setEnabled(false);
            KOHlabel.setVisible(false);
            KOH.setEnabled(false);
            CO2label.setVisible(false);
            CO2.setEnabled(false);
            H2Olabel.setVisible(false);
            H2O.setEnabled(false);
            Feen.setEnabled(true);
            Znen.setEnabled(true);
            MnO2en.setEnabled(true);
            Alen.setEnabled(true);
            Mgen.setEnabled(true);
            H2SO4en.setEnabled(true);
            HClen.setEnabled(true);
            HNO3en.setEnabled(true);
            NaOHen.setEnabled(true);
            KOHen.setEnabled(true);
            CO2en.setEnabled(true);
            H2Oen.setEnabled(true);
            wynik1.setVisible(false);
            wynik2.setVisible(false);
            wynik3.setVisible(false);
            wynik4.setVisible(false);
            wynik5.setVisible(false);
            wynik6.setVisible(false);
            wynik7.setVisible(false);
            wynik8.setVisible(false);
            wynik9.setVisible(false);
            wynik10.setVisible(false);
            wynik11.setVisible(false);
            wynik12.setVisible(false);
            wynik13.setVisible(false);
            wynik14.setVisible(false);
            wynik15.setVisible(false);
            wynik16.setVisible(false);
            wynik17.setVisible(false);
            wynik18.setVisible(false);
            wynik19.setVisible(false);
            wynik20.setVisible(false);
            wynik21.setVisible(false);
            wynik22.setVisible(false);
            wynik23.setVisible(false);
            wynik24.setVisible(false);
            wynik25.setVisible(false);
            wynik26.setVisible(false);
            wynik27.setVisible(false);
            wynik28.setVisible(false);
            wynik29.setVisible(false);
            wynik30.setVisible(false);
            wynik31.setVisible(false);
            wynik32.setVisible(false);
            wynik33.setVisible(false);
            wynik34.setVisible(false);
            wynik35.setVisible(false);
            wynik36.setVisible(false);
            wynik37.setVisible(false);
            wynik38.setVisible(false);
            wynik39.setVisible(false);
            wynik40.setVisible(false);
            wynik41.setVisible(false);
            wynik42.setVisible(false);
        }
        if (e.getSource()==menubutton){
            this.dispose();
            Menu Menu = new Menu(pass);
        }

    }
}


//wszystkie możliwe reakcje

//        1.	Fe + 2HCl → FeCl2 + H2 ↑
//        2.	Fe + H2SO4 rozc.→ FeSO4 + H2 ↑
//        3.	Fe + H2O → Fe3 O4  + H2 ↑
//        4.	Fe + KOH = Fe(OH)3 + K
//        5.	Fe + NaOH = Fe(OH)3 +Na
//        6.	Fe + HNO3 = Fe(NO3)3+NO(gaz)+H2O
//
//        7.	Zn + 4 HNO3 → Zn(NO3)2 + 2 NO2 + 2 H20
//        8.	ZnO+2HCl→ZnCl2+H2O
//        9.	Zn+2NaOH−→Na2ZnO2+ H2 ↑
//        10.	Zn+H2SO4→ZnSO4+ H2 ↑
//        11.	Zn + 2KOH + 2H2O → K2(Zn(OH)4) + H2   //POTROJNA
//
//        12.	MnO2 + H2SO4 = Mn2O3 + O2
//        13.	MnO2 + KOH = (pod wpływem tlenu) = K2MnO4 + 2 H20
//        14.	3MnO2 + 4H2O → 3Mn(OH)2 + 2HO2
//        15.	MnO2 + NaOH = (pod wpływem tlenu) = Na2MnO4 + 2 H20
//        16.	MnO2 + HNO3 = Mn(NO3)2 +H2O +O2
//        17.	 MnO 2 + HCl → MnCl 2 + H 2 O + Cl 2.
//        18.	MnO2+CO2=Mn(CO3)2
//
//        19.	2Al+6HCl→2AlCl3+3H2↑
//        20.	2Al+2NaOH+6H2O→2Na[Al(OH)4]+3H2↑     //POTROJNA
//        21.	8Al+27HNO3→8Al(NO3)3+3NH3+9H2O
//        22.	2Al+6H2SO4→Al2(SO4)3+3SO2↑+6H2O
//        23.	Al + CO2 = AlO + CO
//        24.	2Al + 6KOH + 6H2O → 2K3(Al(OH)6) + 3H2  //POTROJNA
//
//        25.	Mg + H₂O → MgO + H₂ ↑
//        26.	Mg + H2SO4 ------------->  MgSO4 + H2
//        27.	2Mg + CO2 --> 2MgO + C
//        28.	Mg + 4HNO3 → Mg(NO3)2 + 2NO2 + 2H2O
//        29.	Mg + 2NaOH → Mg(OH)2 + 2Na
//        30.	Mg + 2KOH → Mg(OH)2 + 2K
//        31.	Mg + HCl → MgCl 2 + H 2
//
//        32.	H2O +H2SO4 = H3O + SO4
//        33.	2HCl + H2O → 2H2 + Cl2O
//        34.	H20 + HNO3 = H2O + NO2
//        35.	naoh+h2o=na(oh)2+h2
//        36.	CO2 + H2O = H2CO3
//
//        37.	h2so4+naoh = Na2SO4 + H2O
//        38.	hcl+naoh = NaCl + h2o
//        39.	hno3+naoh = NaNO3 + H2O
//        40.	hno3+koh = KNO3 + H2O
//        41.	hcl+koh = kcl + h2o
//        42.	h2so4 + koh = k2so4 + h20
//




