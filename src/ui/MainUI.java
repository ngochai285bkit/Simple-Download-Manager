package ui;

import javax.swing.JFrame;

public class MainUI extends JFrame{
    public MainUI(String title){
        this.setTitle(title);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
