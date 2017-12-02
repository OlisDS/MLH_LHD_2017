import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class commentclicker {

    public static void main(String[] args) {

        CommentButton buttonObject = new CommentButton();
        buttonObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonObject.setSize(800, 800);
        buttonObject.setVisible(true);
    }
}
