import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.*;
import java.lang.Exception;

public class Browser {
  private JFrame frame;
  private JPanel upperPanel;
  private JPanel lowerPanel;
  private Container content;

  public Browser() {
  }

  public void setView() {
    frame = new JFrame("Browser");
    frame.setSize(800, 600);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(new BorderLayout());

    // Set upper panel, those buttons
    frame.add(upperPanel(), BorderLayout.NORTH);

    // Set lower panel, the web view
    frame.add(lowerPanel());
    frame.setVisible(true);
  }

  private JPanel upperPanel() {
    upperPanel = new JPanel();
    upperPanel.setLayout(new BorderLayout());

    JButton button = new JButton("TEST");
    upperPanel.add(BorderLayout.CENTER, button);
    return upperPanel;
  }

  private JPanel lowerPanel() {
    lowerPanel = new JPanel();
    lowerPanel.setLayout(new BorderLayout());

    JEditorPane editor = null;
    try {
      editor = new JEditorPane("http://google.com.hk");
      lowerPanel.add(BorderLayout.CENTER, editor);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return lowerPanel;
  }

  public static void main(String[] args) {
    Browser browser = new Browser();
    browser.setView();
  }
}
