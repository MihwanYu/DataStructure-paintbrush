import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.util.Stack;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JToolBar;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;

//전체 프레임
public class Panels extends JPanel{

	public static final int DEFAULT = 0;
	public static final int LINE = 1;
	public static final int RECT = 2;
	public static final int TRIANGLE = 3;
	public static final int POLYLINE = 4;
	public static final int SKETCH = 5;
	public static final int ERASE = 6;
	public static final int ERASER = 7;
	public static final int UNDO = 8;
	public static final int REDO = 9;




	//포인트 받아오는 곳
	Point start =null;
	Point end =null;
	int minx;
	int miny;
	int maxx;
	int maxy;
	int px, py;
	int width;
	int height;
	int move = 0;
	Point mouse = new Point(0,0);

	//프레임 안에 있는 요소들
	JPanel optionPanel = new JPanel();
	Canvas canvas = new Canvas();
	//왜 못불러오는지;;;;;;;;;;
//	PainterTools tb = new PainterTools("Custom Toolbar"); //커스텀 툴바
	JMenuBar menubar = new JMenuBar();
	JToolBar toolbar = new JToolBar("Options");
	SpinnerNumberModel sizemodel = new SpinnerNumberModel(8, 1, 50, 1);
	JSpinner spinner = new JSpinner(sizemodel);
	ExamplePanel examplepanel = new ExamplePanel();
	JPanel endbarpanel = new JPanel();
	JLabel xycoord;
	JLabel mode;




	//작업선택용 옵션
	int option = 0;
	int mousepressed = 0;

	int psize = 0;

	//각 도형들의 포인트를 저장해 놓는 벡터

	Vector<Point> sketSP = new Vector<Point>();
	ShapeRepository newshape, copycropshape;
	Stack<ShapeRepository> shape = new Stack<ShapeRepository>();
	Stack<ShapeRepository> redoshape = new Stack<ShapeRepository>();
	Stack<ShapeRepository> moveshape = new Stack<ShapeRepository>();
	

	//폴리라인을 위한 벡터
	int [] tempX = new int [40];
	int [] tempY = new int [40];

	//설정을 위한 변수들
	Color mypencolor = Color.black;
	Color myfillcolor = Color.white;

	Point hey1, hey2;
	int thick = 8;
	int eraserthick = 15;

	Dimension dim = new Dimension(1000,700);
	Dimension dim1 = new Dimension(1000, 60);
	Dimension dim2 = new Dimension(1000,570);
	Dimension dim3 = new Dimension(1000, 30);

	//프레임 설정해주는 곳
	public Panels() {


		//프레임 설정
		setLocation(800,100);
//		setTitle("Jin's Studio");
		setSize(dim);
		setLayout(null);
		setVisible(true);

//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		JToolBar tb = new JToolBar();
//		add(tb);
		
		//아이템들 위치 선정
		add(canvas);
		add(toolbar);
		
		add(endbarpanel);
//		setJMenuBar(menubar);
//		toolbar.setLocation(0,0);
		endbarpanel.setSize(dim3);
		endbarpanel.setBackground(Color.gray);
		endbarpanel.setLocation(0,620);
		endbarpanel.setLayout(new BoxLayout(endbarpanel, BoxLayout.X_AXIS));
		canvas.setSize(dim2);
		canvas.setBackground(Color.white);
		canvas.setLocation(0,50);

		xycoord = new JLabel("[x, y] = [" + mouse.getX() + "] [" +mouse.getY() + "]");
		xycoord.setPreferredSize(new Dimension(200, 40));
		mode = new JLabel("[Mode] = [DEFAULT]");
		endbarpanel.add(xycoord);
		endbarpanel.add(mode);
		
		//custom toolbar
//		tb.setLocation(0,0);
//		tb.setPreferredSize(new Dimension(1000,60));
//	    tb.setBackground(Color.gray);
//	    tb.setLayout(new FlowLayout());
	    

		//메뉴를 위한 정보 입력
		JMenu file = new JMenu("File");
		menubar.add(file);
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		exit.addActionListener(new ExitAction());

		//툴바 설정
		toolbar.setBackground(Color.white);
		toolbar.setSize(dim1);
		toolbar.setLayout(new FlowLayout());
		
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
		
	    Image[] org_image = new Image[9];
	    Image[] ch_image = new Image[9];
	    ImageIcon[] org_icon = new ImageIcon[9];
	    ImageIcon[] ch_icon = new ImageIcon[9];
	    JButton[] btn = new JButton[9];
	    
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
	    
	    for (int i = 0; i < btn.length; i++) {
	        btn[i] = new JButton(org_icon[i]);
	        toolbar.add(btn[i]);
	        btn[i].setPreferredSize(new Dimension(40, 40));
	        btn[i].setRolloverIcon(ch_icon[i]);
	        btn[i].setBorderPainted(true);
	        toolbar.addSeparator();
	        btn[i].setName("img"+Integer.toString(i));
	        btn[i].addActionListener(new ButtonAction());
	    }
		
	    SpinnerNumberModel fontsize = new SpinnerNumberModel(8, 1, 50, 1);
	    JSpinner spinner = new JSpinner(fontsize);
	    JLabel sizelabel = new JLabel("Text Size");
	    sizelabel.setPreferredSize(new Dimension(60, 40));
	    toolbar.add(sizelabel);
	    toolbar.add(spinner);
	    
	    JLabel fontlabel = new JLabel("Fonts");
	    fontlabel.setPreferredSize(new Dimension(40,40));
	    
	    JComboBox combo = new JComboBox<>();
	    combo.addItem("맑은 고딕");
	    combo.addItem("궁서체");
	    combo.addItem("함초롱바탕");
	    toolbar.add(fontlabel);
	    toolbar.add(combo);
	    
	    

//		JLabel preview = new JLabel("미리보기");
//		preview.setPreferredSize(new Dimension(60,40));
//
//		toolbar.add(preview);
//		toolbar.add(examplepanel);
//		toolbar.addSeparator();
//		JButton[] optionbtn = new JButton[5]; 
//		optionbtn[0] = new JButton("l");
//		optionbtn[1] = new JButton("▢");
//		optionbtn[2] = new JButton("△");
//		optionbtn[3] = new JButton(">");
//		optionbtn[4] = new JButton("⌇");
//		for(int i = 0; i<optionbtn.length; i++) {
//			toolbar.add(optionbtn[i]);
//			optionbtn[i].setPreferredSize(new Dimension(40,40));
//			optionbtn[i].addActionListener(new ButtonAction());
//		}
//		toolbar.addSeparator();

//		JButton[] setbtn = new JButton[6]; 
//		setbtn[0] = new JButton("Undo");
//		setbtn[1] = new JButton("Redo");
//		setbtn[2] = new JButton("지우개");
//		setbtn[3] = new JButton("지우기");
//		setbtn[4] = new JButton("펜색");
//		setbtn[5] = new JButton("채우기색");
//
//		for(int i = 0; i<setbtn.length; i++) {
//			toolbar.add(setbtn[i]);
//			setbtn[i].setPreferredSize(new Dimension(60,40));
//			setbtn[i].addActionListener(new ButtonAction());
//		}
//
//		JLabel thickLabel = new JLabel("두께");
//		thickLabel.setPreferredSize(new Dimension(40,40));
//		toolbar.add(thickLabel);
//		toolbar.add(spinner);

		//두께 스피너에 리스너 설치 - 필요업슴
		spinner.addChangeListener(new ChangeDetector());
	}

	class ChangeDetector implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {
			// TODO Auto-generated method stub
			thick = (Integer)spinner.getValue();
			examplepanel.repaint();
		}

	}

	//메뉴바 Exit버튼을 위한 액션 리스너
	class ExitAction implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			System.exit(0);
		}
	}

	//그림판 설정
	class Canvas extends JPanel {

		//리스너
		MyMouseListener ml = new MyMouseListener();
		//그림판 마우스 리스너 불러주기
		Canvas(){
			addMouseListener(ml);
			addMouseMotionListener(ml);

		}

		//새로 그림 그리는 곳 
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			Graphics2D g2 =(Graphics2D)g;
			if(option == ERASE) {

				newshape.myfillcolor = Color.white;
				newshape.start = new Point(0, 0);
				newshape.end = new Point(1000, 500);
				newshape.option = option;
				shape.add(newshape);
			}
			for(int i= 0 ; i<shape.size(); i++) {
				g2.setPaint(shape.get(i).myfillcolor);
				g2.setStroke(new BasicStroke(shape.get(i).thick,BasicStroke.CAP_ROUND,0));
				switch(shape.get(i).option) {
				case LINE : 
					g2.setPaint(shape.get(i).mypencolor);
					g2.drawLine(shape.get(i).start.x, shape.get(i).start.y, shape.get(i).end.x, shape.get(i).end.y);
					break;
				case RECT :
//					g2.fillRect(shape.get(i).minx, shape.get(i).miny, shape.get(i).width, shape.get(i).height);
					g2.setPaint(shape.get(i).mypencolor);
					g2.drawRect(shape.get(i).minx, shape.get(i).miny, shape.get(i).width, shape.get(i).height);
					break;
				case TRIANGLE :
//					g2.drawPolygon(new int[] {shape.get(i).minx, shape.get(i).minx+shape.get(i).width/2, shape.get(i).maxx}, new int[] {shape.get(i).miny, shape.get(i).maxy, shape.get(i).miny}, 3);
//					g2.fillOval(shape.get(i).minx, shape.get(i).miny, shape.get(i).width, shape.get(i).height);
					g2.setColor(shape.get(i).mypencolor);
//					g2.drawOval(shape.get(i).minx, shape.get(i).miny, shape.get(i).width, shape.get(i).height);
					g2.drawPolygon(new int[] {shape.get(i).minx, shape.get(i).minx+shape.get(i).width/2, shape.get(i).maxx}, new int[] {shape.get(i).maxy, shape.get(i).miny, shape.get(i).maxy}, 3);
					break;
				case POLYLINE :
					g2.setPaint(shape.get(i).mypencolor);
					g2.drawPolyline(shape.get(i).array_x, shape.get(i).array_y, shape.get(i).size);
					break;
				case SKETCH : case ERASER :
					g2.setPaint(shape.get(i).mypencolor);
					for(int j = 1; j< shape.get(i).sketchSP.size(); j++) {
						g2.drawLine(shape.get(i).sketchSP.get(j-1).x, shape.get(i).sketchSP.get(j-1).y, shape.get(i).sketchSP.get(j).x, shape.get(i).sketchSP.get(j).y);
					}
					break;
				case ERASE :
					g2.setPaint(shape.get(i).myfillcolor);
					g2.fillRect(shape.get(i).start.x, shape.get(i).start.y, Math.abs(shape.get(i).end.x-shape.get(i).start.x), Math.abs(shape.get(i).end.y-shape.get(i).start.y));

				}
			}

			//그림자 그리기
			if(start != null) {

				if(option == ERASER) {
					g2.setColor(Color.white);
					g2.setStroke(new BasicStroke(eraserthick,BasicStroke.CAP_ROUND,0));
				}
				else {
					g2.setPaint(myfillcolor);
					g2.setStroke(new BasicStroke(thick,BasicStroke.CAP_ROUND,0));

				}
				if(option == LINE ) {
					g2.setPaint(mypencolor);
					g2.drawLine(start.x, start.y, end.x, end.y);
				}
				else if(option == RECT) {
//					g2.fillRect(minx, miny, width, height);
					g2.setPaint(mypencolor);
					g2.drawRect(minx, miny, width, height);
				}
				else if(option == TRIANGLE) {
//					g2.drawPolygon(new int[] {minx, minx+width/2, maxx}, new int[] {miny, maxy, miny}, 3);
//					g2.fillOval(minx, miny, width, height);
					g2.setPaint(mypencolor);
//					g2.drawOval(minx, miny, width, height);
//					g2.drawPolygon(new int[] {minx, minx+width/2, maxx}, new int[] {maxy, miny, maxy}, 3);
				}
				else if(option == POLYLINE) {
					g2.setPaint(mypencolor);
					if(move == 0)g2.drawPolyline(tempX, tempY, psize+1);
					else g2.drawPolyline(tempX, tempY, psize);
				}
				else if(option == SKETCH) {
					g2.setPaint(mypencolor);
					for(int i = 1; i < sketSP.size(); i++) {

						g2.drawLine(sketSP.get(i-1).x, sketSP.get(i-1).y, sketSP.get(i).x, sketSP.get(i).y);
					}
				}
				else if(option == ERASER) {
					for(int i = 1; i < sketSP.size(); i++) {

						g2.drawLine(sketSP.get(i-1).x, sketSP.get(i-1).y, sketSP.get(i).x, sketSP.get(i).y);
					}

					g2.setStroke(new BasicStroke(1,BasicStroke.CAP_ROUND,0));
					g2.setColor(Color.black);
					if(end != null)
						g2.drawOval(end.x - eraserthick/2, end.y - eraserthick/2, eraserthick, eraserthick);

				}


			}

		}

		//마우스 리스너 클래스
		class MyMouseListener extends MouseAdapter implements MouseMotionListener{
			int temp = 0;
			int makeinstance = 0;
			ShapeRepository newshape;
			ShapeRepository tempshape;
			int top = -1;
			
			int sx, sy;
			//마우스 프레스 됐을 때
			public void mousePressed(MouseEvent e) {
				
				if(option == DEFAULT) {
					top = shape.size();
					sx = e.getX();
					sy = e.getY();
					while(shape.isEmpty() == false) {

						if(top == 0) break;
						tempshape = shape.get(--top);
						int maxx = tempshape.maxx;
						int maxy = tempshape.maxy;
						int minx = tempshape.minx;
						int miny = tempshape.miny;
						if(sx <= maxx && sx >= minx && sy <= maxy && sy>= miny) {
							moveshape.push(shape.remove(top));
							myfillcolor = tempshape.myfillcolor;
							mypencolor = tempshape.mypencolor;
							thick = tempshape.thick;
							move = 1;
							newshape = new ShapeRepository();
							hey1 = tempshape.start;
							hey2 = tempshape.end;
							break;
						
						}
					}
				}
				if(makeinstance == 0 && (option == LINE || option == RECT || option == SKETCH || option == POLYLINE || option == TRIANGLE || option == ERASER)) {
					redoshape.removeAllElements();
					newshape = new ShapeRepository();
					if(option == ERASER) {
						newshape.mypencolor = Color.white;
						newshape.thick = eraserthick;
					}


					else {
						newshape.mypencolor = mypencolor;
						newshape.myfillcolor = myfillcolor;
						newshape.thick = thick;
					}
					newshape.option = option;
					makeinstance = 1;
					System.out.println("object packed");
				}

				if(mousepressed == 0 && option != 0) {

					mousepressed += 1;
				}
				else mousepressed = 0;

				if(option == POLYLINE) {
					if(mousepressed == 1) {
						tempX[psize] = e.getX();
						tempY[psize] = e.getY();
					}
					psize++;
					tempX[psize] = e.getX();
					tempY[psize] = e.getY();

					if(e.getButton()==MouseEvent.BUTTON3) {
						newshape.size = psize;
						for(int i = 0 ; i < psize ; i++) {
							
							newshape.maxx = Math.max(newshape.maxx, tempX[i]);
							newshape.minx = Math.min(newshape.minx, tempX[i]);
							newshape.maxy = Math.max(newshape.maxy, tempY[i]);
							newshape.miny = Math.min(newshape.miny, tempY[i]);
							newshape.array_x[i] = tempX[i];
							newshape.array_y[i] = tempY[i];
						}
						
						shape.add(newshape);
						makeinstance = 0;
						psize = 0;
						option = DEFAULT;
						repaint();
					}
				}
				if(e.getButton()==MouseEvent.BUTTON3) {
					option = DEFAULT;
				}

				else if(option == SKETCH || option == ERASER) {
					newshape.sketchSP.add(e.getPoint());
					sketSP.add(e.getPoint());
				}
				String t = "";
				if(option == 0) t = "DEFAULT";
				else if(option == 1) t = "LINE";
				else if(option == 2) t = "RECTANGLE";
				else if(option == 3) t = "TRIANGLE";
				else if(option == 4) t = "POLYLINE";
				else if(option == 5) t = "SKETCH";
				else if(option == 6) t = "ERASE";
				else if(option == 7) t = "ERASER";
				else if(option == 8) t = "UNDO";
				else if(option == 9) t = "REDO";

				mode.setText("[Mode] = [" + t + "]");
				start = e.getPoint();
			}

			//마우스 릴리즈 됐을 때
			public void mouseReleased(MouseEvent e) {
				if(option != DEFAULT && move == 0)shape.add(newshape);
				if(move == 1) {
					newshape.option =option; 
					newshape.minx = minx;
					newshape.miny = miny;
					newshape.maxx = maxx;
					newshape.maxy = maxy;
					newshape.width = width;
					newshape.height = height;
					newshape.start = start;
					newshape.end = end;
					newshape.size = psize;
					newshape.thick = thick;
					newshape.moved = 1;
					newshape.myfillcolor = myfillcolor;
					newshape.mypencolor = mypencolor;
					for(int i = 0; i < psize; i++) {
						newshape.array_x[i] = tempX[i];
						newshape.array_y[i] = tempY[i];
					}
					newshape.sketchSP.addAll(sketSP);
					shape.push(newshape);
					option = DEFAULT;
				}
				end = e.getPoint();
				
				if(option == ERASER) end = null;
				
				makeinstance = 0;
				
				if((option == RECT || option == TRIANGLE) && move == 0) {
					minx = (int)Math.min(start.getX(), end.getX());
					miny = (int)Math.min(start.getY(), end.getY());
					width = (int)Math.abs(start.getX()- end.getX());
					height = (int)Math.abs(start.getY()- end.getY());

					newshape.minx = minx;
					newshape.miny = miny;
					newshape.maxx = minx+width;
					newshape.maxy = miny+height;

					newshape.width = width;
					newshape.height = height;
				}
				else if(option == LINE && move == 0) {
					minx = (int)Math.min(start.getX(), end.getX());
					miny = (int)Math.min(start.getY(), end.getY());
					width = (int)Math.abs(start.getX()- end.getX());
					height = (int)Math.abs(start.getY()- end.getY());

					newshape.minx = minx;
					newshape.miny = miny;
					newshape.maxx = minx+width;
					newshape.maxy = miny+height;

					newshape.start = start;
					newshape.end = end;

				}
				else if(option == SKETCH || option == ERASER || move == 0) {

					sketSP.removeAllElements();
				}
				move = 0;
				repaint();
			}



			@Override
			//마우스 드레그 됐을 때
			public void mouseDragged(MouseEvent e) {
				
				px = e.getX() - sx;
				py = e.getY() - sy;
				// TODO Auto-generated method stub
				if(option == SKETCH || option == ERASER) {
					newshape.sketchSP.add(e.getPoint());
					sketSP.add(e.getPoint());
					newshape.maxx = (int)Math.max(e.getPoint().getX(), newshape.maxx);
					newshape.minx = (int)Math.min(e.getPoint().getX(), newshape.minx);
					newshape.maxy = (int)Math.max(e.getPoint().getY(), newshape.maxy);
					newshape.miny = (int)Math.max(e.getPoint().getY(), newshape.maxy);

				}
				end = e.getPoint();
				if(option == RECT || option == TRIANGLE) {
					minx = (int)Math.min(start.getX(), end.getX());
					miny = (int)Math.min(start.getY(), end.getY());
					width = (int)Math.abs(start.getX()- end.getX());
					height = (int)Math.abs(start.getY() - end.getY());
				}

				if(move == 1) {
					option = tempshape.option;
					minx = tempshape.minx + px;
					miny = tempshape.miny + py;
					maxx = tempshape.maxx + px;
					maxy = tempshape.maxy + py;
					width = tempshape.width;
					height = tempshape.height;
					start = new Point(hey1.x + px, hey1.y + py);
					end = new Point(hey2.x + px, hey2.y + py);
					psize = tempshape.size;
					for(int i = 0; i < tempshape.size; i++) {
						tempX[i] =tempshape.array_x[i]+ px;
						tempY[i] =tempshape.array_y[i]+ py;
					}
					for(int i = 0; i <tempshape.sketchSP.size(); i++) {
						Point pt; 
						pt = tempshape.sketchSP.get(i);
						pt.move(pt.x + px, pt.y + py);
						sketSP.add(pt);
					}

				}
				repaint();
			}

			@Override
			//마우스 움직일 때
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				mouse = e.getPoint();

				xycoord.setText("[x, y] = [" + mouse.getX() + "] [" +mouse.getY() + "]");
				if(option == POLYLINE) {
					if(psize > 0) {
						tempX[psize] = e.getX();
						tempY[psize] = e.getY();

						repaint();
					}
				}


			}
		}
	}

	//버튼 액션 리스너 클래스
	class ButtonAction implements ActionListener{
		public void actionPerformed (ActionEvent e) {
			JButton myButton = (JButton)e.getSource();
			mousepressed = 0;
			newshape = new ShapeRepository();
//			String temp = myButton.getText();
			String temp;
			if (myButton.getText().compareTo("")!=0)
				temp = myButton.getText();
			else
				temp = myButton.getName();
			System.out.println("clicked button name: "+temp);

			
			if(temp.equals("img0")) {
				option = UNDO;
				
				if(shape.isEmpty()==false) {
					if(shape.get(shape.size()-1).moved == 1) {
						redoshape.push(shape.pop());
						shape.push(moveshape.pop());
					}
					else	redoshape.push(shape.pop());
				}
				canvas.repaint();
			}
			else if(temp.equals("img1")) {
				option = REDO;
				if(redoshape.isEmpty() == false) {
					if(redoshape.get(redoshape.size()-1).moved == 1) {
						moveshape.push(shape.pop());
						shape.push(redoshape.pop());
					}
					else shape.push(redoshape.pop()); 
				}

				canvas.repaint();
			}
			else if(temp.equals("img2")) {
				System.out.println("copy action");
				if(shape.isEmpty()==false) {
//					copycropshape = shape.peek();
					copycropshape = new ShapeRepository(shape.peek());
					copycropshape.mypencolor = Color.pink;
					System.out.println(copycropshape);
				}
				canvas.repaint();
				
			}
			else if(temp.equals("img3")) {
				System.out.println("paste action");
				if(copycropshape!=null) {
					shape.push(copycropshape);
				}
				canvas.repaint();
			}
			else if(temp.equals("img6")) {
				mypencolor = JColorChooser.showDialog(null, "색선정", Color.blue);
				examplepanel.repaint();
				//펜색바꾸기 여기서 가능
//				moveshape.peek().mypencolor = mypencolor;
			}
			else if(temp.equals("img7")) {
				JFrame thickness = new JFrame("Thickness");
				thickness.setVisible(true);
				thickness.setSize(100,250);
				thickness.setLocation(200,200);


				JSlider penThickSize = new JSlider(JSlider.VERTICAL, 0, 50, 15);
				penThickSize.setMajorTickSpacing(10);
				penThickSize.setMinorTickSpacing(1);
				penThickSize.setPaintTicks(true);
				penThickSize.setPaintLabels(true);

				thickness.add(penThickSize);

				penThickSize.addChangeListener(new ChangeListener() {

					@Override
					public void stateChanged(ChangeEvent e) {
						// TODO Auto-generated method stub
						JSlider source = (JSlider)e.getSource();
						if(!source.getValueIsAdjusting()) {
							thick = (int)source.getValue();
						}
					}
				});
				
			}
			else if(temp.equals("img8")) {
				if(option == ERASER) option = DEFAULT;
				else {
					option = ERASER;
					JFrame eraser = new JFrame("지우개");
					eraser.setVisible(true);
					eraser.setSize(250,100);
					eraser.setLocation(200,200);


					JSlider eraserSize = new JSlider(JSlider.HORIZONTAL, 0, 50, 15);
					eraserSize.setMajorTickSpacing(10);
					eraserSize.setMinorTickSpacing(1);
					eraserSize.setPaintTicks(true);
					eraserSize.setPaintLabels(true);

					eraser.add(eraserSize);

					eraserSize.addChangeListener(new ChangeListener() {

						@Override
						public void stateChanged(ChangeEvent e) {
							// TODO Auto-generated method stub
							JSlider source = (JSlider)e.getSource();
							if(!source.getValueIsAdjusting()) {
								eraserthick = (int)source.getValue();
							}
						}
					});
				}
				new Canvas();
			}
			
			else if(temp.equals("Redo")) {
				//위에도 redo인데 왜똑같이 redo임? 어차피 실행안될듯
				option = REDO;
				if(redoshape.isEmpty() == false) shape.push(redoshape.pop()); 

				canvas.repaint();
			}
			String t = "";
			if(option == 0) t = "DEFAULT";
			else if(option == 1) t = "LINE";
			else if(option == 2) t = "RECTANGLE";
			else if(option == 3) t = "CIRCLE";
			else if(option == 4) t = "POLYLINE";
			else if(option == 5) t = "SKETCH";
			else if(option == 6) t = "ERASE";
			else if(option == 7) t = "ERASER";
			else if(option == 8) t = "UNDO";
			else if(option == 9) t = "REDO";

			mode.setText("[Mode] = [" + t + "]");
		}
	}
	public void saveCanvas() {
//		Container pane = frame.getContentPane();
		BufferedImage img = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d = img.createGraphics();
		canvas.printAll(g2d);
		g2d.dispose();
		
		JFileChooser jFileChooser = new JFileChooser();
		jFileChooser.setFileFilter(new FileNameExtensionFilter("*.png", "png"));
		int rVal = jFileChooser.showSaveDialog(null);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File file = jFileChooser.getSelectedFile();
			try {
				ImageIO.write(img, "png", new File(file.getAbsolutePath()));
				System.out.println("saved Correctly " + file.getAbsolutePath());
			} catch (IOException e1) {
				System.out.println("Failed to save image");
			}
		}
		if (rVal == JFileChooser.CANCEL_OPTION) {
			System.out.println("No file choosen");
		}
	}
	
	public void openCanvas() {
		
		JFileChooser jFileChooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG", "jpeg", "jpg", "png", "bmp", "gif");
		jFileChooser.addChoosableFileFilter(filter);

		int rVal = jFileChooser.showOpenDialog(null);
		if (rVal == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jFileChooser.getSelectedFile();
			try {
				System.out.println("open picture");
				BufferedImage bi = ImageIO.read(new File(selectedFile.getAbsolutePath()));
				Dimension nDim = new Dimension(bi.getWidth(), bi.getHeight());
				Graphics2D g2 = bi.createGraphics();
//				panel.canvas.printAll(g2);  
				
//				canvas.paintAll(g2);
//				canvas.setSize(nDim);
				canvas.getGraphics().drawImage(bi, 0,0, null);
				g2.dispose();
				
//				BufferedImage img = new BufferedImage(canvas.getWidth(), canvas.getHeight(), BufferedImage.TYPE_INT_RGB);
//				Graphics2D g2d = img.createGraphics();
//				canvas.printAll(g2d);
//				g2d.dispose();
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		if (rVal == JFileChooser.CANCEL_OPTION) {

		}		
		
	}

	class ExamplePanel extends JPanel{
		ExamplePanel(){
			setPreferredSize(new Dimension(40, 40));
			setLayout(new FlowLayout());
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 =(Graphics2D)g;

			g2.setPaint(myfillcolor);
			g2.fillRect(10, 10, 20, 20);
			g2.setPaint(mypencolor);
			g2.drawRect(10, 10, 20, 20);
			g2.setStroke(new BasicStroke(thick,BasicStroke.CAP_ROUND,0));
		}
	}
}