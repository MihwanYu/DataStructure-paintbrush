import java.awt.Font;import java.awt.BorderLayout;import java.awt.Color;import javax.swing.JFrame;import javax.swing.JLabel;import javax.swing.JColorChooser;import javax.swing.colorchooser.ColorSelectionModel;import javax.swing.event.ChangeListener;import javax.swing.event.ChangeEvent;public class color{   public static void main(String args[])   {      JFrame frame = new JFrame("Color palette not used in DS_project");//      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      final JLabel label = new JLabel("alecture.blogspot.com",JLabel.CENTER);      label.setFont(new Font("DIALOG", Font.BOLD|Font.ITALIC,36));      frame.add(label, BorderLayout.SOUTH); //레이블을  프레임 아래쪽에 배치      final JColorChooser chooser = new JColorChooser(); //칼라 팔레트 사용준비      ColorSelectionModel model = chooser.getSelectionModel();      ChangeListener listener = new ChangeListener(){ //내부 클래스 시작         public void stateChanged(ChangeEvent e)         {            Color newForegroundColor = chooser.getColor();//선택한 칼라값을 리턴            System.out.printf("Selected color : ",newForegroundColor);            label.setForeground(newForegroundColor); // 위의 값을 전경색으로 변경         }      }; // 내부클래스 끝      model.addChangeListener(listener); //유저의 칼라 선택을 기다림      frame.add(chooser); // 프레임에 칼라 팔레트 설치하기      frame.add(chooser);      frame.pack();      frame.setVisible(true);      }}