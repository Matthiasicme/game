package codes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Interface extends JFrame implements ActionListener {
    JButton playbio;
    JButton playchem;
    JButton close;
    JLabel introduction;
    JPanel intro;

    boolean nameInput = false;
    public String name;
    String username;

    public Interface(boolean is_name, String username) {
        this.username = username;
        ImageIcon background = new ImageIcon("src/resources/maininterface.png");
        JLabel label = new JLabel();
        label.setIcon(background);
        nameInput = is_name;

        if (!nameInput) {
            name = JOptionPane.showInputDialog(null, "Hello, what is your name?", "Introduce Yourself", JOptionPane.QUESTION_MESSAGE);
            nameInput = true;
        }else name= username;

        intro = new JPanel();
        intro.setVisible(true);
        intro.setBounds(100,170,530,70);
        intro.setLayout(new BorderLayout());
        intro.setBackground(new Color(0x6af6be));

        introduction = new JLabel();
        introduction.setText(name +"'s lab");
        introduction.setFont(new Font("MV Boli",Font.PLAIN,35));

        playbio = new JButton();
        playbio.setBounds(200,420,210,60);
        playbio.setOpaque(false);
        playbio.setContentAreaFilled(false);
        playbio.setBorderPainted(false);
        playbio.addActionListener(this);

        playchem = new JButton();
        playchem.setBounds(850,420,210,60);
        playchem.setOpaque(false);
        playchem.setContentAreaFilled(false);
        playchem.setBorderPainted(false);
        playchem.addActionListener(this);


        close = new JButton();
        close.setBounds(530,930,210,60);
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setBorderPainted(false);
        close.addActionListener(this);

        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Secret Lab");
        this.setSize(1280, 1024);
        this.setVisible(true);
        this.add(close);
        this.add(playbio);
        this.add(playchem);
        this.add(intro);
        intro.add(introduction);
        this.add(label);


        ImageIcon logo = new ImageIcon("src/resources/logo.jpg");
        this.setIconImage(logo.getImage());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==playbio){
            this.dispose();
            Menubiol Menubiol = new Menubiol(name);
        }
        if(e.getSource()==playchem){
            this.dispose();
            Menu Menu = new Menu(name);
        }
        if (e.getSource()==close){
            this.dispose();
        }
    }
}


