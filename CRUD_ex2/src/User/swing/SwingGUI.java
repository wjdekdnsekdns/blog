package User.swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import User.UserController.UserController;
import User.UserDAO.UserDao;
import User.UserDTO.UserDto;


public class SwingGUI extends JFrame {
	UserDao userDAO = new UserDao();
	UserDto dto = new UserDto();
	UserController userController = new UserController();

	JFrame jFrame = new JFrame();
	JPanel jPanel = new JPanel();
	
	JButton btn1 = new JButton("추가");
	JButton btn2 = new JButton("삭제");
	JButton btn3 = new JButton("전체조회");
	
	JTextField tf1 = new JTextField();
	JTextField tf2 = new JTextField();
	JTextField tf3 = new JTextField();
	
	JLabel jLabel1 = new JLabel("ID : ");
	JLabel jLabel2 = new JLabel("NAME : ");
	JLabel jLabel3 = new JLabel("AGE : ");
	
	JTextArea ta = new JTextArea(); 
	public SwingGUI() {
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
	ta.setBounds(25,60,300,200);
	jPanel.add(ta);
	//ta.append("id" + "\t" + "name" + "\t" + "age" + "\n");
	
	jLabel1.setBounds(10,25,70,10);
	jLabel2.setBounds(110,25,70,10);
	jLabel3.setBounds(230,25,70,10);
	jPanel.add(jLabel1);
	jPanel.add(jLabel2);
	jPanel.add(jLabel3);
	
	tf1.setBounds(30, 25, 70, 25);
	tf2.setBounds(150, 25, 70, 25);
	tf3.setBounds(260, 25, 70, 25);
	jPanel.add(tf1);
	jPanel.add(tf2);
	jPanel.add(tf3);
	
	btn1.setBounds(350, 70, 100, 30);
	btn2.setBounds(350, 120, 100, 30);
	btn3.setBounds(350, 170, 100, 30);
	jPanel.add(btn1);
	jPanel.add(btn2);
	jPanel.add(btn3);
}
private void addEventListener() {
	btn1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
				
				
				int userid = Integer.parseInt(tf1.getText());
				String username = tf2.getText();
				int userage = Integer.parseInt(tf3.getText());
				userController.requestSignUp(new UserDto(userid, username, userage,dto.getCreatedate()));
				//ta.append("입력완료");
				ta.setText("");
				tf1.setText("");
				tf2.setText("");
				tf3.setText("");
		}
	});
	btn2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int userid = Integer.parseInt(tf1.getText());
			String username = tf2.getText();
			userDAO.userDelete(new UserDto(userid, username));
			ta.setText("");
			tf1.setText("");
			tf2.setText("");
			tf3.setText("");
		}
	});
	btn3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			ArrayList<UserDto> list = new ArrayList<UserDto>();
			list = userDAO.userResive();
			ta.append("id" + "\t" + "이름" + "\t" + "나이" + "\n"  );
			//ta.append(list.toString());
			System.out.println(list.get(0).toString());
			for(int i = 0; i < list.size(); i++) {
				ta.append(list.get(i).getId() + "\t" + list.get(i).getName() + "\t" + list.get(i).getAge() + "\t" + list.get(i).getCreatedate() + "\n");
			}
		}
	});
}

	
	public static void main(String[] args) {
	 new SwingGUI();
		
	}
	
}
