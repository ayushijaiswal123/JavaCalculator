import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Calci implements ActionListener {
	JFrame f;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bmul,bdiv,bsub,bclr,beq;
	JTextField tf;
	
	String s1,s2,s3,s4,s5;
	int c,n;
	Calci(){
		f = new JFrame("My Calculator");
		f.setSize(400,400);
		f.setVisible(true);
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		
		tf = new JTextField();
		tf.setBounds(20, 40, 360, 40);
		f.add(tf);
		
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		badd = new JButton("+");
		bsub = new JButton("-");
		bmul = new JButton("*");
		bdiv = new JButton("/");
		bclr = new JButton("C");
		beq = new JButton("=");
		
		b1.setBounds(20,100,60,40);
		b1.setBackground(Color.BLUE);
		b2.setBounds(120,100,60,40);
		b3.setBounds(220,100,60,40);
		badd.setBounds(320,100,60,40);
		f.add(b1);f.add(b2);f.add(b3);f.add(badd);
		
		b4.setBounds(20,160,60,40);
		b5.setBounds(120,160,60,40);
		b6.setBounds(220,160,60,40);
		bsub.setBounds(320,160,60,40);
		f.add(b4);f.add(b5);f.add(b6);f.add(bsub);
		
		b7.setBounds(20,220,60,40);
		b8.setBounds(120,220,60,40);
		b9.setBounds(220,220,60,40);
		bmul.setBounds(320,220,60,40);
		f.add(b7);f.add(b8);f.add(b9);f.add(bmul);
		
		bclr.setBounds(20,280,60,40);
		b0.setBounds(120,280,60,40);
		beq.setBounds(220,280,60,40);
		bdiv.setBounds(320,280,60,40);
		f.add(bclr);f.add(b0);f.add(beq);f.add(bdiv);
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		badd.addActionListener(this);
		bmul.addActionListener(this);
		bdiv.addActionListener(this);
		bsub.addActionListener(this);
		bclr.addActionListener(this);
		beq.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			s3 = tf.getText();
			s4 = "1";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b2){
			s3 = tf.getText();
			s4 = "2";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b3){
			s3 = tf.getText();
			s4 = "3";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b4){
			s3 = tf.getText();
			s4 = "4";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b5){
			s3 = tf.getText();
			s4 = "5";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b6){
			s3 = tf.getText();
			s4 = "6";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b7){
			s3 = tf.getText();
			s4 = "7";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b8){
			s3 = tf.getText();
			s4 = "8";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b9){
			s3 = tf.getText();
			s4 = "9";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==b0){
			s3 = tf.getText();
			s4 = "0";
			s5 = s3+s4;
			tf.setText(s5);
		}
		if(e.getSource()==bclr){
			tf.setText("");
		}
		if(e.getSource()==badd){
			s1 = tf.getText();
			tf.setText("");
			c=1;
		}
		if(e.getSource()==bsub){
			s1 = tf.getText();
			tf.setText("");
			c=2;
		}
		if(e.getSource()==bmul){
			s1 = tf.getText();
			tf.setText("");
			c=3;
		}
		if(e.getSource()==bdiv){
			s1 = tf.getText();
			tf.setText("");
			c=4;
		}
		if(e.getSource()==beq){
			s2 = tf.getText();
			if(c==1){
				n = Integer.parseInt(s1)+Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			if(c==2){
				n = Integer.parseInt(s1)-Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			if(c==3){
				n = Integer.parseInt(s1)*Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
			if(c==4){
				n = Integer.parseInt(s1)/Integer.parseInt(s2);
				tf.setText(String.valueOf(n));
			}
		}
	}
	public static void main(String args[]){
		Calci c = new Calci();
	}
}
