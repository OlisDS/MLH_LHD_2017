import javax.swing.*;
import java.awt.*;

public class Graphics {
    /*
    JFrame mainWindow = new JFrame();

    JTextField howManyComments;
    JButton commentClick;
    Icon commentIcon;
    JTextField commentFrequency;

    JLabel storeHeader;
    JLabel have;
    JLabel sell;

    JLabel sHave1;
    JButton sBuy1;
    JButton sSell1;

    JLabel sHave2;
    JButton sBuy2;
    JButton sSell2;

    JLabel sHave3;
    JButton sBuy3;
    JButton sSell3;

    JLabel sHave4;
    JButton sBuy4;
    JButton sSell4;

    JLabel sHave5;
    JButton sBuy5;
    JButton sSell5;

    JLabel sHave6;
    JButton sBuy6;
    JButton sSell6;

    JLabel sHave7;
    JButton sBuy7;
    JButton sSell7;

    JLabel sHave8;
    JButton sBuy8;
    JButton sSell8;
    */

    static JFrame mainWindow;
    static GridBagConstraints layoutConst;

    public void init(){

        Asset[] assetTypes = Main.assetTypes;

        layoutConst = null;

        JFrame mainWindow = new JFrame("CommentClicker");

        JLabel howManyComments = new JLabel(Long.toString(Main.commentCounter.getNComments()));
        JButton commentClick = new JButton();
        Icon commentIcon = new ImageIcon(getClass().getResource("export.png"));

        JLabel commentFrequency = new JLabel("0");

        JLabel storeHeader = new JLabel("Store");
        JLabel have = new JLabel("Owned");

        JLabel sHave1 = new JLabel(Integer.toString(assetTypes[0].getQuantity()));
        JButton sBuy1 = new JButton("Single Line Commenting");
        JButton sSell1 = new JButton("Sell");

        JLabel sHave2 = new JLabel(Integer.toString(assetTypes[1].getQuantity()));
        JButton sBuy2 = new JButton("Multi-Line commenting");
        JButton sSell2 = new JButton("Sell");

        JLabel sHave3 = new JLabel(Integer.toString(assetTypes[2].getQuantity()));
        JButton sBuy3 = new JButton("JavaDocs");
        JButton sSell3 = new JButton("Sell");

        JLabel sHave4 = new JLabel(Integer.toString(assetTypes[3].getQuantity()));
        JButton sBuy4 = new JButton("ReadMe files");
        JButton sSell4 = new JButton("Sell");

        JLabel sHave5 = new JLabel(Integer.toString(assetTypes[4].getQuantity()));
        JButton sBuy5 = new JButton("Header and Design Patterns");
        JButton sSell5 = new JButton("Sell");

        JLabel sHave6 = new JLabel(Integer.toString(assetTypes[5].getQuantity()));
        JButton sBuy6 = new JButton("QA Commenter");
        JButton sSell6 = new JButton("Sell");

        JLabel sHave7 = new JLabel(Integer.toString(assetTypes[6].getQuantity()));
        JButton sBuy7 = new JButton("Automatic Commenting Scripts");
        JButton sSell7 = new JButton("Sell");

        JLabel sHave8 = new JLabel(Integer.toString(assetTypes[7].getQuantity()));
        JButton sBuy8 = new JButton("Readable Code");
        JButton sSell8 = new JButton("Sell");

        layoutConst = new GridBagConstraints();

        add(2, 6, 1,2, howManyComments);
        add(2, 6, 2,6, commentClick);
        add(2, 6,  7,8, commentFrequency);

        add(8, 11, 0, 1, storeHeader);
        add(8, 9, 1, 2, sHave1);
        add(9, 10,1,2,sBuy1);
        add(10,11,1,2,sSell1);

        add(8, 9, 2, 3, sHave2);
        add(9, 10,2,3,sBuy2);
        add(10,11,2,3,sSell2);

        add(8, 9, 3, 4, sHave1);
        add(9, 10,3,4,sBuy1);
        add(10,11,3,4,sSell1);

        add(8, 9, 4, 5, sHave1);
        add(9, 10,4,5,sBuy1);
        add(10,11,4,5,sSell1);

        add(8, 9, 5, 6, sHave1);
        add(9, 10,5,6,sBuy1);
        add(10,11,5,6,sSell1);

        add(8, 9, 6, 7, sHave1);
        add(9, 10,6,7,sBuy1);
        add(10,11,6,7,sSell1);

        add(8, 9, 7, 8, sHave1);
        add(9, 10,7,8,sBuy1);
        add(10,11,7,8,sSell1);

        add(8, 9, 8, 9, sHave1);
        add(9, 10,8,9,sBuy1);
        add(10,11,8,9,sSell1);

        mainWindow.pack();
        mainWindow.setVisible(true);

    }

    public void add(int x, int x1, int y, int y1, JComponent c){
        layoutConst.gridx = x;
        layoutConst.gridy = y;
        layoutConst.gridwidth = x1 - x;
        layoutConst.gridheight = y1 - y;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        mainWindow.add(c, layoutConst);
        return;
    }

    //Icon commentIcon = new ImageIcon(getClass().getResource("export.png"));




}
