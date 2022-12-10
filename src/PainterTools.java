import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JToolBar;
import javax.swing.SpinnerNumberModel;

public class PainterTools extends JToolBar{
    static Image[] org_image = new Image[9];
    static Image[] ch_image = new Image[9];
    static ImageIcon[] org_icon = new ImageIcon[9];
    static ImageIcon[] ch_icon = new ImageIcon[9];
    static JButton[] btn = new JButton[9];
	
    PainterTools(){
    	this("");
    }
    
	
	PainterTools(String toolbarname){
		
	
//	JToolBar tb = new JToolBar();
    SpinnerNumberModel fontsize = new SpinnerNumberModel(8, 1, 50, 1);
    JSpinner spinner = new JSpinner(fontsize);
    JComboBox combo = new JComboBox<>();

    
//    tb.setLocation(0, 0);
//    tb.setPreferredSize(new Dimension(1000,60));
    
	ImageIcon back = new ImageIcon("folder/back.png");
    ImageIcon back2 = new ImageIcon("folder/back2.png");
    ImageIcon copy = new ImageIcon("folder/copy.png");
    ImageIcon copy2 = new ImageIcon("folder/copy2.png");
    ImageIcon front = new ImageIcon("folder/front.png");
    ImageIcon front2 = new ImageIcon("folder/front2.png");
    ImageIcon paste = new ImageIcon("folder/paste.png");
    ImageIcon paste2 = new ImageIcon("folder/paste2.png");
    ImageIcon leftrotation = new ImageIcon("folder/leftrotation.png");
    ImageIcon leftrotation2 = new ImageIcon("folder/leftrotation2.png");
    ImageIcon rightrotation = new ImageIcon("folder/rightrotation.png");
    ImageIcon rightrotation2 = new ImageIcon("folder/rightrotation2.png");
    ImageIcon color = new ImageIcon("folder/color.png");
    ImageIcon color2 = new ImageIcon("folder/color2.png");
    ImageIcon line = new ImageIcon("folder/line.png");
    ImageIcon line2 = new ImageIcon("folder/line2.png");
    ImageIcon erase = new ImageIcon("folder/erase.png");
    ImageIcon erase2 = new ImageIcon("folder/erase2.png");

    /*
    Image[] org_image = new Image[9];
    Image[] ch_image = new Image[9];
    ImageIcon[] org_icon = new ImageIcon[9];
    ImageIcon[] ch_icon = new ImageIcon[9];
	*/
    
    org_image[0] = back.getImage();
    org_image[1] = front.getImage();
    org_image[2] = copy.getImage();
    org_image[3] = paste.getImage();
    org_image[4] = leftrotation.getImage();
    org_image[5] = rightrotation.getImage();
    org_image[6] = color.getImage();
    org_image[7] = line.getImage();
    org_image[8] = erase.getImage();

    ch_image[0] = back2.getImage();
    ch_image[1] = front2.getImage();
    ch_image[2] = copy2.getImage();
    ch_image[3] = paste2.getImage();
    ch_image[4] = leftrotation2.getImage();
    ch_image[5] = rightrotation2.getImage();
    ch_image[6] = color2.getImage();
    ch_image[7] = line2.getImage();
    ch_image[8] = erase2.getImage();

    for (int i = 0; i < org_image.length; i++) {
        org_image[i] = org_image[i].getScaledInstance(40, 40, Image.SCALE_SMOOTH);
    }

    for (int i = 0; i < ch_image.length; i++) {
        ch_image[i] = ch_image[i].getScaledInstance(40, 40, Image.SCALE_SMOOTH);
    }

    for (int i = 0; i < org_icon.length; i++) {
        org_icon[i] = new ImageIcon(org_image[i]);
    }

    for (int i = 0; i < ch_icon.length; i++) {
        ch_icon[i] = new ImageIcon(ch_image[i]);
    }


//    tb.setBackground(Color.white);
//    tb.setLayout(new FlowLayout());


//    JButton[] btn = new JButton[9];

    for (int i = 0; i < btn.length; i++) {
        btn[i] = new JButton(org_icon[i]);
//        tb.add(btn[i]);
        add(btn[i]);
        btn[i].setPreferredSize(new Dimension(40, 40));
        btn[i].setRolloverIcon(ch_icon[i]);
        btn[i].setBorderPainted(true);
//        tb.addSeparator();
        addSeparator();
    }

//    tb.addSeparator();
    addSeparator();

    JLabel sizelabel = new JLabel("Text Size");
    sizelabel.setPreferredSize(new Dimension(60, 40));
//    tb.add(sizelabel);
//    tb.add(spinner);
//
//    tb.addSeparator();
    add(sizelabel);
    add(spinner);

    JLabel fontlabel = new JLabel("Fonts");
    fontlabel.setPreferredSize(new Dimension(40,40));
    combo.addItem("맑은 고딕");
    combo.addItem("궁서체");
    combo.addItem("함초롱바탕");
//    tb.add(fontlabel);
//    tb.add(combo);
    add(fontlabel);
    add(combo);
	}

}
