import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//proposal 이전 버전
public class DS_project_v1 extends JFrame{
	RectPanel rectPanel;

    public DS_project_v1(){
        setTitle("Drawing Board");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createMenu();
        rectPanel = new RectPanel();
        add(rectPanel, BorderLayout.NORTH);//여기서 RectPanel추가
        pack();
        setSize(600,600);
        setVisible(true);
    }
    
    public static void main(String[] args) {
    	new DS_project_v1();
    }

    // DS_project의 inner class
    class MenuActionListener implements ActionListener { 
    	public void actionPerformed(ActionEvent e) {
    		String cmd = e.getActionCommand(); 
    		System.out.println("방금 클릭한 메뉴: "+cmd);
    		switch(cmd) { // 메뉴 아이템의 종류 구분
    			case "Black" :
    				rectPanel.shapeString=cmd;
    				System.out.println("color black load clicked");
    				break;
    			case "1/4 pt" :
    				rectPanel.stroke=(float)0.25;
    				System.out.println("color stroke 1/4 clicked");
    				break;
    			case "Save" :
    				if(rectPanel!=null) {
//    					SaveL savePann = new SaveL(rectPanel, rectPanel.bufferedImage);
//    					savePann.savePic();
    				}
    				
    				System.out.println("menu save clicked"); break;
    			case "Open" :
    				if(rectPanel!=null) {
//    					OpenL openPann = new OpenL(rectPanel, rectPanel.bufferedImage);
//    					openPann.openPic();
    				}
    				System.out.println("menu open clicked"); break;
    			case "Clear" :
    				rectPanel.shapeString="전체지우기";
    				System.out.println("menu clear clicked"); break;
    		}
    	}
    }

    
    //이미지 버튼 내용 다 뺐음 -> TestGUI.java로
    void createMenu(){
        JMenuBar mb = new JMenuBar();
        //메뉴 누르면 MenuActionListenr 실행될거임
        MenuActionListener listener = new MenuActionListener(); 

        mb.setBackground(Color.pink);
        JMenu[] menus = new JMenu[5];
        String[] menunames = {"File", "Shape", "Draw", "Zoom in(X)", "Zoom out(X)"};
        
        for(int i=0; i<menus.length; i++) {
        	menus[i] = new JMenu(menunames[i]);
        	mb.add(menus[i]);
        	menus[i].addActionListener(new MenuActionListener());
        }
        /*
        JMenu filemenu = new JMenu("File");
        JMenu shapemenu = new JMenu("Shape");
        JMenu drawmenu = new JMenu("Draw");
        JMenu zoominmenu = new JMenu("Zoom in");
        JMenu zoomoutmenu = new JMenu("Zoom out");
        
        mb.add(filemenu);
        mb.add(shapemenu);
        mb.add(drawmenu);
        mb.add(zoominmenu);
        mb.add(zoomoutmenu);
		*/
        
        JMenuItem savemenu = new JMenuItem("Save");
        JMenuItem openmenu = new JMenuItem("Open");
        JMenuItem clearmenu = new JMenuItem("Clear");
        JMenu colormenu = new JMenu("Color");
        JMenu thicnesskmenu = new JMenu("Line thinkness");
//        SaveL save = new SaveL();
//        savemenu.addActionListener(new SaveL(rectPanel, rectPanel.bufferedImage));
        savemenu.addActionListener(listener);
        openmenu.addActionListener(listener);
        clearmenu.addActionListener(listener);
        
        //File 세부 메뉴들
        menus[0].add(savemenu);
        menus[0].add(openmenu);
        menus[0].add(clearmenu);
//        filemenu.add(savemenu);
//        filemenu.add(openmenu);
//        filemenu.add(clearmenu);

        JMenu colormenu1 = new JMenu("Color");
        JMenu thicnesskmenu1 = new JMenu("Line thinkness");
        
        //1 안붙은 컬러메뉴->Draw메뉴 컬러설정 아이템들
        JMenuItem redmenu = new JMenuItem("Red");
        JMenuItem orangemenu = new JMenuItem("Orange");
        JMenuItem yellowmenu = new JMenuItem("Yellow");
        JMenuItem greenmenu = new JMenuItem("Green");
        JMenuItem bluemenu = new JMenuItem("Blue");
        JMenuItem purplemenu = new JMenuItem("Purple");
        JMenuItem pinkmenu = new JMenuItem("Pink");
        JMenuItem whitemenu = new JMenuItem("White");
        JMenuItem graymenu = new JMenuItem("Gray");
        JMenuItem blackmenu = new JMenuItem("Black");
        blackmenu.addActionListener(listener);//<-------내가 추가

        //1안붙은 레벨메뉴->Draw메뉴 굵기설정 아이템들
        JMenuItem level1 = new JMenuItem("1/4 pt");
        JMenuItem level2 = new JMenuItem("1/2 pt");
        JMenuItem level3 = new JMenuItem("3/4 pt");
        JMenuItem level4 = new JMenuItem("1 pt");
        JMenuItem level5 = new JMenuItem("2 pt");
        JMenuItem level6 = new JMenuItem("3 pt");
        level1.addActionListener(listener);//<----------내가 추가

        JMenuItem redmenu1 = new JMenuItem("Red");
        JMenuItem orangemenu1 = new JMenuItem("Orange");
        JMenuItem yellowmenu1 = new JMenuItem("Yellow");
        JMenuItem greenmenu1 = new JMenuItem("Green");
        JMenuItem bluemenu1 = new JMenuItem("Blue");
        JMenuItem purplemenu1 = new JMenuItem("Purple");
        JMenuItem pinkmenu1 = new JMenuItem("Pink");
        JMenuItem whitemenu1 = new JMenuItem("White");
        JMenuItem graymenu1 = new JMenuItem("Gray");
        JMenuItem blackmenu1 = new JMenuItem("Black");

        JMenuItem level11 = new JMenuItem("1/4 pt");
        JMenuItem level21 = new JMenuItem("1/2 pt");
        JMenuItem level31 = new JMenuItem("3/4 pt");
        JMenuItem level41 = new JMenuItem("1 pt");
        JMenuItem level51 = new JMenuItem("2 pt");
        JMenuItem level61 = new JMenuItem("3 pt");
        

        colormenu.add(redmenu);
        colormenu.add(orangemenu);
        colormenu.add(yellowmenu);
        colormenu.add(greenmenu);
        colormenu.add(bluemenu);
        colormenu.add(purplemenu);
        colormenu.add(pinkmenu);
        colormenu.add(whitemenu);
        colormenu.add(graymenu);
        colormenu.add(blackmenu);

        thicnesskmenu.add(level1);
        thicnesskmenu.add(level2);
        thicnesskmenu.add(level3);
        thicnesskmenu.add(level4);
        thicnesskmenu.add(level5);
        thicnesskmenu.add(level6);

        colormenu1.add(redmenu1);
        colormenu1.add(orangemenu1);
        colormenu1.add(yellowmenu1);
        colormenu1.add(greenmenu1);
        colormenu1.add(bluemenu1);
        colormenu1.add(purplemenu1);
        colormenu1.add(pinkmenu1);
        colormenu1.add(whitemenu1);
        colormenu1.add(graymenu1);
        colormenu1.add(blackmenu1);

        thicnesskmenu1.add(level11);
        thicnesskmenu1.add(level21);
        thicnesskmenu1.add(level31);
        thicnesskmenu1.add(level41);
        thicnesskmenu1.add(level51);
        thicnesskmenu1.add(level61);

        //shapemenu랑 drawmenu똑같은데 왜이렇게만들어놓은건지?
        menus[1].add(colormenu1);
        menus[1].add(thicnesskmenu1);
//        shapemenu.add(colormenu1);
//        shapemenu.add(thicnesskmenu1);

        menus[2].add(colormenu);
        menus[2].add(thicnesskmenu);
//        drawmenu.add(colormenu);
//        drawmenu.add(thicnesskmenu);


        menus[1].addSeparator();
//        shapemenu.addSeparator();
        menus[2].addSeparator();
        colormenu.addSeparator();
        thicnesskmenu.addSeparator();
        colormenu1.addSeparator();
        thicnesskmenu1.addSeparator();
        
        menus[0].addSeparator();
//        filemenu.addSeparator();
        
        this.setJMenuBar(mb);
//        this.setLayout(new FlowLayout());

//        ImageIcon back = new ImageIcon("folder/back.jpg");
//        ImageIcon back2 = new ImageIcon("folder/back2.jpg");
//        ImageIcon copy = new ImageIcon("folder/copy.jpg");
//        ImageIcon copy2 = new ImageIcon("folder/copy2.jpg");
//        ImageIcon front = new ImageIcon("folder/front.jpg");
//        ImageIcon front2 = new ImageIcon("folder/front2.jpg");
//        ImageIcon image = new ImageIcon("folder/image.jpg");
//        ImageIcon image2 = new ImageIcon("folder/image2.jpg");
//        ImageIcon paste = new ImageIcon("folder/paste.jpg");
//        ImageIcon paste2 = new ImageIcon("folder/paste2.jpg");
//        ImageIcon rotation = new ImageIcon("folder/rotation.jpg");
//        ImageIcon rotation2 = new ImageIcon("folder/rotation2.jpg");
//
//        Image backimage = back.getImage();
//        Image back2image = back2.getImage();
//        Image copyimage = copy.getImage();
//        Image copy2image = copy2.getImage();
//        Image frontimage = front.getImage();
//        Image front2image = front2.getImage();
//        Image imageimage = image.getImage();
//        Image image2image = image2.getImage();
//        Image pasteimage = paste.getImage();
//        Image paste2image = paste2.getImage();
//        Image rotationimage = rotation.getImage();
//        Image rotation2image = rotation2.getImage();
//
//        Image ch_backimage = backimage.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_back2image = back2image.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_copyimage = copyimage.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_copy2image = copy2image.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_frontimage = frontimage.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_front2image = front2image.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_imageimage = imageimage.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_image2image = image2image.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_pasteimage = pasteimage.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_paste2image = paste2image.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_rotationimage = rotationimage.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//        Image ch_rotation2image = rotation2image.getScaledInstance(40,40,Image.SCALE_SMOOTH);
//
//        ImageIcon ch_backicon = new ImageIcon(ch_backimage);
//        ImageIcon ch_back2icon = new ImageIcon(ch_back2image);
//        ImageIcon ch_copyicon = new ImageIcon(ch_copyimage);
//        ImageIcon ch_copy2icon = new ImageIcon(ch_copy2image);
//        ImageIcon ch_fronticon = new ImageIcon(ch_frontimage);
//        ImageIcon ch_front2icon = new ImageIcon(ch_front2image);
//        ImageIcon ch_imageicon = new ImageIcon(ch_imageimage);
//        ImageIcon ch_image2icon = new ImageIcon(ch_image2image);
//        ImageIcon ch_pasteicon = new ImageIcon(ch_pasteimage);
//        ImageIcon ch_paste2icon = new ImageIcon(ch_paste2image);
//        ImageIcon ch_rotationicon = new ImageIcon(ch_rotationimage);
//        ImageIcon ch_rotation2icon = new ImageIcon(ch_rotation2image);
//
//        JButton btn1 = new JButton(ch_backicon);
//        this.add(btn1);
//        btn1.setPreferredSize(new Dimension(40,40));
//        btn1.setRolloverIcon(ch_back2icon);
//        btn1.setBorderPainted(false);
//
//        JButton btn2 = new JButton(ch_fronticon);
//        this.add(btn2);
//        btn2.setPreferredSize(new Dimension(40,40));
//        btn2.setRolloverIcon(ch_front2icon);
//        btn2.setBorderPainted(false);
//
//        JButton btn3 = new JButton(ch_copyicon);
//        this.add(btn3);
//        btn3.setPreferredSize(new Dimension(40,40));
//        btn3.setRolloverIcon(ch_copy2icon);
//        btn3.setBorderPainted(false);
//
//        JButton btn4 = new JButton(ch_pasteicon);
//        this.add(btn4);
//        btn4.setPreferredSize(new Dimension(40,40));
//        btn4.setRolloverIcon(ch_paste2icon);
//        btn4.setBorderPainted(false);
//
//        JButton btn5 = new JButton(ch_imageicon);
//        this.add(btn5);
//        btn5.setPreferredSize(new Dimension(40,40));
//        btn5.setRolloverIcon(ch_image2icon);
//        btn5.setBorderPainted(false);
//
//        JButton btn6 = new JButton(ch_rotationicon);
//        this.add(btn6);
//        btn6.setPreferredSize(new Dimension(40,40));
//        btn6.setRolloverIcon(ch_rotation2icon);
//        btn6.setBorderPainted(false);

        

    }


    
}
