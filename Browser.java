import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;

public class Browser {
  private JFrame frame;
  private JPanel panel;
  private Container content;

  public Browser() {
  }

  public void setView() {
    frame = new JFrame("Browser");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    // Set upper panel, those buttons
    frame.add(upperPanel());

    // Set lower panel, the web view
    
    frame.setVisible(true);
  }

  private JPanel upperPanel() {
    panel = new JPanel();
    JButton button = new JButton("TEST");
    panel.setLayout(new BorderLayout());
    panel.add(BorderLayout.CENTER, button);
    return panel;
  }

  public static void main(String[] args) {
    Browser browser = new Browser();
    browser.setView();
  }
}
