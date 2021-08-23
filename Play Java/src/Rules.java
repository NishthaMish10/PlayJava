import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
	JButton b1,b2;
	String username;
	
	Rules(String username){
		this.username=username;
		setBounds(400,200,800,525);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		
		JLabel l1=new JLabel("Welcome " + username +" to  the rules of Play Java World");
		l1.setFont(new Font(" Mongolian Baiti",Font.BOLD,18));
		l1.setForeground(Color.black);
		l1.setBounds(50, 20, 700, 30);
		add(l1);
		
		JLabel l2=new JLabel("IMPORTANT RULES");
		l2.setFont(new Font(" Tahoma",Font.BOLD,13));
		//l2.setForeground(Color.red);
		l2.setBounds(20, 90, 600, 300);
		add(l2);
		l2.setText(
				"<html>"+
				       "1.please answer properly"+"<br><br>"+
				       "2.please do not cheat"+"<br><br>"+
				       "3.please answer each question"+"<br><br>"+
				       "4.please answer with proper attention"+"<br><br>"+
				       "5.please attempt every question"+"<br><br>"+
				       "6.please complete it before time over"+"<br><br>"+
				       "7.please be patient"+"<br><br>"+
						"<html>"
				);
		
		//setVisible(true);
		 b1=new JButton("Back");
		b1.setBounds(250, 450, 100, 30);
		b1.setBackground(new Color(30,144,255));
		b1.addActionListener(this);
		b1.setForeground(Color.white);
		add(b1);
		
		 b2=new JButton("Start");
		b2.setBounds(400, 450, 100, 30);
		b2.setBackground(new Color(30,144,255));
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			this.setVisible(false);
			new Frame().setVisible(true);
			
		}else if(ae.getSource()==b2) {
			this.setVisible(false);
			new Quiz(username).setVisible(true);
		}
			
		
	}
	
	public static void main(String[] args) {
		new Rules("");
	}

}
