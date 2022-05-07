package ui;

import java.awt.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class SdmSplassScreen extends JWindow {
    // attributes
    private int duration;
    private final int width = 600;
    private final int height = 400;

    // constructor
    public SdmSplassScreen(int duration) {
        this.duration = duration;
    }

    // A simple little method to show a title screen in the center of the screen for
    // the amount of time given in the constructor
    public void showSplash() {
        ImageBackgroundPanel content = new ImageBackgroundPanel();
        this.setContentPane(content);
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        // Build the splash screen
        JLabel lblTitle = new JLabel("SDM: Simple Download Manager", JLabel.CENTER);
        lblTitle.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 22));
        lblTitle.setForeground(new Color(16, 134, 218));
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        titlePanel.setBackground(new Color(0, 0, 0, 0));
        titlePanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
        titlePanel.add(lblTitle);

        JLabel lblVersion = new JLabel("Version: v0.0.1", JLabel.CENTER);
        lblVersion.setFont(new Font(Font.SANS_SERIF, Font.ITALIC | Font.BOLD, 16));
        lblVersion.setForeground(new Color(16, 134, 218));
        JPanel versionPanel = new JPanel();
        versionPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        versionPanel.setBackground(new Color(0, 0, 0, 0));
        versionPanel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 5));
        versionPanel.add(lblVersion);

        content.add(titlePanel, BorderLayout.NORTH);
        content.add(versionPanel, BorderLayout.SOUTH);

        this.setVisible(true);
        try {
            Thread.sleep(duration);
        } catch (Exception e) {
            System.out.println(e);
        }
        this.setVisible(false);
    }

    private class ImageBackgroundPanel extends JPanel {
        Image image = null;

        public ImageBackgroundPanel() {
            this.setLayout(new BorderLayout());
            try {
                image = new ImageIcon(this.getClass().getResource("/images/splash.png")).getImage();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            if (image != null) {
                g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        }
    }

}
