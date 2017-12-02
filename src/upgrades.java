import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class upgrades extends JFrame{

    private JLabel cookie;

    public upgrades() {
        super("Comment Cutter");
        setLayout(new FlowLayout());
        cookie = new JLabel("Insert cookie here");
        cookie.setToolTipText("");
    }
}
