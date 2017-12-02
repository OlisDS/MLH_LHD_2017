import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class CommentButton extends JFrame{

    private JButton comment;
    GridBagConstraints layout = new GridBagConstraints();

    public CommentButton() {
        super("Comment Clicker");
        setLayout(new GridBagLayout());

        Icon commentIcon = new ImageIcon(getClass().getResource("export.png"));
        comment = new JButton("Comment", commentIcon);
        layout.gridx = 0;
        layout.gridy = 0;

        add(comment, layout);

        Handler click = new Handler();
        comment.addActionListener(click);

    }

    private class Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(null, String.format("%s", "Comment has been pressed"));
        }
    }
}
