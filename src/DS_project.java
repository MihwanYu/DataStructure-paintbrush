import javax.swing.*;import java.awt.*;import java.awt.event.ActionEvent;import java.awt.event.ActionListener;//for final presentationpublic class DS_project extends JFrame {	RectPanel rectPanel;	Panels panel;//	PanelEx panelEx;	    public DS_project() {                setTitle("Drawing Board");               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        createMenu();        //        rectPanel = new RectPanel();//        add(rectPanel, BorderLayout.NORTH);//TestGUI.java RectPanel추가//        pack();        panel = new Panels();        add(panel);        panel.setLocation(0,0);        setSize(new Dimension(1000,710));        setVisible(true);            }        public static void main(String[] args) {    	new DS_project();    }     // DS_project의 inner class    class MenuActionListener implements ActionListener {     	public void actionPerformed(ActionEvent e) {    		String cmd = e.getActionCommand();    		System.out.println("clicked: "+cmd+", "+e.getSource());    		switch(cmd) { // 메뉴 아이템의 종류 구분    					case "Zoom in":				System.out.println("zoom in should be implemented");break;			case "Zoom out":				System.out.println("zoom out should be implementes");break;							//File menu children			case "Save" :				if(panel!=null) {					panel.saveCanvas();					System.out.println("\t\t***CANVAS SAVE IMAGE***");				}break;			case "Open" :				if(panel!=null) {					panel.openCanvas();					System.out.println("\t\t***CANVAS OPEN IMAGE***");				}break;			case "Clear" :				panel.resetCanvas();				System.out.println("\t\t***CANVAS RESET***");				break;								//Shape menu children			case "Rectangular" :				panel.option = 2;				System.out.println("\t\t***RECT DRAWING MODE***");				break;						case "Triangle":				panel.option = 3;				System.out.println("triangle drawing should be implemented"); break;						case "Line":				panel.option = 1;				System.out.println("\\t\\t***LINE DRAWING MODE***"); break;						case "Draw":				panel.option = 5;				System.out.println("\\t\\t***FREE DRAWING MODE***");break;							case "Text":				System.out.println("Text input should be implemented"); break;							case "Image":				panel.option = 4;				panel.drawImage();				System.out.println("\\\\t\\\\t***IMAGE OPENNING MODE***\""); break;				    		}    	}    }    void createMenu() {        JMenuBar mb = new JMenuBar();        MenuActionListener menulistener = new MenuActionListener();        setJMenuBar(mb);        mb.setBackground(Color.pink);                JMenu[] menus = new JMenu[5];        String[] menunames = {"File", "Shape", "Zoom in", "Zoom out", "Polygon"};                for(int i=0; i<menus.length; i++) {        	menus[i] = new JMenu(menunames[i]);        	        	if(i==menus.length-1) {        		//Shape 안에 Polygon 메뉴 추가(여기에 Rectangular, Triangle 담김)        		menus[1].add(menus[i]);        		menus[1].addSeparator();        		break;        	}        	mb.add(menus[i]);        }                //메뉴별 새끼 매뉴들 저장        JMenuItem[] menuchildren = new JMenuItem[9];        String[] childmenunames = {"Save", "Open", "Clear", "Line", "Draw", "Text", "Image", "Rectangular", "Triangle"};                for(int i=0; i<menuchildren.length; i++) {        	menuchildren[i] = new JMenuItem(childmenunames[i]);        	if(i<3) {        		//filemenu에 save, open, clear 메뉴 추가        		menus[0].add(menuchildren[i]);        		menus[0].addSeparator();        	}else if(i>=3 && i<7) {        		//Shape menu에 draw, text, line, image 메뉴 추가        		menus[1].add(menuchildren[i]);        		menus[1].addSeparator();        	}else {        		//Polygon menu에         		menus[4].add(menuchildren[i]);        		menus[4].addSeparator();        	}        	menuchildren[i].addActionListener(menulistener);        }            }}