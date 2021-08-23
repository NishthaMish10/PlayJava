import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame implements ActionListener{
	JButton b1,b2;
	JTextField t1;
	
	Frame(){
		setBounds(100,100,1000,400);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/quiz.jpg"));
		JLabel l1=new JLabel(i1);
		l1.setBounds(0,0,600,400);
		add(l1);
		
		JLabel l2=new JLabel(" Let's Play");
		l2.setFont(new Font("Mongolian Baiti",Font.BOLD,40));
		l2.setForeground(Color.blue);
		l2.setBounds(725,40,300,45);
		add(l2);
		
		JLabel l3=new JLabel(" Enter Your Name");
		l3.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
		l3.setForeground(Color.blue);
		l3.setBounds(750,150,300,25);
		add(l3);
		
		 t1=new JTextField();
		t1.setFont(new Font("Mongolian Baiti",Font.BOLD,18));
		t1.setBounds(655, 200, 300, 25);
		add(t1);
		
		 b1=new JButton("Rules");
		b1.setBounds(670, 270, 120, 25);
		b1.setBackground(new Color(30,144,254));
		b1.setForeground(Color.white);
		b1.addActionListener(this);
		add(b1);
		
	    b2=new JButton("Exit");
		b2.setBounds(835, 270, 120, 25);
		b2.setBackground(new Color(30,144,254));
		b2.setForeground(Color.white);
		b2.addActionListener(this);
		add(b2);
		
		
		
		
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==b1) {
			String name=t1.getText();
			this.setVisible(false);
			new Rules(name);
			
		}else {
			System.exit(0);
		}
		
	}

	public static void main(String[] args) {
	
		new Frame();

	}

}
