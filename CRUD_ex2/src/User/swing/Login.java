package User.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	SwingGUI swingGUI;
	JFrame jFrame = new JFrame();
	JPanel jPanel = new JPanel();
	
	JButton btn1 = new JButton("로그인");
	JTextField tf1 = new JTextField();
	//JTextField tf2 = new JTextField();
	JPasswordField tf2 = new JPasswordField();
	public Login() {
		initData();
		setInitLayout();
		addEventListener();
	}
	public void initData() {
		jFrame.setBounds(50, 50, 500, 330);
		jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
		jFrame.setVisible(true);
		
		jPanel.setLayout(null);
		jFrame.add(jPanel);
		
	}
	public void setInitLayout() {
		tf1.setBounds(30, 55, 100, 25);
		tf2.setBounds(30, 100, 100, 25);
		jPanel.add(tf1);
		jPanel.add(tf2);
		btn1.setBounds(150, 55, 100, 30);
		jPanel.add(btn1);
		
	}
	private void addEventListener() {
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = tf1.getText();
				String pw = tf2.getText();
				
				if(id.equals("admin") && pw.equals("1234")) {
					new SwingGUI();
					jFrame.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "다시 입력하세요");
				}
			}
		});
	}
	
	
	public static void main(String[] args) {
		new Login();
	}
	
}
