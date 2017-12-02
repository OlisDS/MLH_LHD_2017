import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CommentClicker {

    public static void main(String[] args) {

        CommentButton buttonObject = new CommentButton();
        buttonObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonObject.setSize(200, 100);
        buttonObject.setVisible(true);
    }
}
