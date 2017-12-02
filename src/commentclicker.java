import javax.swing.JFrame;

public class commentclicker {

    public static void main(String[] args) {
    /*    JFrame frame =  new JFrame();
        frame.setSize(800, 700);
        frame.setTitle("Comment Cutter");


        //Stops program when window closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);*/

        CommentButton buttonObject = new CommentButton();
        buttonObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buttonObject.setSize(800, 800);
        buttonObject.setVisible(true);
    }
}
